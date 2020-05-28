/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kodfarki.subscreasy.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kodfarki.subscreasy.client.model.Company;
import com.kodfarki.subscreasy.client.model.Subsription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Job
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class Job {
  @SerializedName("activityId")
  private Integer activityId = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("detailProps")
  private Map<String, Object> detailProps = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("executionCount")
  private Integer executionCount = null;

  @SerializedName("executionDate")
  private OffsetDateTime executionDate = null;

  /**
   * Gets or Sets executionStatus
   */
  @JsonAdapter(ExecutionStatusEnum.Adapter.class)
  public enum ExecutionStatusEnum {
    NEW("NEW"),
    
    WAITING("WAITING"),
    
    RUNNING("RUNNING"),
    
    PENDING("PENDING"),
    
    FINISHED("FINISHED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED");

    private String value;

    ExecutionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExecutionStatusEnum fromValue(String text) {
      for (ExecutionStatusEnum b : ExecutionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExecutionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExecutionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExecutionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExecutionStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("executionStatus")
  private ExecutionStatusEnum executionStatus = null;

  @SerializedName("firstExecutionDate")
  private OffsetDateTime firstExecutionDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("retryDate")
  private OffsetDateTime retryDate = null;

  @SerializedName("retryRequired")
  private Boolean retryRequired = null;

  @SerializedName("subscription")
  private Subsription subscription = null;

  /**
   * Gets or Sets workflowId
   */
  @JsonAdapter(WorkflowIdEnum.Adapter.class)
  public enum WorkflowIdEnum {
    CHARGING("CHARGING"),
    
    NOTIFY("NOTIFY"),
    
    TERMINATION("TERMINATION"),
    
    DAILY("DAILY"),
    
    OFFLINE_PAYMENT_CHECK("OFFLINE_PAYMENT_CHECK");

    private String value;

    WorkflowIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowIdEnum fromValue(String text) {
      for (WorkflowIdEnum b : WorkflowIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WorkflowIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowIdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorkflowIdEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("workflowId")
  private WorkflowIdEnum workflowId = null;

  public Job activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")
  public Integer getActivityId() {
    return activityId;
  }

  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }

  public Job company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Job createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public Job detailProps(Map<String, Object> detailProps) {
    this.detailProps = detailProps;
    return this;
  }

  public Job putDetailPropsItem(String key, Object detailPropsItem) {
    if (this.detailProps == null) {
      this.detailProps = new HashMap<String, Object>();
    }
    this.detailProps.put(key, detailPropsItem);
    return this;
  }

   /**
   * Get detailProps
   * @return detailProps
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getDetailProps() {
    return detailProps;
  }

  public void setDetailProps(Map<String, Object> detailProps) {
    this.detailProps = detailProps;
  }

  public Job details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Job executionCount(Integer executionCount) {
    this.executionCount = executionCount;
    return this;
  }

   /**
   * Get executionCount
   * @return executionCount
  **/
  @ApiModelProperty(value = "")
  public Integer getExecutionCount() {
    return executionCount;
  }

  public void setExecutionCount(Integer executionCount) {
    this.executionCount = executionCount;
  }

  public Job executionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Get executionDate
   * @return executionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }

  public Job executionStatus(ExecutionStatusEnum executionStatus) {
    this.executionStatus = executionStatus;
    return this;
  }

   /**
   * Get executionStatus
   * @return executionStatus
  **/
  @ApiModelProperty(value = "")
  public ExecutionStatusEnum getExecutionStatus() {
    return executionStatus;
  }

  public void setExecutionStatus(ExecutionStatusEnum executionStatus) {
    this.executionStatus = executionStatus;
  }

  public Job firstExecutionDate(OffsetDateTime firstExecutionDate) {
    this.firstExecutionDate = firstExecutionDate;
    return this;
  }

   /**
   * Get firstExecutionDate
   * @return firstExecutionDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFirstExecutionDate() {
    return firstExecutionDate;
  }

  public void setFirstExecutionDate(OffsetDateTime firstExecutionDate) {
    this.firstExecutionDate = firstExecutionDate;
  }

  public Job id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Job modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Job priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Job retryDate(OffsetDateTime retryDate) {
    this.retryDate = retryDate;
    return this;
  }

   /**
   * Get retryDate
   * @return retryDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRetryDate() {
    return retryDate;
  }

  public void setRetryDate(OffsetDateTime retryDate) {
    this.retryDate = retryDate;
  }

  public Job retryRequired(Boolean retryRequired) {
    this.retryRequired = retryRequired;
    return this;
  }

   /**
   * Get retryRequired
   * @return retryRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isRetryRequired() {
    return retryRequired;
  }

  public void setRetryRequired(Boolean retryRequired) {
    this.retryRequired = retryRequired;
  }

  public Job subscription(Subsription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public Subsription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subsription subscription) {
    this.subscription = subscription;
  }

  public Job workflowId(WorkflowIdEnum workflowId) {
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @ApiModelProperty(value = "")
  public WorkflowIdEnum getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(WorkflowIdEnum workflowId) {
    this.workflowId = workflowId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.activityId, job.activityId) &&
        Objects.equals(this.company, job.company) &&
        Objects.equals(this.createDate, job.createDate) &&
        Objects.equals(this.detailProps, job.detailProps) &&
        Objects.equals(this.details, job.details) &&
        Objects.equals(this.executionCount, job.executionCount) &&
        Objects.equals(this.executionDate, job.executionDate) &&
        Objects.equals(this.executionStatus, job.executionStatus) &&
        Objects.equals(this.firstExecutionDate, job.firstExecutionDate) &&
        Objects.equals(this.id, job.id) &&
        Objects.equals(this.modifyDate, job.modifyDate) &&
        Objects.equals(this.priority, job.priority) &&
        Objects.equals(this.retryDate, job.retryDate) &&
        Objects.equals(this.retryRequired, job.retryRequired) &&
        Objects.equals(this.subscription, job.subscription) &&
        Objects.equals(this.workflowId, job.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, company, createDate, detailProps, details, executionCount, executionDate, executionStatus, firstExecutionDate, id, modifyDate, priority, retryDate, retryRequired, subscription, workflowId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    detailProps: ").append(toIndentedString(detailProps)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    executionCount: ").append(toIndentedString(executionCount)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    executionStatus: ").append(toIndentedString(executionStatus)).append("\n");
    sb.append("    firstExecutionDate: ").append(toIndentedString(firstExecutionDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    retryDate: ").append(toIndentedString(retryDate)).append("\n");
    sb.append("    retryRequired: ").append(toIndentedString(retryRequired)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

