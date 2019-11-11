# EndpointsApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeUsingPUT**](EndpointsApi.md#authorizeUsingPUT) | **PUT** /api/authorize | authorize
[**deductUsingPUT**](EndpointsApi.md#deductUsingPUT) | **PUT** /api/deduct | deduct
[**getAuthorizedServicesUsingGET**](EndpointsApi.md#getAuthorizedServicesUsingGET) | **GET** /api/service/subscriber/{secureId} | getAuthorizedServices
[**getChargingLogBySubscriptionUsingGET**](EndpointsApi.md#getChargingLogBySubscriptionUsingGET) | **GET** /api/charging-logs/subscription/{id} | getChargingLogBySubscription
[**getCustomerTotalAmountUsingGET**](EndpointsApi.md#getCustomerTotalAmountUsingGET) | **GET** /api/customer-totalAmountCharge/{id} | getCustomerTotalAmount
[**getInvoiceDetailsUsingGET**](EndpointsApi.md#getInvoiceDetailsUsingGET) | **GET** /api/getInvoiceDetails | getInvoiceDetails
[**getMessageTemplateUsingGET**](EndpointsApi.md#getMessageTemplateUsingGET) | **GET** /api/message-templates/email/{lifecycleEventName} | getMessageTemplate
[**getServiceInstancesBySubscriptionUsingGET**](EndpointsApi.md#getServiceInstancesBySubscriptionUsingGET) | **GET** /api/service-instances/subscription/{id} | getServiceInstancesBySubscription
[**getServiceOfferingsBySubscriptionPlanUsingGET**](EndpointsApi.md#getServiceOfferingsBySubscriptionPlanUsingGET) | **GET** /api/service-offerings/offer/{id} | getServiceOfferingsBySubscriptionPlan
[**getTotalRevenuePerMonthUsingGET**](EndpointsApi.md#getTotalRevenuePerMonthUsingGET) | **GET** /api/charging-logs-totalamount-customer/{id} | getTotalRevenuePerMonth


<a name="authorizeUsingPUT"></a>
# **authorizeUsingPUT**
> Boolean authorizeUsingPUT(authorization)

authorize

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Authorization authorization = new Authorization(); // Authorization | authorization
try {
    Boolean result = apiInstance.authorizeUsingPUT(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#authorizeUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | [**Authorization**](Authorization.md)| authorization |

### Return type

**Boolean**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deductUsingPUT"></a>
# **deductUsingPUT**
> DeductionResult deductUsingPUT(deduction)

deduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Deduction deduction = new Deduction(); // Deduction | deduction
try {
    DeductionResult result = apiInstance.deductUsingPUT(deduction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#deductUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deduction** | [**Deduction**](Deduction.md)| deduction |

### Return type

[**DeductionResult**](DeductionResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthorizedServicesUsingGET"></a>
# **getAuthorizedServicesUsingGET**
> AuthorizedServicesResponse getAuthorizedServicesUsingGET(secureId)

getAuthorizedServices

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
String secureId = "secureId_example"; // String | secureId
try {
    AuthorizedServicesResponse result = apiInstance.getAuthorizedServicesUsingGET(secureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getAuthorizedServicesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secureId** | **String**| secureId |

### Return type

[**AuthorizedServicesResponse**](AuthorizedServicesResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getChargingLogBySubscriptionUsingGET"></a>
# **getChargingLogBySubscriptionUsingGET**
> List&lt;ChargingLog&gt; getChargingLogBySubscriptionUsingGET(id)

getChargingLogBySubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Long id = 789L; // Long | id
try {
    List<ChargingLog> result = apiInstance.getChargingLogBySubscriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getChargingLogBySubscriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**List&lt;ChargingLog&gt;**](ChargingLog.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCustomerTotalAmountUsingGET"></a>
# **getCustomerTotalAmountUsingGET**
> Long getCustomerTotalAmountUsingGET(id)

getCustomerTotalAmount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
String id = "id_example"; // String | id
try {
    Long result = apiInstance.getCustomerTotalAmountUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getCustomerTotalAmountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

**Long**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceDetailsUsingGET"></a>
# **getInvoiceDetailsUsingGET**
> Object getInvoiceDetailsUsingGET(invoiceRequest)

getInvoiceDetails

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
InvoiceRequest invoiceRequest = new InvoiceRequest(); // InvoiceRequest | invoiceRequest
try {
    Object result = apiInstance.getInvoiceDetailsUsingGET(invoiceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getInvoiceDetailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceRequest** | [**InvoiceRequest**](InvoiceRequest.md)| invoiceRequest |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getMessageTemplateUsingGET"></a>
# **getMessageTemplateUsingGET**
> MessageTemplate getMessageTemplateUsingGET(lifecycleEventName)

getMessageTemplate

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
String lifecycleEventName = "lifecycleEventName_example"; // String | lifecycleEventName
try {
    MessageTemplate result = apiInstance.getMessageTemplateUsingGET(lifecycleEventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getMessageTemplateUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleEventName** | **String**| lifecycleEventName |

### Return type

[**MessageTemplate**](MessageTemplate.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceInstancesBySubscriptionUsingGET"></a>
# **getServiceInstancesBySubscriptionUsingGET**
> List&lt;ServiceInstanceResult&gt; getServiceInstancesBySubscriptionUsingGET(id)

getServiceInstancesBySubscription

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Long id = 789L; // Long | id
try {
    List<ServiceInstanceResult> result = apiInstance.getServiceInstancesBySubscriptionUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getServiceInstancesBySubscriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**List&lt;ServiceInstanceResult&gt;**](ServiceInstanceResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getServiceOfferingsBySubscriptionPlanUsingGET"></a>
# **getServiceOfferingsBySubscriptionPlanUsingGET**
> List&lt;ServiceOfferingResult&gt; getServiceOfferingsBySubscriptionPlanUsingGET(id)

getServiceOfferingsBySubscriptionPlan

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Long id = 789L; // Long | id
try {
    List<ServiceOfferingResult> result = apiInstance.getServiceOfferingsBySubscriptionPlanUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getServiceOfferingsBySubscriptionPlanUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**List&lt;ServiceOfferingResult&gt;**](ServiceOfferingResult.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTotalRevenuePerMonthUsingGET"></a>
# **getTotalRevenuePerMonthUsingGET**
> List&lt;Object&gt; getTotalRevenuePerMonthUsingGET(id)

getTotalRevenuePerMonth

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.EndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

EndpointsApi apiInstance = new EndpointsApi();
Long id = 789L; // Long | id
try {
    List<Object> result = apiInstance.getTotalRevenuePerMonthUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EndpointsApi#getTotalRevenuePerMonthUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

**List&lt;Object&gt;**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

