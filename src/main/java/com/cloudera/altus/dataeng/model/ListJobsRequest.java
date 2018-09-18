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
import java.time.ZonedDateTime;
import java.util.*;

/**
 * Request object for a list jobs request. One or more filters can be applied. If multiple filters are specified, all of them will be applied.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-09-18T10:40:16.973-07:00")
public class ListJobsRequest  {

  /**
   * The IDs of the jobs.
   **/
  private List<String> jobIds = new ArrayList<String>();

  /**
   * Filters the job list to the jobs with this environment.
   **/
  private String environmentCrn = null;

  /**
   * Filters the job list to the jobs with this cluster.
   **/
  private String clusterCrn = null;

  /**
   * Filters the job list to the jobs with this submitter.
   **/
  private String submitterCrn = null;

  /**
   * Filters the job list to the jobs with these job types.
   **/
  private List<String> jobTypes = new ArrayList<String>();

  /**
   * Filters the job list to the jobs with these statuses.
   **/
  private List<String> jobStatuses = new ArrayList<String>();;

  /**
   * Filters the job list to jobs with creation dates at or after this value.
   **/
  private ZonedDateTime creationDateAfter = null;

  /**
   * Filters the job list to jobs with creation dates at or before this value.
   **/
  private ZonedDateTime creationDateBefore = null;

  /**
   * Controls the order in which jobs are returned. The default is NEWEST_TO_OLDEST.
   **/
  private String order = null;

  /**
   * The size of each page.
   **/
  private Integer pageSize = null;

  /**
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  private String startingToken = null;

  /**
   * Getter for jobIds.
   * The IDs of the jobs.
   **/
  @JsonProperty("jobIds")
  public List<String> getJobIds() {
    return jobIds;
  }

  /**
   * Setter for jobIds.
   * The IDs of the jobs.
   **/
  public void setJobIds(List<String> jobIds) {
    this.jobIds = jobIds;
  }

  /**
   * Getter for environmentCrn.
   * Filters the job list to the jobs with this environment.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * Filters the job list to the jobs with this environment.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for clusterCrn.
   * Filters the job list to the jobs with this cluster.
   **/
  @JsonProperty("clusterCrn")
  public String getClusterCrn() {
    return clusterCrn;
  }

  /**
   * Setter for clusterCrn.
   * Filters the job list to the jobs with this cluster.
   **/
  public void setClusterCrn(String clusterCrn) {
    this.clusterCrn = clusterCrn;
  }

  /**
   * Getter for submitterCrn.
   * Filters the job list to the jobs with this submitter.
   **/
  @JsonProperty("submitterCrn")
  public String getSubmitterCrn() {
    return submitterCrn;
  }

  /**
   * Setter for submitterCrn.
   * Filters the job list to the jobs with this submitter.
   **/
  public void setSubmitterCrn(String submitterCrn) {
    this.submitterCrn = submitterCrn;
  }

  /**
   * Getter for jobTypes.
   * Filters the job list to the jobs with these job types.
   **/
  @JsonProperty("jobTypes")
  public List<String> getJobTypes() {
    return jobTypes;
  }

  /**
   * Setter for jobTypes.
   * Filters the job list to the jobs with these job types.
   **/
  public void setJobTypes(List<String> jobTypes) {
    this.jobTypes = jobTypes;
  }

  /**
   * Getter for jobStatuses.
   * Filters the job list to the jobs with these statuses.
   **/
  @JsonProperty("jobStatuses")
  public List<String> getJobStatuses() {
    return jobStatuses;
  }

  /**
   * Setter for jobStatuses.
   * Filters the job list to the jobs with these statuses.
   **/
  public void setJobStatuses(List<String> jobStatuses) {
    this.jobStatuses = jobStatuses;
  }

  /**
   * Getter for creationDateAfter.
   * Filters the job list to jobs with creation dates at or after this value.
   **/
  @JsonProperty("creationDateAfter")
  public ZonedDateTime getCreationDateAfter() {
    return creationDateAfter;
  }

  /**
   * Setter for creationDateAfter.
   * Filters the job list to jobs with creation dates at or after this value.
   **/
  public void setCreationDateAfter(ZonedDateTime creationDateAfter) {
    this.creationDateAfter = creationDateAfter;
  }

  /**
   * Getter for creationDateBefore.
   * Filters the job list to jobs with creation dates at or before this value.
   **/
  @JsonProperty("creationDateBefore")
  public ZonedDateTime getCreationDateBefore() {
    return creationDateBefore;
  }

  /**
   * Setter for creationDateBefore.
   * Filters the job list to jobs with creation dates at or before this value.
   **/
  public void setCreationDateBefore(ZonedDateTime creationDateBefore) {
    this.creationDateBefore = creationDateBefore;
  }

  /**
   * Getter for order.
   * Controls the order in which jobs are returned. The default is NEWEST_TO_OLDEST.
   **/
  @JsonProperty("order")
  public String getOrder() {
    return order;
  }

  /**
   * Setter for order.
   * Controls the order in which jobs are returned. The default is NEWEST_TO_OLDEST.
   **/
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * Getter for pageSize.
   * The size of each page.
   **/
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * Setter for pageSize.
   * The size of each page.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * Getter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  @JsonProperty("startingToken")
  public String getStartingToken() {
    return startingToken;
  }

  /**
   * Setter for startingToken.
   * A token to specify where to start paginating. This is the nextToken from a previously truncated response.
   **/
  public void setStartingToken(String startingToken) {
    this.startingToken = startingToken;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListJobsRequest listJobsRequest = (ListJobsRequest) o;
    if (!Objects.equals(this.jobIds, listJobsRequest.jobIds)) {
      return false;
    }
    if (!Objects.equals(this.environmentCrn, listJobsRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.clusterCrn, listJobsRequest.clusterCrn)) {
      return false;
    }
    if (!Objects.equals(this.submitterCrn, listJobsRequest.submitterCrn)) {
      return false;
    }
    if (!Objects.equals(this.jobTypes, listJobsRequest.jobTypes)) {
      return false;
    }
    if (!Objects.equals(this.jobStatuses, listJobsRequest.jobStatuses)) {
      return false;
    }
    if (!Objects.equals(this.creationDateAfter, listJobsRequest.creationDateAfter)) {
      return false;
    }
    if (!Objects.equals(this.creationDateBefore, listJobsRequest.creationDateBefore)) {
      return false;
    }
    if (!Objects.equals(this.order, listJobsRequest.order)) {
      return false;
    }
    if (!Objects.equals(this.pageSize, listJobsRequest.pageSize)) {
      return false;
    }
    if (!Objects.equals(this.startingToken, listJobsRequest.startingToken)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobIds, environmentCrn, clusterCrn, submitterCrn, jobTypes, jobStatuses, creationDateAfter, creationDateBefore, order, pageSize, startingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListJobsRequest {\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    clusterCrn: ").append(toIndentedString(clusterCrn)).append("\n");
    sb.append("    submitterCrn: ").append(toIndentedString(submitterCrn)).append("\n");
    sb.append("    jobTypes: ").append(toIndentedString(jobTypes)).append("\n");
    sb.append("    jobStatuses: ").append(toIndentedString(jobStatuses)).append("\n");
    sb.append("    creationDateAfter: ").append(toIndentedString(creationDateAfter)).append("\n");
    sb.append("    creationDateBefore: ").append(toIndentedString(creationDateBefore)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    startingToken: ").append(toIndentedString(startingToken)).append("\n");
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

