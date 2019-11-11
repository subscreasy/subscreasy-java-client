
# Job

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **Integer** |  |  [optional]
**company** | [**Company**](Company.md) |  |  [optional]
**createDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**detailProps** | **Map&lt;String, Object&gt;** |  |  [optional]
**details** | **String** |  |  [optional]
**executionCount** | **Integer** |  |  [optional]
**executionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**executionStatus** | [**ExecutionStatusEnum**](#ExecutionStatusEnum) |  |  [optional]
**firstExecutionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**modifyDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**priority** | **Integer** |  |  [optional]
**retryDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**retryRequired** | **Boolean** |  |  [optional]
**subscription** | [**Subsription**](Subsription.md) |  |  [optional]
**workflowId** | [**WorkflowIdEnum**](#WorkflowIdEnum) |  |  [optional]


<a name="ExecutionStatusEnum"></a>
## Enum: ExecutionStatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
WAITING | &quot;WAITING&quot;
RUNNING | &quot;RUNNING&quot;
PENDING | &quot;PENDING&quot;
FINISHED | &quot;FINISHED&quot;
FAILED | &quot;FAILED&quot;
CANCELLED | &quot;CANCELLED&quot;
EXPIRED | &quot;EXPIRED&quot;


<a name="WorkflowIdEnum"></a>
## Enum: WorkflowIdEnum
Name | Value
---- | -----
CHARGING | &quot;CHARGING&quot;
NOTIFY | &quot;NOTIFY&quot;
TERMINATION | &quot;TERMINATION&quot;
DAILY | &quot;DAILY&quot;
OFFLINE_PAYMENT_CHECK | &quot;OFFLINE_PAYMENT_CHECK&quot;



