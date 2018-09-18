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
import com.cloudera.altus.sdx.model.JdbcUrlConfigurationDetails;

/**
 * Configured namespace specific information.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-09-18T14:55:51.656-07:00")
public class NamespaceConfiguredDetails  {

  /**
   * Passthrough connection details for the HMS database.
   **/
  private JdbcUrlConfigurationDetails hmsJdbcUrlDetails = null;

  /**
   * Passthrough connection details for the Sentry database.
   **/
  private JdbcUrlConfigurationDetails sentryJdbcUrlDetails = null;

  /**
   * Getter for hmsJdbcUrlDetails.
   * Passthrough connection details for the HMS database.
   **/
  @JsonProperty("hmsJdbcUrlDetails")
  public JdbcUrlConfigurationDetails getHmsJdbcUrlDetails() {
    return hmsJdbcUrlDetails;
  }

  /**
   * Setter for hmsJdbcUrlDetails.
   * Passthrough connection details for the HMS database.
   **/
  public void setHmsJdbcUrlDetails(JdbcUrlConfigurationDetails hmsJdbcUrlDetails) {
    this.hmsJdbcUrlDetails = hmsJdbcUrlDetails;
  }

  /**
   * Getter for sentryJdbcUrlDetails.
   * Passthrough connection details for the Sentry database.
   **/
  @JsonProperty("sentryJdbcUrlDetails")
  public JdbcUrlConfigurationDetails getSentryJdbcUrlDetails() {
    return sentryJdbcUrlDetails;
  }

  /**
   * Setter for sentryJdbcUrlDetails.
   * Passthrough connection details for the Sentry database.
   **/
  public void setSentryJdbcUrlDetails(JdbcUrlConfigurationDetails sentryJdbcUrlDetails) {
    this.sentryJdbcUrlDetails = sentryJdbcUrlDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamespaceConfiguredDetails namespaceConfiguredDetails = (NamespaceConfiguredDetails) o;
    if (!Objects.equals(this.hmsJdbcUrlDetails, namespaceConfiguredDetails.hmsJdbcUrlDetails)) {
      return false;
    }
    if (!Objects.equals(this.sentryJdbcUrlDetails, namespaceConfiguredDetails.sentryJdbcUrlDetails)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(hmsJdbcUrlDetails, sentryJdbcUrlDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamespaceConfiguredDetails {\n");
    sb.append("    hmsJdbcUrlDetails: ").append(toIndentedString(hmsJdbcUrlDetails)).append("\n");
    sb.append("    sentryJdbcUrlDetails: ").append(toIndentedString(sentryJdbcUrlDetails)).append("\n");
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

