# WebHookResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebHookUsingPOST**](WebHookResourceApi.md#createWebHookUsingPOST) | **POST** /api/web-hooks | createWebHook
[**deleteWebHookUsingDELETE**](WebHookResourceApi.md#deleteWebHookUsingDELETE) | **DELETE** /api/web-hooks/{id} | deleteWebHook
[**getAllWebHooksUsingGET**](WebHookResourceApi.md#getAllWebHooksUsingGET) | **GET** /api/web-hooks | getAllWebHooks
[**getWebHookUsingGET**](WebHookResourceApi.md#getWebHookUsingGET) | **GET** /api/web-hooks/{id} | getWebHook
[**updateWebHookUsingPUT**](WebHookResourceApi.md#updateWebHookUsingPUT) | **PUT** /api/web-hooks | updateWebHook


<a name="createWebHookUsingPOST"></a>
# **createWebHookUsingPOST**
> WebHook createWebHookUsingPOST(webHook)

createWebHook

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.WebHookResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebHookResourceApi apiInstance = new WebHookResourceApi();
WebHook webHook = new WebHook(); // WebHook | webHook
try {
    WebHook result = apiInstance.createWebHookUsingPOST(webHook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookResourceApi#createWebHookUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webHook** | [**WebHook**](WebHook.md)| webHook |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteWebHookUsingDELETE"></a>
# **deleteWebHookUsingDELETE**
> deleteWebHookUsingDELETE(id)

deleteWebHook

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.WebHookResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebHookResourceApi apiInstance = new WebHookResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteWebHookUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookResourceApi#deleteWebHookUsingDELETE");
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

<a name="getAllWebHooksUsingGET"></a>
# **getAllWebHooksUsingGET**
> List&lt;WebHook&gt; getAllWebHooksUsingGET()

getAllWebHooks

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.WebHookResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebHookResourceApi apiInstance = new WebHookResourceApi();
try {
    List<WebHook> result = apiInstance.getAllWebHooksUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookResourceApi#getAllWebHooksUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WebHook&gt;**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getWebHookUsingGET"></a>
# **getWebHookUsingGET**
> WebHook getWebHookUsingGET(id)

getWebHook

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.WebHookResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebHookResourceApi apiInstance = new WebHookResourceApi();
Long id = 789L; // Long | id
try {
    WebHook result = apiInstance.getWebHookUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookResourceApi#getWebHookUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateWebHookUsingPUT"></a>
# **updateWebHookUsingPUT**
> WebHook updateWebHookUsingPUT(webHook)

updateWebHook

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.WebHookResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

WebHookResourceApi apiInstance = new WebHookResourceApi();
WebHook webHook = new WebHook(); // WebHook | webHook
try {
    WebHook result = apiInstance.updateWebHookUsingPUT(webHook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookResourceApi#updateWebHookUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webHook** | [**WebHook**](WebHook.md)| webHook |

### Return type

[**WebHook**](WebHook.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

