package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ModelResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ModelResponse   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("metaInfo")
  private String metaInfo = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  @JsonProperty("lastUpdateTime")
  private OffsetDateTime lastUpdateTime = null;

  @JsonProperty("deploymentUrl")
  private String deploymentUrl = null;

  @JsonProperty("sourceUrl")
  private String sourceUrl = null;

  @JsonProperty("sourceExtraUrl")
  private String sourceExtraUrl = null;

  public ModelResponse name(String name) {
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

  public ModelResponse key(String key) {
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

  public ModelResponse category(String category) {
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

  public ModelResponse version(Integer version) {
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

  public ModelResponse metaInfo(String metaInfo) {
    this.metaInfo = metaInfo;
    return this;
  }

  /**
   * Get metaInfo
   * @return metaInfo
  **/
  @ApiModelProperty(value = "")


  public String getMetaInfo() {
    return metaInfo;
  }

  public void setMetaInfo(String metaInfo) {
    this.metaInfo = metaInfo;
  }

  public ModelResponse deploymentId(String deploymentId) {
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

  public ModelResponse tenantId(String tenantId) {
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

  public ModelResponse id(String id) {
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

  public ModelResponse url(String url) {
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

  public ModelResponse createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public ModelResponse lastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Get lastUpdateTime
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public ModelResponse deploymentUrl(String deploymentUrl) {
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

  public ModelResponse sourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
    return this;
  }

  /**
   * Get sourceUrl
   * @return sourceUrl
  **/
  @ApiModelProperty(value = "")


  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public ModelResponse sourceExtraUrl(String sourceExtraUrl) {
    this.sourceExtraUrl = sourceExtraUrl;
    return this;
  }

  /**
   * Get sourceExtraUrl
   * @return sourceExtraUrl
  **/
  @ApiModelProperty(value = "")


  public String getSourceExtraUrl() {
    return sourceExtraUrl;
  }

  public void setSourceExtraUrl(String sourceExtraUrl) {
    this.sourceExtraUrl = sourceExtraUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelResponse modelResponse = (ModelResponse) o;
    return Objects.equals(this.name, modelResponse.name) &&
        Objects.equals(this.key, modelResponse.key) &&
        Objects.equals(this.category, modelResponse.category) &&
        Objects.equals(this.version, modelResponse.version) &&
        Objects.equals(this.metaInfo, modelResponse.metaInfo) &&
        Objects.equals(this.deploymentId, modelResponse.deploymentId) &&
        Objects.equals(this.tenantId, modelResponse.tenantId) &&
        Objects.equals(this.id, modelResponse.id) &&
        Objects.equals(this.url, modelResponse.url) &&
        Objects.equals(this.createTime, modelResponse.createTime) &&
        Objects.equals(this.lastUpdateTime, modelResponse.lastUpdateTime) &&
        Objects.equals(this.deploymentUrl, modelResponse.deploymentUrl) &&
        Objects.equals(this.sourceUrl, modelResponse.sourceUrl) &&
        Objects.equals(this.sourceExtraUrl, modelResponse.sourceExtraUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, category, version, metaInfo, deploymentId, tenantId, id, url, createTime, lastUpdateTime, deploymentUrl, sourceUrl, sourceExtraUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    sourceExtraUrl: ").append(toIndentedString(sourceExtraUrl)).append("\n");
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

