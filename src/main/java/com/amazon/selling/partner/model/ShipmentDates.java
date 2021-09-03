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


package com.amazon.selling.partner.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Shipment dates.
 */
@ApiModel(description = "Shipment dates.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:52.067+08:00")
public class ShipmentDates {
  @SerializedName("requiredShipDate")
  private OffsetDateTime requiredShipDate = null;

  @SerializedName("promisedDeliveryDate")
  private OffsetDateTime promisedDeliveryDate = null;

  public ShipmentDates requiredShipDate(OffsetDateTime requiredShipDate) {
    this.requiredShipDate = requiredShipDate;
    return this;
  }

   /**
   * Time by which the vendor is required to ship the order.
   * @return requiredShipDate
  **/
  @ApiModelProperty(required = true, value = "Time by which the vendor is required to ship the order.")
  public OffsetDateTime getRequiredShipDate() {
    return requiredShipDate;
  }

  public void setRequiredShipDate(OffsetDateTime requiredShipDate) {
    this.requiredShipDate = requiredShipDate;
  }

  public ShipmentDates promisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
    return this;
  }

   /**
   * Delivery date promised to the Amazon customer.
   * @return promisedDeliveryDate
  **/
  @ApiModelProperty(value = "Delivery date promised to the Amazon customer.")
  public OffsetDateTime getPromisedDeliveryDate() {
    return promisedDeliveryDate;
  }

  public void setPromisedDeliveryDate(OffsetDateTime promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDates shipmentDates = (ShipmentDates) o;
    return Objects.equals(this.requiredShipDate, shipmentDates.requiredShipDate) &&
        Objects.equals(this.promisedDeliveryDate, shipmentDates.promisedDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredShipDate, promisedDeliveryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDates {\n");
    
    sb.append("    requiredShipDate: ").append(toIndentedString(requiredShipDate)).append("\n");
    sb.append("    promisedDeliveryDate: ").append(toIndentedString(promisedDeliveryDate)).append("\n");
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

