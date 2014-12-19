package org.zeroturnaround.jenkins.flowbuildtestaggregator;

import jenkins.model.Jenkins;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.tasks.test.AbstractTestResultAction;
import hudson.tasks.test.AggregatedTestResultAction;
import hudson.tasks.test.AggregatedTestResultAction.Child;

public class FlowTestResults extends AggregatedTestResultAction {

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
		super.add(child);
	}

	protected void add_all(AggregatedTestResultAction child) {
		super.add(child);
		
		children.remove(children.size() - 1);
		children.addAll(child.children);
	}
}
