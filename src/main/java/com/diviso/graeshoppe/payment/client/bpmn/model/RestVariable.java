package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * RestVariable
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class RestVariable   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("valueUrl")
  private String valueUrl = null;

  @JsonProperty("scope")
  private String scope = null;

  public RestVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RestVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RestVariable value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public RestVariable valueUrl(String valueUrl) {
    this.valueUrl = valueUrl;
    return this;
  }

  /**
   * Get valueUrl
   * @return valueUrl
  **/
  @ApiModelProperty(value = "")


  public String getValueUrl() {
    return valueUrl;
  }

  public void setValueUrl(String valueUrl) {
    this.valueUrl = valueUrl;
  }

  public RestVariable scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestVariable restVariable = (RestVariable) o;
    return Objects.equals(this.name, restVariable.name) &&
        Objects.equals(this.type, restVariable.type) &&
        Objects.equals(this.value, restVariable.value) &&
        Objects.equals(this.valueUrl, restVariable.valueUrl) &&
        Objects.equals(this.scope, restVariable.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, valueUrl, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueUrl: ").append(toIndentedString(valueUrl)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

