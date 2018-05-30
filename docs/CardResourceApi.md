# CardResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCardUsingPOST**](CardResourceApi.md#createCardUsingPOST) | **POST** /api/cards | createCard
[**deleteCardUsingDELETE**](CardResourceApi.md#deleteCardUsingDELETE) | **DELETE** /api/cards/{id} | deleteCard
[**getAllCardsUsingGET**](CardResourceApi.md#getAllCardsUsingGET) | **GET** /api/cards | getAllCards
[**getCardUsingGET**](CardResourceApi.md#getCardUsingGET) | **GET** /api/cards/{id} | getCard
[**updateCardUsingPUT**](CardResourceApi.md#updateCardUsingPUT) | **PUT** /api/cards | updateCard


<a name="createCardUsingPOST"></a>
# **createCardUsingPOST**
> SavedCard createCardUsingPOST(card)

createCard

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
SavedCard card = new SavedCard(); // SavedCard | card
try {
    SavedCard result = apiInstance.createCardUsingPOST(card);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#createCardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**SavedCard**](SavedCard.md)| card |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCardUsingDELETE"></a>
# **deleteCardUsingDELETE**
> deleteCardUsingDELETE(id)

deleteCard

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteCardUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#deleteCardUsingDELETE");
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

<a name="getAllCardsUsingGET"></a>
# **getAllCardsUsingGET**
> List&lt;SavedCard&gt; getAllCardsUsingGET()

getAllCards

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
try {
    List<SavedCard> result = apiInstance.getAllCardsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#getAllCardsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SavedCard&gt;**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCardUsingGET"></a>
# **getCardUsingGET**
> SavedCard getCardUsingGET(id)

getCard

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
Long id = 789L; // Long | id
try {
    SavedCard result = apiInstance.getCardUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#getCardUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCardUsingPUT"></a>
# **updateCardUsingPUT**
> SavedCard updateCardUsingPUT(card)

updateCard

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
SavedCard card = new SavedCard(); // SavedCard | card
try {
    SavedCard result = apiInstance.updateCardUsingPUT(card);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#updateCardUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | [**SavedCard**](SavedCard.md)| card |

### Return type

[**SavedCard**](SavedCard.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

