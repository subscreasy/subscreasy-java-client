
# Offer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | [**Company**](Company.md) |  | 
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  | 
**description** | **String** |  |  [optional]
**disablePaymentForm** | **Boolean** |  | 
**id** | **Long** |  |  [optional]
**imagePath** | **String** |  |  [optional]
**multiplePurchase** | **Boolean** |  | 
**name** | **String** |  | 
**openEnded** | **Boolean** |  | 
**physicalProduct** | **Boolean** |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  | 
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) |  |  [optional]
**recurrence** | [**RecurrencePeriod**](RecurrencePeriod.md) |  |  [optional]
**recurrenceCount** | **Integer** |  |  [optional]
**renewalBillcycleBased** | **Boolean** |  |  [optional]
**renewalType** | [**RenewalTypeEnum**](#RenewalTypeEnum) |  |  [optional]
**secureId** | **String** |  |  [optional]
**trialPeriod** | **Integer** |  |  [optional]


<a name="CurrencyEnum"></a>
## Enum: CurrencyEnum
Name | Value
---- | -----
TRY | &quot;TRY&quot;
USD | &quot;USD&quot;


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
PHYSICAL | &quot;PHYSICAL&quot;
SERVICE | &quot;SERVICE&quot;


<a name="RenewalTypeEnum"></a>
## Enum: RenewalTypeEnum
Name | Value
---- | -----
BILLCYCLE | &quot;BILLCYCLE&quot;
START_DATE | &quot;START_DATE&quot;



