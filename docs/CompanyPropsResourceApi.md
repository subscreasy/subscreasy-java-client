# CompanyPropsResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyPropsUsingPOST**](CompanyPropsResourceApi.md#createCompanyPropsUsingPOST) | **POST** /api/company-props | createCompanyProps
[**deleteCompanyPropsUsingDELETE**](CompanyPropsResourceApi.md#deleteCompanyPropsUsingDELETE) | **DELETE** /api/company-props/{id} | deleteCompanyProps
[**getAllCompanyPropsUsingGET**](CompanyPropsResourceApi.md#getAllCompanyPropsUsingGET) | **GET** /api/company-props | getAllCompanyProps
[**getCompanyPropsByCompanyIdUsingGET**](CompanyPropsResourceApi.md#getCompanyPropsByCompanyIdUsingGET) | **GET** /api/company-props/company/{companyId} | getCompanyPropsByCompanyId
[**updateCompanyPropsUsingPUT**](CompanyPropsResourceApi.md#updateCompanyPropsUsingPUT) | **PUT** /api/company-props | updateCompanyProps
[**uploadCSSUsingPOST**](CompanyPropsResourceApi.md#uploadCSSUsingPOST) | **POST** /api/company-props/uploadCSS | uploadCSS
[**uploadFileUsingPOST**](CompanyPropsResourceApi.md#uploadFileUsingPOST) | **POST** /api/company-props/uploadFile | uploadFile


<a name="createCompanyPropsUsingPOST"></a>
# **createCompanyPropsUsingPOST**
> CompanyProps createCompanyPropsUsingPOST(companyProps)

createCompanyProps

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
CompanyProps companyProps = new CompanyProps(); // CompanyProps | companyProps
try {
    CompanyProps result = apiInstance.createCompanyPropsUsingPOST(companyProps);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#createCompanyPropsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyProps** | [**CompanyProps**](CompanyProps.md)| companyProps |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCompanyPropsUsingDELETE"></a>
# **deleteCompanyPropsUsingDELETE**
> deleteCompanyPropsUsingDELETE(id)

deleteCompanyProps

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteCompanyPropsUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#deleteCompanyPropsUsingDELETE");
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

<a name="getAllCompanyPropsUsingGET"></a>
# **getAllCompanyPropsUsingGET**
> List&lt;CompanyProps&gt; getAllCompanyPropsUsingGET()

getAllCompanyProps

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
try {
    List<CompanyProps> result = apiInstance.getAllCompanyPropsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#getAllCompanyPropsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CompanyProps&gt;**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyPropsByCompanyIdUsingGET"></a>
# **getCompanyPropsByCompanyIdUsingGET**
> CompanyProps getCompanyPropsByCompanyIdUsingGET(companyId)

getCompanyPropsByCompanyId

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
Long companyId = 789L; // Long | companyId
try {
    CompanyProps result = apiInstance.getCompanyPropsByCompanyIdUsingGET(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#getCompanyPropsByCompanyIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Long**| companyId |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCompanyPropsUsingPUT"></a>
# **updateCompanyPropsUsingPUT**
> CompanyProps updateCompanyPropsUsingPUT(companyProps)

updateCompanyProps

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
CompanyProps companyProps = new CompanyProps(); // CompanyProps | companyProps
try {
    CompanyProps result = apiInstance.updateCompanyPropsUsingPUT(companyProps);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#updateCompanyPropsUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyProps** | [**CompanyProps**](CompanyProps.md)| companyProps |

### Return type

[**CompanyProps**](CompanyProps.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadCSSUsingPOST"></a>
# **uploadCSSUsingPOST**
> Object uploadCSSUsingPOST(file)

uploadCSS

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
File file = new File("/path/to/file.txt"); // File | file
try {
    Object result = apiInstance.uploadCSSUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#uploadCSSUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadFileUsingPOST"></a>
# **uploadFileUsingPOST**
> Object uploadFileUsingPOST(file)

uploadFile

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyPropsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyPropsResourceApi apiInstance = new CompanyPropsResourceApi();
File file = new File("/path/to/file.txt"); // File | file
try {
    Object result = apiInstance.uploadFileUsingPOST(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyPropsResourceApi#uploadFileUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

