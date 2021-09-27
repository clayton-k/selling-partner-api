/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.Container;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.Item;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.PartyIdentification;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.ShipmentDetails;
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
 * ShipmentConfirmation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-09-27T17:50:31.206+08:00")
public class ShipmentConfirmation {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("shipmentDetails")
  private ShipmentDetails shipmentDetails = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  @SerializedName("items")
  private List<Item> items = new ArrayList<>();

  @SerializedName("containers")
  private List<Container> containers = null;

  public ShipmentConfirmation purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number corresponding to the shipment.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(required = true, value = "Purchase order number corresponding to the shipment.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public ShipmentConfirmation shipmentDetails(ShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

   /**
   * Shipment information.
   * @return shipmentDetails
  **/
  @ApiModelProperty(required = true, value = "Shipment information.")
  public ShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(ShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }

  public ShipmentConfirmation sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/
  @ApiModelProperty(required = true, value = "ID of the selling party or vendor.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public ShipmentConfirmation shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Warehouse code of vendor.
   * @return shipFromParty
  **/
  @ApiModelProperty(required = true, value = "Warehouse code of vendor.")
  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public ShipmentConfirmation items(List<Item> items) {
    this.items = items;
    return this;
  }

  public ShipmentConfirmation addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package.")
  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public ShipmentConfirmation containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  public ShipmentConfirmation addContainersItem(Container containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package.
   * @return containers
  **/
  @ApiModelProperty(value = "Provide the details of the items in this shipment. If any of the item details field is common at a package or a pallet level, then provide them at the corresponding package.")
  public List<Container> getContainers() {
    return containers;
  }

  public void setContainers(List<Container> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentConfirmation shipmentConfirmation = (ShipmentConfirmation) o;
    return Objects.equals(this.purchaseOrderNumber, shipmentConfirmation.purchaseOrderNumber) &&
        Objects.equals(this.shipmentDetails, shipmentConfirmation.shipmentDetails) &&
        Objects.equals(this.sellingParty, shipmentConfirmation.sellingParty) &&
        Objects.equals(this.shipFromParty, shipmentConfirmation.shipFromParty) &&
        Objects.equals(this.items, shipmentConfirmation.items) &&
        Objects.equals(this.containers, shipmentConfirmation.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, shipmentDetails, sellingParty, shipFromParty, items, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentConfirmation {\n");
    
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

