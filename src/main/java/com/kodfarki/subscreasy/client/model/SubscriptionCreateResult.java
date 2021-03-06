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
import com.kodfarki.subscreasy.client.model.ChargingLog;
import com.kodfarki.subscreasy.client.model.Subsription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubscriptionCreateResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-30T00:20:36.956+03:00")
public class SubscriptionCreateResult {
  @SerializedName("payment")
  private ChargingLog payment = null;

  @SerializedName("subscription")
  private Subsription subscription = null;

  public SubscriptionCreateResult payment(ChargingLog payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")
  public ChargingLog getPayment() {
    return payment;
  }

  public void setPayment(ChargingLog payment) {
    this.payment = payment;
  }

  public SubscriptionCreateResult subscription(Subsription subscription) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCreateResult subscriptionCreateResult = (SubscriptionCreateResult) o;
    return Objects.equals(this.payment, subscriptionCreateResult.payment) &&
        Objects.equals(this.subscription, subscriptionCreateResult.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreateResult {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

