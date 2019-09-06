/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.altus.dataeng.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import java.util.*;

/**
 * Spark specific job information. This is only ever present for SPARK jobs.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:11.397-07:00")
public class JobSparkJobDetails  {

  /**
   * A list of jars to be added to the classpath (e.g. s3a://bucket-name/app.jar). If your code depends on other projects, you will need to package them alongside your application in order to distribute the code to a Spark cluster. Our recommendation is to create an assembly jar (or uber jar) containing your code and its dependencies. Both sbt and Maven have assembly plugins. When creating assembly jars, list Spark and Hadoop as provided dependencies; these need not be bundled since they are provided by the cluster manager at runtime.
   **/
  private List<String> jars = new ArrayList<String>();

  /**
   * Spark application main class. The entry point for your application (e.g. org.apache.spark.examples.SparkPi). This is not required if the jar has a main declaration in its manifest.
   **/
  private String mainClass = null;

  /**
   * Arguments for the Spark application. They will be passed to the main method of the main class.
   **/
  private List<String> applicationArguments = new ArrayList<String>();

  /**
   * Arguments for Spark itself respresented by a string (e.g. --executor-memory 4G --num-executors 50 --conf spark.app.name=MyApp).
   **/
  private String sparkArguments = null;

  /**
   * Only available in CDH513 and above. Text contents of the Spark properties file from which Spark loads extra Spark properties.
   **/
  private String propertiesFile = null;

  /**
   * Getter for jars.
   * A list of jars to be added to the classpath (e.g. s3a://bucket-name/app.jar). If your code depends on other projects, you will need to package them alongside your application in order to distribute the code to a Spark cluster. Our recommendation is to create an assembly jar (or uber jar) containing your code and its dependencies. Both sbt and Maven have assembly plugins. When creating assembly jars, list Spark and Hadoop as provided dependencies; these need not be bundled since they are provided by the cluster manager at runtime.
   **/
  @JsonProperty("jars")
  public List<String> getJars() {
    return jars;
  }

  /**
   * Setter for jars.
   * A list of jars to be added to the classpath (e.g. s3a://bucket-name/app.jar). If your code depends on other projects, you will need to package them alongside your application in order to distribute the code to a Spark cluster. Our recommendation is to create an assembly jar (or uber jar) containing your code and its dependencies. Both sbt and Maven have assembly plugins. When creating assembly jars, list Spark and Hadoop as provided dependencies; these need not be bundled since they are provided by the cluster manager at runtime.
   **/
  public void setJars(List<String> jars) {
    this.jars = jars;
  }

  /**
   * Getter for mainClass.
   * Spark application main class. The entry point for your application (e.g. org.apache.spark.examples.SparkPi). This is not required if the jar has a main declaration in its manifest.
   **/
  @JsonProperty("mainClass")
  public String getMainClass() {
    return mainClass;
  }

  /**
   * Setter for mainClass.
   * Spark application main class. The entry point for your application (e.g. org.apache.spark.examples.SparkPi). This is not required if the jar has a main declaration in its manifest.
   **/
  public void setMainClass(String mainClass) {
    this.mainClass = mainClass;
  }

  /**
   * Getter for applicationArguments.
   * Arguments for the Spark application. They will be passed to the main method of the main class.
   **/
  @JsonProperty("applicationArguments")
  public List<String> getApplicationArguments() {
    return applicationArguments;
  }

  /**
   * Setter for applicationArguments.
   * Arguments for the Spark application. They will be passed to the main method of the main class.
   **/
  public void setApplicationArguments(List<String> applicationArguments) {
    this.applicationArguments = applicationArguments;
  }

  /**
   * Getter for sparkArguments.
   * Arguments for Spark itself respresented by a string (e.g. --executor-memory 4G --num-executors 50 --conf spark.app.name&#x3D;MyApp).
   **/
  @JsonProperty("sparkArguments")
  public String getSparkArguments() {
    return sparkArguments;
  }

  /**
   * Setter for sparkArguments.
   * Arguments for Spark itself respresented by a string (e.g. --executor-memory 4G --num-executors 50 --conf spark.app.name&#x3D;MyApp).
   **/
  public void setSparkArguments(String sparkArguments) {
    this.sparkArguments = sparkArguments;
  }

  /**
   * Getter for propertiesFile.
   * Only available in CDH513 and above. Text contents of the Spark properties file from which Spark loads extra Spark properties.
   **/
  @JsonProperty("propertiesFile")
  public String getPropertiesFile() {
    return propertiesFile;
  }

  /**
   * Setter for propertiesFile.
   * Only available in CDH513 and above. Text contents of the Spark properties file from which Spark loads extra Spark properties.
   **/
  public void setPropertiesFile(String propertiesFile) {
    this.propertiesFile = propertiesFile;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSparkJobDetails jobSparkJobDetails = (JobSparkJobDetails) o;
    if (!Objects.equals(this.jars, jobSparkJobDetails.jars)) {
      return false;
    }
    if (!Objects.equals(this.mainClass, jobSparkJobDetails.mainClass)) {
      return false;
    }
    if (!Objects.equals(this.applicationArguments, jobSparkJobDetails.applicationArguments)) {
      return false;
    }
    if (!Objects.equals(this.sparkArguments, jobSparkJobDetails.sparkArguments)) {
      return false;
    }
    if (!Objects.equals(this.propertiesFile, jobSparkJobDetails.propertiesFile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jars, mainClass, applicationArguments, sparkArguments, propertiesFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSparkJobDetails {\n");
    sb.append("    jars: ").append(toIndentedString(jars)).append("\n");
    sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
    sb.append("    applicationArguments: ").append(toIndentedString(applicationArguments)).append("\n");
    sb.append("    sparkArguments: ").append(toIndentedString(sparkArguments)).append("\n");
    sb.append("    propertiesFile: ").append(toIndentedString(propertiesFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

