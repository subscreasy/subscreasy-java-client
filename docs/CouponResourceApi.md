# CouponResourceApi

All URIs are relative to *https://app.subscreasy.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCouponUsingPOST**](CouponResourceApi.md#createCouponUsingPOST) | **POST** /api/coupons | createCoupon
[**deleteCouponUsingDELETE**](CouponResourceApi.md#deleteCouponUsingDELETE) | **DELETE** /api/coupons/{id} | deleteCoupon
[**getAllCouponsUsingGET**](CouponResourceApi.md#getAllCouponsUsingGET) | **GET** /api/coupons | getAllCoupons
[**getCouponUsingGET**](CouponResourceApi.md#getCouponUsingGET) | **GET** /api/coupons/{id} | getCoupon
[**updateCouponUsingPUT**](CouponResourceApi.md#updateCouponUsingPUT) | **PUT** /api/coupons | updateCoupon


<a name="createCouponUsingPOST"></a>
# **createCouponUsingPOST**
> Coupon createCouponUsingPOST(coupon)

createCoupon

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CouponResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CouponResourceApi apiInstance = new CouponResourceApi();
Coupon coupon = new Coupon(); // Coupon | coupon
try {
    Coupon result = apiInstance.createCouponUsingPOST(coupon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponResourceApi#createCouponUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coupon** | [**Coupon**](Coupon.md)| coupon |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteCouponUsingDELETE"></a>
# **deleteCouponUsingDELETE**
> deleteCouponUsingDELETE(id)

deleteCoupon

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CouponResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CouponResourceApi apiInstance = new CouponResourceApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteCouponUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponResourceApi#deleteCouponUsingDELETE");
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

<a name="getAllCouponsUsingGET"></a>
# **getAllCouponsUsingGET**
> List&lt;Coupon&gt; getAllCouponsUsingGET()

getAllCoupons

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CouponResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CouponResourceApi apiInstance = new CouponResourceApi();
try {
    List<Coupon> result = apiInstance.getAllCouponsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponResourceApi#getAllCouponsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Coupon&gt;**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCouponUsingGET"></a>
# **getCouponUsingGET**
> Coupon getCouponUsingGET(id)

getCoupon

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CouponResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CouponResourceApi apiInstance = new CouponResourceApi();
Long id = 789L; // Long | id
try {
    Coupon result = apiInstance.getCouponUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponResourceApi#getCouponUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateCouponUsingPUT"></a>
# **updateCouponUsingPUT**
> Coupon updateCouponUsingPUT(coupon)

updateCoupon

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.CouponResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

CouponResourceApi apiInstance = new CouponResourceApi();
Coupon coupon = new Coupon(); // Coupon | coupon
try {
    Coupon result = apiInstance.updateCouponUsingPUT(coupon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponResourceApi#updateCouponUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coupon** | [**Coupon**](Coupon.md)| coupon |

### Return type

[**Coupon**](Coupon.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

