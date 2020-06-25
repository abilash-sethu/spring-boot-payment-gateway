package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * HistoricIdentityLinkResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class HistoricIdentityLinkResponse   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskUrl")
  private String taskUrl = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  public HistoricIdentityLinkResponse type(String type) {
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

  public HistoricIdentityLinkResponse userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HistoricIdentityLinkResponse groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public HistoricIdentityLinkResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricIdentityLinkResponse taskUrl(String taskUrl) {
    this.taskUrl = taskUrl;
    return this;
  }

  /**
   * Get taskUrl
   * @return taskUrl
  **/
  @ApiModelProperty(value = "")


  public String getTaskUrl() {
    return taskUrl;
  }

  public void setTaskUrl(String taskUrl) {
    this.taskUrl = taskUrl;
  }

  public HistoricIdentityLinkResponse processInstanceId(String processInstanceId) {
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

  public HistoricIdentityLinkResponse processInstanceUrl(String processInstanceUrl) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricIdentityLinkResponse historicIdentityLinkResponse = (HistoricIdentityLinkResponse) o;
    return Objects.equals(this.type, historicIdentityLinkResponse.type) &&
        Objects.equals(this.userId, historicIdentityLinkResponse.userId) &&
        Objects.equals(this.groupId, historicIdentityLinkResponse.groupId) &&
        Objects.equals(this.taskId, historicIdentityLinkResponse.taskId) &&
        Objects.equals(this.taskUrl, historicIdentityLinkResponse.taskUrl) &&
        Objects.equals(this.processInstanceId, historicIdentityLinkResponse.processInstanceId) &&
        Objects.equals(this.processInstanceUrl, historicIdentityLinkResponse.processInstanceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userId, groupId, taskId, taskUrl, processInstanceId, processInstanceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricIdentityLinkResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
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

