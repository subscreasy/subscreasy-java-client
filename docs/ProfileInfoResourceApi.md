# ProfileInfoResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActiveProfilesUsingGET**](ProfileInfoResourceApi.md#getActiveProfilesUsingGET) | **GET** /api/profile-info | getActiveProfiles


<a name="getActiveProfilesUsingGET"></a>
# **getActiveProfilesUsingGET**
> ProfileInfoVM getActiveProfilesUsingGET()

getActiveProfiles

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProfileInfoResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProfileInfoResourceApi apiInstance = new ProfileInfoResourceApi();
try {
    ProfileInfoVM result = apiInstance.getActiveProfilesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileInfoResourceApi#getActiveProfilesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileInfoVM**](ProfileInfoVM.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

