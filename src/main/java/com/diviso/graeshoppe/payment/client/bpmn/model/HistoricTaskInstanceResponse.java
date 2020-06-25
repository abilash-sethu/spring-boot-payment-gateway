package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.RestVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * HistoricTaskInstanceResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class HistoricTaskInstanceResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionUrl")
  private String processDefinitionUrl = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceUrl")
  private String processInstanceUrl = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("deleteReason")
  private String deleteReason = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("durationInMillis")
  private Long durationInMillis = null;

  @JsonProperty("workTimeInMillis")
  private Long workTimeInMillis = null;

  @JsonProperty("claimTime")
  private OffsetDateTime claimTime = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("category")
  private String category = null;

  public HistoricTaskInstanceResponse id(String id) {
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

  public HistoricTaskInstanceResponse processDefinitionId(String processDefinitionId) {
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

  public HistoricTaskInstanceResponse processDefinitionUrl(String processDefinitionUrl) {
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

  public HistoricTaskInstanceResponse processInstanceId(String processInstanceId) {
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

  public HistoricTaskInstanceResponse processInstanceUrl(String processInstanceUrl) {
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

  public HistoricTaskInstanceResponse executionId(String executionId) {
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

  public HistoricTaskInstanceResponse name(String name) {
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

  public HistoricTaskInstanceResponse description(String description) {
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

  public HistoricTaskInstanceResponse deleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
    return this;
  }

  /**
   * Get deleteReason
   * @return deleteReason
  **/
  @ApiModelProperty(value = "")


  public String getDeleteReason() {
    return deleteReason;
  }

  public void setDeleteReason(String deleteReason) {
    this.deleteReason = deleteReason;
  }

  public HistoricTaskInstanceResponse owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")


  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public HistoricTaskInstanceResponse assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")


  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public HistoricTaskInstanceResponse startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricTaskInstanceResponse endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricTaskInstanceResponse durationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
  }

  /**
   * Get durationInMillis
   * @return durationInMillis
  **/
  @ApiModelProperty(value = "")


  public Long getDurationInMillis() {
    return durationInMillis;
  }

  public void setDurationInMillis(Long durationInMillis) {
    this.durationInMillis = durationInMillis;
  }

  public HistoricTaskInstanceResponse workTimeInMillis(Long workTimeInMillis) {
    this.workTimeInMillis = workTimeInMillis;
    return this;
  }

  /**
   * Get workTimeInMillis
   * @return workTimeInMillis
  **/
  @ApiModelProperty(value = "")


  public Long getWorkTimeInMillis() {
    return workTimeInMillis;
  }

  public void setWorkTimeInMillis(Long workTimeInMillis) {
    this.workTimeInMillis = workTimeInMillis;
  }

  public HistoricTaskInstanceResponse claimTime(OffsetDateTime claimTime) {
    this.claimTime = claimTime;
    return this;
  }

  /**
   * Get claimTime
   * @return claimTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClaimTime() {
    return claimTime;
  }

  public void setClaimTime(OffsetDateTime claimTime) {
    this.claimTime = claimTime;
  }

  public HistoricTaskInstanceResponse taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * Get taskDefinitionKey
   * @return taskDefinitionKey
  **/
  @ApiModelProperty(value = "")


  public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public HistoricTaskInstanceResponse formKey(String formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * Get formKey
   * @return formKey
  **/
  @ApiModelProperty(value = "")


  public String getFormKey() {
    return formKey;
  }

  public void setFormKey(String formKey) {
    this.formKey = formKey;
  }

  public HistoricTaskInstanceResponse priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public HistoricTaskInstanceResponse dueDate(OffsetDateTime dueDate) {
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

  public HistoricTaskInstanceResponse parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * Get parentTaskId
   * @return parentTaskId
  **/
  @ApiModelProperty(value = "")


  public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public HistoricTaskInstanceResponse url(String url) {
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

  public HistoricTaskInstanceResponse variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public HistoricTaskInstanceResponse addVariablesItem(RestVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<RestVariable>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RestVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<RestVariable> variables) {
    this.variables = variables;
  }

  public HistoricTaskInstanceResponse tenantId(String tenantId) {
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

  public HistoricTaskInstanceResponse category(String category) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricTaskInstanceResponse historicTaskInstanceResponse = (HistoricTaskInstanceResponse) o;
    return Objects.equals(this.id, historicTaskInstanceResponse.id) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceResponse.processDefinitionId) &&
        Objects.equals(this.processDefinitionUrl, historicTaskInstanceResponse.processDefinitionUrl) &&
        Objects.equals(this.processInstanceId, historicTaskInstanceResponse.processInstanceId) &&
        Objects.equals(this.processInstanceUrl, historicTaskInstanceResponse.processInstanceUrl) &&
        Objects.equals(this.executionId, historicTaskInstanceResponse.executionId) &&
        Objects.equals(this.name, historicTaskInstanceResponse.name) &&
        Objects.equals(this.description, historicTaskInstanceResponse.description) &&
        Objects.equals(this.deleteReason, historicTaskInstanceResponse.deleteReason) &&
        Objects.equals(this.owner, historicTaskInstanceResponse.owner) &&
        Objects.equals(this.assignee, historicTaskInstanceResponse.assignee) &&
        Objects.equals(this.startTime, historicTaskInstanceResponse.startTime) &&
        Objects.equals(this.endTime, historicTaskInstanceResponse.endTime) &&
        Objects.equals(this.durationInMillis, historicTaskInstanceResponse.durationInMillis) &&
        Objects.equals(this.workTimeInMillis, historicTaskInstanceResponse.workTimeInMillis) &&
        Objects.equals(this.claimTime, historicTaskInstanceResponse.claimTime) &&
        Objects.equals(this.taskDefinitionKey, historicTaskInstanceResponse.taskDefinitionKey) &&
        Objects.equals(this.formKey, historicTaskInstanceResponse.formKey) &&
        Objects.equals(this.priority, historicTaskInstanceResponse.priority) &&
        Objects.equals(this.dueDate, historicTaskInstanceResponse.dueDate) &&
        Objects.equals(this.parentTaskId, historicTaskInstanceResponse.parentTaskId) &&
        Objects.equals(this.url, historicTaskInstanceResponse.url) &&
        Objects.equals(this.variables, historicTaskInstanceResponse.variables) &&
        Objects.equals(this.tenantId, historicTaskInstanceResponse.tenantId) &&
        Objects.equals(this.category, historicTaskInstanceResponse.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionId, processDefinitionUrl, processInstanceId, processInstanceUrl, executionId, name, description, deleteReason, owner, assignee, startTime, endTime, durationInMillis, workTimeInMillis, claimTime, taskDefinitionKey, formKey, priority, dueDate, parentTaskId, url, variables, tenantId, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleteReason: ").append(toIndentedString(deleteReason)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    workTimeInMillis: ").append(toIndentedString(workTimeInMillis)).append("\n");
    sb.append("    claimTime: ").append(toIndentedString(claimTime)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

