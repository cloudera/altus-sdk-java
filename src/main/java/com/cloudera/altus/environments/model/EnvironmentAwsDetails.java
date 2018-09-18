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
import com.cloudera.altus.environments.model.S3GuardConfiguration;
import java.util.*;

/**
 * AWS-specific environment information.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-09-18T14:55:51.547-07:00")
public class EnvironmentAwsDetails  {

  /**
   * The ARN of the delegated role.
   **/
  private String delegatedRoleArn = null;

  /**
   * The name of the IAM instance profile.
   **/
  private String instanceProfileName = null;

  /**
   * The network subnets.
   **/
  private List<String> subnets = new ArrayList<String>();

  /**
   * The security groups.
   **/
  private List<String> securityGroups = new ArrayList<String>();

  /**
   * The network region.
   **/
  private String region = null;

  /**
   * The name of the S3 log archive bucket in which cluster logs will be stored.
   **/
  private String logArchiveBucketName = null;

  /**
   * The flag to allow auto registration of SSH keys provided during cluster creation. Key pairs will be imported with name \\'CLOUDERA-\\' followed by the corresponding private key fingerprint.
   **/
  private Boolean autoRegisterClusterSshKeys = null;

  /**
   * The configurations required to enable S3 consistent view (S3Guard).
   **/
  private S3GuardConfiguration s3GuardConfiguration = null;

  /**
   * The ARN of the KMS key used to encrypt non-root cluster EBS volumes. If not set, and securedClusters is true, the default AWS managed CMK for EBS will be used.
   **/
  private String ebsEncryptionKmsKey = null;

  /**
   * Getter for delegatedRoleArn.
   * The ARN of the delegated role.
   **/
  @JsonProperty("delegatedRoleArn")
  public String getDelegatedRoleArn() {
    return delegatedRoleArn;
  }

  /**
   * Setter for delegatedRoleArn.
   * The ARN of the delegated role.
   **/
  public void setDelegatedRoleArn(String delegatedRoleArn) {
    this.delegatedRoleArn = delegatedRoleArn;
  }

  /**
   * Getter for instanceProfileName.
   * The name of the IAM instance profile.
   **/
  @JsonProperty("instanceProfileName")
  public String getInstanceProfileName() {
    return instanceProfileName;
  }

  /**
   * Setter for instanceProfileName.
   * The name of the IAM instance profile.
   **/
  public void setInstanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
  }

  /**
   * Getter for subnets.
   * The network subnets.
   **/
  @JsonProperty("subnets")
  public List<String> getSubnets() {
    return subnets;
  }

  /**
   * Setter for subnets.
   * The network subnets.
   **/
  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }

  /**
   * Getter for securityGroups.
   * The security groups.
   **/
  @JsonProperty("securityGroups")
  public List<String> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Setter for securityGroups.
   * The security groups.
   **/
  public void setSecurityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
  }

  /**
   * Getter for region.
   * The network region.
   **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  /**
   * Setter for region.
   * The network region.
   **/
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * Getter for logArchiveBucketName.
   * The name of the S3 log archive bucket in which cluster logs will be stored.
   **/
  @JsonProperty("logArchiveBucketName")
  public String getLogArchiveBucketName() {
    return logArchiveBucketName;
  }

  /**
   * Setter for logArchiveBucketName.
   * The name of the S3 log archive bucket in which cluster logs will be stored.
   **/
  public void setLogArchiveBucketName(String logArchiveBucketName) {
    this.logArchiveBucketName = logArchiveBucketName;
  }

  /**
   * Getter for autoRegisterClusterSshKeys.
   * The flag to allow auto registration of SSH keys provided during cluster creation. Key pairs will be imported with name \\&#39;CLOUDERA-\\&#39; followed by the corresponding private key fingerprint.
   **/
  @JsonProperty("autoRegisterClusterSshKeys")
  public Boolean getAutoRegisterClusterSshKeys() {
    return autoRegisterClusterSshKeys;
  }

  /**
   * Setter for autoRegisterClusterSshKeys.
   * The flag to allow auto registration of SSH keys provided during cluster creation. Key pairs will be imported with name \\&#39;CLOUDERA-\\&#39; followed by the corresponding private key fingerprint.
   **/
  public void setAutoRegisterClusterSshKeys(Boolean autoRegisterClusterSshKeys) {
    this.autoRegisterClusterSshKeys = autoRegisterClusterSshKeys;
  }

  /**
   * Getter for s3GuardConfiguration.
   * The configurations required to enable S3 consistent view (S3Guard).
   **/
  @JsonProperty("s3GuardConfiguration")
  public S3GuardConfiguration getS3GuardConfiguration() {
    return s3GuardConfiguration;
  }

  /**
   * Setter for s3GuardConfiguration.
   * The configurations required to enable S3 consistent view (S3Guard).
   **/
  public void setS3GuardConfiguration(S3GuardConfiguration s3GuardConfiguration) {
    this.s3GuardConfiguration = s3GuardConfiguration;
  }

  /**
   * Getter for ebsEncryptionKmsKey.
   * The ARN of the KMS key used to encrypt non-root cluster EBS volumes. If not set, and securedClusters is true, the default AWS managed CMK for EBS will be used.
   **/
  @JsonProperty("ebsEncryptionKmsKey")
  public String getEbsEncryptionKmsKey() {
    return ebsEncryptionKmsKey;
  }

  /**
   * Setter for ebsEncryptionKmsKey.
   * The ARN of the KMS key used to encrypt non-root cluster EBS volumes. If not set, and securedClusters is true, the default AWS managed CMK for EBS will be used.
   **/
  public void setEbsEncryptionKmsKey(String ebsEncryptionKmsKey) {
    this.ebsEncryptionKmsKey = ebsEncryptionKmsKey;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentAwsDetails environmentAwsDetails = (EnvironmentAwsDetails) o;
    if (!Objects.equals(this.delegatedRoleArn, environmentAwsDetails.delegatedRoleArn)) {
      return false;
    }
    if (!Objects.equals(this.instanceProfileName, environmentAwsDetails.instanceProfileName)) {
      return false;
    }
    if (!Objects.equals(this.subnets, environmentAwsDetails.subnets)) {
      return false;
    }
    if (!Objects.equals(this.securityGroups, environmentAwsDetails.securityGroups)) {
      return false;
    }
    if (!Objects.equals(this.region, environmentAwsDetails.region)) {
      return false;
    }
    if (!Objects.equals(this.logArchiveBucketName, environmentAwsDetails.logArchiveBucketName)) {
      return false;
    }
    if (!Objects.equals(this.autoRegisterClusterSshKeys, environmentAwsDetails.autoRegisterClusterSshKeys)) {
      return false;
    }
    if (!Objects.equals(this.s3GuardConfiguration, environmentAwsDetails.s3GuardConfiguration)) {
      return false;
    }
    if (!Objects.equals(this.ebsEncryptionKmsKey, environmentAwsDetails.ebsEncryptionKmsKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegatedRoleArn, instanceProfileName, subnets, securityGroups, region, logArchiveBucketName, autoRegisterClusterSshKeys, s3GuardConfiguration, ebsEncryptionKmsKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentAwsDetails {\n");
    sb.append("    delegatedRoleArn: ").append(toIndentedString(delegatedRoleArn)).append("\n");
    sb.append("    instanceProfileName: ").append(toIndentedString(instanceProfileName)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    logArchiveBucketName: ").append(toIndentedString(logArchiveBucketName)).append("\n");
    sb.append("    autoRegisterClusterSshKeys: ").append(toIndentedString(autoRegisterClusterSshKeys)).append("\n");
    sb.append("    s3GuardConfiguration: ").append(toIndentedString(s3GuardConfiguration)).append("\n");
    sb.append("    ebsEncryptionKmsKey: ").append(toIndentedString(ebsEncryptionKmsKey)).append("\n");
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

