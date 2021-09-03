# VendorShippingApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitShipmentConfirmations**](VendorShippingApi.md#submitShipmentConfirmations) | **POST** /vendor/shipping/v1/shipmentConfirmations | 


<a name="submitShipmentConfirmations"></a>
# **submitShipmentConfirmations**
> SubmitShipmentConfirmationsResponse submitShipmentConfirmations(body)



Submits one or more shipment confirmations for vendor orders.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorShippingApi;


VendorShippingApi apiInstance = new VendorShippingApi();
SubmitShipmentConfirmationsRequest body = new SubmitShipmentConfirmationsRequest(); // SubmitShipmentConfirmationsRequest | 
try {
    SubmitShipmentConfirmationsResponse result = apiInstance.submitShipmentConfirmations(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorShippingApi#submitShipmentConfirmations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitShipmentConfirmationsRequest**](SubmitShipmentConfirmationsRequest.md)|  |

### Return type

[**SubmitShipmentConfirmationsResponse**](SubmitShipmentConfirmationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

