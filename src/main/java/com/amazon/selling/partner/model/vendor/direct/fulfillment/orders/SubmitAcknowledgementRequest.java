/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model.vendor.direct.fulfillment.orders;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.orders.OrderAcknowledgementItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The request schema for the submitAcknowledgement operation.
 */
@ApiModel(description = "The request schema for the submitAcknowledgement operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-27T17:50:28.016+08:00")
public class SubmitAcknowledgementRequest {
  @SerializedName("orderAcknowledgements")
  private List<OrderAcknowledgementItem> orderAcknowledgements = null;

  public SubmitAcknowledgementRequest orderAcknowledgements(List<OrderAcknowledgementItem> orderAcknowledgements) {
    this.orderAcknowledgements = orderAcknowledgements;
    return this;
  }

  public SubmitAcknowledgementRequest addOrderAcknowledgementsItem(OrderAcknowledgementItem orderAcknowledgementsItem) {
    if (this.orderAcknowledgements == null) {
      this.orderAcknowledgements = new ArrayList<>();
    }
    this.orderAcknowledgements.add(orderAcknowledgementsItem);
    return this;
  }

   /**
   * A list of one or more purchase orders.
   * @return orderAcknowledgements
  **/
  @ApiModelProperty(value = "A list of one or more purchase orders.")
  public List<OrderAcknowledgementItem> getOrderAcknowledgements() {
    return orderAcknowledgements;
  }

  public void setOrderAcknowledgements(List<OrderAcknowledgementItem> orderAcknowledgements) {
    this.orderAcknowledgements = orderAcknowledgements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitAcknowledgementRequest submitAcknowledgementRequest = (SubmitAcknowledgementRequest) o;
    return Objects.equals(this.orderAcknowledgements, submitAcknowledgementRequest.orderAcknowledgements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderAcknowledgements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitAcknowledgementRequest {\n");
    
    sb.append("    orderAcknowledgements: ").append(toIndentedString(orderAcknowledgements)).append("\n");
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

