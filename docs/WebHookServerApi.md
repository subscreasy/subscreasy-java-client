# WebHookServerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paymentUpdatedUsingPOST**](WebHookServerApi.md#paymentUpdatedUsingPOST) | **POST** /subscreasy/webhook/payment-updated | paymentUpdated
[**subscriberCreatedUsingPOST**](WebHookServerApi.md#subscriberCreatedUsingPOST) | **POST** /subscreasy/webhook/subscriber-created | subscriberCreated
[**subscriberUpdatedUsingPOST**](WebHookServerApi.md#subscriberUpdatedUsingPOST) | **POST** /subscreasy/webhook/subscriber-updated | subscriberUpdated
[**subscriptionEndedUsingPOST**](WebHookServerApi.md#subscriptionEndedUsingPOST) | **POST** /subscreasy/webhook/subscription-ended | subscriptionEnded
[**subscriptionRenewalFailedUsingPOST**](WebHookServerApi.md#subscriptionRenewalFailedUsingPOST) | **POST** /subscreasy/webhook/subscription-renewal-failed | subscriptionRenewalFailed
[**subscriptionRenewedUsingPOST**](WebHookServerApi.md#subscriptionRenewedUsingPOST) | **POST** /subscreasy/webhook/subscription-renewed | subscriptionRenewed
[**subscriptionStartedUsingPOST**](WebHookServerApi.md#subscriptionStartedUsingPOST) | **POST** /subscreasy/webhook/subscription-started | subscriptionStarted


<a name="paymentUpdatedUsingPOST"></a>
# **paymentUpdatedUsingPOST**
> Object paymentUpdatedUsingPOST(r)

paymentUpdated

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.paymentUpdatedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#paymentUpdatedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriberCreatedUsingPOST"></a>
# **subscriberCreatedUsingPOST**
> Object subscriberCreatedUsingPOST(r)

subscriberCreated

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriberCreatedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriberCreatedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriberUpdatedUsingPOST"></a>
# **subscriberUpdatedUsingPOST**
> Object subscriberUpdatedUsingPOST(r)

subscriberUpdated

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriberUpdatedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriberUpdatedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionEndedUsingPOST"></a>
# **subscriptionEndedUsingPOST**
> Object subscriptionEndedUsingPOST(r)

subscriptionEnded

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriptionEndedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriptionEndedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionRenewalFailedUsingPOST"></a>
# **subscriptionRenewalFailedUsingPOST**
> Object subscriptionRenewalFailedUsingPOST(r)

subscriptionRenewalFailed

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriptionRenewalFailedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriptionRenewalFailedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionRenewedUsingPOST"></a>
# **subscriptionRenewedUsingPOST**
> Object subscriptionRenewedUsingPOST(r)

subscriptionRenewed

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriptionRenewedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriptionRenewedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscriptionStartedUsingPOST"></a>
# **subscriptionStartedUsingPOST**
> Object subscriptionStartedUsingPOST(r)

subscriptionStarted

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.client.WebHookServerApi;


WebHookServerApi apiInstance = new WebHookServerApi();
WebHookRequest r = new WebHookRequest(); // WebHookRequest | r
try {
    Object result = apiInstance.subscriptionStartedUsingPOST(r);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebHookServerApi#subscriptionStartedUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **r** | [**WebHookRequest**](WebHookRequest.md)| r |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

