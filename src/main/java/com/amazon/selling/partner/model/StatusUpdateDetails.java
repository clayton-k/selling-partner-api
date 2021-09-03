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
import com.amazon.selling.partner.model.Address;
import com.amazon.selling.partner.model.StatusUpdateDetailsShipmentSchedule;
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
 * Details for the shipment status update given by the vendor for the specific package.
 */
@ApiModel(description = "Details for the shipment status update given by the vendor for the specific package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:55.194+08:00")
public class StatusUpdateDetails {
  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("statusCode")
  private String statusCode = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("statusDateTime")
  private OffsetDateTime statusDateTime = null;

  @SerializedName("statusLocationAddress")
  private Address statusLocationAddress = null;

  @SerializedName("shipmentSchedule")
  private StatusUpdateDetailsShipmentSchedule shipmentSchedule = null;

  public StatusUpdateDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * This is required to be provided for every package and should match with the trackingNumber sent for the shipment confirmation.
   * @return trackingNumber
  **/
  @ApiModelProperty(required = true, value = "This is required to be provided for every package and should match with the trackingNumber sent for the shipment confirmation.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public StatusUpdateDetails statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Indicates the shipment status code of the package that provides transportation information for Amazon tracking systems and ultimately for the final customer.
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "Indicates the shipment status code of the package that provides transportation information for Amazon tracking systems and ultimately for the final customer.")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public StatusUpdateDetails reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Provides a reason code for the status of the package that will provide additional information about the transportation status.
   * @return reasonCode
  **/
  @ApiModelProperty(required = true, value = "Provides a reason code for the status of the package that will provide additional information about the transportation status.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public StatusUpdateDetails statusDateTime(OffsetDateTime statusDateTime) {
    this.statusDateTime = statusDateTime;
    return this;
  }

   /**
   * The date and time when the shipment status was updated. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.
   * @return statusDateTime
  **/
  @ApiModelProperty(required = true, value = "The date and time when the shipment status was updated. This field is expected to be in ISO-8601 date/time format, with UTC time zone or UTC offset. For example, 2020-07-16T23:00:00Z or 2020-07-16T23:00:00+01:00.")
  public OffsetDateTime getStatusDateTime() {
    return statusDateTime;
  }

  public void setStatusDateTime(OffsetDateTime statusDateTime) {
    this.statusDateTime = statusDateTime;
  }

  public StatusUpdateDetails statusLocationAddress(Address statusLocationAddress) {
    this.statusLocationAddress = statusLocationAddress;
    return this;
  }

   /**
   * Get statusLocationAddress
   * @return statusLocationAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getStatusLocationAddress() {
    return statusLocationAddress;
  }

  public void setStatusLocationAddress(Address statusLocationAddress) {
    this.statusLocationAddress = statusLocationAddress;
  }

  public StatusUpdateDetails shipmentSchedule(StatusUpdateDetailsShipmentSchedule shipmentSchedule) {
    this.shipmentSchedule = shipmentSchedule;
    return this;
  }

   /**
   * Get shipmentSchedule
   * @return shipmentSchedule
  **/
  @ApiModelProperty(value = "")
  public StatusUpdateDetailsShipmentSchedule getShipmentSchedule() {
    return shipmentSchedule;
  }

  public void setShipmentSchedule(StatusUpdateDetailsShipmentSchedule shipmentSchedule) {
    this.shipmentSchedule = shipmentSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateDetails statusUpdateDetails = (StatusUpdateDetails) o;
    return Objects.equals(this.trackingNumber, statusUpdateDetails.trackingNumber) &&
        Objects.equals(this.statusCode, statusUpdateDetails.statusCode) &&
        Objects.equals(this.reasonCode, statusUpdateDetails.reasonCode) &&
        Objects.equals(this.statusDateTime, statusUpdateDetails.statusDateTime) &&
        Objects.equals(this.statusLocationAddress, statusUpdateDetails.statusLocationAddress) &&
        Objects.equals(this.shipmentSchedule, statusUpdateDetails.shipmentSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, statusCode, reasonCode, statusDateTime, statusLocationAddress, shipmentSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateDetails {\n");
    
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    statusDateTime: ").append(toIndentedString(statusDateTime)).append("\n");
    sb.append("    statusLocationAddress: ").append(toIndentedString(statusLocationAddress)).append("\n");
    sb.append("    shipmentSchedule: ").append(toIndentedString(shipmentSchedule)).append("\n");
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

