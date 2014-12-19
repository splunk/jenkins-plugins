package com.cloudbees.plugins.flow;

import hudson.model.*;
import java.util.concurrent.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@java.lang.SuppressWarnings(value="GroovyUnusedDeclaration") public class FlowDelegate
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public FlowDelegate
(FlowRun flowRun, hudson.model.BuildListener listener, java.lang.Object upstream, java.lang.Object env) {}
public  java.lang.Object retry(int attempts, java.lang.Object retryClosure) { return null;}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.util.List<hudson.model.Cause> getCauses() { return (java.util.List<hudson.model.Cause>)null;}
public  void setCauses(java.util.List<hudson.model.Cause> value) { }
public  FlowRun getFlowRun() { return (FlowRun)null;}
public  void setFlowRun(FlowRun value) { }
public  hudson.model.BuildListener getListener() { return (hudson.model.BuildListener)null;}
public  void setListener(hudson.model.BuildListener value) { }
public  int getIndent() { return (int)0;}
public  void setIndent(int value) { }
public  java.lang.Object getOut() { return null;}
public synchronized  java.lang.Object println_with_indent(groovy.lang.Closure f) { return null;}
public  java.lang.Object println(java.lang.String s) { return null;}
public  java.lang.Object fail() { return null;}
public  java.lang.Object build(java.lang.String jobName) { return null;}
public  java.lang.Object getBuild() { return null;}
public  java.lang.Object getParams() { return null;}
public  hudson.model.AbstractBuild getUpstream() { return (hudson.model.AbstractBuild)null;}
public  java.util.Map<java.lang.String, java.lang.String> getEnv() { return (java.util.Map<java.lang.String, java.lang.String>)null;}
public  java.lang.Object build(java.util.Map args, java.lang.String jobName) { return null;}
public  java.lang.Object getActions(hudson.model.Job job, java.util.Map args) { return null;}
public  java.lang.Object getClosureValue(java.lang.Object closure) { return null;}
public  java.lang.Object guard(java.lang.Object guardedClosure) { return null;}
public  java.lang.Object ignore(hudson.model.Result result, java.lang.Object closure) { return null;}
public  java.lang.Object retry(int attempts, java.lang.Object worstAllowed, java.lang.Object retryClosure) { return null;}
public  java.util.List<FlowState> parallel(java.util.Collection<? extends groovy.lang.Closure> closures) { return (java.util.List<FlowState>)null;}
public  java.util.Map<?, FlowState> parallel(java.util.Map<?, ? extends groovy.lang.Closure> args) { return (java.util.Map<?, FlowState>)null;}
public  java.util.List<FlowState> parallel(groovy.lang.Closure... closures) { return (java.util.List<FlowState>)null;}
public  java.lang.Object getExtension() { return null;}
public  java.lang.Object propertyMissing(java.lang.String name) { return null;}
public  java.lang.Object methodMissing(java.lang.String name, java.lang.Object args) { return null;}
}
