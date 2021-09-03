/*
 * Selling Partner API for Product Fees
 * The Selling Partner API for Product Fees lets you programmatically retrieve estimated fees for a product. You can then account for those fees in your pricing.
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
import com.amazon.selling.partner.model.Points;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Price information for an item, used to estimate fees.
 */
@ApiModel(description = "Price information for an item, used to estimate fees.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:32.099+08:00")
public class PriceToEstimateFees {
  @SerializedName("ListingPrice")
  private MoneyType listingPrice = null;

  @SerializedName("Shipping")
  private MoneyType shipping = null;

  @SerializedName("Points")
  private Points points = null;

  public PriceToEstimateFees listingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
    return this;
  }

   /**
   * The price of the item.
   * @return listingPrice
  **/
  @ApiModelProperty(required = true, value = "The price of the item.")
  public MoneyType getListingPrice() {
    return listingPrice;
  }

  public void setListingPrice(MoneyType listingPrice) {
    this.listingPrice = listingPrice;
  }

  public PriceToEstimateFees shipping(MoneyType shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * The shipping cost.
   * @return shipping
  **/
  @ApiModelProperty(value = "The shipping cost.")
  public MoneyType getShipping() {
    return shipping;
  }

  public void setShipping(MoneyType shipping) {
    this.shipping = shipping;
  }

  public PriceToEstimateFees points(Points points) {
    this.points = points;
    return this;
  }

   /**
   * The number of Amazon Points offered with the purchase of an item.
   * @return points
  **/
  @ApiModelProperty(value = "The number of Amazon Points offered with the purchase of an item.")
  public Points getPoints() {
    return points;
  }

  public void setPoints(Points points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceToEstimateFees priceToEstimateFees = (PriceToEstimateFees) o;
    return Objects.equals(this.listingPrice, priceToEstimateFees.listingPrice) &&
        Objects.equals(this.shipping, priceToEstimateFees.shipping) &&
        Objects.equals(this.points, priceToEstimateFees.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingPrice, shipping, points);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceToEstimateFees {\n");
    
    sb.append("    listingPrice: ").append(toIndentedString(listingPrice)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

