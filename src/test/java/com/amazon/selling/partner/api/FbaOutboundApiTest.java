/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.api;

import com.amazon.selling.partner.ApiException;
import com.amazon.selling.partner.model.CancelFulfillmentOrderResponse;
import com.amazon.selling.partner.model.CreateFulfillmentOrderRequest;
import com.amazon.selling.partner.model.CreateFulfillmentOrderResponse;
import com.amazon.selling.partner.model.CreateFulfillmentReturnRequest;
import com.amazon.selling.partner.model.CreateFulfillmentReturnResponse;
import com.amazon.selling.partner.model.GetFeatureInventoryResponse;
import com.amazon.selling.partner.model.GetFeatureSkuResponse;
import com.amazon.selling.partner.model.GetFeaturesResponse;
import com.amazon.selling.partner.model.GetFulfillmentOrderResponse;
import com.amazon.selling.partner.model.GetFulfillmentPreviewRequest;
import com.amazon.selling.partner.model.GetFulfillmentPreviewResponse;
import com.amazon.selling.partner.model.GetPackageTrackingDetailsResponse;
import com.amazon.selling.partner.model.ListAllFulfillmentOrdersResponse;
import com.amazon.selling.partner.model.ListReturnReasonCodesResponse;
import java.time.OffsetDateTime;
import com.amazon.selling.partner.model.UpdateFulfillmentOrderRequest;
import com.amazon.selling.partner.model.UpdateFulfillmentOrderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FbaOutboundApi
 */
@Ignore
public class FbaOutboundApiTest {

    private final FbaOutboundApi api = new FbaOutboundApi();

    
    /**
     * 
     *
     * Requests that Amazon stop attempting to fulfill the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelFulfillmentOrderTest() throws ApiException {
        String sellerFulfillmentOrderId = null;
        CancelFulfillmentOrderResponse response = api.cancelFulfillmentOrder(sellerFulfillmentOrderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Requests that Amazon ship items from the seller&#39;s inventory in Amazon&#39;s fulfillment network to a destination address.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentOrderTest() throws ApiException {
        CreateFulfillmentOrderRequest body = null;
        CreateFulfillmentOrderResponse response = api.createFulfillmentOrder(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a fulfillment return.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentReturnTest() throws ApiException {
        CreateFulfillmentReturnRequest body = null;
        String sellerFulfillmentOrderId = null;
        CreateFulfillmentReturnResponse response = api.createFulfillmentReturn(body, sellerFulfillmentOrderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of inventory items that are eligible for the fulfillment feature you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureInventoryTest() throws ApiException {
        String marketplaceId = null;
        String featureName = null;
        String nextToken = null;
        GetFeatureInventoryResponse response = api.getFeatureInventory(marketplaceId, featureName, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the number of items with the sellerSKU you specify that can have orders fulfilled using the specified feature. Note that if the sellerSKU isn&#39;t eligible, the response will contain an empty skuInfo object.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeatureSKUTest() throws ApiException {
        String marketplaceId = null;
        String featureName = null;
        String sellerSku = null;
        GetFeatureSkuResponse response = api.getFeatureSKU(marketplaceId, featureName, sellerSku);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of features available for Multi-Channel Fulfillment orders in the marketplace you specify, and whether the seller for which you made the call is enrolled for each feature.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeaturesTest() throws ApiException {
        String marketplaceId = null;
        GetFeaturesResponse response = api.getFeatures(marketplaceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the fulfillment order indicated by the specified order identifier.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentOrderTest() throws ApiException {
        String sellerFulfillmentOrderId = null;
        GetFulfillmentOrderResponse response = api.getFulfillmentOrder(sellerFulfillmentOrderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of fulfillment order previews based on shipping criteria that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentPreviewTest() throws ApiException {
        GetFulfillmentPreviewRequest body = null;
        GetFulfillmentPreviewResponse response = api.getFulfillmentPreview(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns delivery tracking information for a package in an outbound shipment for a Multi-Channel Fulfillment order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageTrackingDetailsTest() throws ApiException {
        Integer packageNumber = null;
        GetPackageTrackingDetailsResponse response = api.getPackageTrackingDetails(packageNumber);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of fulfillment orders fulfilled after (or at) a specified date-time, or indicated by the next token parameter.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllFulfillmentOrdersTest() throws ApiException {
        OffsetDateTime queryStartDate = null;
        String nextToken = null;
        ListAllFulfillmentOrdersResponse response = api.listAllFulfillmentOrders(queryStartDate, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of return reason codes for a seller SKU in a given marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listReturnReasonCodesTest() throws ApiException {
        String sellerSku = null;
        String language = null;
        String marketplaceId = null;
        String sellerFulfillmentOrderId = null;
        ListReturnReasonCodesResponse response = api.listReturnReasonCodes(sellerSku, language, marketplaceId, sellerFulfillmentOrderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates and/or requests shipment for a fulfillment order with an order hold on it.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 30 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFulfillmentOrderTest() throws ApiException {
        UpdateFulfillmentOrderRequest body = null;
        String sellerFulfillmentOrderId = null;
        UpdateFulfillmentOrderResponse response = api.updateFulfillmentOrder(body, sellerFulfillmentOrderId);

        // TODO: test validations
    }
    
}
