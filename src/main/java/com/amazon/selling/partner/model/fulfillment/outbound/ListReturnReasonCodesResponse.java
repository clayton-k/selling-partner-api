/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model.fulfillment.outbound;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.selling.partner.model.fulfillment.outbound.ErrorList;
import com.amazon.selling.partner.model.fulfillment.outbound.ListReturnReasonCodesResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the listReturnReasonCodes operation.
 */
@ApiModel(description = "The response schema for the listReturnReasonCodes operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-27T17:49:56.517+08:00")
public class ListReturnReasonCodesResponse {
  @SerializedName("payload")
  private ListReturnReasonCodesResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public ListReturnReasonCodesResponse payload(ListReturnReasonCodesResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the listReturnReasonCodes operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the listReturnReasonCodes operation.")
  public ListReturnReasonCodesResult getPayload() {
    return payload;
  }

  public void setPayload(ListReturnReasonCodesResult payload) {
    this.payload = payload;
  }

  public ListReturnReasonCodesResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the listReturnReasonCodes operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the listReturnReasonCodes operation.")
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
    ListReturnReasonCodesResponse listReturnReasonCodesResponse = (ListReturnReasonCodesResponse) o;
    return Objects.equals(this.payload, listReturnReasonCodesResponse.payload) &&
        Objects.equals(this.errors, listReturnReasonCodesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListReturnReasonCodesResponse {\n");
    
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
