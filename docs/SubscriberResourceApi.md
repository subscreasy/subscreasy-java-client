# SubscriberResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriberUsingPOST**](SubscriberResourceApi.md#createSubscriberUsingPOST) | **POST** /api/subscribers | createSubscriber
[**deleteSubscriberUsingDELETE**](SubscriberResourceApi.md#deleteSubscriberUsingDELETE) | **DELETE** /api/subscribers/{id} | deleteSubscriber
[**findAllSubscribersUsingGET**](SubscriberResourceApi.md#findAllSubscribersUsingGET) | **GET** /api/subscribers/find-all | findAllSubscribers
[**getAllSubscribersUsingGET**](SubscriberResourceApi.md#getAllSubscribersUsingGET) | **GET** /api/subscribers | getAllSubscribers
[**getSubscriberByEmailUsingGET**](SubscriberResourceApi.md#getSubscriberByEmailUsingGET) | **GET** /api/subscribers/email/{email} | getSubscriberByEmail
[**getSubscriberByNameUsingGET**](SubscriberResourceApi.md#getSubscriberByNameUsingGET) | **GET** /api/subscribers/name/{name} | getSubscriberByName
[**getSubscriberBySecureIdUsingGET**](SubscriberResourceApi.md#getSubscriberBySecureIdUsingGET) | **GET** /api/subscribers/secureId/{secureId} | getSubscriberBySecureId
[**getSubscriberUsingGET**](SubscriberResourceApi.md#getSubscriberUsingGET) | **GET** /api/subscribers/{id} | getSubscriber
[**updateSubscriberUsingPUT**](SubscriberResourceApi.md#updateSubscriberUsingPUT) | **PUT** /api/subscribers | updateSubscriber


<a name="createSubscriberUsingPOST"></a>
# **createSubscriberUsingPOST**
> Subscriber createSubscriberUsingPOST(subscriber)

createSubscriber

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
Subscriber subscriber = new Subscriber(); // Subscriber | subscriber
try {
    Subscriber result = apiInstance.createSubscriberUsingPOST(subscriber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#createSubscriberUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriber** | [**Subscriber**](Subscriber.md)| subscriber |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSubscriberUsingDELETE"></a>
# **deleteSubscriberUsingDELETE**
> deleteSubscriberUsingDELETE(id)

deleteSubscriber

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteSubscriberUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#deleteSubscriberUsingDELETE");
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

<a name="findAllSubscribersUsingGET"></a>
# **findAllSubscribersUsingGET**
> List&lt;Subscriber&gt; findAllSubscribersUsingGET()

findAllSubscribers

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
try {
    List<Subscriber> result = apiInstance.findAllSubscribersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#findAllSubscribersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllSubscribersUsingGET"></a>
# **getAllSubscribersUsingGET**
> List&lt;Subscriber&gt; getAllSubscribersUsingGET(page, size, sort)

getAllSubscribers

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subscriber> result = apiInstance.getAllSubscribersUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#getAllSubscribersUsingGET");
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

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByEmailUsingGET"></a>
# **getSubscriberByEmailUsingGET**
> List&lt;Subscriber&gt; getSubscriberByEmailUsingGET(email, page, size, sort)

getSubscriberByEmail

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
String email = "email_example"; // String | email
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subscriber> result = apiInstance.getSubscriberByEmailUsingGET(email, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#getSubscriberByEmailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| email |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberByNameUsingGET"></a>
# **getSubscriberByNameUsingGET**
> List&lt;Subscriber&gt; getSubscriberByNameUsingGET(name, page, size, sort)

getSubscriberByName

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
String name = "name_example"; // String | name
Integer page = 56; // Integer | Page number of the requested page
Integer size = 56; // Integer | Size of a page
List<String> sort = Arrays.asList("sort_example"); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
try {
    List<Subscriber> result = apiInstance.getSubscriberByNameUsingGET(name, page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#getSubscriberByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |
 **page** | **Integer**| Page number of the requested page | [optional]
 **size** | **Integer**| Size of a page | [optional]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**List&lt;Subscriber&gt;**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberBySecureIdUsingGET"></a>
# **getSubscriberBySecureIdUsingGET**
> Subscriber getSubscriberBySecureIdUsingGET(secureId)

getSubscriberBySecureId

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
String secureId = "secureId_example"; // String | secureId
try {
    Subscriber result = apiInstance.getSubscriberBySecureIdUsingGET(secureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#getSubscriberBySecureIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **String**| secureId |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSubscriberUsingGET"></a>
# **getSubscriberUsingGET**
> Subscriber getSubscriberUsingGET(id)

getSubscriber

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
Long id = 789L; // Long | id
try {
    Subscriber result = apiInstance.getSubscriberUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#getSubscriberUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSubscriberUsingPUT"></a>
# **updateSubscriberUsingPUT**
> Subscriber updateSubscriberUsingPUT(subscriber)

updateSubscriber

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.SubscriberResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

SubscriberResourceApi apiInstance = new SubscriberResourceApi();
Subscriber subscriber = new Subscriber(); // Subscriber | subscriber
try {
    Subscriber result = apiInstance.updateSubscriberUsingPUT(subscriber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriberResourceApi#updateSubscriberUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriber** | [**Subscriber**](Subscriber.md)| subscriber |

### Return type

[**Subscriber**](Subscriber.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

