package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionAttribute;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionElement;
import com.diviso.graeshoppe.payment.client.bpmn.model.FieldExtension;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ActivitiListener
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ActivitiListener   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("xmlRowNumber")
  private Integer xmlRowNumber = null;

  @JsonProperty("xmlColumnNumber")
  private Integer xmlColumnNumber = null;

  @JsonProperty("extensionElements")
  @Valid
  private Map<String, List<ExtensionElement>> extensionElements = null;

  @JsonProperty("attributes")
  @Valid
  private Map<String, List<ExtensionAttribute>> attributes = null;

  @JsonProperty("event")
  private String event = null;

  @JsonProperty("implementationType")
  private String implementationType = null;

  @JsonProperty("implementation")
  private String implementation = null;

  @JsonProperty("fieldExtensions")
  @Valid
  private List<FieldExtension> fieldExtensions = null;

  @JsonProperty("onTransaction")
  private String onTransaction = null;

  @JsonProperty("customPropertiesResolverImplementationType")
  private String customPropertiesResolverImplementationType = null;

  @JsonProperty("customPropertiesResolverImplementation")
  private String customPropertiesResolverImplementation = null;

  public ActivitiListener id(String id) {
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

  public ActivitiListener xmlRowNumber(Integer xmlRowNumber) {
    this.xmlRowNumber = xmlRowNumber;
    return this;
  }

  /**
   * Get xmlRowNumber
   * @return xmlRowNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getXmlRowNumber() {
    return xmlRowNumber;
  }

  public void setXmlRowNumber(Integer xmlRowNumber) {
    this.xmlRowNumber = xmlRowNumber;
  }

  public ActivitiListener xmlColumnNumber(Integer xmlColumnNumber) {
    this.xmlColumnNumber = xmlColumnNumber;
    return this;
  }

  /**
   * Get xmlColumnNumber
   * @return xmlColumnNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getXmlColumnNumber() {
    return xmlColumnNumber;
  }

  public void setXmlColumnNumber(Integer xmlColumnNumber) {
    this.xmlColumnNumber = xmlColumnNumber;
  }

  public ActivitiListener extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public ActivitiListener putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
    if (this.extensionElements == null) {
      this.extensionElements = new HashMap<String, List<ExtensionElement>>();
    }
    this.extensionElements.put(key, extensionElementsItem);
    return this;
  }

  /**
   * Get extensionElements
   * @return extensionElements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, List<ExtensionElement>> getExtensionElements() {
    return extensionElements;
  }

  public void setExtensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
  }

  public ActivitiListener attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ActivitiListener putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, List<ExtensionAttribute>>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, List<ExtensionAttribute>> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
  }

  public ActivitiListener event(String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(value = "")


  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public ActivitiListener implementationType(String implementationType) {
    this.implementationType = implementationType;
    return this;
  }

  /**
   * Get implementationType
   * @return implementationType
  **/
  @ApiModelProperty(value = "")


  public String getImplementationType() {
    return implementationType;
  }

  public void setImplementationType(String implementationType) {
    this.implementationType = implementationType;
  }

  public ActivitiListener implementation(String implementation) {
    this.implementation = implementation;
    return this;
  }

  /**
   * Get implementation
   * @return implementation
  **/
  @ApiModelProperty(value = "")


  public String getImplementation() {
    return implementation;
  }

  public void setImplementation(String implementation) {
    this.implementation = implementation;
  }

  public ActivitiListener fieldExtensions(List<FieldExtension> fieldExtensions) {
    this.fieldExtensions = fieldExtensions;
    return this;
  }

  public ActivitiListener addFieldExtensionsItem(FieldExtension fieldExtensionsItem) {
    if (this.fieldExtensions == null) {
      this.fieldExtensions = new ArrayList<FieldExtension>();
    }
    this.fieldExtensions.add(fieldExtensionsItem);
    return this;
  }

  /**
   * Get fieldExtensions
   * @return fieldExtensions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FieldExtension> getFieldExtensions() {
    return fieldExtensions;
  }

  public void setFieldExtensions(List<FieldExtension> fieldExtensions) {
    this.fieldExtensions = fieldExtensions;
  }

  public ActivitiListener onTransaction(String onTransaction) {
    this.onTransaction = onTransaction;
    return this;
  }

  /**
   * Get onTransaction
   * @return onTransaction
  **/
  @ApiModelProperty(value = "")


  public String getOnTransaction() {
    return onTransaction;
  }

  public void setOnTransaction(String onTransaction) {
    this.onTransaction = onTransaction;
  }

  public ActivitiListener customPropertiesResolverImplementationType(String customPropertiesResolverImplementationType) {
    this.customPropertiesResolverImplementationType = customPropertiesResolverImplementationType;
    return this;
  }

  /**
   * Get customPropertiesResolverImplementationType
   * @return customPropertiesResolverImplementationType
  **/
  @ApiModelProperty(value = "")


  public String getCustomPropertiesResolverImplementationType() {
    return customPropertiesResolverImplementationType;
  }

  public void setCustomPropertiesResolverImplementationType(String customPropertiesResolverImplementationType) {
    this.customPropertiesResolverImplementationType = customPropertiesResolverImplementationType;
  }

  public ActivitiListener customPropertiesResolverImplementation(String customPropertiesResolverImplementation) {
    this.customPropertiesResolverImplementation = customPropertiesResolverImplementation;
    return this;
  }

  /**
   * Get customPropertiesResolverImplementation
   * @return customPropertiesResolverImplementation
  **/
  @ApiModelProperty(value = "")


  public String getCustomPropertiesResolverImplementation() {
    return customPropertiesResolverImplementation;
  }

  public void setCustomPropertiesResolverImplementation(String customPropertiesResolverImplementation) {
    this.customPropertiesResolverImplementation = customPropertiesResolverImplementation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitiListener activitiListener = (ActivitiListener) o;
    return Objects.equals(this.id, activitiListener.id) &&
        Objects.equals(this.xmlRowNumber, activitiListener.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, activitiListener.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, activitiListener.extensionElements) &&
        Objects.equals(this.attributes, activitiListener.attributes) &&
        Objects.equals(this.event, activitiListener.event) &&
        Objects.equals(this.implementationType, activitiListener.implementationType) &&
        Objects.equals(this.implementation, activitiListener.implementation) &&
        Objects.equals(this.fieldExtensions, activitiListener.fieldExtensions) &&
        Objects.equals(this.onTransaction, activitiListener.onTransaction) &&
        Objects.equals(this.customPropertiesResolverImplementationType, activitiListener.customPropertiesResolverImplementationType) &&
        Objects.equals(this.customPropertiesResolverImplementation, activitiListener.customPropertiesResolverImplementation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, event, implementationType, implementation, fieldExtensions, onTransaction, customPropertiesResolverImplementationType, customPropertiesResolverImplementation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitiListener {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    implementationType: ").append(toIndentedString(implementationType)).append("\n");
    sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
    sb.append("    fieldExtensions: ").append(toIndentedString(fieldExtensions)).append("\n");
    sb.append("    onTransaction: ").append(toIndentedString(onTransaction)).append("\n");
    sb.append("    customPropertiesResolverImplementationType: ").append(toIndentedString(customPropertiesResolverImplementationType)).append("\n");
    sb.append("    customPropertiesResolverImplementation: ").append(toIndentedString(customPropertiesResolverImplementation)).append("\n");
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

