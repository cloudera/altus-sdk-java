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

/**
 * AWS-specific security configuration. This will only be populated for AWS clusters with security enabled.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-11-16T18:04:32.454-08:00")
public class ClusterSecurityConfigurationAwsDetails  {

  /**
   * The ARN of the KMS key used to encrypt non-root EBS volumes. If not set, and security is enabled, the default AWS managed CMK for EBS was used.
   **/
  private String ebsEncryptionKmsKey = null;

  /**
   * Getter for ebsEncryptionKmsKey.
   * The ARN of the KMS key used to encrypt non-root EBS volumes. If not set, and security is enabled, the default AWS managed CMK for EBS was used.
   **/
  @JsonProperty("ebsEncryptionKmsKey")
  public String getEbsEncryptionKmsKey() {
    return ebsEncryptionKmsKey;
  }

  /**
   * Setter for ebsEncryptionKmsKey.
   * The ARN of the KMS key used to encrypt non-root EBS volumes. If not set, and security is enabled, the default AWS managed CMK for EBS was used.
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
    ClusterSecurityConfigurationAwsDetails clusterSecurityConfigurationAwsDetails = (ClusterSecurityConfigurationAwsDetails) o;
    if (!Objects.equals(this.ebsEncryptionKmsKey, clusterSecurityConfigurationAwsDetails.ebsEncryptionKmsKey)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebsEncryptionKmsKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSecurityConfigurationAwsDetails {\n");
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

