
# ServiceInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capacity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currentUsage** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**numberOfUnits** | **Integer** |  |  [optional]
**offer** | [**Offer**](Offer.md) |  |  [optional]
**overUsage** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**overUsageQuota** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**quotaOrigin** | [**QuotaOriginEnum**](#QuotaOriginEnum) |  |  [optional]
**serviceOffering** | [**ServiceOffering**](ServiceOffering.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subscriberId** | **String** |  |  [optional]
**subscription** | [**Subsription**](Subsription.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**version** | **Long** |  |  [optional]


<a name="QuotaOriginEnum"></a>
## Enum: QuotaOriginEnum
Name | Value
---- | -----
SUBS | &quot;SUBS&quot;
OVER | &quot;OVER&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
ACTIVE | &quot;ACTIVE&quot;
SUSPENDED | &quot;SUSPENDED&quot;
FINISHED | &quot;FINISHED&quot;
CANCELLED | &quot;CANCELLED&quot;
IN_TRIAL | &quot;IN_TRIAL&quot;
PAYMENT_DUE | &quot;PAYMENT_DUE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ONOFF | &quot;ONOFF&quot;
SEAT_BASED | &quot;SEAT_BASED&quot;
USAGE_BASED | &quot;USAGE_BASED&quot;



