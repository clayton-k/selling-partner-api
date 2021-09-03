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
import com.amazon.selling.partner.model.Currency;
import com.amazon.selling.partner.model.ServiceType;
import com.amazon.selling.partner.model.ShippingPromiseSet;
import com.amazon.selling.partner.model.Weight;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The specific rate purchased for the shipment, or null if unpurchased.
 */
@ApiModel(description = "The specific rate purchased for the shipment, or null if unpurchased.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-03T11:47:45.473+08:00")
public class AcceptedRate {
  @SerializedName("totalCharge")
  private Currency totalCharge = null;

  @SerializedName("billedWeight")
  private Weight billedWeight = null;

  @SerializedName("serviceType")
  private ServiceType serviceType = null;

  @SerializedName("promise")
  private ShippingPromiseSet promise = null;

  public AcceptedRate totalCharge(Currency totalCharge) {
    this.totalCharge = totalCharge;
    return this;
  }

   /**
   * The total charge that will be billed for the rate.
   * @return totalCharge
  **/
  @ApiModelProperty(value = "The total charge that will be billed for the rate.")
  public Currency getTotalCharge() {
    return totalCharge;
  }

  public void setTotalCharge(Currency totalCharge) {
    this.totalCharge = totalCharge;
  }

  public AcceptedRate billedWeight(Weight billedWeight) {
    this.billedWeight = billedWeight;
    return this;
  }

   /**
   * The weight that was used to calculate the totalCharge.
   * @return billedWeight
  **/
  @ApiModelProperty(value = "The weight that was used to calculate the totalCharge.")
  public Weight getBilledWeight() {
    return billedWeight;
  }

  public void setBilledWeight(Weight billedWeight) {
    this.billedWeight = billedWeight;
  }

  public AcceptedRate serviceType(ServiceType serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")
  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public AcceptedRate promise(ShippingPromiseSet promise) {
    this.promise = promise;
    return this;
  }

   /**
   * Get promise
   * @return promise
  **/
  @ApiModelProperty(value = "")
  public ShippingPromiseSet getPromise() {
    return promise;
  }

  public void setPromise(ShippingPromiseSet promise) {
    this.promise = promise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptedRate acceptedRate = (AcceptedRate) o;
    return Objects.equals(this.totalCharge, acceptedRate.totalCharge) &&
        Objects.equals(this.billedWeight, acceptedRate.billedWeight) &&
        Objects.equals(this.serviceType, acceptedRate.serviceType) &&
        Objects.equals(this.promise, acceptedRate.promise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCharge, billedWeight, serviceType, promise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptedRate {\n");
    
    sb.append("    totalCharge: ").append(toIndentedString(totalCharge)).append("\n");
    sb.append("    billedWeight: ").append(toIndentedString(billedWeight)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    promise: ").append(toIndentedString(promise)).append("\n");
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

