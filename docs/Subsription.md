
# Subsription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedCoupon** | [**Coupon**](Coupon.md) |  |  [optional]
**cancelDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**card** | [**SavedCard**](SavedCard.md) |  |  [optional]
**company** | [**Company**](Company.md) |  | 
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**lastEvent** | [**LastEventEnum**](#LastEventEnum) |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional]
**services** | [**List&lt;ServiceInstance&gt;**](ServiceInstance.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subscriber** | [**Subscriber**](Subscriber.md) |  |  [optional]
**subscriberSecureId** | **String** |  |  [optional]
**termEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**termStartDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**trialEndDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="LastEventEnum"></a>
## Enum: LastEventEnum
Name | Value
---- | -----
STARTED | &quot;STARTED&quot;
RENEWED | &quot;RENEWED&quot;
RENEWAL_FAILED | &quot;RENEWAL_FAILED&quot;
FINISHED | &quot;FINISHED&quot;
CANCELLED | &quot;CANCELLED&quot;
SUBSCRIBER_CREATED | &quot;SUBSCRIBER_CREATED&quot;
SUBSCRIBER_UPDATED | &quot;SUBSCRIBER_UPDATED&quot;
TRIAL_ENDING | &quot;TRIAL_ENDING&quot;
PAYMENT_UPDATED | &quot;PAYMENT_UPDATED&quot;
IMMEDIATE_CANCELLATION_REQUESTED | &quot;IMMEDIATE_CANCELLATION_REQUESTED&quot;
ENDOFPERIOD_CANCELLATION_REQUESTED | &quot;ENDOFPERIOD_CANCELLATION_REQUESTED&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
OFFLINE | &quot;OFFLINE&quot;
CC | &quot;CC&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
FINISHED | &quot;FINISHED&quot;
CANCELLED | &quot;CANCELLED&quot;



