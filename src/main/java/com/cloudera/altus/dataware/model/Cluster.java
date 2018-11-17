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

package com.cloudera.altus.dataware.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.dataware.model.ClusterResourceTagResponse;
import com.cloudera.altus.dataware.model.ClusterSecurityConfiguration;
import com.cloudera.altus.dataware.model.ClusterWorkersConfiguration;
import com.cloudera.altus.dataware.model.Endpoint;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Information about a cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-11-16T18:04:32.139-08:00")
public class Cluster  {

  /**
   * The name of the cluster.
   **/
  private String clusterName = null;

  /**
   * The CRN of the cluster.
   **/
  private String crn = null;

  /**
   * The date when the cluster was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The status of the cluster.
   **/
  private String status = null;

  /**
   * The CDH version for the cluster.
   **/
  private String cdhVersion = null;

  /**
   * The instance type for the worker instances.
   **/
  private String instanceType = null;

  /**
   * A flag indicating if a bootstrap script was provided or not during the cluster create request. The script content is not returned because it may be sensitive.
   **/
  private Boolean hasInstanceBootstrapScript = null;

  /**
   * The worker group size.
   **/
  private Integer workersGroupSize = null;

  /**
   * The type of the environment.
   **/
  private String environmentType = null;

  /**
   * The CRN of the environment.
   **/
  private String environmentCrn = null;

  /**
   * 
   **/
  private ClusterSecurityConfiguration securityConfiguration = null;

  /**
   * The SSH public key to connect to the cluster. The user uses the private key that corresponds to the public key to SSH into the cluster.
   **/
  private String publicKey = null;

  /**
   * If the cluster's status is FAILED, this will be set with related failure codes.
   **/
  private List<String> failureCodes = new ArrayList<String>();

  /**
   * If the cluster's status is FAILED, this will be set with a message explaining the reason.
   **/
  private String failureReason = null;

  /**
   * The S3 location where cluster logs will be placed.
   **/
  private String logArchiveLocation = null;

  /**
   * The connection endpoint of the cluster's Cloudera Manager.
   **/
  private Endpoint clouderaManagerEndpoint = null;

  /**
   * 
   **/
  private ClusterWorkersConfiguration workersConfiguration = null;

  /**
   * The CRN of the cluster's Altus SDX namespace.
   **/
  private String namespaceCrn = null;

  /**
   * Tags that were added to cluster-associated resources at cluster creation time. This list does not include those that the Altus service sets.
   **/
  private List<ClusterResourceTagResponse> additionalClusterResourceTags = new ArrayList<ClusterResourceTagResponse>();

  /**
   * Getter for clusterName.
   * The name of the cluster.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the cluster.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for crn.
   * The CRN of the cluster.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the cluster.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for creationDate.
   * The date when the cluster was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when the cluster was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for status.
   * The status of the cluster.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the cluster.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for cdhVersion.
   * The CDH version for the cluster.
   **/
  @JsonProperty("cdhVersion")
  public String getCdhVersion() {
    return cdhVersion;
  }

  /**
   * Setter for cdhVersion.
   * The CDH version for the cluster.
   **/
  public void setCdhVersion(String cdhVersion) {
    this.cdhVersion = cdhVersion;
  }

  /**
   * Getter for instanceType.
   * The instance type for the worker instances.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The instance type for the worker instances.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for hasInstanceBootstrapScript.
   * A flag indicating if a bootstrap script was provided or not during the cluster create request. The script content is not returned because it may be sensitive.
   **/
  @JsonProperty("hasInstanceBootstrapScript")
  public Boolean getHasInstanceBootstrapScript() {
    return hasInstanceBootstrapScript;
  }

  /**
   * Setter for hasInstanceBootstrapScript.
   * A flag indicating if a bootstrap script was provided or not during the cluster create request. The script content is not returned because it may be sensitive.
   **/
  public void setHasInstanceBootstrapScript(Boolean hasInstanceBootstrapScript) {
    this.hasInstanceBootstrapScript = hasInstanceBootstrapScript;
  }

  /**
   * Getter for workersGroupSize.
   * The worker group size.
   **/
  @JsonProperty("workersGroupSize")
  public Integer getWorkersGroupSize() {
    return workersGroupSize;
  }

  /**
   * Setter for workersGroupSize.
   * The worker group size.
   **/
  public void setWorkersGroupSize(Integer workersGroupSize) {
    this.workersGroupSize = workersGroupSize;
  }

  /**
   * Getter for environmentType.
   * The type of the environment.
   **/
  @JsonProperty("environmentType")
  public String getEnvironmentType() {
    return environmentType;
  }

  /**
   * Setter for environmentType.
   * The type of the environment.
   **/
  public void setEnvironmentType(String environmentType) {
    this.environmentType = environmentType;
  }

  /**
   * Getter for environmentCrn.
   * The CRN of the environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of the environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for securityConfiguration.
   * 
   **/
  @JsonProperty("securityConfiguration")
  public ClusterSecurityConfiguration getSecurityConfiguration() {
    return securityConfiguration;
  }

  /**
   * Setter for securityConfiguration.
   * 
   **/
  public void setSecurityConfiguration(ClusterSecurityConfiguration securityConfiguration) {
    this.securityConfiguration = securityConfiguration;
  }

  /**
   * Getter for publicKey.
   * The SSH public key to connect to the cluster. The user uses the private key that corresponds to the public key to SSH into the cluster.
   **/
  @JsonProperty("publicKey")
  public String getPublicKey() {
    return publicKey;
  }

  /**
   * Setter for publicKey.
   * The SSH public key to connect to the cluster. The user uses the private key that corresponds to the public key to SSH into the cluster.
   **/
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  /**
   * Getter for failureCodes.
   * If the cluster&#39;s status is FAILED, this will be set with related failure codes.
   **/
  @JsonProperty("failureCodes")
  public List<String> getFailureCodes() {
    return failureCodes;
  }

  /**
   * Setter for failureCodes.
   * If the cluster&#39;s status is FAILED, this will be set with related failure codes.
   **/
  public void setFailureCodes(List<String> failureCodes) {
    this.failureCodes = failureCodes;
  }

  /**
   * Getter for failureReason.
   * If the cluster&#39;s status is FAILED, this will be set with a message explaining the reason.
   **/
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  /**
   * Setter for failureReason.
   * If the cluster&#39;s status is FAILED, this will be set with a message explaining the reason.
   **/
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  /**
   * Getter for logArchiveLocation.
   * The S3 location where cluster logs will be placed.
   **/
  @JsonProperty("logArchiveLocation")
  public String getLogArchiveLocation() {
    return logArchiveLocation;
  }

  /**
   * Setter for logArchiveLocation.
   * The S3 location where cluster logs will be placed.
   **/
  public void setLogArchiveLocation(String logArchiveLocation) {
    this.logArchiveLocation = logArchiveLocation;
  }

  /**
   * Getter for clouderaManagerEndpoint.
   * The connection endpoint of the cluster&#39;s Cloudera Manager.
   **/
  @JsonProperty("clouderaManagerEndpoint")
  public Endpoint getClouderaManagerEndpoint() {
    return clouderaManagerEndpoint;
  }

  /**
   * Setter for clouderaManagerEndpoint.
   * The connection endpoint of the cluster&#39;s Cloudera Manager.
   **/
  public void setClouderaManagerEndpoint(Endpoint clouderaManagerEndpoint) {
    this.clouderaManagerEndpoint = clouderaManagerEndpoint;
  }

  /**
   * Getter for workersConfiguration.
   * 
   **/
  @JsonProperty("workersConfiguration")
  public ClusterWorkersConfiguration getWorkersConfiguration() {
    return workersConfiguration;
  }

  /**
   * Setter for workersConfiguration.
   * 
   **/
  public void setWorkersConfiguration(ClusterWorkersConfiguration workersConfiguration) {
    this.workersConfiguration = workersConfiguration;
  }

  /**
   * Getter for namespaceCrn.
   * The CRN of the cluster&#39;s Altus SDX namespace.
   **/
  @JsonProperty("namespaceCrn")
  public String getNamespaceCrn() {
    return namespaceCrn;
  }

  /**
   * Setter for namespaceCrn.
   * The CRN of the cluster&#39;s Altus SDX namespace.
   **/
  public void setNamespaceCrn(String namespaceCrn) {
    this.namespaceCrn = namespaceCrn;
  }

  /**
   * Getter for additionalClusterResourceTags.
   * Tags that were added to cluster-associated resources at cluster creation time. This list does not include those that the Altus service sets.
   **/
  @JsonProperty("additionalClusterResourceTags")
  public List<ClusterResourceTagResponse> getAdditionalClusterResourceTags() {
    return additionalClusterResourceTags;
  }

  /**
   * Setter for additionalClusterResourceTags.
   * Tags that were added to cluster-associated resources at cluster creation time. This list does not include those that the Altus service sets.
   **/
  public void setAdditionalClusterResourceTags(List<ClusterResourceTagResponse> additionalClusterResourceTags) {
    this.additionalClusterResourceTags = additionalClusterResourceTags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    if (!Objects.equals(this.clusterName, cluster.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.crn, cluster.crn)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, cluster.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.status, cluster.status)) {
      return false;
    }
    if (!Objects.equals(this.cdhVersion, cluster.cdhVersion)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, cluster.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.hasInstanceBootstrapScript, cluster.hasInstanceBootstrapScript)) {
      return false;
    }
    if (!Objects.equals(this.workersGroupSize, cluster.workersGroupSize)) {
      return false;
    }
    if (!Objects.equals(this.environmentType, cluster.environmentType)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, cluster.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.securityConfiguration, cluster.securityConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, cluster.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.failureCodes, cluster.failureCodes)) {
      return false;
    }
    if (!Objects.equals(this.failureReason, cluster.failureReason)) {
      return false;
    }
    if (!Objects.equals(this.logArchiveLocation, cluster.logArchiveLocation)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerEndpoint, cluster.clouderaManagerEndpoint)) {
      return false;
    }
    if (!Objects.equals(this.workersConfiguration, cluster.workersConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.namespaceCrn, cluster.namespaceCrn)) {
      return false;
    }
    if (!Objects.equals(this.additionalClusterResourceTags, cluster.additionalClusterResourceTags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, crn, creationDate, status, cdhVersion, instanceType, hasInstanceBootstrapScript, workersGroupSize, environmentType, environmentCrn, securityConfiguration, publicKey, failureCodes, failureReason, logArchiveLocation, clouderaManagerEndpoint, workersConfiguration, namespaceCrn, additionalClusterResourceTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cdhVersion: ").append(toIndentedString(cdhVersion)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    hasInstanceBootstrapScript: ").append(toIndentedString(hasInstanceBootstrapScript)).append("\n");
    sb.append("    workersGroupSize: ").append(toIndentedString(workersGroupSize)).append("\n");
    sb.append("    environmentType: ").append(toIndentedString(environmentType)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    securityConfiguration: ").append(toIndentedString(securityConfiguration)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    failureCodes: ").append(toIndentedString(failureCodes)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    logArchiveLocation: ").append(toIndentedString(logArchiveLocation)).append("\n");
    sb.append("    clouderaManagerEndpoint: ").append(toIndentedString(clouderaManagerEndpoint)).append("\n");
    sb.append("    workersConfiguration: ").append(toIndentedString(workersConfiguration)).append("\n");
    sb.append("    namespaceCrn: ").append(toIndentedString(namespaceCrn)).append("\n");
    sb.append("    additionalClusterResourceTags: ").append(toIndentedString(additionalClusterResourceTags)).append("\n");
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

