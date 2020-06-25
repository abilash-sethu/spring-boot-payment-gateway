package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionAttribute;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Operation
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class Operation   {
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

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("implementationRef")
  private String implementationRef = null;

  @JsonProperty("inMessageRef")
  private String inMessageRef = null;

  @JsonProperty("outMessageRef")
  private String outMessageRef = null;

  @JsonProperty("errorMessageRef")
  @Valid
  private List<String> errorMessageRef = null;

  public Operation id(String id) {
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

  public Operation xmlRowNumber(Integer xmlRowNumber) {
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

  public Operation xmlColumnNumber(Integer xmlColumnNumber) {
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

  public Operation extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public Operation putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

  public Operation attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Operation putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

  public Operation name(String name) {
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

  public Operation implementationRef(String implementationRef) {
    this.implementationRef = implementationRef;
    return this;
  }

  /**
   * Get implementationRef
   * @return implementationRef
  **/
  @ApiModelProperty(value = "")


  public String getImplementationRef() {
    return implementationRef;
  }

  public void setImplementationRef(String implementationRef) {
    this.implementationRef = implementationRef;
  }

  public Operation inMessageRef(String inMessageRef) {
    this.inMessageRef = inMessageRef;
    return this;
  }

  /**
   * Get inMessageRef
   * @return inMessageRef
  **/
  @ApiModelProperty(value = "")


  public String getInMessageRef() {
    return inMessageRef;
  }

  public void setInMessageRef(String inMessageRef) {
    this.inMessageRef = inMessageRef;
  }

  public Operation outMessageRef(String outMessageRef) {
    this.outMessageRef = outMessageRef;
    return this;
  }

  /**
   * Get outMessageRef
   * @return outMessageRef
  **/
  @ApiModelProperty(value = "")


  public String getOutMessageRef() {
    return outMessageRef;
  }

  public void setOutMessageRef(String outMessageRef) {
    this.outMessageRef = outMessageRef;
  }

  public Operation errorMessageRef(List<String> errorMessageRef) {
    this.errorMessageRef = errorMessageRef;
    return this;
  }

  public Operation addErrorMessageRefItem(String errorMessageRefItem) {
    if (this.errorMessageRef == null) {
      this.errorMessageRef = new ArrayList<String>();
    }
    this.errorMessageRef.add(errorMessageRefItem);
    return this;
  }

  /**
   * Get errorMessageRef
   * @return errorMessageRef
  **/
  @ApiModelProperty(value = "")


  public List<String> getErrorMessageRef() {
    return errorMessageRef;
  }

  public void setErrorMessageRef(List<String> errorMessageRef) {
    this.errorMessageRef = errorMessageRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operation operation = (Operation) o;
    return Objects.equals(this.id, operation.id) &&
        Objects.equals(this.xmlRowNumber, operation.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, operation.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, operation.extensionElements) &&
        Objects.equals(this.attributes, operation.attributes) &&
        Objects.equals(this.name, operation.name) &&
        Objects.equals(this.implementationRef, operation.implementationRef) &&
        Objects.equals(this.inMessageRef, operation.inMessageRef) &&
        Objects.equals(this.outMessageRef, operation.outMessageRef) &&
        Objects.equals(this.errorMessageRef, operation.errorMessageRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, implementationRef, inMessageRef, outMessageRef, errorMessageRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    implementationRef: ").append(toIndentedString(implementationRef)).append("\n");
    sb.append("    inMessageRef: ").append(toIndentedString(inMessageRef)).append("\n");
    sb.append("    outMessageRef: ").append(toIndentedString(outMessageRef)).append("\n");
    sb.append("    errorMessageRef: ").append(toIndentedString(errorMessageRef)).append("\n");
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

