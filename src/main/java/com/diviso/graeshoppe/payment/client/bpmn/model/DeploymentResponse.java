package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DeploymentResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class DeploymentResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("deploymentTime")
  private OffsetDateTime deploymentTime = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  public DeploymentResponse id(String id) {
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

  public DeploymentResponse name(String name) {
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

  public DeploymentResponse deploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

  /**
   * Get deploymentTime
   * @return deploymentTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDeploymentTime() {
    return deploymentTime;
  }

  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
  }

  public DeploymentResponse category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DeploymentResponse url(String url) {
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

  public DeploymentResponse tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResponse deploymentResponse = (DeploymentResponse) o;
    return Objects.equals(this.id, deploymentResponse.id) &&
        Objects.equals(this.name, deploymentResponse.name) &&
        Objects.equals(this.deploymentTime, deploymentResponse.deploymentTime) &&
        Objects.equals(this.category, deploymentResponse.category) &&
        Objects.equals(this.url, deploymentResponse.url) &&
        Objects.equals(this.tenantId, deploymentResponse.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deploymentTime, category, url, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

