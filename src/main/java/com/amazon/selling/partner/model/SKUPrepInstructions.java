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
import com.amazon.selling.partner.model.AmazonPrepFeesDetailsList;
import com.amazon.selling.partner.model.BarcodeInstruction;
import com.amazon.selling.partner.model.PrepGuidance;
import com.amazon.selling.partner.model.PrepInstructionList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Labeling requirements and item preparation instructions to help you prepare items for shipment to Amazon&#39;s fulfillment network.
 */
@ApiModel(description = "Labeling requirements and item preparation instructions to help you prepare items for shipment to Amazon's fulfillment network.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:18.830+08:00")
public class SKUPrepInstructions {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("BarcodeInstruction")
  private BarcodeInstruction barcodeInstruction = null;

  @SerializedName("PrepGuidance")
  private PrepGuidance prepGuidance = null;

  @SerializedName("PrepInstructionList")
  private PrepInstructionList prepInstructionList = null;

  @SerializedName("AmazonPrepFeesDetailsList")
  private AmazonPrepFeesDetailsList amazonPrepFeesDetailsList = null;

  public SKUPrepInstructions sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller SKU of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public SKUPrepInstructions ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public SKUPrepInstructions barcodeInstruction(BarcodeInstruction barcodeInstruction) {
    this.barcodeInstruction = barcodeInstruction;
    return this;
  }

   /**
   * Get barcodeInstruction
   * @return barcodeInstruction
  **/
  @ApiModelProperty(value = "")
  public BarcodeInstruction getBarcodeInstruction() {
    return barcodeInstruction;
  }

  public void setBarcodeInstruction(BarcodeInstruction barcodeInstruction) {
    this.barcodeInstruction = barcodeInstruction;
  }

  public SKUPrepInstructions prepGuidance(PrepGuidance prepGuidance) {
    this.prepGuidance = prepGuidance;
    return this;
  }

   /**
   * Get prepGuidance
   * @return prepGuidance
  **/
  @ApiModelProperty(value = "")
  public PrepGuidance getPrepGuidance() {
    return prepGuidance;
  }

  public void setPrepGuidance(PrepGuidance prepGuidance) {
    this.prepGuidance = prepGuidance;
  }

  public SKUPrepInstructions prepInstructionList(PrepInstructionList prepInstructionList) {
    this.prepInstructionList = prepInstructionList;
    return this;
  }

   /**
   * Get prepInstructionList
   * @return prepInstructionList
  **/
  @ApiModelProperty(value = "")
  public PrepInstructionList getPrepInstructionList() {
    return prepInstructionList;
  }

  public void setPrepInstructionList(PrepInstructionList prepInstructionList) {
    this.prepInstructionList = prepInstructionList;
  }

  public SKUPrepInstructions amazonPrepFeesDetailsList(AmazonPrepFeesDetailsList amazonPrepFeesDetailsList) {
    this.amazonPrepFeesDetailsList = amazonPrepFeesDetailsList;
    return this;
  }

   /**
   * Get amazonPrepFeesDetailsList
   * @return amazonPrepFeesDetailsList
  **/
  @ApiModelProperty(value = "")
  public AmazonPrepFeesDetailsList getAmazonPrepFeesDetailsList() {
    return amazonPrepFeesDetailsList;
  }

  public void setAmazonPrepFeesDetailsList(AmazonPrepFeesDetailsList amazonPrepFeesDetailsList) {
    this.amazonPrepFeesDetailsList = amazonPrepFeesDetailsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SKUPrepInstructions skUPrepInstructions = (SKUPrepInstructions) o;
    return Objects.equals(this.sellerSKU, skUPrepInstructions.sellerSKU) &&
        Objects.equals(this.ASIN, skUPrepInstructions.ASIN) &&
        Objects.equals(this.barcodeInstruction, skUPrepInstructions.barcodeInstruction) &&
        Objects.equals(this.prepGuidance, skUPrepInstructions.prepGuidance) &&
        Objects.equals(this.prepInstructionList, skUPrepInstructions.prepInstructionList) &&
        Objects.equals(this.amazonPrepFeesDetailsList, skUPrepInstructions.amazonPrepFeesDetailsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, ASIN, barcodeInstruction, prepGuidance, prepInstructionList, amazonPrepFeesDetailsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SKUPrepInstructions {\n");
    
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    barcodeInstruction: ").append(toIndentedString(barcodeInstruction)).append("\n");
    sb.append("    prepGuidance: ").append(toIndentedString(prepGuidance)).append("\n");
    sb.append("    prepInstructionList: ").append(toIndentedString(prepInstructionList)).append("\n");
    sb.append("    amazonPrepFeesDetailsList: ").append(toIndentedString(amazonPrepFeesDetailsList)).append("\n");
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

