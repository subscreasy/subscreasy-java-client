# UsageNotificationResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsageNotificationUsingPOST**](UsageNotificationResourceApi.md#createUsageNotificationUsingPOST) | **POST** /api/usage-notifications | createUsageNotification
[**deleteUsageNotificationUsingDELETE**](UsageNotificationResourceApi.md#deleteUsageNotificationUsingDELETE) | **DELETE** /api/usage-notifications/{id} | deleteUsageNotification
[**getAllUsageNotificationsUsingGET**](UsageNotificationResourceApi.md#getAllUsageNotificationsUsingGET) | **GET** /api/usage-notifications | getAllUsageNotifications
[**getUsageNotificationUsingGET**](UsageNotificationResourceApi.md#getUsageNotificationUsingGET) | **GET** /api/usage-notifications/{id} | getUsageNotification
[**updateUsageNotificationUsingPUT**](UsageNotificationResourceApi.md#updateUsageNotificationUsingPUT) | **PUT** /api/usage-notifications | updateUsageNotification


<a name="createUsageNotificationUsingPOST"></a>
# **createUsageNotificationUsingPOST**
> UsageNotification createUsageNotificationUsingPOST(usageNotification)

createUsageNotification

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UsageNotificationResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UsageNotificationResourceApi apiInstance = new UsageNotificationResourceApi();
UsageNotification usageNotification = new UsageNotification(); // UsageNotification | usageNotification
try {
    UsageNotification result = apiInstance.createUsageNotificationUsingPOST(usageNotification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageNotificationResourceApi#createUsageNotificationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageNotification** | [**UsageNotification**](UsageNotification.md)| usageNotification |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsageNotificationUsingDELETE"></a>
# **deleteUsageNotificationUsingDELETE**
> deleteUsageNotificationUsingDELETE(id)

deleteUsageNotification

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UsageNotificationResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UsageNotificationResourceApi apiInstance = new UsageNotificationResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteUsageNotificationUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageNotificationResourceApi#deleteUsageNotificationUsingDELETE");
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

<a name="getAllUsageNotificationsUsingGET"></a>
# **getAllUsageNotificationsUsingGET**
> List&lt;UsageNotification&gt; getAllUsageNotificationsUsingGET()

getAllUsageNotifications

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UsageNotificationResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UsageNotificationResourceApi apiInstance = new UsageNotificationResourceApi();
try {
    List<UsageNotification> result = apiInstance.getAllUsageNotificationsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageNotificationResourceApi#getAllUsageNotificationsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UsageNotification&gt;**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getUsageNotificationUsingGET"></a>
# **getUsageNotificationUsingGET**
> UsageNotification getUsageNotificationUsingGET(id)

getUsageNotification

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UsageNotificationResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UsageNotificationResourceApi apiInstance = new UsageNotificationResourceApi();
Long id = 789L; // Long | id
try {
    UsageNotification result = apiInstance.getUsageNotificationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageNotificationResourceApi#getUsageNotificationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsageNotificationUsingPUT"></a>
# **updateUsageNotificationUsingPUT**
> UsageNotification updateUsageNotificationUsingPUT(usageNotification)

updateUsageNotification

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UsageNotificationResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UsageNotificationResourceApi apiInstance = new UsageNotificationResourceApi();
UsageNotification usageNotification = new UsageNotification(); // UsageNotification | usageNotification
try {
    UsageNotification result = apiInstance.updateUsageNotificationUsingPUT(usageNotification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsageNotificationResourceApi#updateUsageNotificationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageNotification** | [**UsageNotification**](UsageNotification.md)| usageNotification |

### Return type

[**UsageNotification**](UsageNotification.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

