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

/**
 * Object used to specify a JDBC connection using a JDBC URL.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:13.430-08:00")
public class JdbcUrlConfiguration  {

  /**
   * The JDBC URL for connection.
   **/
  private String jdbcUrl = null;

  /**
   * The JDBC connection username.
   **/
  private String username = null;

  /**
   * The JDBC connection password.
   **/
  private String password = null;

  /**
   * Getter for jdbcUrl.
   * The JDBC URL for connection.
   **/
  @JsonProperty("jdbcUrl")
  public String getJdbcUrl() {
    return jdbcUrl;
  }

  /**
   * Setter for jdbcUrl.
   * The JDBC URL for connection.
   **/
  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }

  /**
   * Getter for username.
   * The JDBC connection username.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The JDBC connection username.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * The JDBC connection password.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * The JDBC connection password.
   **/
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JdbcUrlConfiguration jdbcUrlConfiguration = (JdbcUrlConfiguration) o;
    if (!Objects.equals(this.jdbcUrl, jdbcUrlConfiguration.jdbcUrl)) {
      return false;
    }
    if (!Objects.equals(this.username, jdbcUrlConfiguration.username)) {
      return false;
    }
    if (!Objects.equals(this.password, jdbcUrlConfiguration.password)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(jdbcUrl, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JdbcUrlConfiguration {\n");
    sb.append("    jdbcUrl: ").append(toIndentedString(jdbcUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

