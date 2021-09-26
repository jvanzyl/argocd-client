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
import ca.vanzyl.harbor.client.okhttp.model.RegistryEndpoint;
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
 * The registry endpoint pattern
 */
@ApiModel(description = "The registry endpoint pattern")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class RegistryProviderEndpointPattern {
  @SerializedName("endpoint_type")
  private String endpointType = null;

  @SerializedName("endpoints")
  private List<RegistryEndpoint> endpoints = null;

  public RegistryProviderEndpointPattern endpointType(String endpointType) {
    this.endpointType = endpointType;
    return this;
  }

   /**
   * The endpoint type
   * @return endpointType
  **/
  @ApiModelProperty(value = "The endpoint type")
  public String getEndpointType() {
    return endpointType;
  }

  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }

  public RegistryProviderEndpointPattern endpoints(List<RegistryEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public RegistryProviderEndpointPattern addEndpointsItem(RegistryEndpoint endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * The endpoint list
   * @return endpoints
  **/
  @ApiModelProperty(value = "The endpoint list")
  public List<RegistryEndpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<RegistryEndpoint> endpoints) {
    this.endpoints = endpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryProviderEndpointPattern registryProviderEndpointPattern = (RegistryProviderEndpointPattern) o;
    return Objects.equals(this.endpointType, registryProviderEndpointPattern.endpointType) &&
        Objects.equals(this.endpoints, registryProviderEndpointPattern.endpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointType, endpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryProviderEndpointPattern {\n");
    
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
