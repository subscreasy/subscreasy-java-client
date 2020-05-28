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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * DeductionResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class DeductionResult {
  @SerializedName("capacity")
  private BigDecimal capacity = null;

  @SerializedName("consumedResourceId")
  private Long consumedResourceId = null;

  @SerializedName("overUsage")
  private BigDecimal overUsage = null;

  @SerializedName("requestedAmount")
  private Long requestedAmount = null;

  @SerializedName("subscriptionId")
  private Long subscriptionId = null;

  @SerializedName("usage")
  private BigDecimal usage = null;

  public DeductionResult capacity(BigDecimal capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCapacity() {
    return capacity;
  }

  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }

  public DeductionResult consumedResourceId(Long consumedResourceId) {
    this.consumedResourceId = consumedResourceId;
    return this;
  }

   /**
   * Get consumedResourceId
   * @return consumedResourceId
  **/
  @ApiModelProperty(value = "")
  public Long getConsumedResourceId() {
    return consumedResourceId;
  }

  public void setConsumedResourceId(Long consumedResourceId) {
    this.consumedResourceId = consumedResourceId;
  }

  public DeductionResult overUsage(BigDecimal overUsage) {
    this.overUsage = overUsage;
    return this;
  }

   /**
   * Get overUsage
   * @return overUsage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverUsage() {
    return overUsage;
  }

  public void setOverUsage(BigDecimal overUsage) {
    this.overUsage = overUsage;
  }

  public DeductionResult requestedAmount(Long requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

   /**
   * Get requestedAmount
   * @return requestedAmount
  **/
  @ApiModelProperty(value = "")
  public Long getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(Long requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public DeductionResult subscriptionId(Long subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Long subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public DeductionResult usage(BigDecimal usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeductionResult deductionResult = (DeductionResult) o;
    return Objects.equals(this.capacity, deductionResult.capacity) &&
        Objects.equals(this.consumedResourceId, deductionResult.consumedResourceId) &&
        Objects.equals(this.overUsage, deductionResult.overUsage) &&
        Objects.equals(this.requestedAmount, deductionResult.requestedAmount) &&
        Objects.equals(this.subscriptionId, deductionResult.subscriptionId) &&
        Objects.equals(this.usage, deductionResult.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, consumedResourceId, overUsage, requestedAmount, subscriptionId, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeductionResult {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    consumedResourceId: ").append(toIndentedString(consumedResourceId)).append("\n");
    sb.append("    overUsage: ").append(toIndentedString(overUsage)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

