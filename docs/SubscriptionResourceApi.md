# SubscriptionResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelSubscriptionUsingPUT**](SubscriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
[**changePaymentMethodUsingPUT**](SubscriptionResourceApi.md#changePaymentMethodUsingPUT) | **PUT** /api/subscriptions/change-payment-method/{subscriptionId} | changePaymentMethod
[**chargeEarlyUsingPUT**](SubscriptionResourceApi.md#chargeEarlyUsingPUT) | **PUT** /api/subscriptions/charge/{subscriptionId} | chargeEarly
[**getActiveSubscriptionsByEmailUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsByEmailUsingGET) | **GET** /api/subscriptions/subscriber/email/{email} | getActiveSubscriptionsByEmail
[**getActiveSubscriptionsUsingGET**](SubscriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subscriptions/subscriber/{secureId} | getActiveSubscriptions
[**getAllCompanySubscriptionsUsingGET**](SubscriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
[**getAllSubscriptionsByOfferUsingGET**](SubscriptionResourceApi.md#getAllSubscriptionsByOfferUsingGET) | **GET** /api/subscriptions/offer/{id} | getAllSubscriptionsByOffer
[**getSubscriptionUsingGET**](SubscriptionResourceApi.md#getSubscriptionUsingGET) | **GET** /api/subscriptions/{id} | getSubscription
[**getSubscriptionsByMerchantSubscriberIdUsingGET**](SubscriptionResourceApi.md#getSubscriptionsByMerchantSubscriberIdUsingGET) | **GET** /api/subscriptions/subscriber/m/{merchantSubscriberId} | getSubscriptionsByMerchantSubscriberId
[**getSubscriptionsByStatusUsingGET**](SubscriptionResourceApi.md#getSubscriptionsByStatusUsingGET) | **GET** /api/subscriptions/status/{status} | getSubscriptionsByStatus
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

<a name="changePaymentMethodUsingPUT"></a>
# **changePaymentMethodUsingPUT**
> Subsription changePaymentMethodUsingPUT(subscriptionId)

changePaymentMethod

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
Long subscriptionId = 789L; // Long | subscriptionId
try {
    Subsription result = apiInstance.changePaymentMethodUsingPUT(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#changePaymentMethodUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**| subscriptionId |

### Return type

[**Subsription**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="chargeEarlyUsingPUT"></a>
# **chargeEarlyUsingPUT**
> Job chargeEarlyUsingPUT(subscriptionId)

chargeEarly

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
Long subscriptionId = 789L; // Long | subscriptionId
try {
    Job result = apiInstance.chargeEarlyUsingPUT(subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#chargeEarlyUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **Long**| subscriptionId |

### Return type

[**Job**](Job.md)

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

<a name="getAllSubscriptionsByOfferUsingGET"></a>
# **getAllSubscriptionsByOfferUsingGET**
> List&lt;Subsription&gt; getAllSubscriptionsByOfferUsingGET(id, page, size, sort)

getAllSubscriptionsByOffer

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
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subsription> result = apiInstance.getAllSubscriptionsByOfferUsingGET(id, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getAllSubscriptionsByOfferUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

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

<a name="getSubscriptionsByMerchantSubscriberIdUsingGET"></a>
# **getSubscriptionsByMerchantSubscriberIdUsingGET**
> List&lt;Subsription&gt; getSubscriptionsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort)

getSubscriptionsByMerchantSubscriberId

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
String merchantSubscriberId = "merchantSubscriberId_example"; // String | merchantSubscriberId
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subsription> result = apiInstance.getSubscriptionsByMerchantSubscriberIdUsingGET(merchantSubscriberId, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getSubscriptionsByMerchantSubscriberIdUsingGET");
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

[**List&lt;Subsription&gt;**](Subsription.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriptionsByStatusUsingGET"></a>
# **getSubscriptionsByStatusUsingGET**
> List&lt;Subsription&gt; getSubscriptionsByStatusUsingGET(status, page, size, sort)

getSubscriptionsByStatus

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
String status = "status_example"; // String | status
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subsription> result = apiInstance.getSubscriptionsByStatusUsingGET(status, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionResourceApi#getSubscriptionsByStatusUsingGET");
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

[**List&lt;Subsription&gt;**](Subsription.md)

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

