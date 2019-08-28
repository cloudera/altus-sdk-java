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

package com.cloudera.altus.environments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.environments.model.WorkloadAnalyticsConfigurationRequest;

/**
 * Request object for a CreateAzureEnvironment request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-08-28T09:14:05.210-07:00")
public class CreateAzureEnvironmentRequest  {

  /**
   * The name of the environment. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  private String name = null;

  /**
   * The subscription ID.
   **/
  private String subscriptionId = null;

  /**
   * Supported Azure regions.
   **/
  private String region = null;

  /**
   * The Azure AD tenant ID for the Azure subscription.
   **/
  private String aadTenantId = null;

  /**
   * The resource group where the virtual network is located.
   **/
  private String vnetResourceGroup = null;

  /**
   * The virtual network name.
   **/
  private String vnetName = null;

  /**
   * The subnet name.
   **/
  private String subnetName = null;

  /**
   * The resource group where the network security group is located.
   **/
  private String networkSecurityGroupResourceGroup = null;

  /**
   * The network security group name.
   **/
  private String networkSecurityGroupName = null;

  /**
   * The resource group where the cluster nodes are located.
   **/
  private String clusterNodeResourceGroup = null;

  /**
   * The resource group where the Assigned Managed Service Identity is located.
   **/
  private String userAssignedMsiResourceGroup = null;

  /**
   * The User Assigned Managed Service Identity Name.
   **/
  private String userAssignedMsiName = null;

  /**
   * Configuration for integration with Altus Workload Analytics.
   **/
  private WorkloadAnalyticsConfigurationRequest workloadAnalyticsConfiguration = null;

  /**
   * The full URL of the ADLS / ADLS Gen2 folder in which cluster logs will be stored.
   **/
  private String logArchiveFolderPath = null;

  /**
   * If true all clusters created with this environment will be secured. Cluster services will require authentication and wire encryption will be enabled.
   **/
  private Boolean securedClusters = null;

  /**
   * If true the clusters created with this environment will have public IP addresses assigned to them.  If false, no public IPs will be assigned.
   **/
  private Boolean associatePublicIps = null;

  /**
   * Getter for name.
   * The name of the environment. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The name of the environment. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters and hyphens. Names are case-sensitive.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for subscriptionId.
   * The subscription ID.
   **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Setter for subscriptionId.
   * The subscription ID.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  /**
   * Getter for region.
   * Supported Azure regions.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * Supported Azure regions.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for aadTenantId.
   * The Azure AD tenant ID for the Azure subscription.
   **/
  @JsonProperty("aadTenantId")
  public String getAadTenantId() {
    return aadTenantId;
  }

  /**
   * Setter for aadTenantId.
   * The Azure AD tenant ID for the Azure subscription.
   **/
  public void setAadTenantId(String aadTenantId) {
    this.aadTenantId = aadTenantId;
  }

  /**
   * Getter for vnetResourceGroup.
   * The resource group where the virtual network is located.
   **/
  @JsonProperty("vnetResourceGroup")
  public String getVnetResourceGroup() {
    return vnetResourceGroup;
  }

  /**
   * Setter for vnetResourceGroup.
   * The resource group where the virtual network is located.
   **/
  public void setVnetResourceGroup(String vnetResourceGroup) {
    this.vnetResourceGroup = vnetResourceGroup;
  }

  /**
   * Getter for vnetName.
   * The virtual network name.
   **/
  @JsonProperty("vnetName")
  public String getVnetName() {
    return vnetName;
  }

  /**
   * Setter for vnetName.
   * The virtual network name.
   **/
  public void setVnetName(String vnetName) {
    this.vnetName = vnetName;
  }

  /**
   * Getter for subnetName.
   * The subnet name.
   **/
  @JsonProperty("subnetName")
  public String getSubnetName() {
    return subnetName;
  }

  /**
   * Setter for subnetName.
   * The subnet name.
   **/
  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  /**
   * Getter for networkSecurityGroupResourceGroup.
   * The resource group where the network security group is located.
   **/
  @JsonProperty("networkSecurityGroupResourceGroup")
  public String getNetworkSecurityGroupResourceGroup() {
    return networkSecurityGroupResourceGroup;
  }

  /**
   * Setter for networkSecurityGroupResourceGroup.
   * The resource group where the network security group is located.
   **/
  public void setNetworkSecurityGroupResourceGroup(String networkSecurityGroupResourceGroup) {
    this.networkSecurityGroupResourceGroup = networkSecurityGroupResourceGroup;
  }

  /**
   * Getter for networkSecurityGroupName.
   * The network security group name.
   **/
  @JsonProperty("networkSecurityGroupName")
  public String getNetworkSecurityGroupName() {
    return networkSecurityGroupName;
  }

  /**
   * Setter for networkSecurityGroupName.
   * The network security group name.
   **/
  public void setNetworkSecurityGroupName(String networkSecurityGroupName) {
    this.networkSecurityGroupName = networkSecurityGroupName;
  }

  /**
   * Getter for clusterNodeResourceGroup.
   * The resource group where the cluster nodes are located.
   **/
  @JsonProperty("clusterNodeResourceGroup")
  public String getClusterNodeResourceGroup() {
    return clusterNodeResourceGroup;
  }

  /**
   * Setter for clusterNodeResourceGroup.
   * The resource group where the cluster nodes are located.
   **/
  public void setClusterNodeResourceGroup(String clusterNodeResourceGroup) {
    this.clusterNodeResourceGroup = clusterNodeResourceGroup;
  }

  /**
   * Getter for userAssignedMsiResourceGroup.
   * The resource group where the Assigned Managed Service Identity is located.
   **/
  @JsonProperty("userAssignedMsiResourceGroup")
  public String getUserAssignedMsiResourceGroup() {
    return userAssignedMsiResourceGroup;
  }

  /**
   * Setter for userAssignedMsiResourceGroup.
   * The resource group where the Assigned Managed Service Identity is located.
   **/
  public void setUserAssignedMsiResourceGroup(String userAssignedMsiResourceGroup) {
    this.userAssignedMsiResourceGroup = userAssignedMsiResourceGroup;
  }

  /**
   * Getter for userAssignedMsiName.
   * The User Assigned Managed Service Identity Name.
   **/
  @JsonProperty("userAssignedMsiName")
  public String getUserAssignedMsiName() {
    return userAssignedMsiName;
  }

  /**
   * Setter for userAssignedMsiName.
   * The User Assigned Managed Service Identity Name.
   **/
  public void setUserAssignedMsiName(String userAssignedMsiName) {
    this.userAssignedMsiName = userAssignedMsiName;
  }

  /**
   * Getter for workloadAnalyticsConfiguration.
   * Configuration for integration with Altus Workload Analytics.
   **/
  @JsonProperty("workloadAnalyticsConfiguration")
  public WorkloadAnalyticsConfigurationRequest getWorkloadAnalyticsConfiguration() {
    return workloadAnalyticsConfiguration;
  }

  /**
   * Setter for workloadAnalyticsConfiguration.
   * Configuration for integration with Altus Workload Analytics.
   **/
  public void setWorkloadAnalyticsConfiguration(WorkloadAnalyticsConfigurationRequest workloadAnalyticsConfiguration) {
    this.workloadAnalyticsConfiguration = workloadAnalyticsConfiguration;
  }

  /**
   * Getter for logArchiveFolderPath.
   * The full URL of the ADLS / ADLS Gen2 folder in which cluster logs will be stored.
   **/
  @JsonProperty("logArchiveFolderPath")
  public String getLogArchiveFolderPath() {
    return logArchiveFolderPath;
  }

  /**
   * Setter for logArchiveFolderPath.
   * The full URL of the ADLS / ADLS Gen2 folder in which cluster logs will be stored.
   **/
  public void setLogArchiveFolderPath(String logArchiveFolderPath) {
    this.logArchiveFolderPath = logArchiveFolderPath;
  }

  /**
   * Getter for securedClusters.
   * If true all clusters created with this environment will be secured. Cluster services will require authentication and wire encryption will be enabled.
   **/
  @JsonProperty("securedClusters")
  public Boolean getSecuredClusters() {
    return securedClusters;
  }

  /**
   * Setter for securedClusters.
   * If true all clusters created with this environment will be secured. Cluster services will require authentication and wire encryption will be enabled.
   **/
  public void setSecuredClusters(Boolean securedClusters) {
    this.securedClusters = securedClusters;
  }

  /**
   * Getter for associatePublicIps.
   * If true the clusters created with this environment will have public IP addresses assigned to them.  If false, no public IPs will be assigned.
   **/
  @JsonProperty("associatePublicIps")
  public Boolean getAssociatePublicIps() {
    return associatePublicIps;
  }

  /**
   * Setter for associatePublicIps.
   * If true the clusters created with this environment will have public IP addresses assigned to them.  If false, no public IPs will be assigned.
   **/
  public void setAssociatePublicIps(Boolean associatePublicIps) {
    this.associatePublicIps = associatePublicIps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAzureEnvironmentRequest createAzureEnvironmentRequest = (CreateAzureEnvironmentRequest) o;
    if (!Objects.equals(this.name, createAzureEnvironmentRequest.name)) {
      return false;
    }
    if (!Objects.equals(this.subscriptionId, createAzureEnvironmentRequest.subscriptionId)) {
      return false;
    }
    if (!Objects.equals(this.region, createAzureEnvironmentRequest.region)) {
      return false;
    }
    if (!Objects.equals(this.aadTenantId, createAzureEnvironmentRequest.aadTenantId)) {
      return false;
    }
    if (!Objects.equals(this.vnetResourceGroup, createAzureEnvironmentRequest.vnetResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.vnetName, createAzureEnvironmentRequest.vnetName)) {
      return false;
    }
    if (!Objects.equals(this.subnetName, createAzureEnvironmentRequest.subnetName)) {
      return false;
    }
    if (!Objects.equals(this.networkSecurityGroupResourceGroup, createAzureEnvironmentRequest.networkSecurityGroupResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.networkSecurityGroupName, createAzureEnvironmentRequest.networkSecurityGroupName)) {
      return false;
    }
    if (!Objects.equals(this.clusterNodeResourceGroup, createAzureEnvironmentRequest.clusterNodeResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.userAssignedMsiResourceGroup, createAzureEnvironmentRequest.userAssignedMsiResourceGroup)) {
      return false;
    }
    if (!Objects.equals(this.userAssignedMsiName, createAzureEnvironmentRequest.userAssignedMsiName)) {
      return false;
    }
    if (!Objects.equals(this.workloadAnalyticsConfiguration, createAzureEnvironmentRequest.workloadAnalyticsConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.logArchiveFolderPath, createAzureEnvironmentRequest.logArchiveFolderPath)) {
      return false;
    }
    if (!Objects.equals(this.securedClusters, createAzureEnvironmentRequest.securedClusters)) {
      return false;
    }
    if (!Objects.equals(this.associatePublicIps, createAzureEnvironmentRequest.associatePublicIps)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriptionId, region, aadTenantId, vnetResourceGroup, vnetName, subnetName, networkSecurityGroupResourceGroup, networkSecurityGroupName, clusterNodeResourceGroup, userAssignedMsiResourceGroup, userAssignedMsiName, workloadAnalyticsConfiguration, logArchiveFolderPath, securedClusters, associatePublicIps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAzureEnvironmentRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    aadTenantId: ").append(toIndentedString(aadTenantId)).append("\n");
    sb.append("    vnetResourceGroup: ").append(toIndentedString(vnetResourceGroup)).append("\n");
    sb.append("    vnetName: ").append(toIndentedString(vnetName)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    networkSecurityGroupResourceGroup: ").append(toIndentedString(networkSecurityGroupResourceGroup)).append("\n");
    sb.append("    networkSecurityGroupName: ").append(toIndentedString(networkSecurityGroupName)).append("\n");
    sb.append("    clusterNodeResourceGroup: ").append(toIndentedString(clusterNodeResourceGroup)).append("\n");
    sb.append("    userAssignedMsiResourceGroup: ").append(toIndentedString(userAssignedMsiResourceGroup)).append("\n");
    sb.append("    userAssignedMsiName: ").append(toIndentedString(userAssignedMsiName)).append("\n");
    sb.append("    workloadAnalyticsConfiguration: ").append(toIndentedString(workloadAnalyticsConfiguration)).append("\n");
    sb.append("    logArchiveFolderPath: ").append(toIndentedString(logArchiveFolderPath)).append("\n");
    sb.append("    securedClusters: ").append(toIndentedString(securedClusters)).append("\n");
    sb.append("    associatePublicIps: ").append(toIndentedString(associatePublicIps)).append("\n");
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

