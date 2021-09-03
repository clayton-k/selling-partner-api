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
import com.amazon.selling.partner.model.MoneyType;
import com.amazon.selling.partner.model.OfferCustomerType;
import com.amazon.selling.partner.model.PriceType;
import com.amazon.selling.partner.model.QuantityDiscountPriceType;
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
 * OfferType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:33.598+08:00")
public class OfferType {
  @SerializedName("offerType")
  private OfferCustomerType offerType = null;

  @SerializedName("BuyingPrice")
  private PriceType buyingPrice = null;

  @SerializedName("RegularPrice")
  private MoneyType regularPrice = null;

  @SerializedName("businessPrice")
  private MoneyType businessPrice = null;

  @SerializedName("quantityDiscountPrices")
  private List<QuantityDiscountPriceType> quantityDiscountPrices = null;

  @SerializedName("FulfillmentChannel")
  private String fulfillmentChannel = null;

  @SerializedName("ItemCondition")
  private String itemCondition = null;

  @SerializedName("ItemSubCondition")
  private String itemSubCondition = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  public OfferType offerType(OfferCustomerType offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Indicates the type of customer that the offer is valid for.
   * @return offerType
  **/
  @ApiModelProperty(value = "Indicates the type of customer that the offer is valid for.")
  public OfferCustomerType getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferCustomerType offerType) {
    this.offerType = offerType;
  }

  public OfferType buyingPrice(PriceType buyingPrice) {
    this.buyingPrice = buyingPrice;
    return this;
  }

   /**
   * Contains pricing information that includes promotions and contains the shipping cost.
   * @return buyingPrice
  **/
  @ApiModelProperty(required = true, value = "Contains pricing information that includes promotions and contains the shipping cost.")
  public PriceType getBuyingPrice() {
    return buyingPrice;
  }

  public void setBuyingPrice(PriceType buyingPrice) {
    this.buyingPrice = buyingPrice;
  }

  public OfferType regularPrice(MoneyType regularPrice) {
    this.regularPrice = regularPrice;
    return this;
  }

   /**
   * The current price excluding any promotions that apply to the product. Excludes the shipping cost.
   * @return regularPrice
  **/
  @ApiModelProperty(required = true, value = "The current price excluding any promotions that apply to the product. Excludes the shipping cost.")
  public MoneyType getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(MoneyType regularPrice) {
    this.regularPrice = regularPrice;
  }

  public OfferType businessPrice(MoneyType businessPrice) {
    this.businessPrice = businessPrice;
    return this;
  }

   /**
   * The current listing price for Business buyers.
   * @return businessPrice
  **/
  @ApiModelProperty(value = "The current listing price for Business buyers.")
  public MoneyType getBusinessPrice() {
    return businessPrice;
  }

  public void setBusinessPrice(MoneyType businessPrice) {
    this.businessPrice = businessPrice;
  }

  public OfferType quantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
    this.quantityDiscountPrices = quantityDiscountPrices;
    return this;
  }

  public OfferType addQuantityDiscountPricesItem(QuantityDiscountPriceType quantityDiscountPricesItem) {
    if (this.quantityDiscountPrices == null) {
      this.quantityDiscountPrices = new ArrayList<>();
    }
    this.quantityDiscountPrices.add(quantityDiscountPricesItem);
    return this;
  }

   /**
   * Get quantityDiscountPrices
   * @return quantityDiscountPrices
  **/
  @ApiModelProperty(value = "")
  public List<QuantityDiscountPriceType> getQuantityDiscountPrices() {
    return quantityDiscountPrices;
  }

  public void setQuantityDiscountPrices(List<QuantityDiscountPriceType> quantityDiscountPrices) {
    this.quantityDiscountPrices = quantityDiscountPrices;
  }

  public OfferType fulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
    return this;
  }

   /**
   * The fulfillment channel for the offer listing. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.
   * @return fulfillmentChannel
  **/
  @ApiModelProperty(required = true, value = "The fulfillment channel for the offer listing. Possible values:  * Amazon - Fulfilled by Amazon. * Merchant - Fulfilled by the seller.")
  public String getFulfillmentChannel() {
    return fulfillmentChannel;
  }

  public void setFulfillmentChannel(String fulfillmentChannel) {
    this.fulfillmentChannel = fulfillmentChannel;
  }

  public OfferType itemCondition(String itemCondition) {
    this.itemCondition = itemCondition;
    return this;
  }

   /**
   * The item condition for the offer listing. Possible values: New, Used, Collectible, Refurbished, or Club.
   * @return itemCondition
  **/
  @ApiModelProperty(required = true, value = "The item condition for the offer listing. Possible values: New, Used, Collectible, Refurbished, or Club.")
  public String getItemCondition() {
    return itemCondition;
  }

  public void setItemCondition(String itemCondition) {
    this.itemCondition = itemCondition;
  }

  public OfferType itemSubCondition(String itemSubCondition) {
    this.itemSubCondition = itemSubCondition;
    return this;
  }

   /**
   * The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.
   * @return itemSubCondition
  **/
  @ApiModelProperty(required = true, value = "The item subcondition for the offer listing. Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, or Other.")
  public String getItemSubCondition() {
    return itemSubCondition;
  }

  public void setItemSubCondition(String itemSubCondition) {
    this.itemSubCondition = itemSubCondition;
  }

  public OfferType sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(required = true, value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferType offerType = (OfferType) o;
    return Objects.equals(this.offerType, offerType.offerType) &&
        Objects.equals(this.buyingPrice, offerType.buyingPrice) &&
        Objects.equals(this.regularPrice, offerType.regularPrice) &&
        Objects.equals(this.businessPrice, offerType.businessPrice) &&
        Objects.equals(this.quantityDiscountPrices, offerType.quantityDiscountPrices) &&
        Objects.equals(this.fulfillmentChannel, offerType.fulfillmentChannel) &&
        Objects.equals(this.itemCondition, offerType.itemCondition) &&
        Objects.equals(this.itemSubCondition, offerType.itemSubCondition) &&
        Objects.equals(this.sellerSKU, offerType.sellerSKU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerType, buyingPrice, regularPrice, businessPrice, quantityDiscountPrices, fulfillmentChannel, itemCondition, itemSubCondition, sellerSKU);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferType {\n");
    
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    buyingPrice: ").append(toIndentedString(buyingPrice)).append("\n");
    sb.append("    regularPrice: ").append(toIndentedString(regularPrice)).append("\n");
    sb.append("    businessPrice: ").append(toIndentedString(businessPrice)).append("\n");
    sb.append("    quantityDiscountPrices: ").append(toIndentedString(quantityDiscountPrices)).append("\n");
    sb.append("    fulfillmentChannel: ").append(toIndentedString(fulfillmentChannel)).append("\n");
    sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
    sb.append("    itemSubCondition: ").append(toIndentedString(itemSubCondition)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
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

