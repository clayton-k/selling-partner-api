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


package com.amazon.selling.partner.api;

import com.amazon.selling.partner.ApiCallback;
import com.amazon.selling.partner.ApiClient;
import com.amazon.selling.partner.ApiException;
import com.amazon.selling.partner.ApiResponse;
import com.amazon.selling.partner.Configuration;
import com.amazon.selling.partner.Pair;
import com.amazon.selling.partner.ProgressRequestBody;
import com.amazon.selling.partner.ProgressResponseBody;
import com.amazon.selling.partner.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.GetCustomerInvoiceResponse;
import com.amazon.selling.partner.model.vendor.direct.fulfillment.shipping.GetCustomerInvoicesResponse;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.AWSSigV4Signer;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;

public class CustomerInvoicesApi {
    private ApiClient apiClient;

    CustomerInvoicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerInvoicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCustomerInvoice
     * @param purchaseOrderNumber Purchase order number of the shipment for which to return the invoice. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCustomerInvoiceCall(String purchaseOrderNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/shipping/v1/customerInvoices/{purchaseOrderNumber}"
            .replaceAll("\\{" + "purchaseOrderNumber" + "\\}", apiClient.escapeString(purchaseOrderNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCustomerInvoiceValidateBeforeCall(String purchaseOrderNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'purchaseOrderNumber' is set
        if (purchaseOrderNumber == null) {
            throw new ApiException("Missing the required parameter 'purchaseOrderNumber' when calling getCustomerInvoice(Async)");
        }
        

        com.squareup.okhttp.Call call = getCustomerInvoiceCall(purchaseOrderNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns a customer invoice based on the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param purchaseOrderNumber Purchase order number of the shipment for which to return the invoice. (required)
     * @return GetCustomerInvoiceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCustomerInvoiceResponse getCustomerInvoice(String purchaseOrderNumber) throws ApiException {
        ApiResponse<GetCustomerInvoiceResponse> resp = getCustomerInvoiceWithHttpInfo(purchaseOrderNumber);
        return resp.getData();
    }

    /**
     * 
     * Returns a customer invoice based on the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param purchaseOrderNumber Purchase order number of the shipment for which to return the invoice. (required)
     * @return ApiResponse&lt;GetCustomerInvoiceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCustomerInvoiceResponse> getCustomerInvoiceWithHttpInfo(String purchaseOrderNumber) throws ApiException {
        com.squareup.okhttp.Call call = getCustomerInvoiceValidateBeforeCall(purchaseOrderNumber, null, null);
        Type localVarReturnType = new TypeToken<GetCustomerInvoiceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a customer invoice based on the purchaseOrderNumber that you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param purchaseOrderNumber Purchase order number of the shipment for which to return the invoice. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomerInvoiceAsync(String purchaseOrderNumber, final ApiCallback<GetCustomerInvoiceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCustomerInvoiceValidateBeforeCall(purchaseOrderNumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCustomerInvoiceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCustomerInvoices
     * @param createdAfter Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. (optional)
     * @param limit The limit to the number of records returned (optional)
     * @param sortOrder Sort ASC or DESC by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCustomerInvoicesCall(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, Integer limit, String sortOrder, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vendor/directFulfillment/shipping/v1/customerInvoices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shipFromPartyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("shipFromPartyId", shipFromPartyId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (createdAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdAfter", createdAfter));
        if (createdBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdBefore", createdBefore));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));
        if (nextToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nextToken", nextToken));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCustomerInvoicesValidateBeforeCall(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, Integer limit, String sortOrder, String nextToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createdAfter' is set
        if (createdAfter == null) {
            throw new ApiException("Missing the required parameter 'createdAfter' when calling getCustomerInvoices(Async)");
        }
        
        // verify the required parameter 'createdBefore' is set
        if (createdBefore == null) {
            throw new ApiException("Missing the required parameter 'createdBefore' when calling getCustomerInvoices(Async)");
        }
        

        com.squareup.okhttp.Call call = getCustomerInvoicesCall(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns a list of customer invoices created during a time frame that you specify. You define the  time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must be no more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param createdAfter Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. (optional)
     * @param limit The limit to the number of records returned (optional)
     * @param sortOrder Sort ASC or DESC by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @return GetCustomerInvoicesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCustomerInvoicesResponse getCustomerInvoices(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, Integer limit, String sortOrder, String nextToken) throws ApiException {
        ApiResponse<GetCustomerInvoicesResponse> resp = getCustomerInvoicesWithHttpInfo(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken);
        return resp.getData();
    }

    /**
     * 
     * Returns a list of customer invoices created during a time frame that you specify. You define the  time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must be no more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param createdAfter Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. (optional)
     * @param limit The limit to the number of records returned (optional)
     * @param sortOrder Sort ASC or DESC by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @return ApiResponse&lt;GetCustomerInvoicesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCustomerInvoicesResponse> getCustomerInvoicesWithHttpInfo(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, Integer limit, String sortOrder, String nextToken) throws ApiException {
        com.squareup.okhttp.Call call = getCustomerInvoicesValidateBeforeCall(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken, null, null);
        Type localVarReturnType = new TypeToken<GetCustomerInvoicesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a list of customer invoices created during a time frame that you specify. You define the  time frame using the createdAfter and createdBefore parameters. You must use both of these parameters. The date range to search must be no more than 7 days.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     * @param createdAfter Orders that became available after this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param createdBefore Orders that became available before this date and time will be included in the result. Must be in ISO-8601 date/time format. (required)
     * @param shipFromPartyId The vendor warehouseId for order fulfillment. If not specified, the result will contain orders for all warehouses. (optional)
     * @param limit The limit to the number of records returned (optional)
     * @param sortOrder Sort ASC or DESC by order creation date. (optional)
     * @param nextToken Used for pagination when there are more orders than the specified result size limit. The token value is returned in the previous API call. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomerInvoicesAsync(OffsetDateTime createdAfter, OffsetDateTime createdBefore, String shipFromPartyId, Integer limit, String sortOrder, String nextToken, final ApiCallback<GetCustomerInvoicesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCustomerInvoicesValidateBeforeCall(createdAfter, createdBefore, shipFromPartyId, limit, sortOrder, nextToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCustomerInvoicesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private AWSAuthenticationCredentials awsAuthenticationCredentials;
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;
        private RateLimitConfiguration rateLimitConfiguration;

        public Builder awsAuthenticationCredentials(AWSAuthenticationCredentials awsAuthenticationCredentials) {
            this.awsAuthenticationCredentials = awsAuthenticationCredentials;
            return this;
        }

        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }
        
        public Builder awsAuthenticationCredentialsProvider(AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider) {
            this.awsAuthenticationCredentialsProvider = awsAuthenticationCredentialsProvider;
            return this;
        }
        
        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }
        

        public CustomerInvoicesApi build() {
            if (awsAuthenticationCredentials == null) {
                throw new RuntimeException("AWSAuthenticationCredentials not set");
            }

            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }

            AWSSigV4Signer awsSigV4Signer;
            if ( awsAuthenticationCredentialsProvider == null) {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials);
            }
            else {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials,awsAuthenticationCredentialsProvider);
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new CustomerInvoicesApi(new ApiClient()
                .setAWSSigV4Signer(awsSigV4Signer)
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
