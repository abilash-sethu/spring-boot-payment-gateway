package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * JobResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class JobResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionUrl")
  private String processDefinitionUrl = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("executionUrl")
  private String executionUrl = null;

  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("exceptionMessage")
  private String exceptionMessage = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  public JobResponse id(String id) {
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

  public JobResponse url(String url) {
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

  public JobResponse processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public JobResponse processInstanceUrl(String processInstanceUrl) {
    this.processInstanceUrl = processInstanceUrl;
    return this;
  }

  /**
   * Get processInstanceUrl
   * @return processInstanceUrl
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceUrl() {
    return processInstanceUrl;
  }

  public void setProcessInstanceUrl(String processInstanceUrl) {
    this.processInstanceUrl = processInstanceUrl;
  }

  public JobResponse processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobResponse processDefinitionUrl(String processDefinitionUrl) {
    this.processDefinitionUrl = processDefinitionUrl;
    return this;
  }

  /**
   * Get processDefinitionUrl
   * @return processDefinitionUrl
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionUrl() {
    return processDefinitionUrl;
  }

  public void setProcessDefinitionUrl(String processDefinitionUrl) {
    this.processDefinitionUrl = processDefinitionUrl;
  }

  public JobResponse executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")


  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public JobResponse executionUrl(String executionUrl) {
    this.executionUrl = executionUrl;
    return this;
  }

  /**
   * Get executionUrl
   * @return executionUrl
  **/
  @ApiModelProperty(value = "")


  public String getExecutionUrl() {
    return executionUrl;
  }

  public void setExecutionUrl(String executionUrl) {
    this.executionUrl = executionUrl;
  }

  public JobResponse retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * Get retries
   * @return retries
  **/
  @ApiModelProperty(value = "")


  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public JobResponse exceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    return this;
  }

  /**
   * Get exceptionMessage
   * @return exceptionMessage
  **/
  @ApiModelProperty(value = "")


  public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public JobResponse dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public JobResponse tenantId(String tenantId) {
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
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.url, jobResponse.url) &&
        Objects.equals(this.processInstanceId, jobResponse.processInstanceId) &&
        Objects.equals(this.processInstanceUrl, jobResponse.processInstanceUrl) &&
        Objects.equals(this.processDefinitionId, jobResponse.processDefinitionId) &&
        Objects.equals(this.processDefinitionUrl, jobResponse.processDefinitionUrl) &&
        Objects.equals(this.executionId, jobResponse.executionId) &&
        Objects.equals(this.executionUrl, jobResponse.executionUrl) &&
        Objects.equals(this.retries, jobResponse.retries) &&
        Objects.equals(this.exceptionMessage, jobResponse.exceptionMessage) &&
        Objects.equals(this.dueDate, jobResponse.dueDate) &&
        Objects.equals(this.tenantId, jobResponse.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, processInstanceId, processInstanceUrl, processDefinitionId, processDefinitionUrl, executionId, executionUrl, retries, exceptionMessage, dueDate, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    executionUrl: ").append(toIndentedString(executionUrl)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

