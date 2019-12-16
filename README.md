# java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.kodfarki.subscreasy</groupId>
    <artifactId>java-client</artifactId>
    <version>1.1.117</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.kodfarki.subscreasy:java-client:1.1.117"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-client-1.1.117.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.kodfarki.subscreasy.*;
import com.kodfarki.subscreasy.auth.*;
import com.kodfarki.subscreasy.client.model.*;
import com.kodfarki.subscreasy.client.AnalyticsResourceApi;

import java.io.File;
import java.util.*;

public class AnalyticsResourceApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsResourceApi* | [**getDashboardAnalyticsUsingGET**](docs/AnalyticsResourceApi.md#getDashboardAnalyticsUsingGET) | **GET** /api/analytics/dashboard | getDashboardAnalytics
*CardResourceApi* | [**createCardUsingPOST**](docs/CardResourceApi.md#createCardUsingPOST) | **POST** /api/cards | createCard
*CardResourceApi* | [**deleteCardUsingDELETE**](docs/CardResourceApi.md#deleteCardUsingDELETE) | **DELETE** /api/cards/{id} | deleteCard
*CardResourceApi* | [**getAllCardsUsingGET**](docs/CardResourceApi.md#getAllCardsUsingGET) | **GET** /api/cards | getAllCards
*CardResourceApi* | [**getCardUsingGET**](docs/CardResourceApi.md#getCardUsingGET) | **GET** /api/cards/{id} | getCard
*CardResourceApi* | [**updateCardUsingPUT**](docs/CardResourceApi.md#updateCardUsingPUT) | **PUT** /api/cards | updateCard
*ChargingLogResourceApi* | [**createChargingLogUsingPOST**](docs/ChargingLogResourceApi.md#createChargingLogUsingPOST) | **POST** /api/charging-logs | createChargingLog
*ChargingLogResourceApi* | [**deleteChargingLogUsingDELETE**](docs/ChargingLogResourceApi.md#deleteChargingLogUsingDELETE) | **DELETE** /api/charging-logs/{id} | deleteChargingLog
*ChargingLogResourceApi* | [**getAllChargingLogsUsingGET**](docs/ChargingLogResourceApi.md#getAllChargingLogsUsingGET) | **GET** /api/charging-logs | getAllChargingLogs
*ChargingLogResourceApi* | [**getChargingLogUsingGET**](docs/ChargingLogResourceApi.md#getChargingLogUsingGET) | **GET** /api/charging-logs/{id} | getChargingLog
*ChargingLogResourceApi* | [**refundUsingPOST**](docs/ChargingLogResourceApi.md#refundUsingPOST) | **POST** /api/charging-logs/refund/{chargingLogId} | refund
*ChargingLogResourceApi* | [**updateChargingLogUsingPUT**](docs/ChargingLogResourceApi.md#updateChargingLogUsingPUT) | **PUT** /api/charging-logs | updateChargingLog
*CompanyPropsResourceApi* | [**createCompanyPropsUsingPOST**](docs/CompanyPropsResourceApi.md#createCompanyPropsUsingPOST) | **POST** /api/company-props | createCompanyProps
*CompanyPropsResourceApi* | [**deleteCompanyPropsUsingDELETE**](docs/CompanyPropsResourceApi.md#deleteCompanyPropsUsingDELETE) | **DELETE** /api/company-props/{id} | deleteCompanyProps
*CompanyPropsResourceApi* | [**getAllCompanyPropsUsingGET**](docs/CompanyPropsResourceApi.md#getAllCompanyPropsUsingGET) | **GET** /api/company-props | getAllCompanyProps
*CompanyPropsResourceApi* | [**getCompanyPropsByCompanyIdUsingGET**](docs/CompanyPropsResourceApi.md#getCompanyPropsByCompanyIdUsingGET) | **GET** /api/company-props/company/{companyId} | getCompanyPropsByCompanyId
*CompanyPropsResourceApi* | [**updateCompanyPropsUsingPUT**](docs/CompanyPropsResourceApi.md#updateCompanyPropsUsingPUT) | **PUT** /api/company-props | updateCompanyProps
*CompanyResourceApi* | [**createCompanyUsingPOST**](docs/CompanyResourceApi.md#createCompanyUsingPOST) | **POST** /api/companies | createCompany
*CompanyResourceApi* | [**deleteCompanyUsingDELETE**](docs/CompanyResourceApi.md#deleteCompanyUsingDELETE) | **DELETE** /api/companies/{id} | deleteCompany
*CompanyResourceApi* | [**getAllCompaniesUsingGET**](docs/CompanyResourceApi.md#getAllCompaniesUsingGET) | **GET** /api/companies | getAllCompanies
*CompanyResourceApi* | [**getCompanyUsingGET**](docs/CompanyResourceApi.md#getCompanyUsingGET) | **GET** /api/companies/{id} | getCompany
*CompanyResourceApi* | [**updateCompanyUsingPUT**](docs/CompanyResourceApi.md#updateCompanyUsingPUT) | **PUT** /api/companies | updateCompany
*CouponResourceApi* | [**createCouponUsingPOST**](docs/CouponResourceApi.md#createCouponUsingPOST) | **POST** /api/coupons | createCoupon
*CouponResourceApi* | [**deleteCouponUsingDELETE**](docs/CouponResourceApi.md#deleteCouponUsingDELETE) | **DELETE** /api/coupons/{id} | deleteCoupon
*CouponResourceApi* | [**getAllCouponsUsingGET**](docs/CouponResourceApi.md#getAllCouponsUsingGET) | **GET** /api/coupons | getAllCoupons
*CouponResourceApi* | [**getCouponUsingGET**](docs/CouponResourceApi.md#getCouponUsingGET) | **GET** /api/coupons/{id} | getCoupon
*CouponResourceApi* | [**updateCouponUsingPUT**](docs/CouponResourceApi.md#updateCouponUsingPUT) | **PUT** /api/coupons | updateCoupon
*EndpointsApi* | [**authorizeUsingPUT**](docs/EndpointsApi.md#authorizeUsingPUT) | **PUT** /api/authorize | authorize
*EndpointsApi* | [**deductUsingPUT**](docs/EndpointsApi.md#deductUsingPUT) | **PUT** /api/deduct | deduct
*EndpointsApi* | [**getAuthorizedServicesUsingGET**](docs/EndpointsApi.md#getAuthorizedServicesUsingGET) | **GET** /api/service/subscriber/{secureId} | getAuthorizedServices
*EndpointsApi* | [**getChargingLogBySubscriptionUsingGET**](docs/EndpointsApi.md#getChargingLogBySubscriptionUsingGET) | **GET** /api/charging-logs/subscription/{id} | getChargingLogBySubscription
*EndpointsApi* | [**getCustomerTotalAmountUsingGET**](docs/EndpointsApi.md#getCustomerTotalAmountUsingGET) | **GET** /api/customer-totalAmountCharge/{id} | getCustomerTotalAmount
*EndpointsApi* | [**getInvoiceDetailsUsingGET**](docs/EndpointsApi.md#getInvoiceDetailsUsingGET) | **GET** /api/getInvoiceDetails | getInvoiceDetails
*EndpointsApi* | [**getMessageTemplateUsingGET**](docs/EndpointsApi.md#getMessageTemplateUsingGET) | **GET** /api/message-templates/email/{lifecycleEventName} | getMessageTemplate
*EndpointsApi* | [**getServiceInstancesBySubscriptionUsingGET**](docs/EndpointsApi.md#getServiceInstancesBySubscriptionUsingGET) | **GET** /api/service-instances/subscription/{id} | getServiceInstancesBySubscription
*EndpointsApi* | [**getServiceOfferingsBySubscriptionPlanUsingGET**](docs/EndpointsApi.md#getServiceOfferingsBySubscriptionPlanUsingGET) | **GET** /api/service-offerings/offer/{id} | getServiceOfferingsBySubscriptionPlan
*EndpointsApi* | [**getTotalRevenuePerMonthUsingGET**](docs/EndpointsApi.md#getTotalRevenuePerMonthUsingGET) | **GET** /api/charging-logs-totalamount-customer/{id} | getTotalRevenuePerMonth
*HistoryResourceApi* | [**createHistoryUsingPOST**](docs/HistoryResourceApi.md#createHistoryUsingPOST) | **POST** /api/histories | createHistory
*HistoryResourceApi* | [**deleteHistoryUsingDELETE**](docs/HistoryResourceApi.md#deleteHistoryUsingDELETE) | **DELETE** /api/histories/{id} | deleteHistory
*HistoryResourceApi* | [**getAllHistoriesUsingGET**](docs/HistoryResourceApi.md#getAllHistoriesUsingGET) | **GET** /api/histories | getAllHistories
*HistoryResourceApi* | [**getHistoryUsingGET**](docs/HistoryResourceApi.md#getHistoryUsingGET) | **GET** /api/histories/{id} | getHistory
*HistoryResourceApi* | [**updateHistoryUsingPUT**](docs/HistoryResourceApi.md#updateHistoryUsingPUT) | **PUT** /api/histories | updateHistory
*InvoiceResourceApi* | [**createInvoiceUsingPOST**](docs/InvoiceResourceApi.md#createInvoiceUsingPOST) | **POST** /api/invoices | createInvoice
*InvoiceResourceApi* | [**deleteInvoiceUsingDELETE**](docs/InvoiceResourceApi.md#deleteInvoiceUsingDELETE) | **DELETE** /api/invoices/{id} | deleteInvoice
*InvoiceResourceApi* | [**getAllInvoicesUsingGET**](docs/InvoiceResourceApi.md#getAllInvoicesUsingGET) | **GET** /api/invoices | getAllInvoices
*InvoiceResourceApi* | [**getInvoiceBySubscriberUsingGET**](docs/InvoiceResourceApi.md#getInvoiceBySubscriberUsingGET) | **GET** /api/invoices/subscriber/{subscriberSecureId} | getInvoiceBySubscriber
*InvoiceResourceApi* | [**getInvoiceUsingGET**](docs/InvoiceResourceApi.md#getInvoiceUsingGET) | **GET** /api/invoices/{id} | getInvoice
*InvoiceResourceApi* | [**updateInvoiceUsingPUT**](docs/InvoiceResourceApi.md#updateInvoiceUsingPUT) | **PUT** /api/invoices | updateInvoice
*MessageTemplateResourceApi* | [**createMessageTemplateUsingPOST**](docs/MessageTemplateResourceApi.md#createMessageTemplateUsingPOST) | **POST** /api/message-templates | createMessageTemplate
*MessageTemplateResourceApi* | [**deleteMessageTemplateUsingDELETE**](docs/MessageTemplateResourceApi.md#deleteMessageTemplateUsingDELETE) | **DELETE** /api/message-templates/{id} | deleteMessageTemplate
*MessageTemplateResourceApi* | [**getAllMessageTemplatesUsingGET**](docs/MessageTemplateResourceApi.md#getAllMessageTemplatesUsingGET) | **GET** /api/message-templates | getAllMessageTemplates
*MessageTemplateResourceApi* | [**getMessageTemplateUsingGET1**](docs/MessageTemplateResourceApi.md#getMessageTemplateUsingGET1) | **GET** /api/message-templates/{id} | getMessageTemplate
*MessageTemplateResourceApi* | [**updateMessageTemplateUsingPUT**](docs/MessageTemplateResourceApi.md#updateMessageTemplateUsingPUT) | **PUT** /api/message-templates | updateMessageTemplate
*OfferResourceApi* | [**createOfferUsingPOST**](docs/OfferResourceApi.md#createOfferUsingPOST) | **POST** /api/offers | createOffer
*OfferResourceApi* | [**deleteOfferUsingDELETE**](docs/OfferResourceApi.md#deleteOfferUsingDELETE) | **DELETE** /api/offers/{id} | deleteOffer
*OfferResourceApi* | [**getAllOffersUsingGET**](docs/OfferResourceApi.md#getAllOffersUsingGET) | **GET** /api/offers | getAllOffers
*OfferResourceApi* | [**getOfferUsingGET**](docs/OfferResourceApi.md#getOfferUsingGET) | **GET** /api/offers/{id} | getOffer
*OfferResourceApi* | [**updateOfferUsingPUT**](docs/OfferResourceApi.md#updateOfferUsingPUT) | **PUT** /api/offers | updateOffer
*ProfileInfoResourceApi* | [**getActiveProfilesUsingGET**](docs/ProfileInfoResourceApi.md#getActiveProfilesUsingGET) | **GET** /api/profile-info | getActiveProfiles
*ServiceInstanceResourceApi* | [**createServiceInstanceUsingPOST**](docs/ServiceInstanceResourceApi.md#createServiceInstanceUsingPOST) | **POST** /api/service-instances | createServiceInstance
*ServiceInstanceResourceApi* | [**deleteServiceInstanceUsingDELETE**](docs/ServiceInstanceResourceApi.md#deleteServiceInstanceUsingDELETE) | **DELETE** /api/service-instances/{id} | deleteServiceInstance
*ServiceInstanceResourceApi* | [**getAllServiceInstancesUsingGET**](docs/ServiceInstanceResourceApi.md#getAllServiceInstancesUsingGET) | **GET** /api/service-instances | getAllServiceInstances
*ServiceInstanceResourceApi* | [**getServiceInstanceUsingGET**](docs/ServiceInstanceResourceApi.md#getServiceInstanceUsingGET) | **GET** /api/service-instances/{id} | getServiceInstance
*ServiceInstanceResourceApi* | [**updateServiceInstanceUsingPUT**](docs/ServiceInstanceResourceApi.md#updateServiceInstanceUsingPUT) | **PUT** /api/service-instances | updateServiceInstance
*ServiceOfferingResourceApi* | [**createServiceOfferingUsingPOST**](docs/ServiceOfferingResourceApi.md#createServiceOfferingUsingPOST) | **POST** /api/service-offerings | createServiceOffering
*ServiceOfferingResourceApi* | [**deleteServiceOfferingUsingDELETE**](docs/ServiceOfferingResourceApi.md#deleteServiceOfferingUsingDELETE) | **DELETE** /api/service-offerings/{id} | deleteServiceOffering
*ServiceOfferingResourceApi* | [**getAllServiceOfferingsUsingGET**](docs/ServiceOfferingResourceApi.md#getAllServiceOfferingsUsingGET) | **GET** /api/service-offerings | getAllServiceOfferings
*ServiceOfferingResourceApi* | [**getServiceOfferingUsingGET**](docs/ServiceOfferingResourceApi.md#getServiceOfferingUsingGET) | **GET** /api/service-offerings/{id} | getServiceOffering
*ServiceOfferingResourceApi* | [**updateServiceOfferingUsingPUT**](docs/ServiceOfferingResourceApi.md#updateServiceOfferingUsingPUT) | **PUT** /api/service-offerings | updateServiceOffering
*ServiceResourceApi* | [**createServiceUsingPOST**](docs/ServiceResourceApi.md#createServiceUsingPOST) | **POST** /api/services | createService
*ServiceResourceApi* | [**deleteServiceUsingDELETE**](docs/ServiceResourceApi.md#deleteServiceUsingDELETE) | **DELETE** /api/services/{id} | deleteService
*ServiceResourceApi* | [**getAllServicesUsingGET**](docs/ServiceResourceApi.md#getAllServicesUsingGET) | **GET** /api/services | getAllServices
*ServiceResourceApi* | [**getServiceUsingGET**](docs/ServiceResourceApi.md#getServiceUsingGET) | **GET** /api/services/{id} | getService
*ServiceResourceApi* | [**updateServiceUsingPUT**](docs/ServiceResourceApi.md#updateServiceUsingPUT) | **PUT** /api/services | updateService
*SubscriberResourceApi* | [**createSubscriberUsingPOST**](docs/SubscriberResourceApi.md#createSubscriberUsingPOST) | **POST** /api/subscribers | createSubscriber
*SubscriberResourceApi* | [**deleteSubscriberUsingDELETE**](docs/SubscriberResourceApi.md#deleteSubscriberUsingDELETE) | **DELETE** /api/subscribers/{id} | deleteSubscriber
*SubscriberResourceApi* | [**getAllSubscribersUsingGET**](docs/SubscriberResourceApi.md#getAllSubscribersUsingGET) | **GET** /api/subscribers | getAllSubscribers
*SubscriberResourceApi* | [**getSubscriberByEmailUsingGET**](docs/SubscriberResourceApi.md#getSubscriberByEmailUsingGET) | **GET** /api/subscribers/email/{email} | getSubscriberByEmail
*SubscriberResourceApi* | [**getSubscriberByNameUsingGET**](docs/SubscriberResourceApi.md#getSubscriberByNameUsingGET) | **GET** /api/subscribers/name/{name} | getSubscriberByName
*SubscriberResourceApi* | [**getSubscriberUsingGET**](docs/SubscriberResourceApi.md#getSubscriberUsingGET) | **GET** /api/subscribers/{id} | getSubscriber
*SubscriberResourceApi* | [**updateSubscriberUsingPUT**](docs/SubscriberResourceApi.md#updateSubscriberUsingPUT) | **PUT** /api/subscribers | updateSubscriber
*SubscriptionResourceApi* | [**cancelSubscriptionUsingPUT**](docs/SubscriptionResourceApi.md#cancelSubscriptionUsingPUT) | **PUT** /api/subscriptions/cancel | cancelSubscription
*SubscriptionResourceApi* | [**getActiveSubscriptionsUsingGET**](docs/SubscriptionResourceApi.md#getActiveSubscriptionsUsingGET) | **GET** /api/subsriptions/subscriber/{secureId} | getActiveSubscriptions
*SubscriptionResourceApi* | [**getAllCompanySubscriptionsUsingGET**](docs/SubscriptionResourceApi.md#getAllCompanySubscriptionsUsingGET) | **GET** /api/subscriptions/company/{id} | getAllCompanySubscriptions
*SubscriptionResourceApi* | [**getSubsriptionUsingGET**](docs/SubscriptionResourceApi.md#getSubsriptionUsingGET) | **GET** /api/subsriptions/{id} | getSubsription
*SubscriptionResourceApi* | [**startSubscriptionUsingPOST**](docs/SubscriptionResourceApi.md#startSubscriptionUsingPOST) | **POST** /api/subscriptions/start | startSubscription
*UsageNotificationResourceApi* | [**createUsageNotificationUsingPOST**](docs/UsageNotificationResourceApi.md#createUsageNotificationUsingPOST) | **POST** /api/usage-notifications | createUsageNotification
*UsageNotificationResourceApi* | [**deleteUsageNotificationUsingDELETE**](docs/UsageNotificationResourceApi.md#deleteUsageNotificationUsingDELETE) | **DELETE** /api/usage-notifications/{id} | deleteUsageNotification
*UsageNotificationResourceApi* | [**getAllUsageNotificationsUsingGET**](docs/UsageNotificationResourceApi.md#getAllUsageNotificationsUsingGET) | **GET** /api/usage-notifications | getAllUsageNotifications
*UsageNotificationResourceApi* | [**getUsageNotificationUsingGET**](docs/UsageNotificationResourceApi.md#getUsageNotificationUsingGET) | **GET** /api/usage-notifications/{id} | getUsageNotification
*UsageNotificationResourceApi* | [**updateUsageNotificationUsingPUT**](docs/UsageNotificationResourceApi.md#updateUsageNotificationUsingPUT) | **PUT** /api/usage-notifications | updateUsageNotification
*UserResourceApi* | [**createUserUsingPOST**](docs/UserResourceApi.md#createUserUsingPOST) | **POST** /api/users | createUser
*UserResourceApi* | [**deleteUserUsingDELETE**](docs/UserResourceApi.md#deleteUserUsingDELETE) | **DELETE** /api/users/{login} | deleteUser
*UserResourceApi* | [**getAllUsersUsingGET**](docs/UserResourceApi.md#getAllUsersUsingGET) | **GET** /api/users | getAllUsers
*UserResourceApi* | [**getAuthoritiesUsingGET**](docs/UserResourceApi.md#getAuthoritiesUsingGET) | **GET** /api/users/authorities | getAuthorities
*UserResourceApi* | [**getUserUsingGET**](docs/UserResourceApi.md#getUserUsingGET) | **GET** /api/users/{login} | getUser
*UserResourceApi* | [**updateUserUsingPUT**](docs/UserResourceApi.md#updateUserUsingPUT) | **PUT** /api/users | updateUser


## Documentation for Models

 - [Address](docs/Address.md)
 - [Authority](docs/Authority.md)
 - [Authorization](docs/Authorization.md)
 - [AuthorizedServicesResponse](docs/AuthorizedServicesResponse.md)
 - [Cancellation](docs/Cancellation.md)
 - [ChargingLog](docs/ChargingLog.md)
 - [Company](docs/Company.md)
 - [CompanyProps](docs/CompanyProps.md)
 - [Coupon](docs/Coupon.md)
 - [Deduction](docs/Deduction.md)
 - [DeductionResult](docs/DeductionResult.md)
 - [History](docs/History.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceRequest](docs/InvoiceRequest.md)
 - [ManagedUserVM](docs/ManagedUserVM.md)
 - [MessageTemplate](docs/MessageTemplate.md)
 - [Offer](docs/Offer.md)
 - [PaymentCard](docs/PaymentCard.md)
 - [ProfileInfoVM](docs/ProfileInfoVM.md)
 - [RecurrencePeriod](docs/RecurrencePeriod.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [SavedCard](docs/SavedCard.md)
 - [Service](docs/Service.md)
 - [ServiceInstance](docs/ServiceInstance.md)
 - [ServiceInstanceResult](docs/ServiceInstanceResult.md)
 - [ServiceOffering](docs/ServiceOffering.md)
 - [ServiceOfferingResult](docs/ServiceOfferingResult.md)
 - [StartSubscriptionRequest](docs/StartSubscriptionRequest.md)
 - [Subscriber](docs/Subscriber.md)
 - [SubscriptionCreateResult](docs/SubscriptionCreateResult.md)
 - [SubscriptionPlan](docs/SubscriptionPlan.md)
 - [Subsription](docs/Subsription.md)
 - [UsageNotification](docs/UsageNotification.md)
 - [User](docs/User.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



