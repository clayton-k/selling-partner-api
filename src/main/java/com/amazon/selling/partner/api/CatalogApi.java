/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, see the [Catalog Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/catalog-items-api-use-case-guide/catalog-items-api-use-case-guide_2020-12-01.md).
 *
 * OpenAPI spec version: 2020-12-01
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


import com.amazon.selling.partner.model.ErrorList;
import com.amazon.selling.partner.model.Item;
import com.amazon.selling.partner.model.ItemSearchResults;

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

public class CatalogApi {
    private ApiClient apiClient;

    CatalogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CatalogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCatalogItem
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCatalogItemCall(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/catalog/2020-12-01/items/{asin}"
            .replaceAll("\\{" + "asin" + "\\}", apiClient.escapeString(asin.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (includedData != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedData", includedData));
        if (locale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locale", locale));

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
    private com.squareup.okhttp.Call getCatalogItemValidateBeforeCall(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getCatalogItem(Async)");
        }
        
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getCatalogItem(Async)");
        }
        

        com.squareup.okhttp.Call call = getCatalogItemCall(asin, marketplaceIds, includedData, locale, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return Item
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Item getCatalogItem(String asin, List<String> marketplaceIds, List<String> includedData, String locale) throws ApiException {
        ApiResponse<Item> resp = getCatalogItemWithHttpInfo(asin, marketplaceIds, includedData, locale);
        return resp.getData();
    }

    /**
     * 
     * Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return ApiResponse&lt;Item&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Item> getCatalogItemWithHttpInfo(String asin, List<String> marketplaceIds, List<String> includedData, String locale) throws ApiException {
        com.squareup.okhttp.Call call = getCatalogItemValidateBeforeCall(asin, marketplaceIds, includedData, locale, null, null);
        Type localVarReturnType = new TypeToken<Item>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCatalogItemAsync(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ApiCallback<Item> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCatalogItemValidateBeforeCall(asin, marketplaceIds, includedData, locale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Item>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchCatalogItems
     * @param keywords A comma-delimited list of words or item identifiers to search the Amazon catalog for. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search to. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search to. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language the keywords are provided in. Defaults to the primary locale of the marketplace. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCatalogItemsCall(List<String> keywords, List<String> marketplaceIds, List<String> includedData, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/catalog/2020-12-01/items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (keywords != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "keywords", keywords));
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (includedData != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedData", includedData));
        if (brandNames != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "brandNames", brandNames));
        if (classificationIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "classificationIds", classificationIds));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (pageToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
        if (keywordsLocale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keywordsLocale", keywordsLocale));
        if (locale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locale", locale));

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
    private com.squareup.okhttp.Call searchCatalogItemsValidateBeforeCall(List<String> keywords, List<String> marketplaceIds, List<String> includedData, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'keywords' is set
        if (keywords == null) {
            throw new ApiException("Missing the required parameter 'keywords' when calling searchCatalogItems(Async)");
        }
        
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling searchCatalogItems(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCatalogItemsCall(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Search for and return a list of Amazon catalog items and associated information.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param keywords A comma-delimited list of words or item identifiers to search the Amazon catalog for. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search to. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search to. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language the keywords are provided in. Defaults to the primary locale of the marketplace. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return ItemSearchResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemSearchResults searchCatalogItems(List<String> keywords, List<String> marketplaceIds, List<String> includedData, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, String locale) throws ApiException {
        ApiResponse<ItemSearchResults> resp = searchCatalogItemsWithHttpInfo(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale);
        return resp.getData();
    }

    /**
     * 
     * Search for and return a list of Amazon catalog items and associated information.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param keywords A comma-delimited list of words or item identifiers to search the Amazon catalog for. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search to. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search to. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language the keywords are provided in. Defaults to the primary locale of the marketplace. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return ApiResponse&lt;ItemSearchResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemSearchResults> searchCatalogItemsWithHttpInfo(List<String> keywords, List<String> marketplaceIds, List<String> includedData, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, String locale) throws ApiException {
        com.squareup.okhttp.Call call = searchCatalogItemsValidateBeforeCall(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale, null, null);
        Type localVarReturnType = new TypeToken<ItemSearchResults>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Search for and return a list of Amazon catalog items and associated information.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/usage-plans-rate-limits/Usage-Plans-and-Rate-Limits.md).
     * @param keywords A comma-delimited list of words or item identifiers to search the Amazon catalog for. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: summaries. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search to. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search to. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language the keywords are provided in. Defaults to the primary locale of the marketplace. (optional)
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchCatalogItemsAsync(List<String> keywords, List<String> marketplaceIds, List<String> includedData, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, String locale, final ApiCallback<ItemSearchResults> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchCatalogItemsValidateBeforeCall(keywords, marketplaceIds, includedData, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, locale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemSearchResults>(){}.getType();
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
        

        public CatalogApi build() {
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

            return new CatalogApi(new ApiClient()
                .setAWSSigV4Signer(awsSigV4Signer)
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
