# MessageTemplateResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessageTemplateUsingPOST**](MessageTemplateResourceApi.md#createMessageTemplateUsingPOST) | **POST** /api/message-templates | createMessageTemplate
[**deleteMessageTemplateUsingDELETE**](MessageTemplateResourceApi.md#deleteMessageTemplateUsingDELETE) | **DELETE** /api/message-templates/{id} | deleteMessageTemplate
[**getAllMessageTemplatesUsingGET**](MessageTemplateResourceApi.md#getAllMessageTemplatesUsingGET) | **GET** /api/message-templates | getAllMessageTemplates
[**getMessageTemplateUsingGET1**](MessageTemplateResourceApi.md#getMessageTemplateUsingGET1) | **GET** /api/message-templates/{id} | getMessageTemplate
[**updateMessageTemplateUsingPUT**](MessageTemplateResourceApi.md#updateMessageTemplateUsingPUT) | **PUT** /api/message-templates | updateMessageTemplate


<a name="createMessageTemplateUsingPOST"></a>
# **createMessageTemplateUsingPOST**
> MessageTemplate createMessageTemplateUsingPOST(messageTemplate)

createMessageTemplate

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.MessageTemplateResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MessageTemplateResourceApi apiInstance = new MessageTemplateResourceApi();
MessageTemplate messageTemplate = new MessageTemplate(); // MessageTemplate | messageTemplate
try {
    MessageTemplate result = apiInstance.createMessageTemplateUsingPOST(messageTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateResourceApi#createMessageTemplateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageTemplate** | [**MessageTemplate**](MessageTemplate.md)| messageTemplate |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteMessageTemplateUsingDELETE"></a>
# **deleteMessageTemplateUsingDELETE**
> deleteMessageTemplateUsingDELETE(id)

deleteMessageTemplate

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.MessageTemplateResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MessageTemplateResourceApi apiInstance = new MessageTemplateResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteMessageTemplateUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateResourceApi#deleteMessageTemplateUsingDELETE");
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

<a name="getAllMessageTemplatesUsingGET"></a>
# **getAllMessageTemplatesUsingGET**
> List&lt;MessageTemplate&gt; getAllMessageTemplatesUsingGET()

getAllMessageTemplates

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.MessageTemplateResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MessageTemplateResourceApi apiInstance = new MessageTemplateResourceApi();
try {
    List<MessageTemplate> result = apiInstance.getAllMessageTemplatesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateResourceApi#getAllMessageTemplatesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MessageTemplate&gt;**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMessageTemplateUsingGET1"></a>
# **getMessageTemplateUsingGET1**
> MessageTemplate getMessageTemplateUsingGET1(id)

getMessageTemplate

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.MessageTemplateResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MessageTemplateResourceApi apiInstance = new MessageTemplateResourceApi();
Long id = 789L; // Long | id
try {
    MessageTemplate result = apiInstance.getMessageTemplateUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateResourceApi#getMessageTemplateUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateMessageTemplateUsingPUT"></a>
# **updateMessageTemplateUsingPUT**
> MessageTemplate updateMessageTemplateUsingPUT(messageTemplate)

updateMessageTemplate

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.MessageTemplateResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MessageTemplateResourceApi apiInstance = new MessageTemplateResourceApi();
MessageTemplate messageTemplate = new MessageTemplate(); // MessageTemplate | messageTemplate
try {
    MessageTemplate result = apiInstance.updateMessageTemplateUsingPUT(messageTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageTemplateResourceApi#updateMessageTemplateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageTemplate** | [**MessageTemplate**](MessageTemplate.md)| messageTemplate |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

