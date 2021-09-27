/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model.reports;

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

/**
 * CreateReportScheduleResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-27T17:50:12.302+08:00")
public class CreateReportScheduleResult {
  @SerializedName("reportScheduleId")
  private String reportScheduleId = null;

  public CreateReportScheduleResult reportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
    return this;
  }

   /**
   * The identifier for the report schedule. This identifier is unique only in combination with a seller ID.
   * @return reportScheduleId
  **/
  @ApiModelProperty(required = true, value = "The identifier for the report schedule. This identifier is unique only in combination with a seller ID.")
  public String getReportScheduleId() {
    return reportScheduleId;
  }

  public void setReportScheduleId(String reportScheduleId) {
    this.reportScheduleId = reportScheduleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReportScheduleResult createReportScheduleResult = (CreateReportScheduleResult) o;
    return Objects.equals(this.reportScheduleId, createReportScheduleResult.reportScheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportScheduleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReportScheduleResult {\n");
    
    sb.append("    reportScheduleId: ").append(toIndentedString(reportScheduleId)).append("\n");
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
