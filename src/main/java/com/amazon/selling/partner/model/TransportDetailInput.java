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
import com.amazon.selling.partner.model.NonPartneredLtlDataInput;
import com.amazon.selling.partner.model.NonPartneredSmallParcelDataInput;
import com.amazon.selling.partner.model.PartneredLtlDataInput;
import com.amazon.selling.partner.model.PartneredSmallParcelDataInput;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information required to create an Amazon-partnered carrier shipping estimate, or to alert the Amazon fulfillment center to the arrival of an inbound shipment by a non-Amazon-partnered carrier.
 */
@ApiModel(description = "Information required to create an Amazon-partnered carrier shipping estimate, or to alert the Amazon fulfillment center to the arrival of an inbound shipment by a non-Amazon-partnered carrier.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:18.830+08:00")
public class TransportDetailInput {
  @SerializedName("PartneredSmallParcelData")
  private PartneredSmallParcelDataInput partneredSmallParcelData = null;

  @SerializedName("NonPartneredSmallParcelData")
  private NonPartneredSmallParcelDataInput nonPartneredSmallParcelData = null;

  @SerializedName("PartneredLtlData")
  private PartneredLtlDataInput partneredLtlData = null;

  @SerializedName("NonPartneredLtlData")
  private NonPartneredLtlDataInput nonPartneredLtlData = null;

  public TransportDetailInput partneredSmallParcelData(PartneredSmallParcelDataInput partneredSmallParcelData) {
    this.partneredSmallParcelData = partneredSmallParcelData;
    return this;
  }

   /**
   * Get partneredSmallParcelData
   * @return partneredSmallParcelData
  **/
  @ApiModelProperty(value = "")
  public PartneredSmallParcelDataInput getPartneredSmallParcelData() {
    return partneredSmallParcelData;
  }

  public void setPartneredSmallParcelData(PartneredSmallParcelDataInput partneredSmallParcelData) {
    this.partneredSmallParcelData = partneredSmallParcelData;
  }

  public TransportDetailInput nonPartneredSmallParcelData(NonPartneredSmallParcelDataInput nonPartneredSmallParcelData) {
    this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
    return this;
  }

   /**
   * Get nonPartneredSmallParcelData
   * @return nonPartneredSmallParcelData
  **/
  @ApiModelProperty(value = "")
  public NonPartneredSmallParcelDataInput getNonPartneredSmallParcelData() {
    return nonPartneredSmallParcelData;
  }

  public void setNonPartneredSmallParcelData(NonPartneredSmallParcelDataInput nonPartneredSmallParcelData) {
    this.nonPartneredSmallParcelData = nonPartneredSmallParcelData;
  }

  public TransportDetailInput partneredLtlData(PartneredLtlDataInput partneredLtlData) {
    this.partneredLtlData = partneredLtlData;
    return this;
  }

   /**
   * Get partneredLtlData
   * @return partneredLtlData
  **/
  @ApiModelProperty(value = "")
  public PartneredLtlDataInput getPartneredLtlData() {
    return partneredLtlData;
  }

  public void setPartneredLtlData(PartneredLtlDataInput partneredLtlData) {
    this.partneredLtlData = partneredLtlData;
  }

  public TransportDetailInput nonPartneredLtlData(NonPartneredLtlDataInput nonPartneredLtlData) {
    this.nonPartneredLtlData = nonPartneredLtlData;
    return this;
  }

   /**
   * Get nonPartneredLtlData
   * @return nonPartneredLtlData
  **/
  @ApiModelProperty(value = "")
  public NonPartneredLtlDataInput getNonPartneredLtlData() {
    return nonPartneredLtlData;
  }

  public void setNonPartneredLtlData(NonPartneredLtlDataInput nonPartneredLtlData) {
    this.nonPartneredLtlData = nonPartneredLtlData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportDetailInput transportDetailInput = (TransportDetailInput) o;
    return Objects.equals(this.partneredSmallParcelData, transportDetailInput.partneredSmallParcelData) &&
        Objects.equals(this.nonPartneredSmallParcelData, transportDetailInput.nonPartneredSmallParcelData) &&
        Objects.equals(this.partneredLtlData, transportDetailInput.partneredLtlData) &&
        Objects.equals(this.nonPartneredLtlData, transportDetailInput.nonPartneredLtlData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partneredSmallParcelData, nonPartneredSmallParcelData, partneredLtlData, nonPartneredLtlData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportDetailInput {\n");
    
    sb.append("    partneredSmallParcelData: ").append(toIndentedString(partneredSmallParcelData)).append("\n");
    sb.append("    nonPartneredSmallParcelData: ").append(toIndentedString(nonPartneredSmallParcelData)).append("\n");
    sb.append("    partneredLtlData: ").append(toIndentedString(partneredLtlData)).append("\n");
    sb.append("    nonPartneredLtlData: ").append(toIndentedString(nonPartneredLtlData)).append("\n");
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

