package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * ExtensionAttribute
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class ExtensionAttribute   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("namespacePrefix")
  private String namespacePrefix = null;

  @JsonProperty("namespace")
  private String namespace = null;

  public ExtensionAttribute name(String name) {
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

  public ExtensionAttribute value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ExtensionAttribute namespacePrefix(String namespacePrefix) {
    this.namespacePrefix = namespacePrefix;
    return this;
  }

  /**
   * Get namespacePrefix
   * @return namespacePrefix
  **/
  @ApiModelProperty(value = "")


  public String getNamespacePrefix() {
    return namespacePrefix;
  }

  public void setNamespacePrefix(String namespacePrefix) {
    this.namespacePrefix = namespacePrefix;
  }

  public ExtensionAttribute namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionAttribute extensionAttribute = (ExtensionAttribute) o;
    return Objects.equals(this.name, extensionAttribute.name) &&
        Objects.equals(this.value, extensionAttribute.value) &&
        Objects.equals(this.namespacePrefix, extensionAttribute.namespacePrefix) &&
        Objects.equals(this.namespace, extensionAttribute.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, namespacePrefix, namespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    namespacePrefix: ").append(toIndentedString(namespacePrefix)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

