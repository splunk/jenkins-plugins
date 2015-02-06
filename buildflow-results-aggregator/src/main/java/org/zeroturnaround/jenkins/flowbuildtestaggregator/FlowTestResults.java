package org.zeroturnaround.jenkins.flowbuildtestaggregator;

import java.util.ArrayList;
import java.util.List;

import jenkins.model.Jenkins;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.tasks.test.AbstractTestResultAction;
import hudson.tasks.test.AggregatedTestResultAction;

public class FlowTestResults extends AggregatedTestResultAction {
	
	public static class AbortedJob {
	    String name;
		String url;

		public AbortedJob(String name, String url) {
			this.name = name;
			this.url = url;
		}

		public String getName() {
			return name;
		}

		public String getUrl() {
			return url;
		}

	}
	
	int failedjob = 0;
	int successjob = 0;

	List<AbortedJob> abortedjobs = new ArrayList<AbortedJob>();

	public List<AbortedJob> getAbortedjobs() {
		return abortedjobs;
	}

	public int getFailedJobsNumber() {
		return failedjob;
	}

	public int getSuccessJobsNumber() {
		return successjob;
	}

	public int getAbortedJobsNumber() {
		return abortedjobs.size();
	}

	public FlowTestResults(AbstractBuild owner) {
		super(owner);
	}

	@Override
	protected String getChildName(AbstractTestResultAction tr) {
		return tr.owner.getProject().getFullName();
	}

	@Override
	public AbstractBuild<?, ?> resolveChild(Child child) {
		return Jenkins.getInstance()
				.getItemByFullName(child.name, AbstractProject.class)
				.getBuildByNumber(child.build);
	}

	@Override
	protected void add(AbstractTestResultAction child) {
		// collect test result statictics information on JOB level
		if (child.getFailCount() > 0) {
			failedjob++;
		} else {
			successjob++;
		}

		// collect test result statictics information on CASE level
		super.add(child);
	}

	protected void add_all(AggregatedTestResultAction child) {
		// collect test result statictics information on JOB level

		failedjob += ((FlowTestResults) child).getFailedJobsNumber();
		successjob += ((FlowTestResults) child).getSuccessJobsNumber();
		abortedjobs.addAll(((FlowTestResults) child).abortedjobs);

		// collect test result statictics information on CASE level

		// a workaround for composite reports
		// the reason why add child and then remove it is that cases status can
		// be counted
		super.add(child);

		children.remove(children.size() - 1);
		children.addAll(child.children);
	}
}

