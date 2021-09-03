/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
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
import com.amazon.selling.partner.model.ConditionType;
import com.amazon.selling.partner.model.ItemIdentifier;
import com.amazon.selling.partner.model.OfferDetailList;
import com.amazon.selling.partner.model.Summary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetOffersResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:33.598+08:00")
public class GetOffersResult {
  @SerializedName("MarketplaceID")
  private String marketplaceID = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("SKU")
  private String SKU = null;

  @SerializedName("ItemCondition")
  private ConditionType itemCondition = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("Identifier")
  private ItemIdentifier identifier = null;

  @SerializedName("Summary")
  private Summary summary = null;

  @SerializedName("Offers")
  private OfferDetailList offers = null;

  public GetOffersResult marketplaceID(String marketplaceID) {
    this.marketplaceID = marketplaceID;
    return this;
  }

   /**
   * A marketplace identifier.
   * @return marketplaceID
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier.")
  public String getMarketplaceID() {
    return marketplaceID;
  }

  public void setMarketplaceID(String marketplaceID) {
    this.marketplaceID = marketplaceID;
  }

  public GetOffersResult ASIN(String ASIN) {
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

  public GetOffersResult SKU(String SKU) {
    this.SKU = SKU;
    return this;
  }

   /**
   * The stock keeping unit (SKU) of the item.
   * @return SKU
  **/
  @ApiModelProperty(value = "The stock keeping unit (SKU) of the item.")
  public String getSKU() {
    return SKU;
  }

  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  public GetOffersResult itemCondition(ConditionType itemCondition) {
    this.itemCondition = itemCondition;
    return this;
  }

   /**
   * The condition of the item.
   * @return itemCondition
  **/
  @ApiModelProperty(required = true, value = "The condition of the item.")
  public ConditionType getItemCondition() {
    return itemCondition;
  }

  public void setItemCondition(ConditionType itemCondition) {
    this.itemCondition = itemCondition;
  }

  public GetOffersResult status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the operation.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the operation.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetOffersResult identifier(ItemIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Metadata that identifies the item.
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "Metadata that identifies the item.")
  public ItemIdentifier getIdentifier() {
    return identifier;
  }

  public void setIdentifier(ItemIdentifier identifier) {
    this.identifier = identifier;
  }

  public GetOffersResult summary(Summary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Pricing information about the item.
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "Pricing information about the item.")
  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  public GetOffersResult offers(OfferDetailList offers) {
    this.offers = offers;
    return this;
  }

   /**
   * A list of offer details. The list is the same length as the TotalOfferCount in the Summary or 20, whichever is less.
   * @return offers
  **/
  @ApiModelProperty(required = true, value = "A list of offer details. The list is the same length as the TotalOfferCount in the Summary or 20, whichever is less.")
  public OfferDetailList getOffers() {
    return offers;
  }

  public void setOffers(OfferDetailList offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOffersResult getOffersResult = (GetOffersResult) o;
    return Objects.equals(this.marketplaceID, getOffersResult.marketplaceID) &&
        Objects.equals(this.ASIN, getOffersResult.ASIN) &&
        Objects.equals(this.SKU, getOffersResult.SKU) &&
        Objects.equals(this.itemCondition, getOffersResult.itemCondition) &&
        Objects.equals(this.status, getOffersResult.status) &&
        Objects.equals(this.identifier, getOffersResult.identifier) &&
        Objects.equals(this.summary, getOffersResult.summary) &&
        Objects.equals(this.offers, getOffersResult.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceID, ASIN, SKU, itemCondition, status, identifier, summary, offers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOffersResult {\n");
    
    sb.append("    marketplaceID: ").append(toIndentedString(marketplaceID)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
