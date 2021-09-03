# UpdateInventoryApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInventoryUpdate**](UpdateInventoryApi.md#submitInventoryUpdate) | **POST** /vendor/directFulfillment/inventory/v1/warehouses/{warehouseId}/items | 


<a name="submitInventoryUpdate"></a>
# **submitInventoryUpdate**
> SubmitInventoryUpdateResponse submitInventoryUpdate(body, warehouseId)



Submits inventory updates for the specified warehouse for either a partial or full feed of inventory items.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.UpdateInventoryApi;


UpdateInventoryApi apiInstance = new UpdateInventoryApi();
SubmitInventoryUpdateRequest body = new SubmitInventoryUpdateRequest(); // SubmitInventoryUpdateRequest | 
String warehouseId = "warehouseId_example"; // String | Identifier for the warehouse for which to update inventory.
try {
    SubmitInventoryUpdateResponse result = apiInstance.submitInventoryUpdate(body, warehouseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateInventoryApi#submitInventoryUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitInventoryUpdateRequest**](SubmitInventoryUpdateRequest.md)|  |
 **warehouseId** | **String**| Identifier for the warehouse for which to update inventory. |

### Return type

[**SubmitInventoryUpdateResponse**](SubmitInventoryUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

