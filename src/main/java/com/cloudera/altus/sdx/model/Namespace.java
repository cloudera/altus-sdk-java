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

package com.cloudera.altus.sdx.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import com.cloudera.altus.sdx.model.NamespaceConfiguredDetails;
import java.time.ZonedDateTime;

/**
 * Information about a metadata namespace.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-08-28T09:14:05.375-07:00")
public class Namespace  {

  /**
   * The name of the namespace.
   **/
  private String namespaceName = null;

  /**
   * The CRN of the namespace.
   **/
  private String crn = null;

  /**
   * The status of the namespace.
   **/
  private String status = null;

  /**
   * The date when this namespace record was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * The CRN of the namespace admin group.
   **/
  private String adminGroupCrn = null;

  /**
   * The type of the namespace.
   **/
  private String type = null;

  /**
   * 
   **/
  private NamespaceConfiguredDetails configuredDetails = null;

  /**
   * Getter for namespaceName.
   * The name of the namespace.
   **/
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  /**
   * Setter for namespaceName.
   * The name of the namespace.
   **/
  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  /**
   * Getter for crn.
   * The CRN of the namespace.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the namespace.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for status.
   * The status of the namespace.
   **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  /**
   * Setter for status.
   * The status of the namespace.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Getter for creationDate.
   * The date when this namespace record was created.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   * The date when this namespace record was created.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for adminGroupCrn.
   * The CRN of the namespace admin group.
   **/
  @JsonProperty("adminGroupCrn")
  public String getAdminGroupCrn() {
    return adminGroupCrn;
  }

  /**
   * Setter for adminGroupCrn.
   * The CRN of the namespace admin group.
   **/
  public void setAdminGroupCrn(String adminGroupCrn) {
    this.adminGroupCrn = adminGroupCrn;
  }

  /**
   * Getter for type.
   * The type of the namespace.
   **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Setter for type.
   * The type of the namespace.
   **/
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Getter for configuredDetails.
   * 
   **/
  @JsonProperty("configuredDetails")
  public NamespaceConfiguredDetails getConfiguredDetails() {
    return configuredDetails;
  }

  /**
   * Setter for configuredDetails.
   * 
   **/
  public void setConfiguredDetails(NamespaceConfiguredDetails configuredDetails) {
    this.configuredDetails = configuredDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Namespace namespace = (Namespace) o;
    if (!Objects.equals(this.namespaceName, namespace.namespaceName)) {
      return false;
    }
    if (!Objects.equals(this.crn, namespace.crn)) {
      return false;
    }
    if (!Objects.equals(this.status, namespace.status)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, namespace.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.adminGroupCrn, namespace.adminGroupCrn)) {
      return false;
    }
    if (!Objects.equals(this.type, namespace.type)) {
      return false;
    }
    if (!Objects.equals(this.configuredDetails, namespace.configuredDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceName, crn, status, creationDate, adminGroupCrn, type, configuredDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Namespace {\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    adminGroupCrn: ").append(toIndentedString(adminGroupCrn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    configuredDetails: ").append(toIndentedString(configuredDetails)).append("\n");
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

