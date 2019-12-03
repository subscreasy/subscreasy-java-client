# ServiceResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceUsingPOST**](ServiceResourceApi.md#createServiceUsingPOST) | **POST** /api/services | createService
[**deleteServiceUsingDELETE**](ServiceResourceApi.md#deleteServiceUsingDELETE) | **DELETE** /api/services/{id} | deleteService
[**getAllServicesUsingGET**](ServiceResourceApi.md#getAllServicesUsingGET) | **GET** /api/services | getAllServices
[**getServiceUsingGET**](ServiceResourceApi.md#getServiceUsingGET) | **GET** /api/services/{id} | getService
[**updateServiceUsingPUT**](ServiceResourceApi.md#updateServiceUsingPUT) | **PUT** /api/services | updateService


<a name="createServiceUsingPOST"></a>
# **createServiceUsingPOST**
> Service createServiceUsingPOST(service)

createService

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceResourceApi apiInstance = new ServiceResourceApi();
Service service = new Service(); // Service | service
try {
    Service result = apiInstance.createServiceUsingPOST(service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceResourceApi#createServiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**Service**](Service.md)| service |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceUsingDELETE"></a>
# **deleteServiceUsingDELETE**
> deleteServiceUsingDELETE(id)

deleteService

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceResourceApi apiInstance = new ServiceResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteServiceUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceResourceApi#deleteServiceUsingDELETE");
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

<a name="getAllServicesUsingGET"></a>
# **getAllServicesUsingGET**
> List&lt;Service&gt; getAllServicesUsingGET()

getAllServices

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceResourceApi apiInstance = new ServiceResourceApi();
try {
    List<Service> result = apiInstance.getAllServicesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceResourceApi#getAllServicesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceUsingGET"></a>
# **getServiceUsingGET**
> Service getServiceUsingGET(id)

getService

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceResourceApi apiInstance = new ServiceResourceApi();
Long id = 789L; // Long | id
try {
    Service result = apiInstance.getServiceUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceResourceApi#getServiceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceUsingPUT"></a>
# **updateServiceUsingPUT**
> Service updateServiceUsingPUT(service)

updateService

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceResourceApi apiInstance = new ServiceResourceApi();
Service service = new Service(); // Service | service
try {
    Service result = apiInstance.updateServiceUsingPUT(service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceResourceApi#updateServiceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**Service**](Service.md)| service |

### Return type

[**Service**](Service.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

