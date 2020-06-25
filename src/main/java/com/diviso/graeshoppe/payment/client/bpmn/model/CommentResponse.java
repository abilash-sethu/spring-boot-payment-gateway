package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CommentResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class CommentResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskUrl")
  private String taskUrl = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  public CommentResponse id(String id) {
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

  public CommentResponse author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public CommentResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CommentResponse time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public CommentResponse taskId(String taskId) {
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

  public CommentResponse taskUrl(String taskUrl) {
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

  public CommentResponse processInstanceId(String processInstanceId) {
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

  public CommentResponse processInstanceUrl(String processInstanceUrl) {
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
    CommentResponse commentResponse = (CommentResponse) o;
    return Objects.equals(this.id, commentResponse.id) &&
        Objects.equals(this.author, commentResponse.author) &&
        Objects.equals(this.message, commentResponse.message) &&
        Objects.equals(this.time, commentResponse.time) &&
        Objects.equals(this.taskId, commentResponse.taskId) &&
        Objects.equals(this.taskUrl, commentResponse.taskUrl) &&
        Objects.equals(this.processInstanceId, commentResponse.processInstanceId) &&
        Objects.equals(this.processInstanceUrl, commentResponse.processInstanceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, message, time, taskId, taskUrl, processInstanceId, processInstanceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

