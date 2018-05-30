
# Coupon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**currentUsage** | **Integer** |  |  [optional]
**discountAmount** | [**BigDecimal**](BigDecimal.md) |  | 
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) |  | 
**expireDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**maxLimit** | **Integer** |  | 


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum
Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
PERCENTAGE | &quot;PERCENTAGE&quot;



