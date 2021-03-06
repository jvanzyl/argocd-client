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
 * The parameters of the policy, the values are dependent on the type of the policy.
 */
@ApiModel(description = "The parameters of the policy, the values are dependent on the type of the policy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class ConfigurationsResponseScanAllPolicyParameter {
  @SerializedName("daily_time")
  private Integer dailyTime = null;

  public ConfigurationsResponseScanAllPolicyParameter dailyTime(Integer dailyTime) {
    this.dailyTime = dailyTime;
    return this;
  }

   /**
   * The offset in seconds of UTC 0 o&#39;clock, only valid when the policy type is \&quot;daily\&quot;
   * @return dailyTime
  **/
  @ApiModelProperty(value = "The offset in seconds of UTC 0 o'clock, only valid when the policy type is \"daily\"")
  public Integer getDailyTime() {
    return dailyTime;
  }

  public void setDailyTime(Integer dailyTime) {
    this.dailyTime = dailyTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationsResponseScanAllPolicyParameter configurationsResponseScanAllPolicyParameter = (ConfigurationsResponseScanAllPolicyParameter) o;
    return Objects.equals(this.dailyTime, configurationsResponseScanAllPolicyParameter.dailyTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationsResponseScanAllPolicyParameter {\n");
    
    sb.append("    dailyTime: ").append(toIndentedString(dailyTime)).append("\n");
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

