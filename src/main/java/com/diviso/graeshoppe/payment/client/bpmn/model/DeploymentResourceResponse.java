package com.diviso.graeshoppe.payment.client.bpmn.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * DeploymentResourceResponse
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-15T10:23:39.926964+05:30[Asia/Kolkata]")

public class DeploymentResourceResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("contentUrl")
  private String contentUrl = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  /**
   * Type of resource
   */
  public enum TypeEnum {
    RESOURCE("resource"),
    
    PROCESSDEFINITION("processDefinition"),
    
    PROCESSIMAGE("processImage");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public DeploymentResourceResponse id(String id) {
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

  public DeploymentResourceResponse url(String url) {
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

  public DeploymentResourceResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * Get contentUrl
   * @return contentUrl
  **/
  @ApiModelProperty(value = "")


  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public DeploymentResourceResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Contains the media-type the resource has. This is resolved using a (pluggable) MediaTypeResolver and contains, by default, a limited number of mime-type mappings.
   * @return mediaType
  **/
  @ApiModelProperty(value = "Contains the media-type the resource has. This is resolved using a (pluggable) MediaTypeResolver and contains, by default, a limited number of mime-type mappings.")


  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public DeploymentResourceResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of resource
   * @return type
  **/
  @ApiModelProperty(value = "Type of resource")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResourceResponse deploymentResourceResponse = (DeploymentResourceResponse) o;
    return Objects.equals(this.id, deploymentResourceResponse.id) &&
        Objects.equals(this.url, deploymentResourceResponse.url) &&
        Objects.equals(this.contentUrl, deploymentResourceResponse.contentUrl) &&
        Objects.equals(this.mediaType, deploymentResourceResponse.mediaType) &&
        Objects.equals(this.type, deploymentResourceResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, contentUrl, mediaType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResourceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

