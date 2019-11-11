
# MessageTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | [**Company**](Company.md) |  | 
**enabled** | **Boolean** |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  [optional]
**id** | **Long** |  |  [optional]
**messageTemplate** | **String** |  |  [optional]
**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) |  |  [optional]
**sender** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
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
PRICE_UPDATED | &quot;PRICE_UPDATED&quot;


<a name="NotificationTypeEnum"></a>
## Enum: NotificationTypeEnum
Name | Value
---- | -----
WEBHOOK | &quot;WEBHOOK&quot;
EMAIL | &quot;EMAIL&quot;



