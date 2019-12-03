# CompanyResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyUsingPOST**](CompanyResourceApi.md#createCompanyUsingPOST) | **POST** /api/companies | createCompany
[**deleteCompanyUsingDELETE**](CompanyResourceApi.md#deleteCompanyUsingDELETE) | **DELETE** /api/companies/{id} | deleteCompany
[**getAllCompaniesUsingGET**](CompanyResourceApi.md#getAllCompaniesUsingGET) | **GET** /api/companies | getAllCompanies
[**getCompanyUsingGET**](CompanyResourceApi.md#getCompanyUsingGET) | **GET** /api/companies/{id} | getCompany
[**updateCompanyUsingPUT**](CompanyResourceApi.md#updateCompanyUsingPUT) | **PUT** /api/companies | updateCompany


<a name="createCompanyUsingPOST"></a>
# **createCompanyUsingPOST**
> Company createCompanyUsingPOST(company)

createCompany

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyResourceApi apiInstance = new CompanyResourceApi();
Company company = new Company(); // Company | company
try {
    Company result = apiInstance.createCompanyUsingPOST(company);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyResourceApi#createCompanyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**Company**](Company.md)| company |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCompanyUsingDELETE"></a>
# **deleteCompanyUsingDELETE**
> deleteCompanyUsingDELETE(id)

deleteCompany

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyResourceApi apiInstance = new CompanyResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteCompanyUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyResourceApi#deleteCompanyUsingDELETE");
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

<a name="getAllCompaniesUsingGET"></a>
# **getAllCompaniesUsingGET**
> List&lt;Company&gt; getAllCompaniesUsingGET()

getAllCompanies

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyResourceApi apiInstance = new CompanyResourceApi();
try {
    List<Company> result = apiInstance.getAllCompaniesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyResourceApi#getAllCompaniesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Company&gt;**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyUsingGET"></a>
# **getCompanyUsingGET**
> Company getCompanyUsingGET(id)

getCompany

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyResourceApi apiInstance = new CompanyResourceApi();
Long id = 789L; // Long | id
try {
    Company result = apiInstance.getCompanyUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyResourceApi#getCompanyUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCompanyUsingPUT"></a>
# **updateCompanyUsingPUT**
> Company updateCompanyUsingPUT(company)

updateCompany

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CompanyResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CompanyResourceApi apiInstance = new CompanyResourceApi();
Company company = new Company(); // Company | company
try {
    Company result = apiInstance.updateCompanyUsingPUT(company);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyResourceApi#updateCompanyUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**Company**](Company.md)| company |

### Return type

[**Company**](Company.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

