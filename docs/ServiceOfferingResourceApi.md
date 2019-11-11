# ServiceOfferingResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceOfferingUsingPOST**](ServiceOfferingResourceApi.md#createServiceOfferingUsingPOST) | **POST** /api/service-offerings | createServiceOffering
[**deleteServiceOfferingUsingDELETE**](ServiceOfferingResourceApi.md#deleteServiceOfferingUsingDELETE) | **DELETE** /api/service-offerings/{id} | deleteServiceOffering
[**getAllServiceOfferingsUsingGET**](ServiceOfferingResourceApi.md#getAllServiceOfferingsUsingGET) | **GET** /api/service-offerings | getAllServiceOfferings
[**getServiceOfferingUsingGET**](ServiceOfferingResourceApi.md#getServiceOfferingUsingGET) | **GET** /api/service-offerings/{id} | getServiceOffering
[**updateServiceOfferingUsingPUT**](ServiceOfferingResourceApi.md#updateServiceOfferingUsingPUT) | **PUT** /api/service-offerings | updateServiceOffering


<a name="createServiceOfferingUsingPOST"></a>
# **createServiceOfferingUsingPOST**
> ServiceOffering createServiceOfferingUsingPOST(serviceOffering)

createServiceOffering

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceOfferingResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceOfferingResourceApi apiInstance = new ServiceOfferingResourceApi();
ServiceOffering serviceOffering = new ServiceOffering(); // ServiceOffering | serviceOffering
try {
    ServiceOffering result = apiInstance.createServiceOfferingUsingPOST(serviceOffering);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOfferingResourceApi#createServiceOfferingUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceOffering** | [**ServiceOffering**](ServiceOffering.md)| serviceOffering |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceOfferingUsingDELETE"></a>
# **deleteServiceOfferingUsingDELETE**
> deleteServiceOfferingUsingDELETE(id)

deleteServiceOffering

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceOfferingResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceOfferingResourceApi apiInstance = new ServiceOfferingResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteServiceOfferingUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOfferingResourceApi#deleteServiceOfferingUsingDELETE");
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

<a name="getAllServiceOfferingsUsingGET"></a>
# **getAllServiceOfferingsUsingGET**
> List&lt;ServiceOffering&gt; getAllServiceOfferingsUsingGET()

getAllServiceOfferings

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceOfferingResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceOfferingResourceApi apiInstance = new ServiceOfferingResourceApi();
try {
    List<ServiceOffering> result = apiInstance.getAllServiceOfferingsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOfferingResourceApi#getAllServiceOfferingsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ServiceOffering&gt;**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceOfferingUsingGET"></a>
# **getServiceOfferingUsingGET**
> ServiceOffering getServiceOfferingUsingGET(id)

getServiceOffering

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceOfferingResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceOfferingResourceApi apiInstance = new ServiceOfferingResourceApi();
Long id = 789L; // Long | id
try {
    ServiceOffering result = apiInstance.getServiceOfferingUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOfferingResourceApi#getServiceOfferingUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceOfferingUsingPUT"></a>
# **updateServiceOfferingUsingPUT**
> ServiceOffering updateServiceOfferingUsingPUT(serviceOffering)

updateServiceOffering

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceOfferingResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceOfferingResourceApi apiInstance = new ServiceOfferingResourceApi();
ServiceOffering serviceOffering = new ServiceOffering(); // ServiceOffering | serviceOffering
try {
    ServiceOffering result = apiInstance.updateServiceOfferingUsingPUT(serviceOffering);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceOfferingResourceApi#updateServiceOfferingUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceOffering** | [**ServiceOffering**](ServiceOffering.md)| serviceOffering |

### Return type

[**ServiceOffering**](ServiceOffering.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

