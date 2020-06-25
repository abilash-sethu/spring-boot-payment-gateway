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
 * SignalEventReceivedRequest
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class SignalEventReceivedRequest   {
  @JsonProperty("signalName")
  private String signalName = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("async")
  private Boolean async = false;

  public SignalEventReceivedRequest signalName(String signalName) {
    this.signalName = signalName;
    return this;
  }

  /**
   * Name of the signal
   * @return signalName
  **/
  @ApiModelProperty(value = "Name of the signal")


  public String getSignalName() {
    return signalName;
  }

  public void setSignalName(String signalName) {
    this.signalName = signalName;
  }

  public SignalEventReceivedRequest variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public SignalEventReceivedRequest addVariablesItem(RestVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<RestVariable>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Array of variables (in the general variables format) to use as payload to pass along with the signal. Cannot be used in case async is set to true, this will result in an error.
   * @return variables
  **/
  @ApiModelProperty(value = "Array of variables (in the general variables format) to use as payload to pass along with the signal. Cannot be used in case async is set to true, this will result in an error.")

  @Valid

  public List<RestVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<RestVariable> variables) {
    this.variables = variables;
  }

  public SignalEventReceivedRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * ID of the tenant that the signal event should be processed in
   * @return tenantId
  **/
  @ApiModelProperty(value = "ID of the tenant that the signal event should be processed in")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public SignalEventReceivedRequest async(Boolean async) {
    this.async = async;
    return this;
  }

  /**
   * If true, handling of the signal will happen asynchronously. Return code will be 202 - Accepted to indicate the request is accepted but not yet executed. If false,                     handling the signal will be done immediately and result (200 - OK) will only return after this completed successfully. Defaults to false if omitted.
   * @return async
  **/
  @ApiModelProperty(value = "If true, handling of the signal will happen asynchronously. Return code will be 202 - Accepted to indicate the request is accepted but not yet executed. If false,                     handling the signal will be done immediately and result (200 - OK) will only return after this completed successfully. Defaults to false if omitted.")


  public Boolean isAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalEventReceivedRequest signalEventReceivedRequest = (SignalEventReceivedRequest) o;
    return Objects.equals(this.signalName, signalEventReceivedRequest.signalName) &&
        Objects.equals(this.variables, signalEventReceivedRequest.variables) &&
        Objects.equals(this.tenantId, signalEventReceivedRequest.tenantId) &&
        Objects.equals(this.async, signalEventReceivedRequest.async);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signalName, variables, tenantId, async);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalEventReceivedRequest {\n");
    
    sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
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

