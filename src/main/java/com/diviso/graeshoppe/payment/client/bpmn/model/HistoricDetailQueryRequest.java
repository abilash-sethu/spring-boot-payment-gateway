package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * HistoricDetailQueryRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class HistoricDetailQueryRequest   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("selectOnlyFormProperties")
  private Boolean selectOnlyFormProperties = false;

  @JsonProperty("selectOnlyVariableUpdates")
  private Boolean selectOnlyVariableUpdates = false;

  public HistoricDetailQueryRequest start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public HistoricDetailQueryRequest size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public HistoricDetailQueryRequest sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")


  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public HistoricDetailQueryRequest order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public HistoricDetailQueryRequest id(String id) {
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

  public HistoricDetailQueryRequest processInstanceId(String processInstanceId) {
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

  public HistoricDetailQueryRequest executionId(String executionId) {
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

  public HistoricDetailQueryRequest activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * Get activityInstanceId
   * @return activityInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricDetailQueryRequest taskId(String taskId) {
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

  public HistoricDetailQueryRequest selectOnlyFormProperties(Boolean selectOnlyFormProperties) {
    this.selectOnlyFormProperties = selectOnlyFormProperties;
    return this;
  }

  /**
   * Get selectOnlyFormProperties
   * @return selectOnlyFormProperties
  **/
  @ApiModelProperty(value = "")


  public Boolean isSelectOnlyFormProperties() {
    return selectOnlyFormProperties;
  }

  public void setSelectOnlyFormProperties(Boolean selectOnlyFormProperties) {
    this.selectOnlyFormProperties = selectOnlyFormProperties;
  }

  public HistoricDetailQueryRequest selectOnlyVariableUpdates(Boolean selectOnlyVariableUpdates) {
    this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
    return this;
  }

  /**
   * Get selectOnlyVariableUpdates
   * @return selectOnlyVariableUpdates
  **/
  @ApiModelProperty(value = "")


  public Boolean isSelectOnlyVariableUpdates() {
    return selectOnlyVariableUpdates;
  }

  public void setSelectOnlyVariableUpdates(Boolean selectOnlyVariableUpdates) {
    this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDetailQueryRequest historicDetailQueryRequest = (HistoricDetailQueryRequest) o;
    return Objects.equals(this.start, historicDetailQueryRequest.start) &&
        Objects.equals(this.size, historicDetailQueryRequest.size) &&
        Objects.equals(this.sort, historicDetailQueryRequest.sort) &&
        Objects.equals(this.order, historicDetailQueryRequest.order) &&
        Objects.equals(this.id, historicDetailQueryRequest.id) &&
        Objects.equals(this.processInstanceId, historicDetailQueryRequest.processInstanceId) &&
        Objects.equals(this.executionId, historicDetailQueryRequest.executionId) &&
        Objects.equals(this.activityInstanceId, historicDetailQueryRequest.activityInstanceId) &&
        Objects.equals(this.taskId, historicDetailQueryRequest.taskId) &&
        Objects.equals(this.selectOnlyFormProperties, historicDetailQueryRequest.selectOnlyFormProperties) &&
        Objects.equals(this.selectOnlyVariableUpdates, historicDetailQueryRequest.selectOnlyVariableUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, size, sort, order, id, processInstanceId, executionId, activityInstanceId, taskId, selectOnlyFormProperties, selectOnlyVariableUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDetailQueryRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    selectOnlyFormProperties: ").append(toIndentedString(selectOnlyFormProperties)).append("\n");
    sb.append("    selectOnlyVariableUpdates: ").append(toIndentedString(selectOnlyVariableUpdates)).append("\n");
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

