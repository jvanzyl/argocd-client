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
import ca.vanzyl.harbor.client.okhttp.model.FilterStyle;
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
 * The registry info contains the base info and capability declarations of the registry
 */
@ApiModel(description = "The registry info contains the base info and capability declarations of the registry")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class RegistryInfo {
  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("supported_resource_filters")
  private List<FilterStyle> supportedResourceFilters = null;

  @SerializedName("supported_triggers")
  private List<String> supportedTriggers = null;

  public RegistryInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The registry type
   * @return type
  **/
  @ApiModelProperty(value = "The registry type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RegistryInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description
   * @return description
  **/
  @ApiModelProperty(value = "The description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RegistryInfo supportedResourceFilters(List<FilterStyle> supportedResourceFilters) {
    this.supportedResourceFilters = supportedResourceFilters;
    return this;
  }

  public RegistryInfo addSupportedResourceFiltersItem(FilterStyle supportedResourceFiltersItem) {
    if (this.supportedResourceFilters == null) {
      this.supportedResourceFilters = new ArrayList<>();
    }
    this.supportedResourceFilters.add(supportedResourceFiltersItem);
    return this;
  }

   /**
   * The filters that the registry supports
   * @return supportedResourceFilters
  **/
  @ApiModelProperty(value = "The filters that the registry supports")
  public List<FilterStyle> getSupportedResourceFilters() {
    return supportedResourceFilters;
  }

  public void setSupportedResourceFilters(List<FilterStyle> supportedResourceFilters) {
    this.supportedResourceFilters = supportedResourceFilters;
  }

  public RegistryInfo supportedTriggers(List<String> supportedTriggers) {
    this.supportedTriggers = supportedTriggers;
    return this;
  }

  public RegistryInfo addSupportedTriggersItem(String supportedTriggersItem) {
    if (this.supportedTriggers == null) {
      this.supportedTriggers = new ArrayList<>();
    }
    this.supportedTriggers.add(supportedTriggersItem);
    return this;
  }

   /**
   * The triggers that the registry supports
   * @return supportedTriggers
  **/
  @ApiModelProperty(value = "The triggers that the registry supports")
  public List<String> getSupportedTriggers() {
    return supportedTriggers;
  }

  public void setSupportedTriggers(List<String> supportedTriggers) {
    this.supportedTriggers = supportedTriggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryInfo registryInfo = (RegistryInfo) o;
    return Objects.equals(this.type, registryInfo.type) &&
        Objects.equals(this.description, registryInfo.description) &&
        Objects.equals(this.supportedResourceFilters, registryInfo.supportedResourceFilters) &&
        Objects.equals(this.supportedTriggers, registryInfo.supportedTriggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, supportedResourceFilters, supportedTriggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryInfo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportedResourceFilters: ").append(toIndentedString(supportedResourceFilters)).append("\n");
    sb.append("    supportedTriggers: ").append(toIndentedString(supportedTriggers)).append("\n");
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

