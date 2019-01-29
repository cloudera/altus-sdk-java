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
import com.cloudera.altus.sdx.model.JdbcUrlConfiguration;

/**
 * Request object for a create configured namespace request.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:13.430-08:00")
public class CreateConfiguredNamespaceRequest  {

  /**
   * The name of the configured namespace. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters, hyphens and underscores. Names are case-sensitive.
   **/
  private String namespaceName = null;

  /**
   * The JDBC configuration for an existing HMS database to be used by the configured namespace.
   **/
  private JdbcUrlConfiguration hmsJdbcUrlConfig = null;

  /**
   * The JDBC configuration for an existing Sentry database to be used by the configured namespace.
   **/
  private JdbcUrlConfiguration sentryJdbcUrlConfig = null;

  /**
   * Getter for namespaceName.
   * The name of the configured namespace. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters, hyphens and underscores. Names are case-sensitive.
   **/
  @JsonProperty("namespaceName")
  public String getNamespaceName() {
    return namespaceName;
  }

  /**
   * Setter for namespaceName.
   * The name of the configured namespace. This name must be unique, must have a maximum of 128 characters, and must contain only alphanumeric characters, hyphens and underscores. Names are case-sensitive.
   **/
  public void setNamespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
  }

  /**
   * Getter for hmsJdbcUrlConfig.
   * The JDBC configuration for an existing HMS database to be used by the configured namespace.
   **/
  @JsonProperty("hmsJdbcUrlConfig")
  public JdbcUrlConfiguration getHmsJdbcUrlConfig() {
    return hmsJdbcUrlConfig;
  }

  /**
   * Setter for hmsJdbcUrlConfig.
   * The JDBC configuration for an existing HMS database to be used by the configured namespace.
   **/
  public void setHmsJdbcUrlConfig(JdbcUrlConfiguration hmsJdbcUrlConfig) {
    this.hmsJdbcUrlConfig = hmsJdbcUrlConfig;
  }

  /**
   * Getter for sentryJdbcUrlConfig.
   * The JDBC configuration for an existing Sentry database to be used by the configured namespace.
   **/
  @JsonProperty("sentryJdbcUrlConfig")
  public JdbcUrlConfiguration getSentryJdbcUrlConfig() {
    return sentryJdbcUrlConfig;
  }

  /**
   * Setter for sentryJdbcUrlConfig.
   * The JDBC configuration for an existing Sentry database to be used by the configured namespace.
   **/
  public void setSentryJdbcUrlConfig(JdbcUrlConfiguration sentryJdbcUrlConfig) {
    this.sentryJdbcUrlConfig = sentryJdbcUrlConfig;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfiguredNamespaceRequest createConfiguredNamespaceRequest = (CreateConfiguredNamespaceRequest) o;
    if (!Objects.equals(this.namespaceName, createConfiguredNamespaceRequest.namespaceName)) {
      return false;
    }
    if (!Objects.equals(this.hmsJdbcUrlConfig, createConfiguredNamespaceRequest.hmsJdbcUrlConfig)) {
      return false;
    }
    if (!Objects.equals(this.sentryJdbcUrlConfig, createConfiguredNamespaceRequest.sentryJdbcUrlConfig)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceName, hmsJdbcUrlConfig, sentryJdbcUrlConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateConfiguredNamespaceRequest {\n");
    sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
    sb.append("    hmsJdbcUrlConfig: ").append(toIndentedString(hmsJdbcUrlConfig)).append("\n");
    sb.append("    sentryJdbcUrlConfig: ").append(toIndentedString(sentryJdbcUrlConfig)).append("\n");
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

