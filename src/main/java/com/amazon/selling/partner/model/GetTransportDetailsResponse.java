/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.selling.partner.model.ErrorList;
import com.amazon.selling.partner.model.GetTransportDetailsResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getTransportDetails operation.
 */
@ApiModel(description = "The response schema for the getTransportDetails operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:18.830+08:00")
public class GetTransportDetailsResponse {
  @SerializedName("payload")
  private GetTransportDetailsResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetTransportDetailsResponse payload(GetTransportDetailsResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getTransportDetails operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getTransportDetails operation.")
  public GetTransportDetailsResult getPayload() {
    return payload;
  }

  public void setPayload(GetTransportDetailsResult payload) {
    this.payload = payload;
  }

  public GetTransportDetailsResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransportDetailsResponse getTransportDetailsResponse = (GetTransportDetailsResponse) o;
    return Objects.equals(this.payload, getTransportDetailsResponse.payload) &&
        Objects.equals(this.errors, getTransportDetailsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransportDetailsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

