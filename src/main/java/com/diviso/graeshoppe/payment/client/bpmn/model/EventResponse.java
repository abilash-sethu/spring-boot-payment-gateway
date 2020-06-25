package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * EventResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class EventResponse   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("time")
  private OffsetDateTime time = null;

  @JsonProperty("taskUrl")
  private String taskUrl = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  @JsonProperty("message")
  @Valid
  private List<String> message = null;

  public EventResponse url(String url) {
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

  public EventResponse id(String id) {
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

  public EventResponse action(String action) {
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

  public EventResponse userId(String userId) {
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

  public EventResponse time(OffsetDateTime time) {
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

  public EventResponse taskUrl(String taskUrl) {
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

  public EventResponse processInstanceUrl(String processInstanceUrl) {
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

  public EventResponse message(List<String> message) {
    this.message = message;
    return this;
  }

  public EventResponse addMessageItem(String messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<String>();
    }
    this.message.add(messageItem);
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public List<String> getMessage() {
    return message;
  }

  public void setMessage(List<String> message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.url, eventResponse.url) &&
        Objects.equals(this.id, eventResponse.id) &&
        Objects.equals(this.action, eventResponse.action) &&
        Objects.equals(this.userId, eventResponse.userId) &&
        Objects.equals(this.time, eventResponse.time) &&
        Objects.equals(this.taskUrl, eventResponse.taskUrl) &&
        Objects.equals(this.processInstanceUrl, eventResponse.processInstanceUrl) &&
        Objects.equals(this.message, eventResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, id, action, userId, time, taskUrl, processInstanceUrl, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
    sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

