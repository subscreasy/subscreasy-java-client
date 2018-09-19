# CardResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saveCardUsingPOST**](CardResourceApi.md#saveCardUsingPOST) | **POST** /api/card | saveCard


<a name="saveCardUsingPOST"></a>
# **saveCardUsingPOST**
> Object saveCardUsingPOST(request)

saveCard

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CardResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CardResourceApi apiInstance = new CardResourceApi();
SaveCardRequest request = new SaveCardRequest(); // SaveCardRequest | request
try {
    Object result = apiInstance.saveCardUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CardResourceApi#saveCardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SaveCardRequest**](SaveCardRequest.md)| request |

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

