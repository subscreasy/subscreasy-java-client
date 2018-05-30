# OfferResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOfferUsingPOST**](OfferResourceApi.md#createOfferUsingPOST) | **POST** /api/offers | createOffer
[**deleteOfferUsingDELETE**](OfferResourceApi.md#deleteOfferUsingDELETE) | **DELETE** /api/offers/{id} | deleteOffer
[**getAllOffersUsingGET**](OfferResourceApi.md#getAllOffersUsingGET) | **GET** /api/offers | getAllOffers
[**getOfferUsingGET**](OfferResourceApi.md#getOfferUsingGET) | **GET** /api/offers/{id} | getOffer
[**updateOfferUsingPUT**](OfferResourceApi.md#updateOfferUsingPUT) | **PUT** /api/offers | updateOffer


<a name="createOfferUsingPOST"></a>
# **createOfferUsingPOST**
> Offer createOfferUsingPOST(offer)

createOffer

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OfferResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OfferResourceApi apiInstance = new OfferResourceApi();
Offer offer = new Offer(); // Offer | offer
try {
    Offer result = apiInstance.createOfferUsingPOST(offer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferResourceApi#createOfferUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | [**Offer**](Offer.md)| offer |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOfferUsingDELETE"></a>
# **deleteOfferUsingDELETE**
> deleteOfferUsingDELETE(id)

deleteOffer

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OfferResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OfferResourceApi apiInstance = new OfferResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteOfferUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferResourceApi#deleteOfferUsingDELETE");
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

<a name="getAllOffersUsingGET"></a>
# **getAllOffersUsingGET**
> List&lt;Offer&gt; getAllOffersUsingGET()

getAllOffers

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OfferResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OfferResourceApi apiInstance = new OfferResourceApi();
try {
    List<Offer> result = apiInstance.getAllOffersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferResourceApi#getAllOffersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Offer&gt;**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOfferUsingGET"></a>
# **getOfferUsingGET**
> Offer getOfferUsingGET(id)

getOffer

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OfferResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OfferResourceApi apiInstance = new OfferResourceApi();
Long id = 789L; // Long | id
try {
    Offer result = apiInstance.getOfferUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferResourceApi#getOfferUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOfferUsingPUT"></a>
# **updateOfferUsingPUT**
> Offer updateOfferUsingPUT(offer)

updateOffer

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.OfferResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

OfferResourceApi apiInstance = new OfferResourceApi();
Offer offer = new Offer(); // Offer | offer
try {
    Offer result = apiInstance.updateOfferUsingPUT(offer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfferResourceApi#updateOfferUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | [**Offer**](Offer.md)| offer |

### Return type

[**Offer**](Offer.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

