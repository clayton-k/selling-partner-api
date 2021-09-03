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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates whether the item is fulfilled by Amazon or by the seller (merchant).
 */
@JsonAdapter(FulfillmentChannelType.Adapter.class)
public enum FulfillmentChannelType {
  
  AMAZON("Amazon"),
  
  MERCHANT("Merchant");

  private String value;

  FulfillmentChannelType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FulfillmentChannelType fromValue(String text) {
    for (FulfillmentChannelType b : FulfillmentChannelType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FulfillmentChannelType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FulfillmentChannelType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FulfillmentChannelType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FulfillmentChannelType.fromValue(String.valueOf(value));
    }
  }
}

