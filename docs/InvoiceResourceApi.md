# InvoiceResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvoiceUsingPOST**](InvoiceResourceApi.md#createInvoiceUsingPOST) | **POST** /api/invoices | createInvoice
[**deleteInvoiceUsingDELETE**](InvoiceResourceApi.md#deleteInvoiceUsingDELETE) | **DELETE** /api/invoices/{id} | deleteInvoice
[**getAllInvoicesUsingGET**](InvoiceResourceApi.md#getAllInvoicesUsingGET) | **GET** /api/invoices | getAllInvoices
[**getInvoiceBySubscriberUsingGET**](InvoiceResourceApi.md#getInvoiceBySubscriberUsingGET) | **GET** /api/invoices/subscriber/{subscriberSecureId} | getInvoiceBySubscriber
[**getInvoiceUsingGET**](InvoiceResourceApi.md#getInvoiceUsingGET) | **GET** /api/invoices/{id} | getInvoice
[**updateInvoiceUsingPUT**](InvoiceResourceApi.md#updateInvoiceUsingPUT) | **PUT** /api/invoices | updateInvoice


<a name="createInvoiceUsingPOST"></a>
# **createInvoiceUsingPOST**
> Invoice createInvoiceUsingPOST(invoice)

createInvoice

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
Invoice invoice = new Invoice(); // Invoice | invoice
try {
    Invoice result = apiInstance.createInvoiceUsingPOST(invoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#createInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInvoiceUsingDELETE"></a>
# **deleteInvoiceUsingDELETE**
> deleteInvoiceUsingDELETE(id)

deleteInvoice

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteInvoiceUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#deleteInvoiceUsingDELETE");
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

<a name="getAllInvoicesUsingGET"></a>
# **getAllInvoicesUsingGET**
> List&lt;Invoice&gt; getAllInvoicesUsingGET()

getAllInvoices

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
try {
    List<Invoice> result = apiInstance.getAllInvoicesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#getAllInvoicesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Invoice&gt;**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceBySubscriberUsingGET"></a>
# **getInvoiceBySubscriberUsingGET**
> List&lt;Invoice&gt; getInvoiceBySubscriberUsingGET(subscriberSecureId)

getInvoiceBySubscriber

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
String subscriberSecureId = "subscriberSecureId_example"; // String | subscriberSecureId
try {
    List<Invoice> result = apiInstance.getInvoiceBySubscriberUsingGET(subscriberSecureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#getInvoiceBySubscriberUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriberSecureId** | **String**| subscriberSecureId |

### Return type

[**List&lt;Invoice&gt;**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInvoiceUsingGET"></a>
# **getInvoiceUsingGET**
> Invoice getInvoiceUsingGET(id)

getInvoice

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
Long id = 789L; // Long | id
try {
    Invoice result = apiInstance.getInvoiceUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#getInvoiceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInvoiceUsingPUT"></a>
# **updateInvoiceUsingPUT**
> Invoice updateInvoiceUsingPUT(invoice)

updateInvoice

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.InvoiceResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

InvoiceResourceApi apiInstance = new InvoiceResourceApi();
Invoice invoice = new Invoice(); // Invoice | invoice
try {
    Invoice result = apiInstance.updateInvoiceUsingPUT(invoice);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceResourceApi#updateInvoiceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoice** | [**Invoice**](Invoice.md)| invoice |

### Return type

[**Invoice**](Invoice.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

