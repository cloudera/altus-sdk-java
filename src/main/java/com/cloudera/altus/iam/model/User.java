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

package com.cloudera.altus.iam.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.altus.client.AltusResponse;
import java.time.ZonedDateTime;

/**
 * Information about a Cloudera Altus user.
 **/
@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2018-05-02T12:03:46.083-07:00")
public class User  {

  /**
   * The stable, unique identifier of the user.
   **/
  private String userId = null;

  /**
   * The CRN of the user.
   **/
  private String crn = null;

  /**
   * The user's email address.
   **/
  private String email = null;

  /**
   * The user's first name.
   **/
  private String firstName = null;

  /**
   * The user's last name.
   **/
  private String lastName = null;

  /**
   * The date when this user record was created.
   **/
  private ZonedDateTime creationDate = null;

  /**
   * Whether the user is an administrator of their Altus account.
   **/
  private Boolean accountAdmin = null;

  /**
   * The date of the user's last interactive login.
   **/
  private ZonedDateTime lastInteractiveLogin = null;

  /**
   * Getter for userId.
   **/
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  /**
   * Setter for userId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * Getter for crn.
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  /**
   * Getter for email.
   **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * Setter for email.
   **/
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Getter for firstName.
   **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  /**
   * Setter for firstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Getter for lastName.
   **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  /**
   * Setter for lastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Getter for creationDate.
   **/
  @JsonProperty("creationDate")
  public ZonedDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Setter for creationDate.
   **/
  public void setCreationDate(ZonedDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Getter for accountAdmin.
   **/
  @JsonProperty("accountAdmin")
  public Boolean getAccountAdmin() {
    return accountAdmin;
  }

  /**
   * Setter for accountAdmin.
   **/
  public void setAccountAdmin(Boolean accountAdmin) {
    this.accountAdmin = accountAdmin;
  }

  /**
   * Getter for lastInteractiveLogin.
   **/
  @JsonProperty("lastInteractiveLogin")
  public ZonedDateTime getLastInteractiveLogin() {
    return lastInteractiveLogin;
  }

  /**
   * Setter for lastInteractiveLogin.
   **/
  public void setLastInteractiveLogin(ZonedDateTime lastInteractiveLogin) {
    this.lastInteractiveLogin = lastInteractiveLogin;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    if (!Objects.equals(this.userId, user.userId)) {
      return false;
    }
    if (!Objects.equals(this.crn, user.crn)) {
      return false;
    }
    if (!Objects.equals(this.email, user.email)) {
      return false;
    }
    if (!Objects.equals(this.firstName, user.firstName)) {
      return false;
    }
    if (!Objects.equals(this.lastName, user.lastName)) {
      return false;
    }
    if (!Objects.equals(this.creationDate, user.creationDate)) {
      return false;
    }
    if (!Objects.equals(this.accountAdmin, user.accountAdmin)) {
      return false;
    }
    if (!Objects.equals(this.lastInteractiveLogin, user.lastInteractiveLogin)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, crn, email, firstName, lastName, creationDate, accountAdmin, lastInteractiveLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountAdmin: ").append(toIndentedString(accountAdmin)).append("\n");
    sb.append("    lastInteractiveLogin: ").append(toIndentedString(lastInteractiveLogin)).append("\n");
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

