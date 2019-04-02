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
import com.cloudera.altus.dataeng.model.AWSInstanceConfiguration;

/**
 * Compute workers group configuration.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-04-02T14:15:31.936-07:00")
public class ClusterComputeWorkersConfiguration  {

  /**
   * The compute workers group size.
   **/
  private Integer groupSize = null;

  /**
   * AWS-specific instance configuration.
   **/
  private AWSInstanceConfiguration awsDetails = null;

  /**
   * Getter for groupSize.
   * The compute workers group size.
   **/
  @JsonProperty("groupSize")
  public Integer getGroupSize() {
    return groupSize;
  }

  /**
   * Setter for groupSize.
   * The compute workers group size.
   **/
  public void setGroupSize(Integer groupSize) {
    this.groupSize = groupSize;
  }

  /**
   * Getter for awsDetails.
   * AWS-specific instance configuration.
   **/
  @JsonProperty("awsDetails")
  public AWSInstanceConfiguration getAwsDetails() {
    return awsDetails;
  }

  /**
   * Setter for awsDetails.
   * AWS-specific instance configuration.
   **/
  public void setAwsDetails(AWSInstanceConfiguration awsDetails) {
    this.awsDetails = awsDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterComputeWorkersConfiguration clusterComputeWorkersConfiguration = (ClusterComputeWorkersConfiguration) o;
    if (!Objects.equals(this.groupSize, clusterComputeWorkersConfiguration.groupSize)) {
      return false;
    }
    if (!Objects.equals(this.awsDetails, clusterComputeWorkersConfiguration.awsDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupSize, awsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterComputeWorkersConfiguration {\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    awsDetails: ").append(toIndentedString(awsDetails)).append("\n");
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

