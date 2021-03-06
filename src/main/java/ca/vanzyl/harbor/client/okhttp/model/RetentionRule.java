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
import ca.vanzyl.harbor.client.okhttp.model.RetentionSelector;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RetentionRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-25T17:57:51.873-04:00")
public class RetentionRule {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("params")
  private Map<String, Object> params = null;

  @SerializedName("tag_selectors")
  private List<RetentionSelector> tagSelectors = null;

  @SerializedName("scope_selectors")
  private Map<String, List<RetentionSelector>> scopeSelectors = null;

  public RetentionRule id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RetentionRule priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public RetentionRule disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public RetentionRule action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public RetentionRule template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public RetentionRule params(Map<String, Object> params) {
    this.params = params;
    return this;
  }

  public RetentionRule putParamsItem(String key, Object paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getParams() {
    return params;
  }

  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  public RetentionRule tagSelectors(List<RetentionSelector> tagSelectors) {
    this.tagSelectors = tagSelectors;
    return this;
  }

  public RetentionRule addTagSelectorsItem(RetentionSelector tagSelectorsItem) {
    if (this.tagSelectors == null) {
      this.tagSelectors = new ArrayList<>();
    }
    this.tagSelectors.add(tagSelectorsItem);
    return this;
  }

   /**
   * Get tagSelectors
   * @return tagSelectors
  **/
  @ApiModelProperty(value = "")
  public List<RetentionSelector> getTagSelectors() {
    return tagSelectors;
  }

  public void setTagSelectors(List<RetentionSelector> tagSelectors) {
    this.tagSelectors = tagSelectors;
  }

  public RetentionRule scopeSelectors(Map<String, List<RetentionSelector>> scopeSelectors) {
    this.scopeSelectors = scopeSelectors;
    return this;
  }

  public RetentionRule putScopeSelectorsItem(String key, List<RetentionSelector> scopeSelectorsItem) {
    if (this.scopeSelectors == null) {
      this.scopeSelectors = new HashMap<>();
    }
    this.scopeSelectors.put(key, scopeSelectorsItem);
    return this;
  }

   /**
   * Get scopeSelectors
   * @return scopeSelectors
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<RetentionSelector>> getScopeSelectors() {
    return scopeSelectors;
  }

  public void setScopeSelectors(Map<String, List<RetentionSelector>> scopeSelectors) {
    this.scopeSelectors = scopeSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionRule retentionRule = (RetentionRule) o;
    return Objects.equals(this.id, retentionRule.id) &&
        Objects.equals(this.priority, retentionRule.priority) &&
        Objects.equals(this.disabled, retentionRule.disabled) &&
        Objects.equals(this.action, retentionRule.action) &&
        Objects.equals(this.template, retentionRule.template) &&
        Objects.equals(this.params, retentionRule.params) &&
        Objects.equals(this.tagSelectors, retentionRule.tagSelectors) &&
        Objects.equals(this.scopeSelectors, retentionRule.scopeSelectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, priority, disabled, action, template, params, tagSelectors, scopeSelectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    tagSelectors: ").append(toIndentedString(tagSelectors)).append("\n");
    sb.append("    scopeSelectors: ").append(toIndentedString(scopeSelectors)).append("\n");
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

