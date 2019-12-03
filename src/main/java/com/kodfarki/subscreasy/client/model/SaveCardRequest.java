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
import com.kodfarki.subscreasy.client.model.PaymentCard;
import com.kodfarki.subscreasy.client.model.Subscriber;
import com.kodfarki.subscreasy.client.model.Subsription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SaveCardRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-03T15:39:09.262+03:00")
public class SaveCardRequest {
  @SerializedName("paymentCard")
  private PaymentCard paymentCard = null;

  @SerializedName("subscriber")
  private Subscriber subscriber = null;

  @SerializedName("subscription")
  private Subsription subscription = null;

  public SaveCardRequest paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")
  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }

  public SaveCardRequest subscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @ApiModelProperty(value = "")
  public Subscriber getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
  }

  public SaveCardRequest subscription(Subsription subscription) {
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
    SaveCardRequest saveCardRequest = (SaveCardRequest) o;
    return Objects.equals(this.paymentCard, saveCardRequest.paymentCard) &&
        Objects.equals(this.subscriber, saveCardRequest.subscriber) &&
        Objects.equals(this.subscription, saveCardRequest.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCard, subscriber, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveCardRequest {\n");
    
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
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

