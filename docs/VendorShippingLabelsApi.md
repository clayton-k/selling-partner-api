# VendorShippingLabelsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getShippingLabel**](VendorShippingLabelsApi.md#getShippingLabel) | **GET** /vendor/directFulfillment/shipping/v1/shippingLabels/{purchaseOrderNumber} | 
[**getShippingLabels**](VendorShippingLabelsApi.md#getShippingLabels) | **GET** /vendor/directFulfillment/shipping/v1/shippingLabels | 
[**submitShippingLabelRequest**](VendorShippingLabelsApi.md#submitShippingLabelRequest) | **POST** /vendor/directFulfillment/shipping/v1/shippingLabels | 


<a name="getShippingLabel"></a>
# **getShippingLabel**
> GetShippingLabelResponse getShippingLabel(purchaseOrderNumber)



Returns a shipping label for the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorShippingLabelsApi;


VendorShippingLabelsApi apiInstance = new VendorShippingLabelsApi();
String purchaseOrderNumber = "purchaseOrderNumber_example"; // String | The purchase order number for which you want to return the shipping label. It should be the same purchaseOrderNumber as received in the order.
try {
    GetShippingLabelResponse result = apiInstance.getShippingLabel(purchaseOrderNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingLabelsApi#getShippingLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderNumber** | **String**| The purchase order number for which you want to return the shipping label. It should be the same purchaseOrderNumber as received in the order. |

### Return type

[**GetShippingLabelResponse**](GetShippingLabelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShippingLabels"></a>
# **getShippingLabels**
> GetShippingLabelListResponse getShippingLabels(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken)



Returns a list of shipping labels created during the time frame that you specify. You define that time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must not be more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorShippingLabelsApi;


VendorShippingLabelsApi apiInstance = new VendorShippingLabelsApi();
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Shipping labels that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format.
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Shipping labels that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format.
String shipFromPartyId = "shipFromPartyId_example"; // String | The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses.
Integer limit = 56; // Integer | The limit to the number of records returned.
String sortOrder = "ASC"; // String | Sort ASC or DESC by order creation date.
String nextToken = "nextToken_example"; // String | Used for pagination when there are more ship labels than the specified result size limit. The token value is returned in the previous API call.
try {
    GetShippingLabelListResponse result = apiInstance.getShippingLabels(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingLabelsApi#getShippingLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **OffsetDateTime**| Shipping labels that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. |
 **createdBefore** | **OffsetDateTime**| Shipping labels that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. |
 **shipFromPartyId** | **String**| The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. | [optional]
 **limit** | **Integer**| The limit to the number of records returned. | [optional]
 **sortOrder** | **String**| Sort ASC or DESC by order creation date. | [optional] [default to ASC] [enum: ASC, DESC]
 **nextToken** | **String**| Used for pagination when there are more ship labels than the specified result size limit. The token value is returned in the previous API call. | [optional]

### Return type

[**GetShippingLabelListResponse**](GetShippingLabelListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitShippingLabelRequest"></a>
# **submitShippingLabelRequest**
> SubmitShippingLabelsResponse submitShippingLabelRequest(body)



Creates a shipping label for a purchase order and returns a transactionId for reference.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorShippingLabelsApi;


VendorShippingLabelsApi apiInstance = new VendorShippingLabelsApi();
SubmitShippingLabelsRequest body = new SubmitShippingLabelsRequest(); // SubmitShippingLabelsRequest | 
try {
    SubmitShippingLabelsResponse result = apiInstance.submitShippingLabelRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingLabelsApi#submitShippingLabelRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitShippingLabelsRequest**](SubmitShippingLabelsRequest.md)|  |

### Return type

[**SubmitShippingLabelsResponse**](SubmitShippingLabelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

