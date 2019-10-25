/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * Resource representing a Membership within a Group
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Membership extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Creation timestamp of the Membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Immutable. EntityKey of the entity to be added as the member. Must be set while
   * creating a Membership, read-only afterwards.
   *
   * Currently allowed entity types: `Users`, `Groups`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntityKey memberKey;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * Membership in the format: `groups/{group_id}/memberships/{member_id}`, where group_id is the
   * unique id assigned to the Group to which Membership belongs to, and member_id is the unique id
   * assigned to the member
   *
   * Must be left blank while creating a Membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Roles for a member within the Group.
   *
   * Currently supported MembershipRoles: `"MEMBER", "OWNER", "MANAGER"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MembershipRole> roles;

  /**
   * Output only. Last updated timestamp of the Membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Creation timestamp of the Membership.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Creation timestamp of the Membership.
   * @param createTime createTime or {@code null} for none
   */
  public Membership setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Immutable. EntityKey of the entity to be added as the member. Must be set while
   * creating a Membership, read-only afterwards.
   *
   * Currently allowed entity types: `Users`, `Groups`.
   * @return value or {@code null} for none
   */
  public EntityKey getMemberKey() {
    return memberKey;
  }

  /**
   * Required. Immutable. EntityKey of the entity to be added as the member. Must be set while
   * creating a Membership, read-only afterwards.
   *
   * Currently allowed entity types: `Users`, `Groups`.
   * @param memberKey memberKey or {@code null} for none
   */
  public Membership setMemberKey(EntityKey memberKey) {
    this.memberKey = memberKey;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * Membership in the format: `groups/{group_id}/memberships/{member_id}`, where group_id is the
   * unique id assigned to the Group to which Membership belongs to, and member_id is the unique id
   * assigned to the member
   *
   * Must be left blank while creating a Membership.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * Membership in the format: `groups/{group_id}/memberships/{member_id}`, where group_id is the
   * unique id assigned to the Group to which Membership belongs to, and member_id is the unique id
   * assigned to the member
   *
   * Must be left blank while creating a Membership.
   * @param name name or {@code null} for none
   */
  public Membership setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Roles for a member within the Group.
   *
   * Currently supported MembershipRoles: `"MEMBER", "OWNER", "MANAGER"`.
   * @return value or {@code null} for none
   */
  public java.util.List<MembershipRole> getRoles() {
    return roles;
  }

  /**
   * Roles for a member within the Group.
   *
   * Currently supported MembershipRoles: `"MEMBER", "OWNER", "MANAGER"`.
   * @param roles roles or {@code null} for none
   */
  public Membership setRoles(java.util.List<MembershipRole> roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Output only. Last updated timestamp of the Membership.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Last updated timestamp of the Membership.
   * @param updateTime updateTime or {@code null} for none
   */
  public Membership setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Membership set(String fieldName, Object value) {
    return (Membership) super.set(fieldName, value);
  }

  @Override
  public Membership clone() {
    return (Membership) super.clone();
  }

}
