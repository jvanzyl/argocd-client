/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.vanzyl.harbor.client.okhttp.model;

import java.util.Objects;
import java.util.Arrays;
import ca.vanzyl.harbor.client.okhttp.model.UserEntity;
import ca.vanzyl.harbor.client.okhttp.model.UserGroup;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProjectMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class ProjectMember {
  @SerializedName("role_id")
  private Integer roleId = null;

  @SerializedName("member_user")
  private UserEntity memberUser = null;

  @SerializedName("member_group")
  private UserGroup memberGroup = null;

  public ProjectMember roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * The role id 1 for projectAdmin, 2 for developer, 3 for guest, 4 for maintainer
   * @return roleId
  **/
  @ApiModelProperty(value = "The role id 1 for projectAdmin, 2 for developer, 3 for guest, 4 for maintainer")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public ProjectMember memberUser(UserEntity memberUser) {
    this.memberUser = memberUser;
    return this;
  }

   /**
   * Get memberUser
   * @return memberUser
  **/
  @ApiModelProperty(value = "")
  public UserEntity getMemberUser() {
    return memberUser;
  }

  public void setMemberUser(UserEntity memberUser) {
    this.memberUser = memberUser;
  }

  public ProjectMember memberGroup(UserGroup memberGroup) {
    this.memberGroup = memberGroup;
    return this;
  }

   /**
   * Get memberGroup
   * @return memberGroup
  **/
  @ApiModelProperty(value = "")
  public UserGroup getMemberGroup() {
    return memberGroup;
  }

  public void setMemberGroup(UserGroup memberGroup) {
    this.memberGroup = memberGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMember projectMember = (ProjectMember) o;
    return Objects.equals(this.roleId, projectMember.roleId) &&
        Objects.equals(this.memberUser, projectMember.memberUser) &&
        Objects.equals(this.memberGroup, projectMember.memberGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, memberUser, memberGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMember {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    memberUser: ").append(toIndentedString(memberUser)).append("\n");
    sb.append("    memberGroup: ").append(toIndentedString(memberGroup)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

