/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: v1
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
import com.amazon.selling.partner.model.ShippingLabelList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The response schema for the getShippingLabels operation.
 */
@ApiModel(description = "The response schema for the getShippingLabels operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:55.194+08:00")
public class GetShippingLabelListResponse {
  @SerializedName("payload")
  private ShippingLabelList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetShippingLabelListResponse payload(ShippingLabelList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * List of ship labels.
   * @return payload
  **/
  @ApiModelProperty(value = "List of ship labels.")
  public ShippingLabelList getPayload() {
    return payload;
  }

  public void setPayload(ShippingLabelList payload) {
    this.payload = payload;
  }

  public GetShippingLabelListResponse errors(ErrorList errors) {
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
    GetShippingLabelListResponse getShippingLabelListResponse = (GetShippingLabelListResponse) o;
    return Objects.equals(this.payload, getShippingLabelListResponse.payload) &&
        Objects.equals(this.errors, getShippingLabelListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetShippingLabelListResponse {\n");
    
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

