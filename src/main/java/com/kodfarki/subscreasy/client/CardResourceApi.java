/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kodfarki.subscreasy.client;

import com.kodfarki.subscreasy.ApiCallback;
import com.kodfarki.subscreasy.ApiClient;
import com.kodfarki.subscreasy.ApiException;
import com.kodfarki.subscreasy.ApiResponse;
import com.kodfarki.subscreasy.Configuration;
import com.kodfarki.subscreasy.Pair;
import com.kodfarki.subscreasy.ProgressRequestBody;
import com.kodfarki.subscreasy.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.kodfarki.subscreasy.client.model.SaveCardRequest;
import com.kodfarki.subscreasy.client.model.SavedCard;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardResourceApi {
    private ApiClient apiClient;

    public CardResourceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CardResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for saveCardUsingPOST
     * @param request request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call saveCardUsingPOSTCall(SaveCardRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/card";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call saveCardUsingPOSTValidateBeforeCall(SaveCardRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling saveCardUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = saveCardUsingPOSTCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * saveCard
     * 
     * @param request request (required)
     * @return SavedCard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SavedCard saveCardUsingPOST(SaveCardRequest request) throws ApiException {
        ApiResponse<SavedCard> resp = saveCardUsingPOSTWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * saveCard
     * 
     * @param request request (required)
     * @return ApiResponse&lt;SavedCard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SavedCard> saveCardUsingPOSTWithHttpInfo(SaveCardRequest request) throws ApiException {
        com.squareup.okhttp.Call call = saveCardUsingPOSTValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<SavedCard>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * saveCard (asynchronously)
     * 
     * @param request request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call saveCardUsingPOSTAsync(SaveCardRequest request, final ApiCallback<SavedCard> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = saveCardUsingPOSTValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SavedCard>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
