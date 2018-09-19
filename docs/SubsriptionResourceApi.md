# SubsriptionResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscriptionUsingPUT**](SubsriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
[**getActiveSubscriptionsUsingGET**](SubsriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subsriptions/subscriber/{secureId} | getActiveSubscriptions
[**getAllCompanySubscriptionsUsingGET**](SubsriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
[**getSubsriptionUsingGET**](SubsriptionResourceApi.md#getSubsriptionUsingGET) | **GET** /api/subsriptions/{id} | getSubsription
[**startSubscriptionUsingPOST**](SubsriptionResourceApi.md#startSubscriptionUsingPOST) | **POST** /api/subscriptions/start | startSubscription


<a name="cancelSubscriptionUsingPUT"></a>
# **cancelSubscriptionUsingPUT**
> Subsription cancelSubscriptionUsingPUT(cancellation)

cancelSubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubsriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubsriptionResourceApi apiInstance = new SubsriptionResourceApi();
Cancellation cancellation = new Cancellation(); // Cancellation | cancellation
try {
    Subsription result = apiInstance.cancelSubscriptionUsingPUT(cancellation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsriptionResourceApi#cancelSubscriptionUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancellation** | [**Cancellation**](Cancellation.md)| cancellation |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getActiveSubscriptionsUsingGET"></a>
# **getActiveSubscriptionsUsingGET**
> List&lt;Subsription&gt; getActiveSubscriptionsUsingGET(secureId)

getActiveSubscriptions

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubsriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubsriptionResourceApi apiInstance = new SubsriptionResourceApi();
String secureId = "secureId_example"; // String | secureId
try {
    List<Subsription> result = apiInstance.getActiveSubscriptionsUsingGET(secureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsriptionResourceApi#getActiveSubscriptionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **String**| secureId |

### Return type

[**List&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllCompanySubscriptionsUsingGET"></a>
# **getAllCompanySubscriptionsUsingGET**
> List&lt;Subsription&gt; getAllCompanySubscriptionsUsingGET(id)

getAllCompanySubscriptions

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubsriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubsriptionResourceApi apiInstance = new SubsriptionResourceApi();
String id = "id_example"; // String | id
try {
    List<Subsription> result = apiInstance.getAllCompanySubscriptionsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsriptionResourceApi#getAllCompanySubscriptionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**List&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubsriptionUsingGET"></a>
# **getSubsriptionUsingGET**
> Subsription getSubsriptionUsingGET(id)

getSubsription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubsriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubsriptionResourceApi apiInstance = new SubsriptionResourceApi();
Long id = 789L; // Long | id
try {
    Subsription result = apiInstance.getSubsriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsriptionResourceApi#getSubsriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="startSubscriptionUsingPOST"></a>
# **startSubscriptionUsingPOST**
> StartSubscriptionResult startSubscriptionUsingPOST(request)

startSubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubsriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubsriptionResourceApi apiInstance = new SubsriptionResourceApi();
StartSubscriptionRequest request = new StartSubscriptionRequest(); // StartSubscriptionRequest | request
try {
    StartSubscriptionResult result = apiInstance.startSubscriptionUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubsriptionResourceApi#startSubscriptionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartSubscriptionRequest**](StartSubscriptionRequest.md)| request |

### Return type

[**StartSubscriptionResult**](StartSubscriptionResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

