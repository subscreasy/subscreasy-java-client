# SubscriptionResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscriptionUsingPUT**](SubscriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
[**getActiveSubscriptionsByEmailUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsByEmailUsingGET) | **GET** /api/subscriptions/subscriber/email/{email} | getActiveSubscriptionsByEmail
[**getActiveSubscriptionsUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subscriptions/subscriber/{secureId} | getActiveSubscriptions
[**getAllCompanySubscriptionsUsingGET**](SubscriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
[**getSubscriptionUsingGET**](SubscriptionResourceApi.md#getSubscriptionUsingGET) | **GET** /api/subscriptions/{id} | getSubscription
[**startSubscriptionUsingPOST**](SubscriptionResourceApi.md#startSubscriptionUsingPOST) | **POST** /api/subscriptions/start | startSubscription


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
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
Cancellation cancellation = new Cancellation(); // Cancellation | cancellation
try {
    Subsription result = apiInstance.cancelSubscriptionUsingPUT(cancellation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#cancelSubscriptionUsingPUT");
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

<a name="getActiveSubscriptionsByEmailUsingGET"></a>
# **getActiveSubscriptionsByEmailUsingGET**
> List&lt;Subsription&gt; getActiveSubscriptionsByEmailUsingGET(email)

getActiveSubscriptionsByEmail

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
String email = "email_example"; // String | email
try {
    List<Subsription> result = apiInstance.getActiveSubscriptionsByEmailUsingGET(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getActiveSubscriptionsByEmailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| email |

### Return type

[**List&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
String secureId = "secureId_example"; // String | secureId
try {
    List<Subsription> result = apiInstance.getActiveSubscriptionsUsingGET(secureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getActiveSubscriptionsUsingGET");
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
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
String id = "id_example"; // String | id
try {
    List<Subsription> result = apiInstance.getAllCompanySubscriptionsUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getAllCompanySubscriptionsUsingGET");
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

<a name="getSubscriptionUsingGET"></a>
# **getSubscriptionUsingGET**
> Subsription getSubscriptionUsingGET(id)

getSubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
Long id = 789L; // Long | id
try {
    Subsription result = apiInstance.getSubscriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getSubscriptionUsingGET");
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
//import com.kodfarki.subscreasy.client.SubscriptionResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriptionResourceApi apiInstance = new SubscriptionResourceApi();
StartSubscriptionRequest request = new StartSubscriptionRequest(); // StartSubscriptionRequest | request
try {
    StartSubscriptionResult result = apiInstance.startSubscriptionUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#startSubscriptionUsingPOST");
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

