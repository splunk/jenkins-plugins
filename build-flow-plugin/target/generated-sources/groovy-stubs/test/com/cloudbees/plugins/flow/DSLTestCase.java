package com.cloudbees.plugins.flow;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public abstract class DSLTestCase
  extends org.jvnet.hudson.test.HudsonTestCase  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.Object getCreateJob() { return null;}
public  void setCreateJob(java.lang.Object value) { }
public  java.lang.Object getCreateJobs() { return null;}
public  void setCreateJobs(java.lang.Object value) { }
public  java.lang.Object getCreateFailJob() { return null;}
public  void setCreateFailJob(java.lang.Object value) { }
public  java.lang.Object getCreateUnstableJob() { return null;}
public  void setCreateUnstableJob(java.lang.Object value) { }
public  java.lang.Object getCreateBlockingJob() { return null;}
public  void setCreateBlockingJob(java.lang.Object value) { }
public  java.lang.Object getRun() { return null;}
public  void setRun(java.lang.Object value) { }
public  java.lang.Object getRunWithWorkspace() { return null;}
public  void setRunWithWorkspace(java.lang.Object value) { }
public  java.lang.Object getSchedule() { return null;}
public  void setSchedule(java.lang.Object value) { }
public  java.lang.Object getRunWithCause() { return null;}
public  void setRunWithCause(java.lang.Object value) { }
public  java.lang.Object getAssertSuccess() { return null;}
public  void setAssertSuccess(java.lang.Object value) { }
public  java.lang.Object getAssertDidNotRun() { return null;}
public  void setAssertDidNotRun(java.lang.Object value) { }
public  java.lang.Object getAssertAllSuccess() { return null;}
public  void setAssertAllSuccess(java.lang.Object value) { }
public  java.lang.Object getAssertFailure() { return null;}
public  void setAssertFailure(java.lang.Object value) { }
public  java.lang.Object getAssertUnstable() { return null;}
public  void setAssertUnstable(java.lang.Object value) { }
public  java.lang.Object assertException(java.lang.Class<? extends java.lang.Exception> exClass, groovy.lang.Closure closure) { return null;}
public  void assertHasParameter(hudson.model.Job job, java.lang.String name, java.lang.String value) { }
public  void assertHasParameter(hudson.model.AbstractBuild build, java.lang.String name, java.lang.String value) { }
public  void assertRan(hudson.model.Job job, int times, hudson.model.Result result) { }
}
