/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.selling.partner.model.ContentDocument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PostContentDocumentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:01.331+08:00")
public class PostContentDocumentRequest {
  @SerializedName("contentDocument")
  private ContentDocument contentDocument = null;

  public PostContentDocumentRequest contentDocument(ContentDocument contentDocument) {
    this.contentDocument = contentDocument;
    return this;
  }

   /**
   * Get contentDocument
   * @return contentDocument
  **/
  @ApiModelProperty(required = true, value = "")
  public ContentDocument getContentDocument() {
    return contentDocument;
  }

  public void setContentDocument(ContentDocument contentDocument) {
    this.contentDocument = contentDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContentDocumentRequest postContentDocumentRequest = (PostContentDocumentRequest) o;
    return Objects.equals(this.contentDocument, postContentDocumentRequest.contentDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContentDocumentRequest {\n");
    
    sb.append("    contentDocument: ").append(toIndentedString(contentDocument)).append("\n");
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

