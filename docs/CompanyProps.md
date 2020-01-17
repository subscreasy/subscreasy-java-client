
# CompanyProps

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aktifbankClientId** | **Integer** |  |  [optional]
**aktifbankEncryptionKey** | **String** |  |  [optional]
**aktifbankName** | **String** |  |  [optional]
**aktifbankPassword** | **String** |  |  [optional]
**billingDate** | **Integer** |  |  [optional]
**billingInformationMandatory** | **Boolean** |  | 
**billingThresholdDays** | **Integer** |  |  [optional]
**branding** | **Boolean** |  | 
**callbackUrl** | **String** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**contactEmail** | **String** |  |  [optional]
**domainName** | **String** |  | 
**hostedPageCSSPath** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**logoPath** | **String** |  |  [optional]
**mobilExpressApiPassword** | **String** |  |  [optional]
**mobilExpressMerchantKey** | **String** |  |  [optional]
**mobilExpressPosid** | **Integer** |  |  [optional]
**mobilePaymentGateway** | [**MobilePaymentGatewayEnum**](#MobilePaymentGatewayEnum) |  |  [optional]
**notifyNewSubscription** | **Boolean** |  | 
**notifyRenewal** | **Boolean** |  | 
**notifySubscriptionCancellation** | **Boolean** |  | 
**paymentGateway** | [**PaymentGatewayEnum**](#PaymentGatewayEnum) |  |  [optional]
**paymentGatewayApiKey** | **String** |  |  [optional]
**paymentGatewaySecurityKey** | **String** |  |  [optional]
**paytrDirectApiEnabled** | **Boolean** |  |  [optional]
**paytrMerchantId** | **Integer** |  |  [optional]
**payuMerchantKeyRenewals** | **String** |  |  [optional]
**payuSecretKeyRenewals** | **String** |  |  [optional]
**privacyPolicyUrl** | **String** |  |  [optional]
**sendDailyReports** | **String** |  |  [optional]
**subscreasyApiKey** | **String** |  |  [optional]
**subscreasySecureKey** | **String** |  |  [optional]
**wirecardErrorMessage** | **String** |  |  [optional]
**wirecardPin** | **String** |  |  [optional]
**wirecardSuccessfulMessage** | **String** |  |  [optional]
**wirecardTurkcellServisId** | **String** |  |  [optional]
**wirecardUserCode** | **String** |  |  [optional]


<a name="MobilePaymentGatewayEnum"></a>
## Enum: MobilePaymentGatewayEnum
Name | Value
---- | -----
DISABLED | &quot;DISABLED&quot;
WIRECARD | &quot;WIRECARD&quot;


<a name="PaymentGatewayEnum"></a>
## Enum: PaymentGatewayEnum
Name | Value
---- | -----
OFFLINE | &quot;OFFLINE&quot;
IYZICO | &quot;IYZICO&quot;
PAYU | &quot;PAYU&quot;
PAYTR | &quot;PAYTR&quot;
MOBILEXPRESS | &quot;MOBILEXPRESS&quot;
AKTIFBANK | &quot;AKTIFBANK&quot;



