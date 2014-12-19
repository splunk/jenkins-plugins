package hudson.plugins.s3;

import hudson.model.AbstractBuild;
import hudson.model.Run;

import java.io.Serializable;


/**
 * Provides a way to construct a destination bucket name and object name based
 * on the bucket name provided by the user.
 * 
 * The convention implemented here is that a / in a bucket name is used to
 * construct a structure in the object name.  That is, a put of file.txt to bucket name
 * of "mybucket/v1" will cause the object "v1/file.txt" to be created in the mybucket.
 * 
 */
public class Destination implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String bucketName; 
  public final String objectName; 
  
  public Destination(final String userBucketName, final String fileName) {
    
    if (userBucketName == null || fileName == null) 
      throw new IllegalArgumentException("Not defined for null parameters: "+userBucketName+","+fileName);
    
    final String[] bucketNameArray = userBucketName.split("/", 2);
    
    bucketName = bucketNameArray[0];
    
    if (bucketNameArray.length > 1) {
        objectName = bucketNameArray[1] + "/" + fileName;
    } else {
        objectName = fileName;
    }
  }

@Override
 public String toString() {
   return "Destination [bucketName="+bucketName+", objectName="+objectName+"]";
 }
  

  public static Destination newFromRun(Run run, String bucketName, String fileName)
  {
    String projectName = run.getParent().getName();
    int buildID = run.getNumber();
    return new Destination(bucketName, "jobs/" + projectName + "/" + buildID + "/" + fileName);
  }

  public static Destination newFromRun(Run run, S3Artifact artifact) 
  {
    return newFromRun(run, artifact.getBucket(), artifact.getName());
  }
    
  public static Destination newFromBuild(AbstractBuild<?, ?> build, String bucketName, String fileName)
  {
    String projectName = build.getParent().getName();
    int buildID =build.getNumber();
    return new Destination(bucketName, "jobs/" + projectName + "/" + buildID + "/" + fileName);
  }
}
