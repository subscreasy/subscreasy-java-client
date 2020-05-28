# ChargingLogResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChargingLogUsingPOST**](ChargingLogResourceApi.md#createChargingLogUsingPOST) | **POST** /api/charging-logs | createChargingLog
[**deleteChargingLogUsingDELETE**](ChargingLogResourceApi.md#deleteChargingLogUsingDELETE) | **DELETE** /api/charging-logs/{id} | deleteChargingLog
[**getAllChargingLogsUsingGET**](ChargingLogResourceApi.md#getAllChargingLogsUsingGET) | **GET** /api/charging-logs | getAllChargingLogs
[**getChargingLogUsingGET**](ChargingLogResourceApi.md#getChargingLogUsingGET) | **GET** /api/charging-logs/{id} | getChargingLog
[**getChargingLogsByStatusUsingGET**](ChargingLogResourceApi.md#getChargingLogsByStatusUsingGET) | **GET** /api/charging-logs/status/{status} | getChargingLogsByStatus
[**getPaymentsByMerchantSubscriberIdUsingGET**](ChargingLogResourceApi.md#getPaymentsByMerchantSubscriberIdUsingGET) | **GET** /api/charging-logs/subscriber/m/{merchantSubscriberId} | getPaymentsByMerchantSubscriberId
[**getPaymentsBySubscriberIdUsingGET**](ChargingLogResourceApi.md#getPaymentsBySubscriberIdUsingGET) | **GET** /api/charging-logs/subscriber/id/{subscriberId} | getPaymentsBySubscriberId
[**getPaymentsBySubscriberIdUsingGET1**](ChargingLogResourceApi.md#getPaymentsBySubscriberIdUsingGET1) | **GET** /api/charging-logs/subscriber/{subscriberSecureId} | getPaymentsBySubscriberId
[**getPaymentsBySubscriptionUsingGET**](ChargingLogResourceApi.md#getPaymentsBySubscriptionUsingGET) | **GET** /api/charging-logs/subscription/{id} | getPaymentsBySubscription
[**refundUsingPOST**](ChargingLogResourceApi.md#refundUsingPOST) | **POST** /api/charging-logs/refund/{chargingLogId} | refund
[**updateChargingLogUsingPUT**](ChargingLogResourceApi.md#updateChargingLogUsingPUT) | **PUT** /api/charging-logs | updateChargingLog


<a name="createChargingLogUsingPOST"></a>
# **createChargingLogUsingPOST**
> ChargingLog createChargingLogUsingPOST(chargingLog)

createChargingLog

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
ChargingLog chargingLog = new ChargingLog(); // ChargingLog | chargingLog
try {
    ChargingLog result = apiInstance.createChargingLogUsingPOST(chargingLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#createChargingLogUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLog** | [**ChargingLog**](ChargingLog.md)| chargingLog |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteChargingLogUsingDELETE"></a>
# **deleteChargingLogUsingDELETE**
> deleteChargingLogUsingDELETE(id)

deleteChargingLog

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteChargingLogUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#deleteChargingLogUsingDELETE");
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

<a name="getAllChargingLogsUsingGET"></a>
# **getAllChargingLogsUsingGET**
> List&lt;ChargingLog&gt; getAllChargingLogsUsingGET(page, size, sort)

getAllChargingLogs

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<ChargingLog> result = apiInstance.getAllChargingLogsUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getAllChargingLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogUsingGET"></a>
# **getChargingLogUsingGET**
> ChargingLog getChargingLogUsingGET(id)

getChargingLog

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Long id = 789L; // Long | id
try {
    ChargingLog result = apiInstance.getChargingLogUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getChargingLogUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogsByStatusUsingGET"></a>
# **getChargingLogsByStatusUsingGET**
> List&lt;ChargingLog&gt; getChargingLogsByStatusUsingGET(status, page, size, sort)

getChargingLogsByStatus

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
String status = "status_example"; // String | status
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<ChargingLog> result = apiInstance.getChargingLogsByStatusUsingGET(status, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getChargingLogsByStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**| status |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaymentsByMerchantSubscriberIdUsingGET"></a>
# **getPaymentsByMerchantSubscriberIdUsingGET**
> List&lt;ChargingLog&gt; getPaymentsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)

getPaymentsByMerchantSubscriberId

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
String merchantSubscriberId = "merchantSubscriberId_example"; // String | merchantSubscriberId
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<ChargingLog> result = apiInstance.getPaymentsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getPaymentsByMerchantSubscriberIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantSubscriberId** | **String**| merchantSubscriberId |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaymentsBySubscriberIdUsingGET"></a>
# **getPaymentsBySubscriberIdUsingGET**
> List&lt;ChargingLog&gt; getPaymentsBySubscriberIdUsingGET(subscriberId, page, size, sort)

getPaymentsBySubscriberId

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Long subscriberId = 789L; // Long | subscriberId
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<ChargingLog> result = apiInstance.getPaymentsBySubscriberIdUsingGET(subscriberId, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getPaymentsBySubscriberIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriberId** | **Long**| subscriberId |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaymentsBySubscriberIdUsingGET1"></a>
# **getPaymentsBySubscriberIdUsingGET1**
> List&lt;ChargingLog&gt; getPaymentsBySubscriberIdUsingGET1(subscriberSecureId, page, size, sort)

getPaymentsBySubscriberId

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
String subscriberSecureId = "subscriberSecureId_example"; // String | subscriberSecureId
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<ChargingLog> result = apiInstance.getPaymentsBySubscriberIdUsingGET1(subscriberSecureId, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getPaymentsBySubscriberIdUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriberSecureId** | **String**| subscriberSecureId |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPaymentsBySubscriptionUsingGET"></a>
# **getPaymentsBySubscriptionUsingGET**
> List&lt;ChargingLog&gt; getPaymentsBySubscriptionUsingGET(id)

getPaymentsBySubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Long id = 789L; // Long | id
try {
    List<ChargingLog> result = apiInstance.getPaymentsBySubscriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#getPaymentsBySubscriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="refundUsingPOST"></a>
# **refundUsingPOST**
> ChargingLog refundUsingPOST(chargingLogId)

refund

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
Long chargingLogId = 789L; // Long | chargingLogId
try {
    ChargingLog result = apiInstance.refundUsingPOST(chargingLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#refundUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLogId** | **Long**| chargingLogId |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateChargingLogUsingPUT"></a>
# **updateChargingLogUsingPUT**
> ChargingLog updateChargingLogUsingPUT(chargingLog)

updateChargingLog

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ChargingLogResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ChargingLogResourceApi apiInstance = new ChargingLogResourceApi();
ChargingLog chargingLog = new ChargingLog(); // ChargingLog | chargingLog
try {
    ChargingLog result = apiInstance.updateChargingLogUsingPUT(chargingLog);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargingLogResourceApi#updateChargingLogUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargingLog** | [**ChargingLog**](ChargingLog.md)| chargingLog |

### Return type

[**ChargingLog**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

