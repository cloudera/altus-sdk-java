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

/**
 * Details about a cluster LDAP access token. This is used to authorise a JDBC/ODBC connection or to log into Hue on the cluster.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-01-29T13:30:12.733-08:00")
public class LdapTokenDetails  {

  /**
   * The LDAP username to use.
   **/
  private String username = null;

  /**
   * The LDAP password for the user.
   **/
  private String password = null;

  /**
   * Getter for username.
   * The LDAP username to use.
   **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Setter for username.
   * The LDAP username to use.
   **/
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Getter for password.
   * The LDAP password for the user.
   **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * Setter for password.
   * The LDAP password for the user.
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
    LdapTokenDetails ldapTokenDetails = (LdapTokenDetails) o;
    if (!Objects.equals(this.username, ldapTokenDetails.username)) {
      return false;
    }
    if (!Objects.equals(this.password, ldapTokenDetails.password)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapTokenDetails {\n");
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

