# CustomerInvoicesApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerInvoice**](CustomerInvoicesApi.md#getCustomerInvoice) | **GET** /vendor/directFulfillment/shipping/v1/customerInvoices/{purchaseOrderNumber} | 
[**getCustomerInvoices**](CustomerInvoicesApi.md#getCustomerInvoices) | **GET** /vendor/directFulfillment/shipping/v1/customerInvoices | 


<a name="getCustomerInvoice"></a>
# **getCustomerInvoice**
> GetCustomerInvoiceResponse getCustomerInvoice(purchaseOrderNumber)



Returns a customer invoice based on the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.CustomerInvoicesApi;


CustomerInvoicesApi apiInstance = new CustomerInvoicesApi();
String purchaseOrderNumber = "purchaseOrderNumber_example"; // String | Purchase order number of the shipment for which to return the invoice.
try {
    GetCustomerInvoiceResponse result = apiInstance.getCustomerInvoice(purchaseOrderNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoicesApi#getCustomerInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseOrderNumber** | **String**| Purchase order number of the shipment for which to return the invoice. |

### Return type

[**GetCustomerInvoiceResponse**](GetCustomerInvoiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomerInvoices"></a>
# **getCustomerInvoices**
> GetCustomerInvoicesResponse getCustomerInvoices(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken)



Returns a list of customer invoices created during a time frame that you specify. You define the  time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must be no more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.CustomerInvoicesApi;


CustomerInvoicesApi apiInstance = new CustomerInvoicesApi();
OffsetDateTime createdAfter = OffsetDateTime.now(); // OffsetDateTime | Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format.
OffsetDateTime createdBefore = OffsetDateTime.now(); // OffsetDateTime | Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format.
String shipFromPartyId = "shipFromPartyId_example"; // String | The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses.
Integer limit = 56; // Integer | The limit to the number of records returned
String sortOrder = "sortOrder_example"; // String | Sort ASC or DESC by order creation date.
String nextToken = "nextToken_example"; // String | Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call.
try {
    GetCustomerInvoicesResponse result = apiInstance.getCustomerInvoices(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerInvoicesApi#getCustomerInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createdAfter** | **OffsetDateTime**| Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. |
 **createdBefore** | **OffsetDateTime**| Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. |
 **shipFromPartyId** | **String**| The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. | [optional]
 **limit** | **Integer**| The limit to the number of records returned | [optional]
 **sortOrder** | **String**| Sort ASC or DESC by order creation date. | [optional] [enum: ASC, DESC]
 **nextToken** | **String**| Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. | [optional]

### Return type

[**GetCustomerInvoicesResponse**](GetCustomerInvoicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

