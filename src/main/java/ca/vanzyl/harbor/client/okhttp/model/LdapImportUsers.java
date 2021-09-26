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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LdapImportUsers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class LdapImportUsers {
  @SerializedName("ldap_uid_list")
  private List<String> ldapUidList = null;

  public LdapImportUsers ldapUidList(List<String> ldapUidList) {
    this.ldapUidList = ldapUidList;
    return this;
  }

  public LdapImportUsers addLdapUidListItem(String ldapUidListItem) {
    if (this.ldapUidList == null) {
      this.ldapUidList = new ArrayList<>();
    }
    this.ldapUidList.add(ldapUidListItem);
    return this;
  }

   /**
   * selected uid list
   * @return ldapUidList
  **/
  @ApiModelProperty(value = "selected uid list")
  public List<String> getLdapUidList() {
    return ldapUidList;
  }

  public void setLdapUidList(List<String> ldapUidList) {
    this.ldapUidList = ldapUidList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapImportUsers ldapImportUsers = (LdapImportUsers) o;
    return Objects.equals(this.ldapUidList, ldapImportUsers.ldapUidList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapUidList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapImportUsers {\n");
    
    sb.append("    ldapUidList: ").append(toIndentedString(ldapUidList)).append("\n");
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
