package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.QueryVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * HistoricTaskInstanceQueryRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class HistoricTaskInstanceQueryRequest   {
  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processBusinessKey")
  private String processBusinessKey = null;

  @JsonProperty("processBusinessKeyLike")
  private String processBusinessKeyLike = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionKeyLike")
  private String processDefinitionKeyLike = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("processDefinitionNameLike")
  private String processDefinitionNameLike = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("taskName")
  private String taskName = null;

  @JsonProperty("taskNameLike")
  private String taskNameLike = null;

  @JsonProperty("taskDescription")
  private String taskDescription = null;

  @JsonProperty("taskDescriptionLike")
  private String taskDescriptionLike = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("taskDefinitionKeyLike")
  private String taskDefinitionKeyLike = null;

  @JsonProperty("taskCategory")
  private String taskCategory = null;

  @JsonProperty("taskDeleteReason")
  private String taskDeleteReason = null;

  @JsonProperty("taskDeleteReasonLike")
  private String taskDeleteReasonLike = null;

  @JsonProperty("taskAssignee")
  private String taskAssignee = null;

  @JsonProperty("taskAssigneeLike")
  private String taskAssigneeLike = null;

  @JsonProperty("taskOwner")
  private String taskOwner = null;

  @JsonProperty("taskOwnerLike")
  private String taskOwnerLike = null;

  @JsonProperty("taskInvolvedUser")
  private String taskInvolvedUser = null;

  @JsonProperty("taskPriority")
  private Integer taskPriority = null;

  @JsonProperty("taskMinPriority")
  private Integer taskMinPriority = null;

  @JsonProperty("taskMaxPriority")
  private Integer taskMaxPriority = null;

  @JsonProperty("finished")
  private Boolean finished = false;

  @JsonProperty("processFinished")
  private Boolean processFinished = false;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("dueDateAfter")
  private OffsetDateTime dueDateAfter = null;

  @JsonProperty("dueDateBefore")
  private OffsetDateTime dueDateBefore = null;

  @JsonProperty("withoutDueDate")
  private Boolean withoutDueDate = false;

  @JsonProperty("taskCreatedOn")
  private OffsetDateTime taskCreatedOn = null;

  @JsonProperty("taskCreatedBefore")
  private OffsetDateTime taskCreatedBefore = null;

  @JsonProperty("taskCreatedAfter")
  private OffsetDateTime taskCreatedAfter = null;

  @JsonProperty("taskCompletedOn")
  private OffsetDateTime taskCompletedOn = null;

  @JsonProperty("taskCompletedBefore")
  private OffsetDateTime taskCompletedBefore = null;

  @JsonProperty("taskCompletedAfter")
  private OffsetDateTime taskCompletedAfter = null;

  @JsonProperty("includeTaskLocalVariables")
  private Boolean includeTaskLocalVariables = false;

  @JsonProperty("includeProcessVariables")
  private Boolean includeProcessVariables = false;

  @JsonProperty("taskVariables")
  @Valid
  private List<QueryVariable> taskVariables = null;

  @JsonProperty("processVariables")
  @Valid
  private List<QueryVariable> processVariables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("tenantIdLike")
  private String tenantIdLike = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = false;

  @JsonProperty("taskCandidateGroup")
  private String taskCandidateGroup = null;

  public HistoricTaskInstanceQueryRequest start(Integer start) {
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

  public HistoricTaskInstanceQueryRequest size(Integer size) {
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

  public HistoricTaskInstanceQueryRequest sort(String sort) {
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

  public HistoricTaskInstanceQueryRequest order(String order) {
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

  public HistoricTaskInstanceQueryRequest taskId(String taskId) {
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

  public HistoricTaskInstanceQueryRequest processInstanceId(String processInstanceId) {
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

  public HistoricTaskInstanceQueryRequest processBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
    return this;
  }

  /**
   * Get processBusinessKey
   * @return processBusinessKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessBusinessKey() {
    return processBusinessKey;
  }

  public void setProcessBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
  }

  public HistoricTaskInstanceQueryRequest processBusinessKeyLike(String processBusinessKeyLike) {
    this.processBusinessKeyLike = processBusinessKeyLike;
    return this;
  }

  /**
   * Get processBusinessKeyLike
   * @return processBusinessKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessBusinessKeyLike() {
    return processBusinessKeyLike;
  }

  public void setProcessBusinessKeyLike(String processBusinessKeyLike) {
    this.processBusinessKeyLike = processBusinessKeyLike;
  }

  public HistoricTaskInstanceQueryRequest processDefinitionId(String processDefinitionId) {
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

  public HistoricTaskInstanceQueryRequest processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Get processDefinitionKey
   * @return processDefinitionKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricTaskInstanceQueryRequest processDefinitionKeyLike(String processDefinitionKeyLike) {
    this.processDefinitionKeyLike = processDefinitionKeyLike;
    return this;
  }

  /**
   * Get processDefinitionKeyLike
   * @return processDefinitionKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionKeyLike() {
    return processDefinitionKeyLike;
  }

  public void setProcessDefinitionKeyLike(String processDefinitionKeyLike) {
    this.processDefinitionKeyLike = processDefinitionKeyLike;
  }

  public HistoricTaskInstanceQueryRequest processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Get processDefinitionName
   * @return processDefinitionName
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public HistoricTaskInstanceQueryRequest processDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
    return this;
  }

  /**
   * Get processDefinitionNameLike
   * @return processDefinitionNameLike
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionNameLike() {
    return processDefinitionNameLike;
  }

  public void setProcessDefinitionNameLike(String processDefinitionNameLike) {
    this.processDefinitionNameLike = processDefinitionNameLike;
  }

  public HistoricTaskInstanceQueryRequest executionId(String executionId) {
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

  public HistoricTaskInstanceQueryRequest taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")


  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public HistoricTaskInstanceQueryRequest taskNameLike(String taskNameLike) {
    this.taskNameLike = taskNameLike;
    return this;
  }

  /**
   * Get taskNameLike
   * @return taskNameLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskNameLike() {
    return taskNameLike;
  }

  public void setTaskNameLike(String taskNameLike) {
    this.taskNameLike = taskNameLike;
  }

  public HistoricTaskInstanceQueryRequest taskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
    return this;
  }

  /**
   * Get taskDescription
   * @return taskDescription
  **/
  @ApiModelProperty(value = "")


  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  public HistoricTaskInstanceQueryRequest taskDescriptionLike(String taskDescriptionLike) {
    this.taskDescriptionLike = taskDescriptionLike;
    return this;
  }

  /**
   * Get taskDescriptionLike
   * @return taskDescriptionLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskDescriptionLike() {
    return taskDescriptionLike;
  }

  public void setTaskDescriptionLike(String taskDescriptionLike) {
    this.taskDescriptionLike = taskDescriptionLike;
  }

  public HistoricTaskInstanceQueryRequest taskDefinitionKey(String taskDefinitionKey) {
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

  public HistoricTaskInstanceQueryRequest taskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
    return this;
  }

  /**
   * Get taskDefinitionKeyLike
   * @return taskDefinitionKeyLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskDefinitionKeyLike() {
    return taskDefinitionKeyLike;
  }

  public void setTaskDefinitionKeyLike(String taskDefinitionKeyLike) {
    this.taskDefinitionKeyLike = taskDefinitionKeyLike;
  }

  public HistoricTaskInstanceQueryRequest taskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
    return this;
  }

  /**
   * Get taskCategory
   * @return taskCategory
  **/
  @ApiModelProperty(value = "")


  public String getTaskCategory() {
    return taskCategory;
  }

  public void setTaskCategory(String taskCategory) {
    this.taskCategory = taskCategory;
  }

  public HistoricTaskInstanceQueryRequest taskDeleteReason(String taskDeleteReason) {
    this.taskDeleteReason = taskDeleteReason;
    return this;
  }

  /**
   * Get taskDeleteReason
   * @return taskDeleteReason
  **/
  @ApiModelProperty(value = "")


  public String getTaskDeleteReason() {
    return taskDeleteReason;
  }

  public void setTaskDeleteReason(String taskDeleteReason) {
    this.taskDeleteReason = taskDeleteReason;
  }

  public HistoricTaskInstanceQueryRequest taskDeleteReasonLike(String taskDeleteReasonLike) {
    this.taskDeleteReasonLike = taskDeleteReasonLike;
    return this;
  }

  /**
   * Get taskDeleteReasonLike
   * @return taskDeleteReasonLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskDeleteReasonLike() {
    return taskDeleteReasonLike;
  }

  public void setTaskDeleteReasonLike(String taskDeleteReasonLike) {
    this.taskDeleteReasonLike = taskDeleteReasonLike;
  }

  public HistoricTaskInstanceQueryRequest taskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
    return this;
  }

  /**
   * Get taskAssignee
   * @return taskAssignee
  **/
  @ApiModelProperty(value = "")


  public String getTaskAssignee() {
    return taskAssignee;
  }

  public void setTaskAssignee(String taskAssignee) {
    this.taskAssignee = taskAssignee;
  }

  public HistoricTaskInstanceQueryRequest taskAssigneeLike(String taskAssigneeLike) {
    this.taskAssigneeLike = taskAssigneeLike;
    return this;
  }

  /**
   * Get taskAssigneeLike
   * @return taskAssigneeLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskAssigneeLike() {
    return taskAssigneeLike;
  }

  public void setTaskAssigneeLike(String taskAssigneeLike) {
    this.taskAssigneeLike = taskAssigneeLike;
  }

  public HistoricTaskInstanceQueryRequest taskOwner(String taskOwner) {
    this.taskOwner = taskOwner;
    return this;
  }

  /**
   * Get taskOwner
   * @return taskOwner
  **/
  @ApiModelProperty(value = "")


  public String getTaskOwner() {
    return taskOwner;
  }

  public void setTaskOwner(String taskOwner) {
    this.taskOwner = taskOwner;
  }

  public HistoricTaskInstanceQueryRequest taskOwnerLike(String taskOwnerLike) {
    this.taskOwnerLike = taskOwnerLike;
    return this;
  }

  /**
   * Get taskOwnerLike
   * @return taskOwnerLike
  **/
  @ApiModelProperty(value = "")


  public String getTaskOwnerLike() {
    return taskOwnerLike;
  }

  public void setTaskOwnerLike(String taskOwnerLike) {
    this.taskOwnerLike = taskOwnerLike;
  }

  public HistoricTaskInstanceQueryRequest taskInvolvedUser(String taskInvolvedUser) {
    this.taskInvolvedUser = taskInvolvedUser;
    return this;
  }

  /**
   * Get taskInvolvedUser
   * @return taskInvolvedUser
  **/
  @ApiModelProperty(value = "")


  public String getTaskInvolvedUser() {
    return taskInvolvedUser;
  }

  public void setTaskInvolvedUser(String taskInvolvedUser) {
    this.taskInvolvedUser = taskInvolvedUser;
  }

  public HistoricTaskInstanceQueryRequest taskPriority(Integer taskPriority) {
    this.taskPriority = taskPriority;
    return this;
  }

  /**
   * Get taskPriority
   * @return taskPriority
  **/
  @ApiModelProperty(value = "")


  public Integer getTaskPriority() {
    return taskPriority;
  }

  public void setTaskPriority(Integer taskPriority) {
    this.taskPriority = taskPriority;
  }

  public HistoricTaskInstanceQueryRequest taskMinPriority(Integer taskMinPriority) {
    this.taskMinPriority = taskMinPriority;
    return this;
  }

  /**
   * Get taskMinPriority
   * @return taskMinPriority
  **/
  @ApiModelProperty(value = "")


  public Integer getTaskMinPriority() {
    return taskMinPriority;
  }

  public void setTaskMinPriority(Integer taskMinPriority) {
    this.taskMinPriority = taskMinPriority;
  }

  public HistoricTaskInstanceQueryRequest taskMaxPriority(Integer taskMaxPriority) {
    this.taskMaxPriority = taskMaxPriority;
    return this;
  }

  /**
   * Get taskMaxPriority
   * @return taskMaxPriority
  **/
  @ApiModelProperty(value = "")


  public Integer getTaskMaxPriority() {
    return taskMaxPriority;
  }

  public void setTaskMaxPriority(Integer taskMaxPriority) {
    this.taskMaxPriority = taskMaxPriority;
  }

  public HistoricTaskInstanceQueryRequest finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")


  public Boolean isFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricTaskInstanceQueryRequest processFinished(Boolean processFinished) {
    this.processFinished = processFinished;
    return this;
  }

  /**
   * Get processFinished
   * @return processFinished
  **/
  @ApiModelProperty(value = "")


  public Boolean isProcessFinished() {
    return processFinished;
  }

  public void setProcessFinished(Boolean processFinished) {
    this.processFinished = processFinished;
  }

  public HistoricTaskInstanceQueryRequest parentTaskId(String parentTaskId) {
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

  public HistoricTaskInstanceQueryRequest dueDate(OffsetDateTime dueDate) {
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

  public HistoricTaskInstanceQueryRequest dueDateAfter(OffsetDateTime dueDateAfter) {
    this.dueDateAfter = dueDateAfter;
    return this;
  }

  /**
   * Get dueDateAfter
   * @return dueDateAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDateAfter() {
    return dueDateAfter;
  }

  public void setDueDateAfter(OffsetDateTime dueDateAfter) {
    this.dueDateAfter = dueDateAfter;
  }

  public HistoricTaskInstanceQueryRequest dueDateBefore(OffsetDateTime dueDateBefore) {
    this.dueDateBefore = dueDateBefore;
    return this;
  }

  /**
   * Get dueDateBefore
   * @return dueDateBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDateBefore() {
    return dueDateBefore;
  }

  public void setDueDateBefore(OffsetDateTime dueDateBefore) {
    this.dueDateBefore = dueDateBefore;
  }

  public HistoricTaskInstanceQueryRequest withoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
    return this;
  }

  /**
   * Get withoutDueDate
   * @return withoutDueDate
  **/
  @ApiModelProperty(value = "")


  public Boolean isWithoutDueDate() {
    return withoutDueDate;
  }

  public void setWithoutDueDate(Boolean withoutDueDate) {
    this.withoutDueDate = withoutDueDate;
  }

  public HistoricTaskInstanceQueryRequest taskCreatedOn(OffsetDateTime taskCreatedOn) {
    this.taskCreatedOn = taskCreatedOn;
    return this;
  }

  /**
   * Get taskCreatedOn
   * @return taskCreatedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCreatedOn() {
    return taskCreatedOn;
  }

  public void setTaskCreatedOn(OffsetDateTime taskCreatedOn) {
    this.taskCreatedOn = taskCreatedOn;
  }

  public HistoricTaskInstanceQueryRequest taskCreatedBefore(OffsetDateTime taskCreatedBefore) {
    this.taskCreatedBefore = taskCreatedBefore;
    return this;
  }

  /**
   * Get taskCreatedBefore
   * @return taskCreatedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCreatedBefore() {
    return taskCreatedBefore;
  }

  public void setTaskCreatedBefore(OffsetDateTime taskCreatedBefore) {
    this.taskCreatedBefore = taskCreatedBefore;
  }

  public HistoricTaskInstanceQueryRequest taskCreatedAfter(OffsetDateTime taskCreatedAfter) {
    this.taskCreatedAfter = taskCreatedAfter;
    return this;
  }

  /**
   * Get taskCreatedAfter
   * @return taskCreatedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCreatedAfter() {
    return taskCreatedAfter;
  }

  public void setTaskCreatedAfter(OffsetDateTime taskCreatedAfter) {
    this.taskCreatedAfter = taskCreatedAfter;
  }

  public HistoricTaskInstanceQueryRequest taskCompletedOn(OffsetDateTime taskCompletedOn) {
    this.taskCompletedOn = taskCompletedOn;
    return this;
  }

  /**
   * Get taskCompletedOn
   * @return taskCompletedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCompletedOn() {
    return taskCompletedOn;
  }

  public void setTaskCompletedOn(OffsetDateTime taskCompletedOn) {
    this.taskCompletedOn = taskCompletedOn;
  }

  public HistoricTaskInstanceQueryRequest taskCompletedBefore(OffsetDateTime taskCompletedBefore) {
    this.taskCompletedBefore = taskCompletedBefore;
    return this;
  }

  /**
   * Get taskCompletedBefore
   * @return taskCompletedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCompletedBefore() {
    return taskCompletedBefore;
  }

  public void setTaskCompletedBefore(OffsetDateTime taskCompletedBefore) {
    this.taskCompletedBefore = taskCompletedBefore;
  }

  public HistoricTaskInstanceQueryRequest taskCompletedAfter(OffsetDateTime taskCompletedAfter) {
    this.taskCompletedAfter = taskCompletedAfter;
    return this;
  }

  /**
   * Get taskCompletedAfter
   * @return taskCompletedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTaskCompletedAfter() {
    return taskCompletedAfter;
  }

  public void setTaskCompletedAfter(OffsetDateTime taskCompletedAfter) {
    this.taskCompletedAfter = taskCompletedAfter;
  }

  public HistoricTaskInstanceQueryRequest includeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
    return this;
  }

  /**
   * Get includeTaskLocalVariables
   * @return includeTaskLocalVariables
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeTaskLocalVariables() {
    return includeTaskLocalVariables;
  }

  public void setIncludeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
  }

  public HistoricTaskInstanceQueryRequest includeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
    return this;
  }

  /**
   * Get includeProcessVariables
   * @return includeProcessVariables
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeProcessVariables() {
    return includeProcessVariables;
  }

  public void setIncludeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
  }

  public HistoricTaskInstanceQueryRequest taskVariables(List<QueryVariable> taskVariables) {
    this.taskVariables = taskVariables;
    return this;
  }

  public HistoricTaskInstanceQueryRequest addTaskVariablesItem(QueryVariable taskVariablesItem) {
    if (this.taskVariables == null) {
      this.taskVariables = new ArrayList<QueryVariable>();
    }
    this.taskVariables.add(taskVariablesItem);
    return this;
  }

  /**
   * Get taskVariables
   * @return taskVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryVariable> getTaskVariables() {
    return taskVariables;
  }

  public void setTaskVariables(List<QueryVariable> taskVariables) {
    this.taskVariables = taskVariables;
  }

  public HistoricTaskInstanceQueryRequest processVariables(List<QueryVariable> processVariables) {
    this.processVariables = processVariables;
    return this;
  }

  public HistoricTaskInstanceQueryRequest addProcessVariablesItem(QueryVariable processVariablesItem) {
    if (this.processVariables == null) {
      this.processVariables = new ArrayList<QueryVariable>();
    }
    this.processVariables.add(processVariablesItem);
    return this;
  }

  /**
   * Get processVariables
   * @return processVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryVariable> getProcessVariables() {
    return processVariables;
  }

  public void setProcessVariables(List<QueryVariable> processVariables) {
    this.processVariables = processVariables;
  }

  public HistoricTaskInstanceQueryRequest tenantId(String tenantId) {
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

  public HistoricTaskInstanceQueryRequest tenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
    return this;
  }

  /**
   * Get tenantIdLike
   * @return tenantIdLike
  **/
  @ApiModelProperty(value = "")


  public String getTenantIdLike() {
    return tenantIdLike;
  }

  public void setTenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
  }

  public HistoricTaskInstanceQueryRequest withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Get withoutTenantId
   * @return withoutTenantId
  **/
  @ApiModelProperty(value = "")


  public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricTaskInstanceQueryRequest taskCandidateGroup(String taskCandidateGroup) {
    this.taskCandidateGroup = taskCandidateGroup;
    return this;
  }

  /**
   * Get taskCandidateGroup
   * @return taskCandidateGroup
  **/
  @ApiModelProperty(value = "")


  public String getTaskCandidateGroup() {
    return taskCandidateGroup;
  }

  public void setTaskCandidateGroup(String taskCandidateGroup) {
    this.taskCandidateGroup = taskCandidateGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricTaskInstanceQueryRequest historicTaskInstanceQueryRequest = (HistoricTaskInstanceQueryRequest) o;
    return Objects.equals(this.start, historicTaskInstanceQueryRequest.start) &&
        Objects.equals(this.size, historicTaskInstanceQueryRequest.size) &&
        Objects.equals(this.sort, historicTaskInstanceQueryRequest.sort) &&
        Objects.equals(this.order, historicTaskInstanceQueryRequest.order) &&
        Objects.equals(this.taskId, historicTaskInstanceQueryRequest.taskId) &&
        Objects.equals(this.processInstanceId, historicTaskInstanceQueryRequest.processInstanceId) &&
        Objects.equals(this.processBusinessKey, historicTaskInstanceQueryRequest.processBusinessKey) &&
        Objects.equals(this.processBusinessKeyLike, historicTaskInstanceQueryRequest.processBusinessKeyLike) &&
        Objects.equals(this.processDefinitionId, historicTaskInstanceQueryRequest.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicTaskInstanceQueryRequest.processDefinitionKey) &&
        Objects.equals(this.processDefinitionKeyLike, historicTaskInstanceQueryRequest.processDefinitionKeyLike) &&
        Objects.equals(this.processDefinitionName, historicTaskInstanceQueryRequest.processDefinitionName) &&
        Objects.equals(this.processDefinitionNameLike, historicTaskInstanceQueryRequest.processDefinitionNameLike) &&
        Objects.equals(this.executionId, historicTaskInstanceQueryRequest.executionId) &&
        Objects.equals(this.taskName, historicTaskInstanceQueryRequest.taskName) &&
        Objects.equals(this.taskNameLike, historicTaskInstanceQueryRequest.taskNameLike) &&
        Objects.equals(this.taskDescription, historicTaskInstanceQueryRequest.taskDescription) &&
        Objects.equals(this.taskDescriptionLike, historicTaskInstanceQueryRequest.taskDescriptionLike) &&
        Objects.equals(this.taskDefinitionKey, historicTaskInstanceQueryRequest.taskDefinitionKey) &&
        Objects.equals(this.taskDefinitionKeyLike, historicTaskInstanceQueryRequest.taskDefinitionKeyLike) &&
        Objects.equals(this.taskCategory, historicTaskInstanceQueryRequest.taskCategory) &&
        Objects.equals(this.taskDeleteReason, historicTaskInstanceQueryRequest.taskDeleteReason) &&
        Objects.equals(this.taskDeleteReasonLike, historicTaskInstanceQueryRequest.taskDeleteReasonLike) &&
        Objects.equals(this.taskAssignee, historicTaskInstanceQueryRequest.taskAssignee) &&
        Objects.equals(this.taskAssigneeLike, historicTaskInstanceQueryRequest.taskAssigneeLike) &&
        Objects.equals(this.taskOwner, historicTaskInstanceQueryRequest.taskOwner) &&
        Objects.equals(this.taskOwnerLike, historicTaskInstanceQueryRequest.taskOwnerLike) &&
        Objects.equals(this.taskInvolvedUser, historicTaskInstanceQueryRequest.taskInvolvedUser) &&
        Objects.equals(this.taskPriority, historicTaskInstanceQueryRequest.taskPriority) &&
        Objects.equals(this.taskMinPriority, historicTaskInstanceQueryRequest.taskMinPriority) &&
        Objects.equals(this.taskMaxPriority, historicTaskInstanceQueryRequest.taskMaxPriority) &&
        Objects.equals(this.finished, historicTaskInstanceQueryRequest.finished) &&
        Objects.equals(this.processFinished, historicTaskInstanceQueryRequest.processFinished) &&
        Objects.equals(this.parentTaskId, historicTaskInstanceQueryRequest.parentTaskId) &&
        Objects.equals(this.dueDate, historicTaskInstanceQueryRequest.dueDate) &&
        Objects.equals(this.dueDateAfter, historicTaskInstanceQueryRequest.dueDateAfter) &&
        Objects.equals(this.dueDateBefore, historicTaskInstanceQueryRequest.dueDateBefore) &&
        Objects.equals(this.withoutDueDate, historicTaskInstanceQueryRequest.withoutDueDate) &&
        Objects.equals(this.taskCreatedOn, historicTaskInstanceQueryRequest.taskCreatedOn) &&
        Objects.equals(this.taskCreatedBefore, historicTaskInstanceQueryRequest.taskCreatedBefore) &&
        Objects.equals(this.taskCreatedAfter, historicTaskInstanceQueryRequest.taskCreatedAfter) &&
        Objects.equals(this.taskCompletedOn, historicTaskInstanceQueryRequest.taskCompletedOn) &&
        Objects.equals(this.taskCompletedBefore, historicTaskInstanceQueryRequest.taskCompletedBefore) &&
        Objects.equals(this.taskCompletedAfter, historicTaskInstanceQueryRequest.taskCompletedAfter) &&
        Objects.equals(this.includeTaskLocalVariables, historicTaskInstanceQueryRequest.includeTaskLocalVariables) &&
        Objects.equals(this.includeProcessVariables, historicTaskInstanceQueryRequest.includeProcessVariables) &&
        Objects.equals(this.taskVariables, historicTaskInstanceQueryRequest.taskVariables) &&
        Objects.equals(this.processVariables, historicTaskInstanceQueryRequest.processVariables) &&
        Objects.equals(this.tenantId, historicTaskInstanceQueryRequest.tenantId) &&
        Objects.equals(this.tenantIdLike, historicTaskInstanceQueryRequest.tenantIdLike) &&
        Objects.equals(this.withoutTenantId, historicTaskInstanceQueryRequest.withoutTenantId) &&
        Objects.equals(this.taskCandidateGroup, historicTaskInstanceQueryRequest.taskCandidateGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, size, sort, order, taskId, processInstanceId, processBusinessKey, processBusinessKeyLike, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, executionId, taskName, taskNameLike, taskDescription, taskDescriptionLike, taskDefinitionKey, taskDefinitionKeyLike, taskCategory, taskDeleteReason, taskDeleteReasonLike, taskAssignee, taskAssigneeLike, taskOwner, taskOwnerLike, taskInvolvedUser, taskPriority, taskMinPriority, taskMaxPriority, finished, processFinished, parentTaskId, dueDate, dueDateAfter, dueDateBefore, withoutDueDate, taskCreatedOn, taskCreatedBefore, taskCreatedAfter, taskCompletedOn, taskCompletedBefore, taskCompletedAfter, includeTaskLocalVariables, includeProcessVariables, taskVariables, processVariables, tenantId, tenantIdLike, withoutTenantId, taskCandidateGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricTaskInstanceQueryRequest {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processBusinessKey: ").append(toIndentedString(processBusinessKey)).append("\n");
    sb.append("    processBusinessKeyLike: ").append(toIndentedString(processBusinessKeyLike)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionKeyLike: ").append(toIndentedString(processDefinitionKeyLike)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionNameLike: ").append(toIndentedString(processDefinitionNameLike)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskNameLike: ").append(toIndentedString(taskNameLike)).append("\n");
    sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
    sb.append("    taskDescriptionLike: ").append(toIndentedString(taskDescriptionLike)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    taskDefinitionKeyLike: ").append(toIndentedString(taskDefinitionKeyLike)).append("\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
    sb.append("    taskDeleteReason: ").append(toIndentedString(taskDeleteReason)).append("\n");
    sb.append("    taskDeleteReasonLike: ").append(toIndentedString(taskDeleteReasonLike)).append("\n");
    sb.append("    taskAssignee: ").append(toIndentedString(taskAssignee)).append("\n");
    sb.append("    taskAssigneeLike: ").append(toIndentedString(taskAssigneeLike)).append("\n");
    sb.append("    taskOwner: ").append(toIndentedString(taskOwner)).append("\n");
    sb.append("    taskOwnerLike: ").append(toIndentedString(taskOwnerLike)).append("\n");
    sb.append("    taskInvolvedUser: ").append(toIndentedString(taskInvolvedUser)).append("\n");
    sb.append("    taskPriority: ").append(toIndentedString(taskPriority)).append("\n");
    sb.append("    taskMinPriority: ").append(toIndentedString(taskMinPriority)).append("\n");
    sb.append("    taskMaxPriority: ").append(toIndentedString(taskMaxPriority)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    processFinished: ").append(toIndentedString(processFinished)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateAfter: ").append(toIndentedString(dueDateAfter)).append("\n");
    sb.append("    dueDateBefore: ").append(toIndentedString(dueDateBefore)).append("\n");
    sb.append("    withoutDueDate: ").append(toIndentedString(withoutDueDate)).append("\n");
    sb.append("    taskCreatedOn: ").append(toIndentedString(taskCreatedOn)).append("\n");
    sb.append("    taskCreatedBefore: ").append(toIndentedString(taskCreatedBefore)).append("\n");
    sb.append("    taskCreatedAfter: ").append(toIndentedString(taskCreatedAfter)).append("\n");
    sb.append("    taskCompletedOn: ").append(toIndentedString(taskCompletedOn)).append("\n");
    sb.append("    taskCompletedBefore: ").append(toIndentedString(taskCompletedBefore)).append("\n");
    sb.append("    taskCompletedAfter: ").append(toIndentedString(taskCompletedAfter)).append("\n");
    sb.append("    includeTaskLocalVariables: ").append(toIndentedString(includeTaskLocalVariables)).append("\n");
    sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
    sb.append("    taskVariables: ").append(toIndentedString(taskVariables)).append("\n");
    sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantIdLike: ").append(toIndentedString(tenantIdLike)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    taskCandidateGroup: ").append(toIndentedString(taskCandidateGroup)).append("\n");
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

