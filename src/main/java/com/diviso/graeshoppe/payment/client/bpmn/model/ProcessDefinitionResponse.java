package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ProcessDefinitionResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ProcessDefinitionResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("deploymentUrl")
  private String deploymentUrl = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("diagramResource")
  private String diagramResource = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("graphicalNotationDefined")
  private Boolean graphicalNotationDefined = false;

  @JsonProperty("suspended")
  private Boolean suspended = false;

  @JsonProperty("startFormDefined")
  private Boolean startFormDefined = false;

  public ProcessDefinitionResponse id(String id) {
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

  public ProcessDefinitionResponse url(String url) {
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

  public ProcessDefinitionResponse key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProcessDefinitionResponse version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ProcessDefinitionResponse name(String name) {
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

  public ProcessDefinitionResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessDefinitionResponse tenantId(String tenantId) {
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

  public ProcessDefinitionResponse deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
  **/
  @ApiModelProperty(value = "")


  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ProcessDefinitionResponse deploymentUrl(String deploymentUrl) {
    this.deploymentUrl = deploymentUrl;
    return this;
  }

  /**
   * Get deploymentUrl
   * @return deploymentUrl
  **/
  @ApiModelProperty(value = "")


  public String getDeploymentUrl() {
    return deploymentUrl;
  }

  public void setDeploymentUrl(String deploymentUrl) {
    this.deploymentUrl = deploymentUrl;
  }

  public ProcessDefinitionResponse resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(value = "")


  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ProcessDefinitionResponse diagramResource(String diagramResource) {
    this.diagramResource = diagramResource;
    return this;
  }

  /**
   * Get diagramResource
   * @return diagramResource
  **/
  @ApiModelProperty(value = "")


  public String getDiagramResource() {
    return diagramResource;
  }

  public void setDiagramResource(String diagramResource) {
    this.diagramResource = diagramResource;
  }

  public ProcessDefinitionResponse category(String category) {
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

  public ProcessDefinitionResponse graphicalNotationDefined(Boolean graphicalNotationDefined) {
    this.graphicalNotationDefined = graphicalNotationDefined;
    return this;
  }

  /**
   * Get graphicalNotationDefined
   * @return graphicalNotationDefined
  **/
  @ApiModelProperty(value = "")


  public Boolean isGraphicalNotationDefined() {
    return graphicalNotationDefined;
  }

  public void setGraphicalNotationDefined(Boolean graphicalNotationDefined) {
    this.graphicalNotationDefined = graphicalNotationDefined;
  }

  public ProcessDefinitionResponse suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Get suspended
   * @return suspended
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessDefinitionResponse startFormDefined(Boolean startFormDefined) {
    this.startFormDefined = startFormDefined;
    return this;
  }

  /**
   * Get startFormDefined
   * @return startFormDefined
  **/
  @ApiModelProperty(value = "")


  public Boolean isStartFormDefined() {
    return startFormDefined;
  }

  public void setStartFormDefined(Boolean startFormDefined) {
    this.startFormDefined = startFormDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionResponse processDefinitionResponse = (ProcessDefinitionResponse) o;
    return Objects.equals(this.id, processDefinitionResponse.id) &&
        Objects.equals(this.url, processDefinitionResponse.url) &&
        Objects.equals(this.key, processDefinitionResponse.key) &&
        Objects.equals(this.version, processDefinitionResponse.version) &&
        Objects.equals(this.name, processDefinitionResponse.name) &&
        Objects.equals(this.description, processDefinitionResponse.description) &&
        Objects.equals(this.tenantId, processDefinitionResponse.tenantId) &&
        Objects.equals(this.deploymentId, processDefinitionResponse.deploymentId) &&
        Objects.equals(this.deploymentUrl, processDefinitionResponse.deploymentUrl) &&
        Objects.equals(this.resource, processDefinitionResponse.resource) &&
        Objects.equals(this.diagramResource, processDefinitionResponse.diagramResource) &&
        Objects.equals(this.category, processDefinitionResponse.category) &&
        Objects.equals(this.graphicalNotationDefined, processDefinitionResponse.graphicalNotationDefined) &&
        Objects.equals(this.suspended, processDefinitionResponse.suspended) &&
        Objects.equals(this.startFormDefined, processDefinitionResponse.startFormDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, key, version, name, description, tenantId, deploymentId, deploymentUrl, resource, diagramResource, category, graphicalNotationDefined, suspended, startFormDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    diagramResource: ").append(toIndentedString(diagramResource)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    graphicalNotationDefined: ").append(toIndentedString(graphicalNotationDefined)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    startFormDefined: ").append(toIndentedString(startFormDefined)).append("\n");
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

