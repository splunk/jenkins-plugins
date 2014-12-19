package com.cloudbees.plugins.flow;

import hudson.model.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class JobInvocation
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public JobInvocation
(FlowRun run, hudson.model.AbstractProject project) {}
public JobInvocation
(FlowRun run, java.lang.String name) {
super ();
}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  com.cloudbees.plugins.flow.JobInvocation run(hudson.model.Cause cause, java.util.List<hudson.model.Action> actions) { return (com.cloudbees.plugins.flow.JobInvocation)null;}
public  boolean abort() { return false;}
public  java.lang.Object invokeMethod(java.lang.String name, java.lang.Object args) { return null;}
public  java.lang.Object propertyMissing(java.lang.String name) { return null;}
public  hudson.model.Result getResult()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { return (hudson.model.Result)null;}
public  java.lang.String getResultString()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { return (java.lang.String)null;}
public  hudson.model.AbstractBuild getFlowRun() { return (hudson.model.AbstractBuild)null;}
public  void buildStarted(hudson.model.AbstractBuild build) { }
public  void buildCompleted() { }
public  void buildFinalized() { }
public  java.lang.String getName() { return (java.lang.String)null;}
public  java.lang.String getDisplayName() { return (java.lang.String)null;}
public  boolean isStarted() { return false;}
public  boolean isCompleted() { return false;}
public  boolean isFinalized() { return false;}
public  java.lang.String getBuildUrl() { return (java.lang.String)null;}
public  java.lang.String getStartTime() { return (java.lang.String)null;}
public  hudson.model.Run getBuild()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { return (hudson.model.Run)null;}
public  hudson.model.AbstractProject<?, ? extends hudson.model.AbstractBuild<?, ?>> getProject() { return (hudson.model.AbstractProject<?, ? extends hudson.model.AbstractBuild<?, ?>>)null;}
public  java.lang.String toString() { return (java.lang.String)null;}
public  hudson.model.Run waitForStart()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { return (hudson.model.Run)null;}
public  void waitForCompletion()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { }
public  void waitForFinalization()throws java.util.concurrent.ExecutionException, java.lang.InterruptedException { }
public  java.lang.String getId() { return (java.lang.String)null;}
@java.lang.Override() public  boolean equals(java.lang.Object obj) { return false;}
@java.lang.Override() public  int hashCode() { return (int)0;}
public static class Start
  extends com.cloudbees.plugins.flow.JobInvocation {
public Start
(FlowRun run) {
super ((FlowRun)null, (hudson.model.AbstractProject)null);
}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
}
}
