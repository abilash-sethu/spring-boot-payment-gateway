package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * GroupRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class GroupRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("nameChanged")
  private Boolean nameChanged = false;

  @JsonProperty("typeChanged")
  private Boolean typeChanged = false;

  public GroupRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GroupRequest name(String name) {
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

  public GroupRequest type(String type) {
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

  public GroupRequest nameChanged(Boolean nameChanged) {
    this.nameChanged = nameChanged;
    return this;
  }

  /**
   * Get nameChanged
   * @return nameChanged
  **/
  @ApiModelProperty(value = "")


  public Boolean isNameChanged() {
    return nameChanged;
  }

  public void setNameChanged(Boolean nameChanged) {
    this.nameChanged = nameChanged;
  }

  public GroupRequest typeChanged(Boolean typeChanged) {
    this.typeChanged = typeChanged;
    return this;
  }

  /**
   * Get typeChanged
   * @return typeChanged
  **/
  @ApiModelProperty(value = "")


  public Boolean isTypeChanged() {
    return typeChanged;
  }

  public void setTypeChanged(Boolean typeChanged) {
    this.typeChanged = typeChanged;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRequest groupRequest = (GroupRequest) o;
    return Objects.equals(this.id, groupRequest.id) &&
        Objects.equals(this.url, groupRequest.url) &&
        Objects.equals(this.name, groupRequest.name) &&
        Objects.equals(this.type, groupRequest.type) &&
        Objects.equals(this.nameChanged, groupRequest.nameChanged) &&
        Objects.equals(this.typeChanged, groupRequest.typeChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, name, type, nameChanged, typeChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    nameChanged: ").append(toIndentedString(nameChanged)).append("\n");
    sb.append("    typeChanged: ").append(toIndentedString(typeChanged)).append("\n");
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

