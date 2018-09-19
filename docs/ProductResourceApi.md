# ProductResourceApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductUsingPOST**](ProductResourceApi.md#createProductUsingPOST) | **POST** /api/products | createProduct
[**getAllCompanyProductUsingGET**](ProductResourceApi.md#getAllCompanyProductUsingGET) | **GET** /api/na/products2/{companyName} | getAllCompanyProduct
[**getAllProductsUsingGET**](ProductResourceApi.md#getAllProductsUsingGET) | **GET** /api/products | getAllProducts
[**getCompanyProductUsingGET**](ProductResourceApi.md#getCompanyProductUsingGET) | **GET** /api/na/products/{companyName}/{id} | getCompanyProduct
[**getProductUsingGET**](ProductResourceApi.md#getProductUsingGET) | **GET** /api/products/{id} | getProduct
[**updateProductUsingPUT**](ProductResourceApi.md#updateProductUsingPUT) | **PUT** /api/products | updateProduct


<a name="createProductUsingPOST"></a>
# **createProductUsingPOST**
> Product createProductUsingPOST(product)

createProduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
Product product = new Product(); // Product | product
try {
    Product result = apiInstance.createProductUsingPOST(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#createProductUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCompanyProductUsingGET"></a>
# **getAllCompanyProductUsingGET**
> List&lt;Product&gt; getAllCompanyProductUsingGET(companyName)

getAllCompanyProduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
String companyName = "companyName_example"; // String | companyName
try {
    List<Product> result = apiInstance.getAllCompanyProductUsingGET(companyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#getAllCompanyProductUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyName** | **String**| companyName |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllProductsUsingGET"></a>
# **getAllProductsUsingGET**
> List&lt;Product&gt; getAllProductsUsingGET()

getAllProducts

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
try {
    List<Product> result = apiInstance.getAllProductsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#getAllProductsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getCompanyProductUsingGET"></a>
# **getCompanyProductUsingGET**
> Product getCompanyProductUsingGET(companyName, id)

getCompanyProduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
String companyName = "companyName_example"; // String | companyName
Long id = 789L; // Long | id
try {
    Product result = apiInstance.getCompanyProductUsingGET(companyName, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#getCompanyProductUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyName** | **String**| companyName |
 **id** | **Long**| id |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProductUsingGET"></a>
# **getProductUsingGET**
> Product getProductUsingGET(id)

getProduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
Long id = 789L; // Long | id
try {
    Product result = apiInstance.getProductUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#getProductUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateProductUsingPUT"></a>
# **updateProductUsingPUT**
> Product updateProductUsingPUT(product)

updateProduct

### Example
```java
// Import classes:
//import com.kodfarki.subscreasy.ApiClient;
//import com.kodfarki.subscreasy.ApiException;
//import com.kodfarki.subscreasy.Configuration;
//import com.kodfarki.subscreasy.auth.*;
//import com.kodfarki.subscreasy.client.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
Product product = new Product(); // Product | product
try {
    Product result = apiInstance.updateProductUsingPUT(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#updateProductUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**Product**](Product.md)| product |

### Return type

[**Product**](Product.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

