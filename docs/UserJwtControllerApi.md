# UserJwtControllerApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeUsingPOST**](UserJwtControllerApi.md#authorizeUsingPOST) | **POST** /api/authenticate | authorize


<a name="authorizeUsingPOST"></a>
# **authorizeUsingPOST**
> ResponseEntity authorizeUsingPOST(loginVM)

authorize

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.UserJwtControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

UserJwtControllerApi apiInstance = new UserJwtControllerApi();
LoginVM loginVM = new LoginVM(); // LoginVM | loginVM
try {
    ResponseEntity result = apiInstance.authorizeUsingPOST(loginVM);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserJwtControllerApi#authorizeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginVM** | [**LoginVM**](LoginVM.md)| loginVM |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

