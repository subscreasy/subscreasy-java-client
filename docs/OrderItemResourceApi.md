# OrderItemResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderItemUsingPOST**](OrderItemResourceApi.md#createOrderItemUsingPOST) | **POST** /api/order-items | createOrderItem
[**deleteOrderItemUsingDELETE**](OrderItemResourceApi.md#deleteOrderItemUsingDELETE) | **DELETE** /api/order-items/{id} | deleteOrderItem
[**getAllOrderItemsUsingGET**](OrderItemResourceApi.md#getAllOrderItemsUsingGET) | **GET** /api/order-items | getAllOrderItems
[**getOrderItemUsingGET**](OrderItemResourceApi.md#getOrderItemUsingGET) | **GET** /api/order-items/{id} | getOrderItem
[**updateOrderItemUsingPUT**](OrderItemResourceApi.md#updateOrderItemUsingPUT) | **PUT** /api/order-items | updateOrderItem


<a name="createOrderItemUsingPOST"></a>
# **createOrderItemUsingPOST**
> OrderItem createOrderItemUsingPOST(orderItem)

createOrderItem

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderItemResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderItemResourceApi apiInstance = new OrderItemResourceApi();
OrderItem orderItem = new OrderItem(); // OrderItem | orderItem
try {
    OrderItem result = apiInstance.createOrderItemUsingPOST(orderItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemResourceApi#createOrderItemUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItem** | [**OrderItem**](OrderItem.md)| orderItem |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOrderItemUsingDELETE"></a>
# **deleteOrderItemUsingDELETE**
> deleteOrderItemUsingDELETE(id)

deleteOrderItem

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderItemResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderItemResourceApi apiInstance = new OrderItemResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteOrderItemUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemResourceApi#deleteOrderItemUsingDELETE");
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

<a name="getAllOrderItemsUsingGET"></a>
# **getAllOrderItemsUsingGET**
> List&lt;OrderItem&gt; getAllOrderItemsUsingGET()

getAllOrderItems

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderItemResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderItemResourceApi apiInstance = new OrderItemResourceApi();
try {
    List<OrderItem> result = apiInstance.getAllOrderItemsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemResourceApi#getAllOrderItemsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OrderItem&gt;**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderItemUsingGET"></a>
# **getOrderItemUsingGET**
> OrderItem getOrderItemUsingGET(id)

getOrderItem

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderItemResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderItemResourceApi apiInstance = new OrderItemResourceApi();
Long id = 789L; // Long | id
try {
    OrderItem result = apiInstance.getOrderItemUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemResourceApi#getOrderItemUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOrderItemUsingPUT"></a>
# **updateOrderItemUsingPUT**
> OrderItem updateOrderItemUsingPUT(orderItem)

updateOrderItem

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OrderItemResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OrderItemResourceApi apiInstance = new OrderItemResourceApi();
OrderItem orderItem = new OrderItem(); // OrderItem | orderItem
try {
    OrderItem result = apiInstance.updateOrderItemUsingPUT(orderItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderItemResourceApi#updateOrderItemUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderItem** | [**OrderItem**](OrderItem.md)| orderItem |

### Return type

[**OrderItem**](OrderItem.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

