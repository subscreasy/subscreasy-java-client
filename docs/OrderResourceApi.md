# OrderResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderUsingPOST**](OrderResourceApi.md#createOrderUsingPOST) | **POST** /api/orders | createOrder
[**deleteOrderUsingDELETE**](OrderResourceApi.md#deleteOrderUsingDELETE) | **DELETE** /api/orders/{id} | deleteOrder
[**getAllOrdersUsingGET**](OrderResourceApi.md#getAllOrdersUsingGET) | **GET** /api/orders | getAllOrders
[**getOrderUsingGET**](OrderResourceApi.md#getOrderUsingGET) | **GET** /api/orders/{id} | getOrder
[**updateOrderUsingPUT**](OrderResourceApi.md#updateOrderUsingPUT) | **PUT** /api/orders | updateOrder


<a name="createOrderUsingPOST"></a>
# **createOrderUsingPOST**
> Order createOrderUsingPOST(order)

createOrder

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderResourceApi apiInstance = new OrderResourceApi();
Order order = new Order(); // Order | order
try {
    Order result = apiInstance.createOrderUsingPOST(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderResourceApi#createOrderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOrderUsingDELETE"></a>
# **deleteOrderUsingDELETE**
> deleteOrderUsingDELETE(id)

deleteOrder

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderResourceApi apiInstance = new OrderResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteOrderUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderResourceApi#deleteOrderUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllOrdersUsingGET"></a>
# **getAllOrdersUsingGET**
> List&lt;Order&gt; getAllOrdersUsingGET()

getAllOrders

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderResourceApi apiInstance = new OrderResourceApi();
try {
    List<Order> result = apiInstance.getAllOrdersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderResourceApi#getAllOrdersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGET"></a>
# **getOrderUsingGET**
> Order getOrderUsingGET(id)

getOrder

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderResourceApi apiInstance = new OrderResourceApi();
Long id = 789L; // Long | id
try {
    Order result = apiInstance.getOrderUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderResourceApi#getOrderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOrderUsingPUT"></a>
# **updateOrderUsingPUT**
> Order updateOrderUsingPUT(order)

updateOrder

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderResourceApi apiInstance = new OrderResourceApi();
Order order = new Order(); // Order | order
try {
    Order result = apiInstance.updateOrderUsingPUT(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderResourceApi#updateOrderUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order |

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

