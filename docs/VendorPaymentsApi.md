# VendorPaymentsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInvoices**](VendorPaymentsApi.md#submitInvoices) | **POST** /vendor/payments/v1/invoices | 


<a name="submitInvoices"></a>
# **submitInvoices**
> SubmitInvoicesResponse submitInvoices(body)



Submit new invoices to Amazon.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.selling.partner.ApiException;
//import com.amazon.selling.partner.api.VendorPaymentsApi;


VendorPaymentsApi apiInstance = new VendorPaymentsApi();
SubmitInvoicesRequest body = new SubmitInvoicesRequest(); // SubmitInvoicesRequest | 
try {
    SubmitInvoicesResponse result = apiInstance.submitInvoices(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorPaymentsApi#submitInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitInvoicesRequest**](SubmitInvoicesRequest.md)|  |

### Return type

[**SubmitInvoicesResponse**](SubmitInvoicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

