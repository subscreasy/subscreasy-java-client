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


import com.kodfarki.subscreasy.client.model.CreateOrderRequest;
import com.kodfarki.subscreasy.client.model.Order;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderResourceApi {
    private ApiClient apiClient;

    public OrderResourceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createOrderUsingPOST
     * @param orderRequest orderRequest (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createOrderUsingPOSTCall(CreateOrderRequest orderRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = orderRequest;

        // create path and map variables
        String localVarPath = "/api/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/html;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded;charset=UTF-8"
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
    private com.squareup.okhttp.Call createOrderUsingPOSTValidateBeforeCall(CreateOrderRequest orderRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'orderRequest' is set
        if (orderRequest == null) {
            throw new ApiException("Missing the required parameter 'orderRequest' when calling createOrderUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = createOrderUsingPOSTCall(orderRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * createOrder
     * 
     * @param orderRequest orderRequest (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Order createOrderUsingPOST(CreateOrderRequest orderRequest) throws ApiException {
        ApiResponse<Order> resp = createOrderUsingPOSTWithHttpInfo(orderRequest);
        return resp.getData();
    }

    /**
     * createOrder
     * 
     * @param orderRequest orderRequest (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Order> createOrderUsingPOSTWithHttpInfo(CreateOrderRequest orderRequest) throws ApiException {
        com.squareup.okhttp.Call call = createOrderUsingPOSTValidateBeforeCall(orderRequest, null, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * createOrder (asynchronously)
     * 
     * @param orderRequest orderRequest (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createOrderUsingPOSTAsync(CreateOrderRequest orderRequest, final ApiCallback<Order> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createOrderUsingPOSTValidateBeforeCall(orderRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllOrdersUsingGET
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllOrdersUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/orders";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllOrdersUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllOrdersUsingGETCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * getAllOrders
     * 
     * @return List&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Order> getAllOrdersUsingGET() throws ApiException {
        ApiResponse<List<Order>> resp = getAllOrdersUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * getAllOrders
     * 
     * @return ApiResponse&lt;List&lt;Order&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Order>> getAllOrdersUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllOrdersUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Order>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllOrders (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllOrdersUsingGETAsync(final ApiCallback<List<Order>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllOrdersUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Order>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrderUsingGET
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderUsingGETCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/orders/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOrderUsingGETValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOrderUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrderUsingGETCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getOrder
     * 
     * @param id id (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Order getOrderUsingGET(Long id) throws ApiException {
        ApiResponse<Order> resp = getOrderUsingGETWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * getOrder
     * 
     * @param id id (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Order> getOrderUsingGETWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getOrderUsingGETValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getOrder (asynchronously)
     * 
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrderUsingGETAsync(Long id, final ApiCallback<Order> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrderUsingGETValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateOrderUsingPUT
     * @param order order (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateOrderUsingPUTCall(Order order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = order;

        // create path and map variables
        String localVarPath = "/api/orders";

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateOrderUsingPUTValidateBeforeCall(Order order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new ApiException("Missing the required parameter 'order' when calling updateOrderUsingPUT(Async)");
        }
        

        com.squareup.okhttp.Call call = updateOrderUsingPUTCall(order, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateOrder
     * 
     * @param order order (required)
     * @return Order
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Order updateOrderUsingPUT(Order order) throws ApiException {
        ApiResponse<Order> resp = updateOrderUsingPUTWithHttpInfo(order);
        return resp.getData();
    }

    /**
     * updateOrder
     * 
     * @param order order (required)
     * @return ApiResponse&lt;Order&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Order> updateOrderUsingPUTWithHttpInfo(Order order) throws ApiException {
        com.squareup.okhttp.Call call = updateOrderUsingPUTValidateBeforeCall(order, null, null);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateOrder (asynchronously)
     * 
     * @param order order (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOrderUsingPUTAsync(Order order, final ApiCallback<Order> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateOrderUsingPUTValidateBeforeCall(order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Order>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
