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

/**
 * The ldap configure properties
 */
@ApiModel(description = "The ldap configure properties")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class LdapConf {
  @SerializedName("ldap_url")
  private String ldapUrl = null;

  @SerializedName("ldap_search_dn")
  private String ldapSearchDn = null;

  @SerializedName("ldap_search_password")
  private String ldapSearchPassword = null;

  @SerializedName("ldap_base_dn")
  private String ldapBaseDn = null;

  @SerializedName("ldap_filter")
  private String ldapFilter = null;

  @SerializedName("ldap_uid")
  private String ldapUid = null;

  @SerializedName("ldap_scope")
  private Long ldapScope = null;

  @SerializedName("ldap_connection_timeout")
  private Long ldapConnectionTimeout = null;

  @SerializedName("ldap_verify_cert")
  private Boolean ldapVerifyCert = null;

  public LdapConf ldapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
    return this;
  }

   /**
   * The url of ldap service.
   * @return ldapUrl
  **/
  @ApiModelProperty(value = "The url of ldap service.")
  public String getLdapUrl() {
    return ldapUrl;
  }

  public void setLdapUrl(String ldapUrl) {
    this.ldapUrl = ldapUrl;
  }

  public LdapConf ldapSearchDn(String ldapSearchDn) {
    this.ldapSearchDn = ldapSearchDn;
    return this;
  }

   /**
   * The search dn of ldap service.
   * @return ldapSearchDn
  **/
  @ApiModelProperty(value = "The search dn of ldap service.")
  public String getLdapSearchDn() {
    return ldapSearchDn;
  }

  public void setLdapSearchDn(String ldapSearchDn) {
    this.ldapSearchDn = ldapSearchDn;
  }

  public LdapConf ldapSearchPassword(String ldapSearchPassword) {
    this.ldapSearchPassword = ldapSearchPassword;
    return this;
  }

   /**
   * The search password of ldap service.
   * @return ldapSearchPassword
  **/
  @ApiModelProperty(value = "The search password of ldap service.")
  public String getLdapSearchPassword() {
    return ldapSearchPassword;
  }

  public void setLdapSearchPassword(String ldapSearchPassword) {
    this.ldapSearchPassword = ldapSearchPassword;
  }

  public LdapConf ldapBaseDn(String ldapBaseDn) {
    this.ldapBaseDn = ldapBaseDn;
    return this;
  }

   /**
   * The base dn of ldap service.
   * @return ldapBaseDn
  **/
  @ApiModelProperty(value = "The base dn of ldap service.")
  public String getLdapBaseDn() {
    return ldapBaseDn;
  }

  public void setLdapBaseDn(String ldapBaseDn) {
    this.ldapBaseDn = ldapBaseDn;
  }

  public LdapConf ldapFilter(String ldapFilter) {
    this.ldapFilter = ldapFilter;
    return this;
  }

   /**
   * The serach filter of ldap service.
   * @return ldapFilter
  **/
  @ApiModelProperty(value = "The serach filter of ldap service.")
  public String getLdapFilter() {
    return ldapFilter;
  }

  public void setLdapFilter(String ldapFilter) {
    this.ldapFilter = ldapFilter;
  }

  public LdapConf ldapUid(String ldapUid) {
    this.ldapUid = ldapUid;
    return this;
  }

   /**
   * The serach uid from ldap service attributes.
   * @return ldapUid
  **/
  @ApiModelProperty(value = "The serach uid from ldap service attributes.")
  public String getLdapUid() {
    return ldapUid;
  }

  public void setLdapUid(String ldapUid) {
    this.ldapUid = ldapUid;
  }

  public LdapConf ldapScope(Long ldapScope) {
    this.ldapScope = ldapScope;
    return this;
  }

   /**
   * The serach scope of ldap service.
   * @return ldapScope
  **/
  @ApiModelProperty(value = "The serach scope of ldap service.")
  public Long getLdapScope() {
    return ldapScope;
  }

  public void setLdapScope(Long ldapScope) {
    this.ldapScope = ldapScope;
  }

  public LdapConf ldapConnectionTimeout(Long ldapConnectionTimeout) {
    this.ldapConnectionTimeout = ldapConnectionTimeout;
    return this;
  }

   /**
   * The connect timeout of ldap service(second).
   * @return ldapConnectionTimeout
  **/
  @ApiModelProperty(value = "The connect timeout of ldap service(second).")
  public Long getLdapConnectionTimeout() {
    return ldapConnectionTimeout;
  }

  public void setLdapConnectionTimeout(Long ldapConnectionTimeout) {
    this.ldapConnectionTimeout = ldapConnectionTimeout;
  }

  public LdapConf ldapVerifyCert(Boolean ldapVerifyCert) {
    this.ldapVerifyCert = ldapVerifyCert;
    return this;
  }

   /**
   * Verify Ldap server certificate.
   * @return ldapVerifyCert
  **/
  @ApiModelProperty(value = "Verify Ldap server certificate.")
  public Boolean isLdapVerifyCert() {
    return ldapVerifyCert;
  }

  public void setLdapVerifyCert(Boolean ldapVerifyCert) {
    this.ldapVerifyCert = ldapVerifyCert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapConf ldapConf = (LdapConf) o;
    return Objects.equals(this.ldapUrl, ldapConf.ldapUrl) &&
        Objects.equals(this.ldapSearchDn, ldapConf.ldapSearchDn) &&
        Objects.equals(this.ldapSearchPassword, ldapConf.ldapSearchPassword) &&
        Objects.equals(this.ldapBaseDn, ldapConf.ldapBaseDn) &&
        Objects.equals(this.ldapFilter, ldapConf.ldapFilter) &&
        Objects.equals(this.ldapUid, ldapConf.ldapUid) &&
        Objects.equals(this.ldapScope, ldapConf.ldapScope) &&
        Objects.equals(this.ldapConnectionTimeout, ldapConf.ldapConnectionTimeout) &&
        Objects.equals(this.ldapVerifyCert, ldapConf.ldapVerifyCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldapUrl, ldapSearchDn, ldapSearchPassword, ldapBaseDn, ldapFilter, ldapUid, ldapScope, ldapConnectionTimeout, ldapVerifyCert);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapConf {\n");
    
    sb.append("    ldapUrl: ").append(toIndentedString(ldapUrl)).append("\n");
    sb.append("    ldapSearchDn: ").append(toIndentedString(ldapSearchDn)).append("\n");
    sb.append("    ldapSearchPassword: ").append(toIndentedString(ldapSearchPassword)).append("\n");
    sb.append("    ldapBaseDn: ").append(toIndentedString(ldapBaseDn)).append("\n");
    sb.append("    ldapFilter: ").append(toIndentedString(ldapFilter)).append("\n");
    sb.append("    ldapUid: ").append(toIndentedString(ldapUid)).append("\n");
    sb.append("    ldapScope: ").append(toIndentedString(ldapScope)).append("\n");
    sb.append("    ldapConnectionTimeout: ").append(toIndentedString(ldapConnectionTimeout)).append("\n");
    sb.append("    ldapVerifyCert: ").append(toIndentedString(ldapVerifyCert)).append("\n");
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
