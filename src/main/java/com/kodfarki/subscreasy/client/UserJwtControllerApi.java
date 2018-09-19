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


import com.kodfarki.subscreasy.client.model.LoginVM;
import com.kodfarki.subscreasy.client.model.ResponseEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserJwtControllerApi {
    private ApiClient apiClient;

    public UserJwtControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserJwtControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authorizeUsingPOST
     * @param loginVM loginVM (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call authorizeUsingPOSTCall(LoginVM loginVM, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = loginVM;

        // create path and map variables
        String localVarPath = "/api/authenticate";

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
    private com.squareup.okhttp.Call authorizeUsingPOSTValidateBeforeCall(LoginVM loginVM, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'loginVM' is set
        if (loginVM == null) {
            throw new ApiException("Missing the required parameter 'loginVM' when calling authorizeUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = authorizeUsingPOSTCall(loginVM, progressListener, progressRequestListener);
        return call;

    }

    /**
     * authorize
     * 
     * @param loginVM loginVM (required)
     * @return ResponseEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResponseEntity authorizeUsingPOST(LoginVM loginVM) throws ApiException {
        ApiResponse<ResponseEntity> resp = authorizeUsingPOSTWithHttpInfo(loginVM);
        return resp.getData();
    }

    /**
     * authorize
     * 
     * @param loginVM loginVM (required)
     * @return ApiResponse&lt;ResponseEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResponseEntity> authorizeUsingPOSTWithHttpInfo(LoginVM loginVM) throws ApiException {
        com.squareup.okhttp.Call call = authorizeUsingPOSTValidateBeforeCall(loginVM, null, null);
        Type localVarReturnType = new TypeToken<ResponseEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * authorize (asynchronously)
     * 
     * @param loginVM loginVM (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call authorizeUsingPOSTAsync(LoginVM loginVM, final ApiCallback<ResponseEntity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = authorizeUsingPOSTValidateBeforeCall(loginVM, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
