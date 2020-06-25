package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.RestFormProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * FormDataResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class FormDataResponse   {
  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionUrl")
  private String processDefinitionUrl = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskUrl")
  private String taskUrl = null;

  @JsonProperty("formProperties")
  @Valid
  private List<RestFormProperty> formProperties = null;

  public FormDataResponse formKey(String formKey) {
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

  public FormDataResponse deploymentId(String deploymentId) {
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

  public FormDataResponse processDefinitionId(String processDefinitionId) {
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

  public FormDataResponse processDefinitionUrl(String processDefinitionUrl) {
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

  public FormDataResponse taskId(String taskId) {
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

  public FormDataResponse taskUrl(String taskUrl) {
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

  public FormDataResponse formProperties(List<RestFormProperty> formProperties) {
    this.formProperties = formProperties;
    return this;
  }

  public FormDataResponse addFormPropertiesItem(RestFormProperty formPropertiesItem) {
    if (this.formProperties == null) {
      this.formProperties = new ArrayList<RestFormProperty>();
    }
    this.formProperties.add(formPropertiesItem);
    return this;
  }

  /**
   * Get formProperties
   * @return formProperties
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RestFormProperty> getFormProperties() {
    return formProperties;
  }

  public void setFormProperties(List<RestFormProperty> formProperties) {
    this.formProperties = formProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataResponse formDataResponse = (FormDataResponse) o;
    return Objects.equals(this.formKey, formDataResponse.formKey) &&
        Objects.equals(this.deploymentId, formDataResponse.deploymentId) &&
        Objects.equals(this.processDefinitionId, formDataResponse.processDefinitionId) &&
        Objects.equals(this.processDefinitionUrl, formDataResponse.processDefinitionUrl) &&
        Objects.equals(this.taskId, formDataResponse.taskId) &&
        Objects.equals(this.taskUrl, formDataResponse.taskUrl) &&
        Objects.equals(this.formProperties, formDataResponse.formProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formKey, deploymentId, processDefinitionId, processDefinitionUrl, taskId, taskUrl, formProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataResponse {\n");
    
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
    sb.append("    formProperties: ").append(toIndentedString(formProperties)).append("\n");
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

