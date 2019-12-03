# HistoryResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHistoryUsingPOST**](HistoryResourceApi.md#createHistoryUsingPOST) | **POST** /api/histories | createHistory
[**deleteHistoryUsingDELETE**](HistoryResourceApi.md#deleteHistoryUsingDELETE) | **DELETE** /api/histories/{id} | deleteHistory
[**getAllHistoriesUsingGET**](HistoryResourceApi.md#getAllHistoriesUsingGET) | **GET** /api/histories | getAllHistories
[**getHistoryUsingGET**](HistoryResourceApi.md#getHistoryUsingGET) | **GET** /api/histories/{id} | getHistory
[**updateHistoryUsingPUT**](HistoryResourceApi.md#updateHistoryUsingPUT) | **PUT** /api/histories | updateHistory


<a name="createHistoryUsingPOST"></a>
# **createHistoryUsingPOST**
> History createHistoryUsingPOST(history)

createHistory

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.HistoryResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

HistoryResourceApi apiInstance = new HistoryResourceApi();
History history = new History(); // History | history
try {
    History result = apiInstance.createHistoryUsingPOST(history);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryResourceApi#createHistoryUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history** | [**History**](History.md)| history |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteHistoryUsingDELETE"></a>
# **deleteHistoryUsingDELETE**
> deleteHistoryUsingDELETE(id)

deleteHistory

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.HistoryResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

HistoryResourceApi apiInstance = new HistoryResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteHistoryUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryResourceApi#deleteHistoryUsingDELETE");
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

<a name="getAllHistoriesUsingGET"></a>
# **getAllHistoriesUsingGET**
> List&lt;History&gt; getAllHistoriesUsingGET()

getAllHistories

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.HistoryResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

HistoryResourceApi apiInstance = new HistoryResourceApi();
try {
    List<History> result = apiInstance.getAllHistoriesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryResourceApi#getAllHistoriesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;History&gt;**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHistoryUsingGET"></a>
# **getHistoryUsingGET**
> History getHistoryUsingGET(id)

getHistory

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.HistoryResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

HistoryResourceApi apiInstance = new HistoryResourceApi();
Long id = 789L; // Long | id
try {
    History result = apiInstance.getHistoryUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryResourceApi#getHistoryUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateHistoryUsingPUT"></a>
# **updateHistoryUsingPUT**
> History updateHistoryUsingPUT(history)

updateHistory

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.HistoryResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

HistoryResourceApi apiInstance = new HistoryResourceApi();
History history = new History(); // History | history
try {
    History result = apiInstance.updateHistoryUsingPUT(history);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoryResourceApi#updateHistoryUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history** | [**History**](History.md)| history |

### Return type

[**History**](History.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

