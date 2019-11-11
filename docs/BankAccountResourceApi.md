# BankAccountResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBankAccountUsingPOST**](BankAccountResourceApi.md#createBankAccountUsingPOST) | **POST** /api/bank-accounts | createBankAccount
[**deleteBankAccountUsingDELETE**](BankAccountResourceApi.md#deleteBankAccountUsingDELETE) | **DELETE** /api/bank-accounts/{id} | deleteBankAccount
[**getAllBankAccountsUsingGET**](BankAccountResourceApi.md#getAllBankAccountsUsingGET) | **GET** /api/bank-accounts | getAllBankAccounts
[**getBankAccountUsingGET**](BankAccountResourceApi.md#getBankAccountUsingGET) | **GET** /api/bank-accounts/{id} | getBankAccount
[**getBankAccountsByCompanyUsingGET**](BankAccountResourceApi.md#getBankAccountsByCompanyUsingGET) | **GET** /api/bank-accounts/company/{companyId} | getBankAccountsByCompany
[**updateBankAccountUsingPUT**](BankAccountResourceApi.md#updateBankAccountUsingPUT) | **PUT** /api/bank-accounts | updateBankAccount


<a name="createBankAccountUsingPOST"></a>
# **createBankAccountUsingPOST**
> BankAccount createBankAccountUsingPOST(bankAccount)

createBankAccount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
BankAccount bankAccount = new BankAccount(); // BankAccount | bankAccount
try {
    BankAccount result = apiInstance.createBankAccountUsingPOST(bankAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#createBankAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccount** | [**BankAccount**](BankAccount.md)| bankAccount |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankAccountUsingDELETE"></a>
# **deleteBankAccountUsingDELETE**
> deleteBankAccountUsingDELETE(id)

deleteBankAccount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteBankAccountUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#deleteBankAccountUsingDELETE");
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

<a name="getAllBankAccountsUsingGET"></a>
# **getAllBankAccountsUsingGET**
> List&lt;BankAccount&gt; getAllBankAccountsUsingGET()

getAllBankAccounts

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
try {
    List<BankAccount> result = apiInstance.getAllBankAccountsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#getAllBankAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BankAccount&gt;**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankAccountUsingGET"></a>
# **getBankAccountUsingGET**
> BankAccount getBankAccountUsingGET(id)

getBankAccount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
Long id = 789L; // Long | id
try {
    BankAccount result = apiInstance.getBankAccountUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#getBankAccountUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankAccountsByCompanyUsingGET"></a>
# **getBankAccountsByCompanyUsingGET**
> List&lt;BankAccount&gt; getBankAccountsByCompanyUsingGET(companyId)

getBankAccountsByCompany

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
Long companyId = 789L; // Long | companyId
try {
    List<BankAccount> result = apiInstance.getBankAccountsByCompanyUsingGET(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#getBankAccountsByCompanyUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Long**| companyId |

### Return type

[**List&lt;BankAccount&gt;**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankAccountUsingPUT"></a>
# **updateBankAccountUsingPUT**
> BankAccount updateBankAccountUsingPUT(bankAccount)

updateBankAccount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.BankAccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

BankAccountResourceApi apiInstance = new BankAccountResourceApi();
BankAccount bankAccount = new BankAccount(); // BankAccount | bankAccount
try {
    BankAccount result = apiInstance.updateBankAccountUsingPUT(bankAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BankAccountResourceApi#updateBankAccountUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bankAccount** | [**BankAccount**](BankAccount.md)| bankAccount |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

