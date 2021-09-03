# VendorInvoiceApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInvoice**](VendorInvoiceApi.md#submitInvoice) | **POST** /vendor/directFulfillment/payments/v1/invoices | 


<a name="submitInvoice"></a>
# **submitInvoice**
> SubmitInvoiceResponse submitInvoice(body)



Submits one or more invoices for a vendor&#39;s direct fulfillment orders.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorInvoiceApi;


VendorInvoiceApi apiInstance = new VendorInvoiceApi();
SubmitInvoiceRequest body = new SubmitInvoiceRequest(); // SubmitInvoiceRequest | 
try {
    SubmitInvoiceResponse result = apiInstance.submitInvoice(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorInvoiceApi#submitInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitInvoiceRequest**](SubmitInvoiceRequest.md)|  |

### Return type

[**SubmitInvoiceResponse**](SubmitInvoiceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

