
# ServiceInstanceResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capacity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**overUsage** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | **String** |  |  [optional]
**usage** | [**BigDecimal**](BigDecimal.md) |  |  [optional]


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



