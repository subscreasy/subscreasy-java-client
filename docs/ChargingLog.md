
# ChargingLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appliedCoupon** | **Long** |  |  [optional]
**authCode** | **String** |  |  [optional]
**companyId** | **Long** |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**errorCode** | **String** |  |  [optional]
**errorText** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**invoiceId** | **Long** |  |  [optional]
**jobId** | **Long** |  |  [optional]
**parent** | [**ChargingLog**](ChargingLog.md) |  |  [optional]
**paymentGateway** | [**PaymentGatewayEnum**](#PaymentGatewayEnum) |  |  [optional]
**paymentId** | **String** |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional]
**serviceInstanceId** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**subscriberSecureId** | **String** |  |  [optional]
**subscriptionId** | **Long** |  |  [optional]
**transactionId** | **String** |  |  [optional]


<a name="PaymentGatewayEnum"></a>
## Enum: PaymentGatewayEnum
Name | Value
---- | -----
OFFLINE | &quot;OFFLINE&quot;
IYZICO | &quot;IYZICO&quot;
PAYU | &quot;PAYU&quot;


<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
START | &quot;START&quot;
RENEWAL | &quot;RENEWAL&quot;
OVER_USAGE | &quot;OVER_USAGE&quot;
REFUND | &quot;REFUND&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NOT_PAID | &quot;NOT_PAID&quot;
SUCCESS | &quot;SUCCESS&quot;
FAIL | &quot;FAIL&quot;
REFUNDED | &quot;REFUNDED&quot;



