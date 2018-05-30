# ServiceInstanceResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceInstanceUsingPOST**](ServiceInstanceResourceApi.md#createServiceInstanceUsingPOST) | **POST** /api/service-instances | createServiceInstance
[**deleteServiceInstanceUsingDELETE**](ServiceInstanceResourceApi.md#deleteServiceInstanceUsingDELETE) | **DELETE** /api/service-instances/{id} | deleteServiceInstance
[**getAllServiceInstancesUsingGET**](ServiceInstanceResourceApi.md#getAllServiceInstancesUsingGET) | **GET** /api/service-instances | getAllServiceInstances
[**getServiceInstanceUsingGET**](ServiceInstanceResourceApi.md#getServiceInstanceUsingGET) | **GET** /api/service-instances/{id} | getServiceInstance
[**updateServiceInstanceUsingPUT**](ServiceInstanceResourceApi.md#updateServiceInstanceUsingPUT) | **PUT** /api/service-instances | updateServiceInstance


<a name="createServiceInstanceUsingPOST"></a>
# **createServiceInstanceUsingPOST**
> ServiceInstance createServiceInstanceUsingPOST(serviceInstance)

createServiceInstance

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceInstanceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceInstanceResourceApi apiInstance = new ServiceInstanceResourceApi();
ServiceInstance serviceInstance = new ServiceInstance(); // ServiceInstance | serviceInstance
try {
    ServiceInstance result = apiInstance.createServiceInstanceUsingPOST(serviceInstance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstanceResourceApi#createServiceInstanceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceInstance** | [**ServiceInstance**](ServiceInstance.md)| serviceInstance |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteServiceInstanceUsingDELETE"></a>
# **deleteServiceInstanceUsingDELETE**
> deleteServiceInstanceUsingDELETE(id)

deleteServiceInstance

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceInstanceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceInstanceResourceApi apiInstance = new ServiceInstanceResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteServiceInstanceUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstanceResourceApi#deleteServiceInstanceUsingDELETE");
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

<a name="getAllServiceInstancesUsingGET"></a>
# **getAllServiceInstancesUsingGET**
> List&lt;ServiceInstance&gt; getAllServiceInstancesUsingGET()

getAllServiceInstances

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceInstanceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceInstanceResourceApi apiInstance = new ServiceInstanceResourceApi();
try {
    List<ServiceInstance> result = apiInstance.getAllServiceInstancesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstanceResourceApi#getAllServiceInstancesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ServiceInstance&gt;**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceInstanceUsingGET"></a>
# **getServiceInstanceUsingGET**
> ServiceInstance getServiceInstanceUsingGET(id)

getServiceInstance

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceInstanceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceInstanceResourceApi apiInstance = new ServiceInstanceResourceApi();
Long id = 789L; // Long | id
try {
    ServiceInstance result = apiInstance.getServiceInstanceUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstanceResourceApi#getServiceInstanceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateServiceInstanceUsingPUT"></a>
# **updateServiceInstanceUsingPUT**
> ServiceInstance updateServiceInstanceUsingPUT(serviceInstance)

updateServiceInstance

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ServiceInstanceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ServiceInstanceResourceApi apiInstance = new ServiceInstanceResourceApi();
ServiceInstance serviceInstance = new ServiceInstance(); // ServiceInstance | serviceInstance
try {
    ServiceInstance result = apiInstance.updateServiceInstanceUsingPUT(serviceInstance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceInstanceResourceApi#updateServiceInstanceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceInstance** | [**ServiceInstance**](ServiceInstance.md)| serviceInstance |

### Return type

[**ServiceInstance**](ServiceInstance.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

