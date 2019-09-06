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
import com.cloudera.altus.dataware.model.ClusterResourceTagRequest;
import com.cloudera.altus.dataware.model.CreateAWSClusterRequestWorkersConfiguration;
import java.util.*;

/**
 * Request object for a create AWS cluster request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:10.984-07:00")
public class CreateAWSClusterRequest  {

  /**
   * The name of the cluster. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  private String clusterName = null;

  /**
   * The CDH version.
   **/
  private String cdhVersion = null;

  /**
   * The EC2 instance type for the worker nodes.
   **/
  private String instanceType = null;

  /**
   * Name or CRN of the environment to use when creating the the cluster. The environment must be an AWS environment.
   **/
  private String environmentName = null;

  /**
   * The worker nodes group size.
   **/
  private Integer workersGroupSize = null;

  /**
   * The SSH public key to connect to the cluster. The user uses the private key that corresponds to the public key to SSH into the cluster.
   **/
  private String publicKey = null;

  /**
   * Instance bootstrap script that is executed on all the cluster instances immediately after startup before any services are configured and started. You can use it to install additional OS packages or application dependencies. This is not intended to be a mechanism for cluster configuration.
   **/
  private String instanceBootstrapScript = null;

  /**
   * 
   **/
  private CreateAWSClusterRequestWorkersConfiguration workersConfiguration = null;

  /**
   * A name or a CRN of an existing Altus SDX namespace.
   **/
  private String namespaceName = null;

  /**
   * The username to login to cluster's Cloudera Manager as readonly user. The default is \\'guest\\'.
   **/
  private String clouderaManagerUsername = null;

  /**
   * The password to login to cluster's Cloudera Manager as readonly user. The default is autogenerated random UUID.
   **/
  private String clouderaManagerPassword = null;

  /**
   * Tags added to cluster-associated resources at cluster creation time. These tags are in addition to those that the Altus service sets. See the AWS documentation for tagging restrictions.
   **/
  private List<ClusterResourceTagRequest> additionalClusterResourceTags = new ArrayList<ClusterResourceTagRequest>();

  /**
   * Getter for clusterName.
   * The name of the cluster. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Setter for clusterName.
   * The name of the cluster. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * Getter for cdhVersion.
   * The CDH version.
   **/
  @JsonProperty("cdhVersion")
  public String getCdhVersion() {
    return cdhVersion;
  }

  /**
   * Setter for cdhVersion.
   * The CDH version.
   **/
  public void setCdhVersion(String cdhVersion) {
    this.cdhVersion = cdhVersion;
  }

  /**
   * Getter for instanceType.
   * The EC2 instance type for the worker nodes.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The EC2 instance type for the worker nodes.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for environmentName.
   * Name or CRN of the environment to use when creating the the cluster. The environment must be an AWS environment.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * Name or CRN of the environment to use when creating the the cluster. The environment must be an AWS environment.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for workersGroupSize.
   * The worker nodes group size.
   **/
  @JsonProperty("workersGroupSize")
  public Integer getWorkersGroupSize() {
    return workersGroupSize;
  }

  /**
   * Setter for workersGroupSize.
   * The worker nodes group size.
   **/
  public void setWorkersGroupSize(Integer workersGroupSize) {
    this.workersGroupSize = workersGroupSize;
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
   * Getter for instanceBootstrapScript.
   * Instance bootstrap script that is executed on all the cluster instances immediately after startup before any services are configured and started. You can use it to install additional OS packages or application dependencies. This is not intended to be a mechanism for cluster configuration.
   **/
  @JsonProperty("instanceBootstrapScript")
  public String getInstanceBootstrapScript() {
    return instanceBootstrapScript;
  }

  /**
   * Setter for instanceBootstrapScript.
   * Instance bootstrap script that is executed on all the cluster instances immediately after startup before any services are configured and started. You can use it to install additional OS packages or application dependencies. This is not intended to be a mechanism for cluster configuration.
   **/
  public void setInstanceBootstrapScript(String instanceBootstrapScript) {
    this.instanceBootstrapScript = instanceBootstrapScript;
  }

  /**
   * Getter for workersConfiguration.
   * 
   **/
  @JsonProperty("workersConfiguration")
  public CreateAWSClusterRequestWorkersConfiguration getWorkersConfiguration() {
    return workersConfiguration;
  }

  /**
   * Setter for workersConfiguration.
   * 
   **/
  public void setWorkersConfiguration(CreateAWSClusterRequestWorkersConfiguration workersConfiguration) {
    this.workersConfiguration = workersConfiguration;
  }

  /**
   * Getter for namespaceName.
   * A name or a CRN of an existing Altus SDX namespace.
   **/
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  /**
   * Setter for namespaceName.
   * A name or a CRN of an existing Altus SDX namespace.
   **/
  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  /**
   * Getter for clouderaManagerUsername.
   * The username to login to cluster&#39;s Cloudera Manager as readonly user. The default is \\&#39;guest\\&#39;.
   **/
  @JsonProperty("clouderaManagerUsername")
  public String getClouderaManagerUsername() {
    return clouderaManagerUsername;
  }

  /**
   * Setter for clouderaManagerUsername.
   * The username to login to cluster&#39;s Cloudera Manager as readonly user. The default is \\&#39;guest\\&#39;.
   **/
  public void setClouderaManagerUsername(String clouderaManagerUsername) {
    this.clouderaManagerUsername = clouderaManagerUsername;
  }

  /**
   * Getter for clouderaManagerPassword.
   * The password to login to cluster&#39;s Cloudera Manager as readonly user. The default is autogenerated random UUID.
   **/
  @JsonProperty("clouderaManagerPassword")
  public String getClouderaManagerPassword() {
    return clouderaManagerPassword;
  }

  /**
   * Setter for clouderaManagerPassword.
   * The password to login to cluster&#39;s Cloudera Manager as readonly user. The default is autogenerated random UUID.
   **/
  public void setClouderaManagerPassword(String clouderaManagerPassword) {
    this.clouderaManagerPassword = clouderaManagerPassword;
  }

  /**
   * Getter for additionalClusterResourceTags.
   * Tags added to cluster-associated resources at cluster creation time. These tags are in addition to those that the Altus service sets. See the AWS documentation for tagging restrictions.
   **/
  @JsonProperty("additionalClusterResourceTags")
  public List<ClusterResourceTagRequest> getAdditionalClusterResourceTags() {
    return additionalClusterResourceTags;
  }

  /**
   * Setter for additionalClusterResourceTags.
   * Tags added to cluster-associated resources at cluster creation time. These tags are in addition to those that the Altus service sets. See the AWS documentation for tagging restrictions.
   **/
  public void setAdditionalClusterResourceTags(List<ClusterResourceTagRequest> additionalClusterResourceTags) {
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
    CreateAWSClusterRequest createAWSClusterRequest = (CreateAWSClusterRequest) o;
    if (!Objects.equals(this.clusterName, createAWSClusterRequest.clusterName)) {
      return false;
    }
    if (!Objects.equals(this.cdhVersion, createAWSClusterRequest.cdhVersion)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, createAWSClusterRequest.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.environmentName, createAWSClusterRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.workersGroupSize, createAWSClusterRequest.workersGroupSize)) {
      return false;
    }
    if (!Objects.equals(this.publicKey, createAWSClusterRequest.publicKey)) {
      return false;
    }
    if (!Objects.equals(this.instanceBootstrapScript, createAWSClusterRequest.instanceBootstrapScript)) {
      return false;
    }
    if (!Objects.equals(this.workersConfiguration, createAWSClusterRequest.workersConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.namespaceName, createAWSClusterRequest.namespaceName)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerUsername, createAWSClusterRequest.clouderaManagerUsername)) {
      return false;
    }
    if (!Objects.equals(this.clouderaManagerPassword, createAWSClusterRequest.clouderaManagerPassword)) {
      return false;
    }
    if (!Objects.equals(this.additionalClusterResourceTags, createAWSClusterRequest.additionalClusterResourceTags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterName, cdhVersion, instanceType, environmentName, workersGroupSize, publicKey, instanceBootstrapScript, workersConfiguration, namespaceName, clouderaManagerUsername, clouderaManagerPassword, additionalClusterResourceTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAWSClusterRequest {\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    cdhVersion: ").append(toIndentedString(cdhVersion)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    workersGroupSize: ").append(toIndentedString(workersGroupSize)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    instanceBootstrapScript: ").append(toIndentedString(instanceBootstrapScript)).append("\n");
    sb.append("    workersConfiguration: ").append(toIndentedString(workersConfiguration)).append("\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    clouderaManagerUsername: ").append(toIndentedString(clouderaManagerUsername)).append("\n");
    sb.append("    clouderaManagerPassword: ").append(toIndentedString(clouderaManagerPassword)).append("\n");
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

