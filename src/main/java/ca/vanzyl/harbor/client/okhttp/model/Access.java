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
 * Access
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class Access {
  @SerializedName("resource")
  private String resource = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("effect")
  private String effect = null;

  public Access resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * The resource of the access
   * @return resource
  **/
  @ApiModelProperty(value = "The resource of the access")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public Access action(String action) {
    this.action = action;
    return this;
  }

   /**
   * The action of the access
   * @return action
  **/
  @ApiModelProperty(value = "The action of the access")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Access effect(String effect) {
    this.effect = effect;
    return this;
  }

   /**
   * The effect of the access
   * @return effect
  **/
  @ApiModelProperty(value = "The effect of the access")
  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Access access = (Access) o;
    return Objects.equals(this.resource, access.resource) &&
        Objects.equals(this.action, access.action) &&
        Objects.equals(this.effect, access.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, action, effect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Access {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

