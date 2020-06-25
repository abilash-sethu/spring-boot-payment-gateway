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
 * ExecutionActionRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ExecutionActionRequest   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("signalName")
  private String signalName = null;

  @JsonProperty("messageName")
  private String messageName = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  @JsonProperty("transientVariables")
  @Valid
  private List<RestVariable> transientVariables = null;

  public ExecutionActionRequest action(String action) {
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

  public ExecutionActionRequest signalName(String signalName) {
    this.signalName = signalName;
    return this;
  }

  /**
   * Get signalName
   * @return signalName
  **/
  @ApiModelProperty(value = "")


  public String getSignalName() {
    return signalName;
  }

  public void setSignalName(String signalName) {
    this.signalName = signalName;
  }

  public ExecutionActionRequest messageName(String messageName) {
    this.messageName = messageName;
    return this;
  }

  /**
   * Get messageName
   * @return messageName
  **/
  @ApiModelProperty(value = "")


  public String getMessageName() {
    return messageName;
  }

  public void setMessageName(String messageName) {
    this.messageName = messageName;
  }

  public ExecutionActionRequest variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ExecutionActionRequest addVariablesItem(RestVariable variablesItem) {
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

  public ExecutionActionRequest transientVariables(List<RestVariable> transientVariables) {
    this.transientVariables = transientVariables;
    return this;
  }

  public ExecutionActionRequest addTransientVariablesItem(RestVariable transientVariablesItem) {
    if (this.transientVariables == null) {
      this.transientVariables = new ArrayList<RestVariable>();
    }
    this.transientVariables.add(transientVariablesItem);
    return this;
  }

  /**
   * Get transientVariables
   * @return transientVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RestVariable> getTransientVariables() {
    return transientVariables;
  }

  public void setTransientVariables(List<RestVariable> transientVariables) {
    this.transientVariables = transientVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionActionRequest executionActionRequest = (ExecutionActionRequest) o;
    return Objects.equals(this.action, executionActionRequest.action) &&
        Objects.equals(this.signalName, executionActionRequest.signalName) &&
        Objects.equals(this.messageName, executionActionRequest.messageName) &&
        Objects.equals(this.variables, executionActionRequest.variables) &&
        Objects.equals(this.transientVariables, executionActionRequest.transientVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, signalName, messageName, variables, transientVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionActionRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
    sb.append("    messageName: ").append(toIndentedString(messageName)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    transientVariables: ").append(toIndentedString(transientVariables)).append("\n");
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

