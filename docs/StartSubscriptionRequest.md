
# StartSubscriptionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callbackUrl** | **String** |  |  [optional]
**companySiteName** | **String** |  |  [optional]
**couponCode** | **String** |  |  [optional]
**editable** | **Boolean** |  |  [optional]
**offer** | [**Offer**](Offer.md) |  |  [optional]
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**privacyPolicyUrl** | **Boolean** |  |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) |  |  [optional]
**subscriber** | [**Subscriber**](Subscriber.md) |  |  [optional]
**subscriberFromDb** | [**Subscriber**](Subscriber.md) |  |  [optional]


<a name="PaymentTypeEnum"></a>
## Enum: PaymentTypeEnum
Name | Value
---- | -----
OFFLINE | &quot;OFFLINE&quot;
CC | &quot;CC&quot;
MOBILE | &quot;MOBILE&quot;


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;PHYSICAL&quot;
SERVICE | &quot;SERVICE&quot;



