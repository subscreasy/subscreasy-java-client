# AccountResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**isAuthenticatedUsingGET**](AccountResourceApi.md#isAuthenticatedUsingGET) | **GET** /api/authenticate | isAuthenticated
[**registerAccountUsingPOST**](AccountResourceApi.md#registerAccountUsingPOST) | **POST** /api/register | registerAccount


<a name="isAuthenticatedUsingGET"></a>
# **isAuthenticatedUsingGET**
> String isAuthenticatedUsingGET()

isAuthenticated

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.AccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AccountResourceApi apiInstance = new AccountResourceApi();
try {
    String result = apiInstance.isAuthenticatedUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#isAuthenticatedUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="registerAccountUsingPOST"></a>
# **registerAccountUsingPOST**
> ResponseEntity registerAccountUsingPOST(managedUserVM)

registerAccount

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.AccountResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AccountResourceApi apiInstance = new AccountResourceApi();
UserDTO managedUserVM = new UserDTO(); // UserDTO | managedUserVM
try {
    ResponseEntity result = apiInstance.registerAccountUsingPOST(managedUserVM);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountResourceApi#registerAccountUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managedUserVM** | [**UserDTO**](UserDTO.md)| managedUserVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

