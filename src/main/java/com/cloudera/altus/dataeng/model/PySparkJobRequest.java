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
 * Object used to submit a PySpark job.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-04-02T14:15:31.936-07:00")
public class PySparkJobRequest  {

  /**
   * Spark application main python file. The entry point for your PySpark application. This is required for all PySpark application.
   **/
  private String mainPy = null;

  /**
   * PySpark job dependencies, such as .zip, .egg, or .py files, to be place on the PYTHONPATH for Python apps.
   **/
  private List<String> pyFiles = new ArrayList<String>();

  /**
   * Arguments for the PySpark application. They will be passed to the main python file.
   **/
  private List<String> applicationArguments = new ArrayList<String>();

  /**
   * Arguments for Spark itself respresented by a string (e.g. --executor-memory 4G --num-executors 50 --conf spark.app.name=MyApp).
   **/
  private String sparkArguments = null;

  /**
   * Only available in CDH513 and above. Contents of the Spark properties file from which Spark loads extra Spark properties. Note that you should use this argument instead of passing '--properties-file' as a part of --spark-arguments above. This can be a local path when using the CLI (e.g. file:///absolute/path/to/propertiesFile).
   **/
  private String propertiesFile = null;

  /**
   * Getter for mainPy.
   * Spark application main python file. The entry point for your PySpark application. This is required for all PySpark application.
   **/
  @JsonProperty("mainPy")
  public String getMainPy() {
    return mainPy;
  }

  /**
   * Setter for mainPy.
   * Spark application main python file. The entry point for your PySpark application. This is required for all PySpark application.
   **/
  public void setMainPy(String mainPy) {
    this.mainPy = mainPy;
  }

  /**
   * Getter for pyFiles.
   * PySpark job dependencies, such as .zip, .egg, or .py files, to be place on the PYTHONPATH for Python apps.
   **/
  @JsonProperty("pyFiles")
  public List<String> getPyFiles() {
    return pyFiles;
  }

  /**
   * Setter for pyFiles.
   * PySpark job dependencies, such as .zip, .egg, or .py files, to be place on the PYTHONPATH for Python apps.
   **/
  public void setPyFiles(List<String> pyFiles) {
    this.pyFiles = pyFiles;
  }

  /**
   * Getter for applicationArguments.
   * Arguments for the PySpark application. They will be passed to the main python file.
   **/
  @JsonProperty("applicationArguments")
  public List<String> getApplicationArguments() {
    return applicationArguments;
  }

  /**
   * Setter for applicationArguments.
   * Arguments for the PySpark application. They will be passed to the main python file.
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
   * Only available in CDH513 and above. Contents of the Spark properties file from which Spark loads extra Spark properties. Note that you should use this argument instead of passing &#39;--properties-file&#39; as a part of --spark-arguments above. This can be a local path when using the CLI (e.g. file:///absolute/path/to/propertiesFile).
   **/
  @JsonProperty("propertiesFile")
  public String getPropertiesFile() {
    return propertiesFile;
  }

  /**
   * Setter for propertiesFile.
   * Only available in CDH513 and above. Contents of the Spark properties file from which Spark loads extra Spark properties. Note that you should use this argument instead of passing &#39;--properties-file&#39; as a part of --spark-arguments above. This can be a local path when using the CLI (e.g. file:///absolute/path/to/propertiesFile).
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
    PySparkJobRequest pySparkJobRequest = (PySparkJobRequest) o;
    if (!Objects.equals(this.mainPy, pySparkJobRequest.mainPy)) {
      return false;
    }
    if (!Objects.equals(this.pyFiles, pySparkJobRequest.pyFiles)) {
      return false;
    }
    if (!Objects.equals(this.applicationArguments, pySparkJobRequest.applicationArguments)) {
      return false;
    }
    if (!Objects.equals(this.sparkArguments, pySparkJobRequest.sparkArguments)) {
      return false;
    }
    if (!Objects.equals(this.propertiesFile, pySparkJobRequest.propertiesFile)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainPy, pyFiles, applicationArguments, sparkArguments, propertiesFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PySparkJobRequest {\n");
    sb.append("    mainPy: ").append(toIndentedString(mainPy)).append("\n");
    sb.append("    pyFiles: ").append(toIndentedString(pyFiles)).append("\n");
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

