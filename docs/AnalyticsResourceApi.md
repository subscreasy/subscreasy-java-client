# AnalyticsResourceApi

All URIs are relative to *https://sandbox.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDashboardAnalyticsUsingGET**](AnalyticsResourceApi.md#getDashboardAnalyticsUsingGET) | **GET** /api/analytics/dashboard | getDashboardAnalytics


<a name="getDashboardAnalyticsUsingGET"></a>
# **getDashboardAnalyticsUsingGET**
> Object getDashboardAnalyticsUsingGET()

getDashboardAnalytics

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.AnalyticsResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

AnalyticsResourceApi apiInstance = new AnalyticsResourceApi();
try {
    Object result = apiInstance.getDashboardAnalyticsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyticsResourceApi#getDashboardAnalyticsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

