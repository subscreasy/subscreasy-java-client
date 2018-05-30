
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
FINISHED | &quot;FINISHED&quot;
CANCELLED | &quot;CANCELLED&quot;


<a name="NotificationTypeEnum"></a>
## Enum: NotificationTypeEnum
Name | Value
---- | -----
WEBHOOK | &quot;WEBHOOK&quot;
EMAIL | &quot;EMAIL&quot;



