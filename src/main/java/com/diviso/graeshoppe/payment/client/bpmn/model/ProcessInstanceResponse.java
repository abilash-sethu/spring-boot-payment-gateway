package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.RestVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ProcessInstanceResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ProcessInstanceResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("suspended")
  private Boolean suspended = false;

  @JsonProperty("ended")
  private Boolean ended = false;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionUrl")
  private String processDefinitionUrl = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("completed")
  private Boolean completed = false;

  public ProcessInstanceResponse id(String id) {
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

  public ProcessInstanceResponse url(String url) {
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

  public ProcessInstanceResponse businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Get businessKey
   * @return businessKey
  **/
  @ApiModelProperty(value = "")


  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public ProcessInstanceResponse suspended(Boolean suspended) {
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

  public ProcessInstanceResponse ended(Boolean ended) {
    this.ended = ended;
    return this;
  }

  /**
   * Get ended
   * @return ended
  **/
  @ApiModelProperty(value = "")


  public Boolean isEnded() {
    return ended;
  }

  public void setEnded(Boolean ended) {
    this.ended = ended;
  }

  public ProcessInstanceResponse processDefinitionId(String processDefinitionId) {
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

  public ProcessInstanceResponse processDefinitionUrl(String processDefinitionUrl) {
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

  public ProcessInstanceResponse processDefinitionKey(String processDefinitionKey) {
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

  public ProcessInstanceResponse activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")


  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ProcessInstanceResponse variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessInstanceResponse addVariablesItem(RestVariable variablesItem) {
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

  public ProcessInstanceResponse tenantId(String tenantId) {
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

  public ProcessInstanceResponse name(String name) {
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

  public ProcessInstanceResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(value = "")


  public Boolean isCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceResponse processInstanceResponse = (ProcessInstanceResponse) o;
    return Objects.equals(this.id, processInstanceResponse.id) &&
        Objects.equals(this.url, processInstanceResponse.url) &&
        Objects.equals(this.businessKey, processInstanceResponse.businessKey) &&
        Objects.equals(this.suspended, processInstanceResponse.suspended) &&
        Objects.equals(this.ended, processInstanceResponse.ended) &&
        Objects.equals(this.processDefinitionId, processInstanceResponse.processDefinitionId) &&
        Objects.equals(this.processDefinitionUrl, processInstanceResponse.processDefinitionUrl) &&
        Objects.equals(this.processDefinitionKey, processInstanceResponse.processDefinitionKey) &&
        Objects.equals(this.activityId, processInstanceResponse.activityId) &&
        Objects.equals(this.variables, processInstanceResponse.variables) &&
        Objects.equals(this.tenantId, processInstanceResponse.tenantId) &&
        Objects.equals(this.name, processInstanceResponse.name) &&
        Objects.equals(this.completed, processInstanceResponse.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, businessKey, suspended, ended, processDefinitionId, processDefinitionUrl, processDefinitionKey, activityId, variables, tenantId, name, completed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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

