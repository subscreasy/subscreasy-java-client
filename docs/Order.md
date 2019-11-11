
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyer** | [**Subscriber**](Subscriber.md) |  | 
**company** | [**Company**](Company.md) |  | 
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**offer** | [**Offer**](Offer.md) |  | 
**payment** | [**ChargingLog**](ChargingLog.md) |  |  [optional]
**shippingAddress** | **Long** |  |  [optional]
**shippingCode** | **String** |  |  [optional]
**shippingCompany** | [**ShippingCompanyEnum**](#ShippingCompanyEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**subscription** | **Long** |  | 


<a name="ShippingCompanyEnum"></a>
## Enum: ShippingCompanyEnum
Name | Value
---- | -----
MNG | &quot;MNG&quot;
SURAT | &quot;SURAT&quot;
YURTICI | &quot;YURTICI&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PREPARING | &quot;PREPARING&quot;
SHIPPED | &quot;SHIPPED&quot;
DELIVERED | &quot;DELIVERED&quot;
CANCELLED | &quot;CANCELLED&quot;



