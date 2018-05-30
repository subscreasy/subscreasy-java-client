
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
**nextChargingDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**services** | [**List&lt;ServiceInstance&gt;**](ServiceInstance.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subscriberId** | **String** |  |  [optional]
**version** | **Long** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
FINISHED | &quot;FINISHED&quot;
CANCELLED | &quot;CANCELLED&quot;



