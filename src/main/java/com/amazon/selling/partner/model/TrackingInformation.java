/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
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
import com.amazon.selling.partner.model.EventList;
import com.amazon.selling.partner.model.TrackingSummary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The payload schema for the getTrackingInformation operation.
 */
@ApiModel(description = "The payload schema for the getTrackingInformation operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:45.473+08:00")
public class TrackingInformation {
  @SerializedName("trackingId")
  private String trackingId = null;

  @SerializedName("summary")
  private TrackingSummary summary = null;

  @SerializedName("promisedDeliveryDate")
  private String promisedDeliveryDate = null;

  @SerializedName("eventHistory")
  private EventList eventHistory = null;

  public TrackingInformation trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public TrackingInformation summary(TrackingSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")
  public TrackingSummary getSummary() {
    return summary;
  }

  public void setSummary(TrackingSummary summary) {
    this.summary = summary;
  }

  public TrackingInformation promisedDeliveryDate(String promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
    return this;
  }

   /**
   * Get promisedDeliveryDate
   * @return promisedDeliveryDate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPromisedDeliveryDate() {
    return promisedDeliveryDate;
  }

  public void setPromisedDeliveryDate(String promisedDeliveryDate) {
    this.promisedDeliveryDate = promisedDeliveryDate;
  }

  public TrackingInformation eventHistory(EventList eventHistory) {
    this.eventHistory = eventHistory;
    return this;
  }

   /**
   * Get eventHistory
   * @return eventHistory
  **/
  @ApiModelProperty(required = true, value = "")
  public EventList getEventHistory() {
    return eventHistory;
  }

  public void setEventHistory(EventList eventHistory) {
    this.eventHistory = eventHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingInformation trackingInformation = (TrackingInformation) o;
    return Objects.equals(this.trackingId, trackingInformation.trackingId) &&
        Objects.equals(this.summary, trackingInformation.summary) &&
        Objects.equals(this.promisedDeliveryDate, trackingInformation.promisedDeliveryDate) &&
        Objects.equals(this.eventHistory, trackingInformation.eventHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId, summary, promisedDeliveryDate, eventHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingInformation {\n");
    
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    promisedDeliveryDate: ").append(toIndentedString(promisedDeliveryDate)).append("\n");
    sb.append("    eventHistory: ").append(toIndentedString(eventHistory)).append("\n");
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

