package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.diviso.graeshoppe.payment.client.bpmn.model.BaseElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * GraphicInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class GraphicInfo   {
  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("height")
  private Double height = null;

  @JsonProperty("width")
  private Double width = null;

  @JsonProperty("element")
  private BaseElement element = null;

  @JsonProperty("expanded")
  private Boolean expanded = false;

  @JsonProperty("xmlRowNumber")
  private Integer xmlRowNumber = null;

  @JsonProperty("xmlColumnNumber")
  private Integer xmlColumnNumber = null;

  public GraphicInfo x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(value = "")


  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public GraphicInfo y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(value = "")


  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public GraphicInfo height(Double height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")


  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public GraphicInfo width(Double width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")


  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public GraphicInfo element(BaseElement element) {
    this.element = element;
    return this;
  }

  /**
   * Get element
   * @return element
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BaseElement getElement() {
    return element;
  }

  public void setElement(BaseElement element) {
    this.element = element;
  }

  public GraphicInfo expanded(Boolean expanded) {
    this.expanded = expanded;
    return this;
  }

  /**
   * Get expanded
   * @return expanded
  **/
  @ApiModelProperty(value = "")


  public Boolean isExpanded() {
    return expanded;
  }

  public void setExpanded(Boolean expanded) {
    this.expanded = expanded;
  }

  public GraphicInfo xmlRowNumber(Integer xmlRowNumber) {
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

  public GraphicInfo xmlColumnNumber(Integer xmlColumnNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicInfo graphicInfo = (GraphicInfo) o;
    return Objects.equals(this.x, graphicInfo.x) &&
        Objects.equals(this.y, graphicInfo.y) &&
        Objects.equals(this.height, graphicInfo.height) &&
        Objects.equals(this.width, graphicInfo.width) &&
        Objects.equals(this.element, graphicInfo.element) &&
        Objects.equals(this.expanded, graphicInfo.expanded) &&
        Objects.equals(this.xmlRowNumber, graphicInfo.xmlRowNumber) &&
        Objects.equals(this.xmlColumnNumber, graphicInfo.xmlColumnNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, height, width, element, expanded, xmlRowNumber, xmlColumnNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicInfo {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    element: ").append(toIndentedString(element)).append("\n");
    sb.append("    expanded: ").append(toIndentedString(expanded)).append("\n");
    sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
    sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
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

