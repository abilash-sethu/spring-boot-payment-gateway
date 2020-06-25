package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.ActivitiListener;
import com.diviso.graeshoppe.payment.client.bpmn.model.Artifact;
import com.diviso.graeshoppe.payment.client.bpmn.model.EventListener;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionAttribute;
import com.diviso.graeshoppe.payment.client.bpmn.model.ExtensionElement;
import com.diviso.graeshoppe.payment.client.bpmn.model.FlowElement;
import com.diviso.graeshoppe.payment.client.bpmn.model.IOSpecification;
import com.diviso.graeshoppe.payment.client.bpmn.model.Lane;
import com.diviso.graeshoppe.payment.client.bpmn.model.ValuedDataObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Process
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class Process   {
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

  @JsonProperty("executable")
  private Boolean executable = false;

  @JsonProperty("documentation")
  private String documentation = null;

  @JsonProperty("ioSpecification")
  private IOSpecification ioSpecification = null;

  @JsonProperty("executionListeners")
  @Valid
  private List<ActivitiListener> executionListeners = null;

  @JsonProperty("lanes")
  @Valid
  private List<Lane> lanes = null;

  @JsonProperty("dataObjects")
  @Valid
  private List<ValuedDataObject> dataObjects = null;

  @JsonProperty("candidateStarterUsers")
  @Valid
  private List<String> candidateStarterUsers = null;

  @JsonProperty("candidateStarterGroups")
  @Valid
  private List<String> candidateStarterGroups = null;

  @JsonProperty("eventListeners")
  @Valid
  private List<EventListener> eventListeners = null;

  @JsonProperty("flowElementMap")
  @Valid
  private Map<String, FlowElement> flowElementMap = null;

  @JsonProperty("initialFlowElement")
  private FlowElement initialFlowElement = null;

  @JsonProperty("artifacts")
  @Valid
  private List<Artifact> artifacts = null;

  @JsonProperty("flowElements")
  @Valid
  private List<FlowElement> flowElements = null;

  public Process id(String id) {
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

  public Process xmlRowNumber(Integer xmlRowNumber) {
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

  public Process xmlColumnNumber(Integer xmlColumnNumber) {
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

  public Process extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
    this.extensionElements = extensionElements;
    return this;
  }

  public Process putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

  public Process attributes(Map<String, List<ExtensionAttribute>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Process putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

  public Process name(String name) {
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

  public Process executable(Boolean executable) {
    this.executable = executable;
    return this;
  }

  /**
   * Get executable
   * @return executable
  **/
  @ApiModelProperty(value = "")


  public Boolean isExecutable() {
    return executable;
  }

  public void setExecutable(Boolean executable) {
    this.executable = executable;
  }

  public Process documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
  **/
  @ApiModelProperty(value = "")


  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public Process ioSpecification(IOSpecification ioSpecification) {
    this.ioSpecification = ioSpecification;
    return this;
  }

  /**
   * Get ioSpecification
   * @return ioSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IOSpecification getIoSpecification() {
    return ioSpecification;
  }

  public void setIoSpecification(IOSpecification ioSpecification) {
    this.ioSpecification = ioSpecification;
  }

  public Process executionListeners(List<ActivitiListener> executionListeners) {
    this.executionListeners = executionListeners;
    return this;
  }

  public Process addExecutionListenersItem(ActivitiListener executionListenersItem) {
    if (this.executionListeners == null) {
      this.executionListeners = new ArrayList<ActivitiListener>();
    }
    this.executionListeners.add(executionListenersItem);
    return this;
  }

  /**
   * Get executionListeners
   * @return executionListeners
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ActivitiListener> getExecutionListeners() {
    return executionListeners;
  }

  public void setExecutionListeners(List<ActivitiListener> executionListeners) {
    this.executionListeners = executionListeners;
  }

  public Process lanes(List<Lane> lanes) {
    this.lanes = lanes;
    return this;
  }

  public Process addLanesItem(Lane lanesItem) {
    if (this.lanes == null) {
      this.lanes = new ArrayList<Lane>();
    }
    this.lanes.add(lanesItem);
    return this;
  }

  /**
   * Get lanes
   * @return lanes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Lane> getLanes() {
    return lanes;
  }

  public void setLanes(List<Lane> lanes) {
    this.lanes = lanes;
  }

  public Process dataObjects(List<ValuedDataObject> dataObjects) {
    this.dataObjects = dataObjects;
    return this;
  }

  public Process addDataObjectsItem(ValuedDataObject dataObjectsItem) {
    if (this.dataObjects == null) {
      this.dataObjects = new ArrayList<ValuedDataObject>();
    }
    this.dataObjects.add(dataObjectsItem);
    return this;
  }

  /**
   * Get dataObjects
   * @return dataObjects
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ValuedDataObject> getDataObjects() {
    return dataObjects;
  }

  public void setDataObjects(List<ValuedDataObject> dataObjects) {
    this.dataObjects = dataObjects;
  }

  public Process candidateStarterUsers(List<String> candidateStarterUsers) {
    this.candidateStarterUsers = candidateStarterUsers;
    return this;
  }

  public Process addCandidateStarterUsersItem(String candidateStarterUsersItem) {
    if (this.candidateStarterUsers == null) {
      this.candidateStarterUsers = new ArrayList<String>();
    }
    this.candidateStarterUsers.add(candidateStarterUsersItem);
    return this;
  }

  /**
   * Get candidateStarterUsers
   * @return candidateStarterUsers
  **/
  @ApiModelProperty(value = "")


  public List<String> getCandidateStarterUsers() {
    return candidateStarterUsers;
  }

  public void setCandidateStarterUsers(List<String> candidateStarterUsers) {
    this.candidateStarterUsers = candidateStarterUsers;
  }

  public Process candidateStarterGroups(List<String> candidateStarterGroups) {
    this.candidateStarterGroups = candidateStarterGroups;
    return this;
  }

  public Process addCandidateStarterGroupsItem(String candidateStarterGroupsItem) {
    if (this.candidateStarterGroups == null) {
      this.candidateStarterGroups = new ArrayList<String>();
    }
    this.candidateStarterGroups.add(candidateStarterGroupsItem);
    return this;
  }

  /**
   * Get candidateStarterGroups
   * @return candidateStarterGroups
  **/
  @ApiModelProperty(value = "")


  public List<String> getCandidateStarterGroups() {
    return candidateStarterGroups;
  }

  public void setCandidateStarterGroups(List<String> candidateStarterGroups) {
    this.candidateStarterGroups = candidateStarterGroups;
  }

  public Process eventListeners(List<EventListener> eventListeners) {
    this.eventListeners = eventListeners;
    return this;
  }

  public Process addEventListenersItem(EventListener eventListenersItem) {
    if (this.eventListeners == null) {
      this.eventListeners = new ArrayList<EventListener>();
    }
    this.eventListeners.add(eventListenersItem);
    return this;
  }

  /**
   * Get eventListeners
   * @return eventListeners
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<EventListener> getEventListeners() {
    return eventListeners;
  }

  public void setEventListeners(List<EventListener> eventListeners) {
    this.eventListeners = eventListeners;
  }

  public Process flowElementMap(Map<String, FlowElement> flowElementMap) {
    this.flowElementMap = flowElementMap;
    return this;
  }

  public Process putFlowElementMapItem(String key, FlowElement flowElementMapItem) {
    if (this.flowElementMap == null) {
      this.flowElementMap = new HashMap<String, FlowElement>();
    }
    this.flowElementMap.put(key, flowElementMapItem);
    return this;
  }

  /**
   * Get flowElementMap
   * @return flowElementMap
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, FlowElement> getFlowElementMap() {
    return flowElementMap;
  }

  public void setFlowElementMap(Map<String, FlowElement> flowElementMap) {
    this.flowElementMap = flowElementMap;
  }

  public Process initialFlowElement(FlowElement initialFlowElement) {
    this.initialFlowElement = initialFlowElement;
    return this;
  }

  /**
   * Get initialFlowElement
   * @return initialFlowElement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FlowElement getInitialFlowElement() {
    return initialFlowElement;
  }

  public void setInitialFlowElement(FlowElement initialFlowElement) {
    this.initialFlowElement = initialFlowElement;
  }

  public Process artifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Process addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<Artifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Get artifacts
   * @return artifacts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }

  public Process flowElements(List<FlowElement> flowElements) {
    this.flowElements = flowElements;
    return this;
  }

  public Process addFlowElementsItem(FlowElement flowElementsItem) {
    if (this.flowElements == null) {
      this.flowElements = new ArrayList<FlowElement>();
    }
    this.flowElements.add(flowElementsItem);
    return this;
  }

  /**
   * Get flowElements
   * @return flowElements
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FlowElement> getFlowElements() {
    return flowElements;
  }

  public void setFlowElements(List<FlowElement> flowElements) {
    this.flowElements = flowElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.id, process.id) &&
        Objects.equals(this.xmlRowNumber, process.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, process.xmlColumnNumber) &&
        Objects.equals(this.extensionElements, process.extensionElements) &&
        Objects.equals(this.attributes, process.attributes) &&
        Objects.equals(this.name, process.name) &&
        Objects.equals(this.executable, process.executable) &&
        Objects.equals(this.documentation, process.documentation) &&
        Objects.equals(this.ioSpecification, process.ioSpecification) &&
        Objects.equals(this.executionListeners, process.executionListeners) &&
        Objects.equals(this.lanes, process.lanes) &&
        Objects.equals(this.dataObjects, process.dataObjects) &&
        Objects.equals(this.candidateStarterUsers, process.candidateStarterUsers) &&
        Objects.equals(this.candidateStarterGroups, process.candidateStarterGroups) &&
        Objects.equals(this.eventListeners, process.eventListeners) &&
        Objects.equals(this.flowElementMap, process.flowElementMap) &&
        Objects.equals(this.initialFlowElement, process.initialFlowElement) &&
        Objects.equals(this.artifacts, process.artifacts) &&
        Objects.equals(this.flowElements, process.flowElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, executable, documentation, ioSpecification, executionListeners, lanes, dataObjects, candidateStarterUsers, candidateStarterGroups, eventListeners, flowElementMap, initialFlowElement, artifacts, flowElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
    sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executable: ").append(toIndentedString(executable)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    ioSpecification: ").append(toIndentedString(ioSpecification)).append("\n");
    sb.append("    executionListeners: ").append(toIndentedString(executionListeners)).append("\n");
    sb.append("    lanes: ").append(toIndentedString(lanes)).append("\n");
    sb.append("    dataObjects: ").append(toIndentedString(dataObjects)).append("\n");
    sb.append("    candidateStarterUsers: ").append(toIndentedString(candidateStarterUsers)).append("\n");
    sb.append("    candidateStarterGroups: ").append(toIndentedString(candidateStarterGroups)).append("\n");
    sb.append("    eventListeners: ").append(toIndentedString(eventListeners)).append("\n");
    sb.append("    flowElementMap: ").append(toIndentedString(flowElementMap)).append("\n");
    sb.append("    initialFlowElement: ").append(toIndentedString(initialFlowElement)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    flowElements: ").append(toIndentedString(flowElements)).append("\n");
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

