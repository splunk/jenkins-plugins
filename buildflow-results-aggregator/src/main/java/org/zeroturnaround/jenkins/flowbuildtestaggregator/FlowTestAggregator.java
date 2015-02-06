package org.zeroturnaround.jenkins.flowbuildtestaggregator;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

import org.kohsuke.stapler.DataBoundConstructor;
import org.zeroturnaround.jenkins.flowbuildtestaggregator.FlowTestResults.AbortedJob;

import com.cloudbees.plugins.flow.BuildFlow;
import com.cloudbees.plugins.flow.FlowRun;
import com.cloudbees.plugins.flow.JobInvocation;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Action;
import hudson.model.BuildListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Publisher;
import hudson.tasks.Recorder;
import hudson.tasks.junit.TestResultAction;
import hudson.tasks.test.AggregatedTestResultAction;
import hudson.tasks.test.TestResultProjectAction;

public class FlowTestAggregator extends Recorder {

	@DataBoundConstructor
	public FlowTestAggregator() {
	}

	public BuildStepMonitor getRequiredMonitorService() {
		return BuildStepMonitor.NONE;
	}

	@Override
	public Collection<? extends Action> getProjectActions(
			AbstractProject<?, ?> project) {
		// show test trend graph on job page
		Action a = new TestResultProjectAction(project);
		return Collections.singletonList(a);
	}

	@Override
	public boolean perform(AbstractBuild<?, ?> build, Launcher launcher,
			BuildListener listener) throws InterruptedException, IOException {
		FlowTestResults testResults = new FlowTestResults(build);
		FlowRun flowRun = (FlowRun) build;
		flowRun.addAction(testResults);

		listener.getLogger().println("Starting to gather test results!");
		try {
			for (JobInvocation jobInvocation : flowRun.getJobsGraph()
					.vertexSet()) {
				// if (!jobInvocation.getClass().getName().contains("Start")) {
				AggregatedTestResultAction testResult1 = jobInvocation
						.getBuild().getAction(FlowTestResults.class);
				if (testResult1 != null) {
					testResults.add_all(testResult1);
					continue;
				}
				TestResultAction testResult = jobInvocation.getBuild()
						.getAction(hudson.tasks.junit.TestResultAction.class);
				if (testResult != null) {
					testResults.add(testResult);
					continue;
				}
				// if you can reach here, then you are an aborted build
				testResults.abortedjobs.add(new AbortedJob(jobInvocation
						.getName(), jobInvocation.getBuild().getUrl()));
				// }
			}
		} catch (ExecutionException e) {
			listener.getLogger().print("ERROR: " + e.getMessage());
		}
		return true;
	}

	@Extension
	public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();

	@Override
	public DescriptorImpl getDescriptor() {
		return DESCRIPTOR;
	}

	public static final class DescriptorImpl extends
			BuildStepDescriptor<Publisher> {

		/**
		 * This human readable name is used in the configuration screen.
		 */
		public String getDisplayName() {
			return "Aggregate build flow test results";
		}

		@Override
		public boolean isApplicable(Class jobType) {
			return BuildFlow.class.equals(jobType);
		}
	}
}