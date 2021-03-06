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

package com.cloudera.altus.iam.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.altus.AltusClientException;
import com.cloudera.altus.authentication.credentials.AltusCredentials;
import com.cloudera.altus.client.AltusClient;
import com.cloudera.altus.client.AltusClientConfiguration;
import com.cloudera.altus.iam.model.AddMachineUserToGroupRequest;
import com.cloudera.altus.iam.model.AddMachineUserToGroupResponse;
import com.cloudera.altus.iam.model.AddUserToGroupRequest;
import com.cloudera.altus.iam.model.AddUserToGroupResponse;
import com.cloudera.altus.iam.model.AssignGroupResourceRoleRequest;
import com.cloudera.altus.iam.model.AssignGroupResourceRoleResponse;
import com.cloudera.altus.iam.model.AssignGroupRoleRequest;
import com.cloudera.altus.iam.model.AssignGroupRoleResponse;
import com.cloudera.altus.iam.model.AssignMachineUserResourceRoleRequest;
import com.cloudera.altus.iam.model.AssignMachineUserResourceRoleResponse;
import com.cloudera.altus.iam.model.AssignMachineUserRoleRequest;
import com.cloudera.altus.iam.model.AssignMachineUserRoleResponse;
import com.cloudera.altus.iam.model.AssignUserResourceRoleRequest;
import com.cloudera.altus.iam.model.AssignUserResourceRoleResponse;
import com.cloudera.altus.iam.model.AssignUserRoleRequest;
import com.cloudera.altus.iam.model.AssignUserRoleResponse;
import com.cloudera.altus.iam.model.CreateGroupRequest;
import com.cloudera.altus.iam.model.CreateGroupResponse;
import com.cloudera.altus.iam.model.CreateMachineUserAccessKeyRequest;
import com.cloudera.altus.iam.model.CreateMachineUserAccessKeyResponse;
import com.cloudera.altus.iam.model.CreateMachineUserRequest;
import com.cloudera.altus.iam.model.CreateMachineUserResponse;
import com.cloudera.altus.iam.model.CreateUserAccessKeyRequest;
import com.cloudera.altus.iam.model.CreateUserAccessKeyResponse;
import com.cloudera.altus.iam.model.DeleteAccessKeyRequest;
import com.cloudera.altus.iam.model.DeleteAccessKeyResponse;
import com.cloudera.altus.iam.model.DeleteGroupRequest;
import com.cloudera.altus.iam.model.DeleteGroupResponse;
import com.cloudera.altus.iam.model.DeleteMachineUserRequest;
import com.cloudera.altus.iam.model.DeleteMachineUserResponse;
import com.cloudera.altus.iam.model.Error;
import com.cloudera.altus.iam.model.GetAccessKeyRequest;
import com.cloudera.altus.iam.model.GetAccessKeyResponse;
import com.cloudera.altus.iam.model.GetUserRequest;
import com.cloudera.altus.iam.model.GetUserResponse;
import com.cloudera.altus.iam.model.ListAccessKeysRequest;
import com.cloudera.altus.iam.model.ListAccessKeysResponse;
import com.cloudera.altus.iam.model.ListGroupAssignedResourceRolesRequest;
import com.cloudera.altus.iam.model.ListGroupAssignedResourceRolesResponse;
import com.cloudera.altus.iam.model.ListGroupAssignedRolesRequest;
import com.cloudera.altus.iam.model.ListGroupAssignedRolesResponse;
import com.cloudera.altus.iam.model.ListGroupMembersRequest;
import com.cloudera.altus.iam.model.ListGroupMembersResponse;
import com.cloudera.altus.iam.model.ListGroupsForMachineUserRequest;
import com.cloudera.altus.iam.model.ListGroupsForMachineUserResponse;
import com.cloudera.altus.iam.model.ListGroupsForUserRequest;
import com.cloudera.altus.iam.model.ListGroupsForUserResponse;
import com.cloudera.altus.iam.model.ListGroupsRequest;
import com.cloudera.altus.iam.model.ListGroupsResponse;
import com.cloudera.altus.iam.model.ListMachineUserAssignedResourceRolesRequest;
import com.cloudera.altus.iam.model.ListMachineUserAssignedResourceRolesResponse;
import com.cloudera.altus.iam.model.ListMachineUserAssignedRolesRequest;
import com.cloudera.altus.iam.model.ListMachineUserAssignedRolesResponse;
import com.cloudera.altus.iam.model.ListMachineUsersRequest;
import com.cloudera.altus.iam.model.ListMachineUsersResponse;
import com.cloudera.altus.iam.model.ListResourceAssigneesRequest;
import com.cloudera.altus.iam.model.ListResourceAssigneesResponse;
import com.cloudera.altus.iam.model.ListResourceRolesRequest;
import com.cloudera.altus.iam.model.ListResourceRolesResponse;
import com.cloudera.altus.iam.model.ListRolesRequest;
import com.cloudera.altus.iam.model.ListRolesResponse;
import com.cloudera.altus.iam.model.ListUserAssignedResourceRolesRequest;
import com.cloudera.altus.iam.model.ListUserAssignedResourceRolesResponse;
import com.cloudera.altus.iam.model.ListUserAssignedRolesRequest;
import com.cloudera.altus.iam.model.ListUserAssignedRolesResponse;
import com.cloudera.altus.iam.model.ListUsersRequest;
import com.cloudera.altus.iam.model.ListUsersResponse;
import com.cloudera.altus.iam.model.RemoveMachineUserFromGroupRequest;
import com.cloudera.altus.iam.model.RemoveMachineUserFromGroupResponse;
import com.cloudera.altus.iam.model.RemoveUserFromGroupRequest;
import com.cloudera.altus.iam.model.RemoveUserFromGroupResponse;
import com.cloudera.altus.iam.model.UnassignGroupResourceRoleRequest;
import com.cloudera.altus.iam.model.UnassignGroupResourceRoleResponse;
import com.cloudera.altus.iam.model.UnassignGroupRoleRequest;
import com.cloudera.altus.iam.model.UnassignGroupRoleResponse;
import com.cloudera.altus.iam.model.UnassignMachineUserResourceRoleRequest;
import com.cloudera.altus.iam.model.UnassignMachineUserResourceRoleResponse;
import com.cloudera.altus.iam.model.UnassignMachineUserRoleRequest;
import com.cloudera.altus.iam.model.UnassignMachineUserRoleResponse;
import com.cloudera.altus.iam.model.UnassignUserResourceRoleRequest;
import com.cloudera.altus.iam.model.UnassignUserResourceRoleResponse;
import com.cloudera.altus.iam.model.UnassignUserRoleRequest;
import com.cloudera.altus.iam.model.UnassignUserRoleResponse;
import com.cloudera.altus.iam.model.UpdateAccessKeyRequest;
import com.cloudera.altus.iam.model.UpdateAccessKeyResponse;

@javax.annotation.Generated(value = "com.cloudera.altus.client.codegen.AltusSDKJavaCodegen", date = "2019-09-05T21:19:11.877-07:00")
public class IamClient extends AltusClient {

  public static final String SERVICE_NAME = "iam";

  public IamClient(
      AltusCredentials credentials,
      String endPoint,
      AltusClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Add a machine user to group.
   * @param input
   * @return AddMachineUserToGroupResponse
   */
  public AddMachineUserToGroupResponse addMachineUserToGroup(AddMachineUserToGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling addMachineUserToGroup");
     }
    return this.invokeAPI("/iam/addMachineUserToGroup", input, new GenericType<AddMachineUserToGroupResponse>(){});
  }

  /**
   * Add a user to a group.
   * @param input
   * @return AddUserToGroupResponse
   */
  public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling addUserToGroup");
     }
    return this.invokeAPI("/iam/addUserToGroup", input, new GenericType<AddUserToGroupResponse>(){});
  }

  /**
   * Assign a resource role to a group.
   * @param input
   * @return AssignGroupResourceRoleResponse
   */
  public AssignGroupResourceRoleResponse assignGroupResourceRole(AssignGroupResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignGroupResourceRole");
     }
    return this.invokeAPI("/iam/assignGroupResourceRole", input, new GenericType<AssignGroupResourceRoleResponse>(){});
  }

  /**
   * Assign a role to a group.
   * @param input
   * @return AssignGroupRoleResponse
   */
  public AssignGroupRoleResponse assignGroupRole(AssignGroupRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignGroupRole");
     }
    return this.invokeAPI("/iam/assignGroupRole", input, new GenericType<AssignGroupRoleResponse>(){});
  }

  /**
   * Assign a resource role to a machine user.
   * @param input
   * @return AssignMachineUserResourceRoleResponse
   */
  public AssignMachineUserResourceRoleResponse assignMachineUserResourceRole(AssignMachineUserResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignMachineUserResourceRole");
     }
    return this.invokeAPI("/iam/assignMachineUserResourceRole", input, new GenericType<AssignMachineUserResourceRoleResponse>(){});
  }

  /**
   * Assign a role to a machine user.
   * @param input
   * @return AssignMachineUserRoleResponse
   */
  public AssignMachineUserRoleResponse assignMachineUserRole(AssignMachineUserRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignMachineUserRole");
     }
    return this.invokeAPI("/iam/assignMachineUserRole", input, new GenericType<AssignMachineUserRoleResponse>(){});
  }

  /**
   * Assign a resource role to a user.
   * @param input
   * @return AssignUserResourceRoleResponse
   */
  public AssignUserResourceRoleResponse assignUserResourceRole(AssignUserResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignUserResourceRole");
     }
    return this.invokeAPI("/iam/assignUserResourceRole", input, new GenericType<AssignUserResourceRoleResponse>(){});
  }

  /**
   * Assign a role to a user.
   * @param input
   * @return AssignUserRoleResponse
   */
  public AssignUserRoleResponse assignUserRole(AssignUserRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling assignUserRole");
     }
    return this.invokeAPI("/iam/assignUserRole", input, new GenericType<AssignUserRoleResponse>(){});
  }

  /**
   * Create a group.
   * @param input
   * @return CreateGroupResponse
   */
  public CreateGroupResponse createGroup(CreateGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createGroup");
     }
    return this.invokeAPI("/iam/createGroup", input, new GenericType<CreateGroupResponse>(){});
  }

  /**
   * Create a machine user.
   * @param input
   * @return CreateMachineUserResponse
   */
  public CreateMachineUserResponse createMachineUser(CreateMachineUserRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createMachineUser");
     }
    return this.invokeAPI("/iam/createMachineUser", input, new GenericType<CreateMachineUserResponse>(){});
  }

  /**
   * Creates a new access key for a machine user.
   * @param input
   * @return CreateMachineUserAccessKeyResponse
   */
  public CreateMachineUserAccessKeyResponse createMachineUserAccessKey(CreateMachineUserAccessKeyRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createMachineUserAccessKey");
     }
    return this.invokeAPI("/iam/createMachineUserAccessKey", input, new GenericType<CreateMachineUserAccessKeyResponse>(){});
  }

  /**
   * Creates a new access key for a user.
   * @param input
   * @return CreateUserAccessKeyResponse
   */
  public CreateUserAccessKeyResponse createUserAccessKey(CreateUserAccessKeyRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling createUserAccessKey");
     }
    return this.invokeAPI("/iam/createUserAccessKey", input, new GenericType<CreateUserAccessKeyResponse>(){});
  }

  /**
   * Deletes an access key.
   * @param input
   * @return DeleteAccessKeyResponse
   */
  public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteAccessKey");
     }
    return this.invokeAPI("/iam/deleteAccessKey", input, new GenericType<DeleteAccessKeyResponse>(){});
  }

  /**
   * Delete a group.
   * @param input
   * @return DeleteGroupResponse
   */
  public DeleteGroupResponse deleteGroup(DeleteGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteGroup");
     }
    return this.invokeAPI("/iam/deleteGroup", input, new GenericType<DeleteGroupResponse>(){});
  }

  /**
   * Delete a machine user.
   * @param input
   * @return DeleteMachineUserResponse
   */
  public DeleteMachineUserResponse deleteMachineUser(DeleteMachineUserRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling deleteMachineUser");
     }
    return this.invokeAPI("/iam/deleteMachineUser", input, new GenericType<DeleteMachineUserResponse>(){});
  }

  /**
   * Gets information on an access key.
   * @param input
   * @return GetAccessKeyResponse
   */
  public GetAccessKeyResponse getAccessKey(GetAccessKeyRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getAccessKey");
     }
    return this.invokeAPI("/iam/getAccessKey", input, new GenericType<GetAccessKeyResponse>(){});
  }

  /**
   * Gets information on a user.
   * @param input
   * @return GetUserResponse
   */
  public GetUserResponse getUser(GetUserRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling getUser");
     }
    return this.invokeAPI("/iam/getUser", input, new GenericType<GetUserResponse>(){});
  }

  /**
   * Lists access keys.
   * @param input
   * @return ListAccessKeysResponse
   */
  public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listAccessKeys");
     }
    return this.invokeAPI("/iam/listAccessKeys", input, new GenericType<ListAccessKeysResponse>(){});
  }

  /**
   * Lists a group&#39;s assigned resource roles.
   * @param input
   * @return ListGroupAssignedResourceRolesResponse
   */
  public ListGroupAssignedResourceRolesResponse listGroupAssignedResourceRoles(ListGroupAssignedResourceRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroupAssignedResourceRoles");
     }
    return this.invokeAPI("/iam/listGroupAssignedResourceRoles", input, new GenericType<ListGroupAssignedResourceRolesResponse>(){});
  }

  /**
   * Lists the group&#39;s assigned roles.
   * @param input
   * @return ListGroupAssignedRolesResponse
   */
  public ListGroupAssignedRolesResponse listGroupAssignedRoles(ListGroupAssignedRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroupAssignedRoles");
     }
    return this.invokeAPI("/iam/listGroupAssignedRoles", input, new GenericType<ListGroupAssignedRolesResponse>(){});
  }

  /**
   * List the members of a group.
   * @param input
   * @return ListGroupMembersResponse
   */
  public ListGroupMembersResponse listGroupMembers(ListGroupMembersRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroupMembers");
     }
    return this.invokeAPI("/iam/listGroupMembers", input, new GenericType<ListGroupMembersResponse>(){});
  }

  /**
   * Lists groups.
   * @param input
   * @return ListGroupsResponse
   */
  public ListGroupsResponse listGroups(ListGroupsRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroups");
     }
    return this.invokeAPI("/iam/listGroups", input, new GenericType<ListGroupsResponse>(){});
  }

  /**
   * List the groups that the machine user belongs to.
   * @param input
   * @return ListGroupsForMachineUserResponse
   */
  public ListGroupsForMachineUserResponse listGroupsForMachineUser(ListGroupsForMachineUserRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroupsForMachineUser");
     }
    return this.invokeAPI("/iam/listGroupsForMachineUser", input, new GenericType<ListGroupsForMachineUserResponse>(){});
  }

  /**
   * List the groups that the user belongs to.
   * @param input
   * @return ListGroupsForUserResponse
   */
  public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listGroupsForUser");
     }
    return this.invokeAPI("/iam/listGroupsForUser", input, new GenericType<ListGroupsForUserResponse>(){});
  }

  /**
   * Lists a machine user&#39;s assigned resource roles.
   * @param input
   * @return ListMachineUserAssignedResourceRolesResponse
   */
  public ListMachineUserAssignedResourceRolesResponse listMachineUserAssignedResourceRoles(ListMachineUserAssignedResourceRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listMachineUserAssignedResourceRoles");
     }
    return this.invokeAPI("/iam/listMachineUserAssignedResourceRoles", input, new GenericType<ListMachineUserAssignedResourceRolesResponse>(){});
  }

  /**
   * Lists the machine user&#39;s assigned roles.
   * @param input
   * @return ListMachineUserAssignedRolesResponse
   */
  public ListMachineUserAssignedRolesResponse listMachineUserAssignedRoles(ListMachineUserAssignedRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listMachineUserAssignedRoles");
     }
    return this.invokeAPI("/iam/listMachineUserAssignedRoles", input, new GenericType<ListMachineUserAssignedRolesResponse>(){});
  }

  /**
   * Lists machine users.
   * @param input
   * @return ListMachineUsersResponse
   */
  public ListMachineUsersResponse listMachineUsers(ListMachineUsersRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listMachineUsers");
     }
    return this.invokeAPI("/iam/listMachineUsers", input, new GenericType<ListMachineUsersResponse>(){});
  }

  /**
   * List the resource assignees and their respective resource roles for the resource.
   * @param input
   * @return ListResourceAssigneesResponse
   */
  public ListResourceAssigneesResponse listResourceAssignees(ListResourceAssigneesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listResourceAssignees");
     }
    return this.invokeAPI("/iam/listResourceAssignees", input, new GenericType<ListResourceAssigneesResponse>(){});
  }

  /**
   * Lists all the available resource roles.
   * @param input
   * @return ListResourceRolesResponse
   */
  public ListResourceRolesResponse listResourceRoles(ListResourceRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listResourceRoles");
     }
    return this.invokeAPI("/iam/listResourceRoles", input, new GenericType<ListResourceRolesResponse>(){});
  }

  /**
   * Lists all the available roles.
   * @param input
   * @return ListRolesResponse
   */
  public ListRolesResponse listRoles(ListRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listRoles");
     }
    return this.invokeAPI("/iam/listRoles", input, new GenericType<ListRolesResponse>(){});
  }

  /**
   * Lists a user&#39;s assigned resource roles.
   * @param input
   * @return ListUserAssignedResourceRolesResponse
   */
  public ListUserAssignedResourceRolesResponse listUserAssignedResourceRoles(ListUserAssignedResourceRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listUserAssignedResourceRoles");
     }
    return this.invokeAPI("/iam/listUserAssignedResourceRoles", input, new GenericType<ListUserAssignedResourceRolesResponse>(){});
  }

  /**
   * Lists the user&#39;s assigned roles.
   * @param input
   * @return ListUserAssignedRolesResponse
   */
  public ListUserAssignedRolesResponse listUserAssignedRoles(ListUserAssignedRolesRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listUserAssignedRoles");
     }
    return this.invokeAPI("/iam/listUserAssignedRoles", input, new GenericType<ListUserAssignedRolesResponse>(){});
  }

  /**
   * Lists users.
   * @param input
   * @return ListUsersResponse
   */
  public ListUsersResponse listUsers(ListUsersRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling listUsers");
     }
    return this.invokeAPI("/iam/listUsers", input, new GenericType<ListUsersResponse>(){});
  }

  /**
   * Remove a machine user from a group.
   * @param input
   * @return RemoveMachineUserFromGroupResponse
   */
  public RemoveMachineUserFromGroupResponse removeMachineUserFromGroup(RemoveMachineUserFromGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling removeMachineUserFromGroup");
     }
    return this.invokeAPI("/iam/removeMachineUserFromGroup", input, new GenericType<RemoveMachineUserFromGroupResponse>(){});
  }

  /**
   * Remove a user from a group.
   * @param input
   * @return RemoveUserFromGroupResponse
   */
  public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling removeUserFromGroup");
     }
    return this.invokeAPI("/iam/removeUserFromGroup", input, new GenericType<RemoveUserFromGroupResponse>(){});
  }

  /**
   * Unassign a resource role from a group.
   * @param input
   * @return UnassignGroupResourceRoleResponse
   */
  public UnassignGroupResourceRoleResponse unassignGroupResourceRole(UnassignGroupResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignGroupResourceRole");
     }
    return this.invokeAPI("/iam/unassignGroupResourceRole", input, new GenericType<UnassignGroupResourceRoleResponse>(){});
  }

  /**
   * Unassign a role from a group.
   * @param input
   * @return UnassignGroupRoleResponse
   */
  public UnassignGroupRoleResponse unassignGroupRole(UnassignGroupRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignGroupRole");
     }
    return this.invokeAPI("/iam/unassignGroupRole", input, new GenericType<UnassignGroupRoleResponse>(){});
  }

  /**
   * Unassign a resource role from a machine user.
   * @param input
   * @return UnassignMachineUserResourceRoleResponse
   */
  public UnassignMachineUserResourceRoleResponse unassignMachineUserResourceRole(UnassignMachineUserResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignMachineUserResourceRole");
     }
    return this.invokeAPI("/iam/unassignMachineUserResourceRole", input, new GenericType<UnassignMachineUserResourceRoleResponse>(){});
  }

  /**
   * Unassign a role from a machine user.
   * @param input
   * @return UnassignMachineUserRoleResponse
   */
  public UnassignMachineUserRoleResponse unassignMachineUserRole(UnassignMachineUserRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignMachineUserRole");
     }
    return this.invokeAPI("/iam/unassignMachineUserRole", input, new GenericType<UnassignMachineUserRoleResponse>(){});
  }

  /**
   * Unassign a resource role from a user.
   * @param input
   * @return UnassignUserResourceRoleResponse
   */
  public UnassignUserResourceRoleResponse unassignUserResourceRole(UnassignUserResourceRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignUserResourceRole");
     }
    return this.invokeAPI("/iam/unassignUserResourceRole", input, new GenericType<UnassignUserResourceRoleResponse>(){});
  }

  /**
   * Unassign a role from a user.
   * @param input
   * @return UnassignUserRoleResponse
   */
  public UnassignUserRoleResponse unassignUserRole(UnassignUserRoleRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling unassignUserRole");
     }
    return this.invokeAPI("/iam/unassignUserRole", input, new GenericType<UnassignUserRoleResponse>(){});
  }

  /**
   * Updates an access key.
   * @param input
   * @return UpdateAccessKeyResponse
   */
  public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest input) {
     if (input == null) {
        throw new AltusClientException("Missing the required parameter 'input' when calling updateAccessKey");
     }
    return this.invokeAPI("/iam/updateAccessKey", input, new GenericType<UpdateAccessKeyResponse>(){});
  }
}
