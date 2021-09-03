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
 * The time range.
 */
@ApiModel(description = "The time range.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:45.473+08:00")
public class TimeRange {
  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  public TimeRange start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * The start date and time. This defaults to the current date and time.
   * @return start
  **/
  @ApiModelProperty(value = "The start date and time. This defaults to the current date and time.")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public TimeRange end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * The end date and time. This must come after the value of start. This defaults to the next business day from the start.
   * @return end
  **/
  @ApiModelProperty(value = "The end date and time. This must come after the value of start. This defaults to the next business day from the start.")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeRange timeRange = (TimeRange) o;
    return Objects.equals(this.start, timeRange.start) &&
        Objects.equals(this.end, timeRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeRange {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

