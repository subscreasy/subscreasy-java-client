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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Deduction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-03T15:39:09.262+03:00")
public class Deduction {
  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("serviceId")
  private Long serviceId = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("subscriberEmail")
  private String subscriberEmail = null;

  @SerializedName("subscriberSecureId")
  private String subscriberSecureId = null;

  @SerializedName("usageEndTime")
  private OffsetDateTime usageEndTime = null;

  @SerializedName("usageStartTime")
  private OffsetDateTime usageStartTime = null;

  public Deduction amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Deduction id(Long id) {
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

  public Deduction serviceId(Long serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }

  public Deduction serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Deduction subscriberEmail(String subscriberEmail) {
    this.subscriberEmail = subscriberEmail;
    return this;
  }

   /**
   * Get subscriberEmail
   * @return subscriberEmail
  **/
  @ApiModelProperty(value = "")
  public String getSubscriberEmail() {
    return subscriberEmail;
  }

  public void setSubscriberEmail(String subscriberEmail) {
    this.subscriberEmail = subscriberEmail;
  }

  public Deduction subscriberSecureId(String subscriberSecureId) {
    this.subscriberSecureId = subscriberSecureId;
    return this;
  }

   /**
   * Get subscriberSecureId
   * @return subscriberSecureId
  **/
  @ApiModelProperty(value = "")
  public String getSubscriberSecureId() {
    return subscriberSecureId;
  }

  public void setSubscriberSecureId(String subscriberSecureId) {
    this.subscriberSecureId = subscriberSecureId;
  }

  public Deduction usageEndTime(OffsetDateTime usageEndTime) {
    this.usageEndTime = usageEndTime;
    return this;
  }

   /**
   * Get usageEndTime
   * @return usageEndTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUsageEndTime() {
    return usageEndTime;
  }

  public void setUsageEndTime(OffsetDateTime usageEndTime) {
    this.usageEndTime = usageEndTime;
  }

  public Deduction usageStartTime(OffsetDateTime usageStartTime) {
    this.usageStartTime = usageStartTime;
    return this;
  }

   /**
   * Get usageStartTime
   * @return usageStartTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUsageStartTime() {
    return usageStartTime;
  }

  public void setUsageStartTime(OffsetDateTime usageStartTime) {
    this.usageStartTime = usageStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deduction deduction = (Deduction) o;
    return Objects.equals(this.amount, deduction.amount) &&
        Objects.equals(this.id, deduction.id) &&
        Objects.equals(this.serviceId, deduction.serviceId) &&
        Objects.equals(this.serviceName, deduction.serviceName) &&
        Objects.equals(this.subscriberEmail, deduction.subscriberEmail) &&
        Objects.equals(this.subscriberSecureId, deduction.subscriberSecureId) &&
        Objects.equals(this.usageEndTime, deduction.usageEndTime) &&
        Objects.equals(this.usageStartTime, deduction.usageStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, serviceId, serviceName, subscriberEmail, subscriberSecureId, usageEndTime, usageStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deduction {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    subscriberEmail: ").append(toIndentedString(subscriberEmail)).append("\n");
    sb.append("    subscriberSecureId: ").append(toIndentedString(subscriberSecureId)).append("\n");
    sb.append("    usageEndTime: ").append(toIndentedString(usageEndTime)).append("\n");
    sb.append("    usageStartTime: ").append(toIndentedString(usageStartTime)).append("\n");
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

