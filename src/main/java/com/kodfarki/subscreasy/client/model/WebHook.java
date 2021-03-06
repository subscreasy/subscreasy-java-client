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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebHook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class WebHook {
  @SerializedName("authenticationKey")
  private String authenticationKey = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("paymentUpdated")
  private Boolean paymentUpdated = null;

  @SerializedName("serverUrl")
  private String serverUrl = null;

  @SerializedName("subscriberCreated")
  private Boolean subscriberCreated = null;

  @SerializedName("subscriberUpdated")
  private Boolean subscriberUpdated = null;

  @SerializedName("subscriptionCreated")
  private Boolean subscriptionCreated = null;

  @SerializedName("subscriptionEnded")
  private Boolean subscriptionEnded = null;

  @SerializedName("subscriptionReactivated")
  private Boolean subscriptionReactivated = null;

  @SerializedName("subscriptionRenewalFailed")
  private Boolean subscriptionRenewalFailed = null;

  @SerializedName("subscriptionRenewed")
  private Boolean subscriptionRenewed = null;

  public WebHook authenticationKey(String authenticationKey) {
    this.authenticationKey = authenticationKey;
    return this;
  }

   /**
   * Get authenticationKey
   * @return authenticationKey
  **/
  @ApiModelProperty(value = "")
  public String getAuthenticationKey() {
    return authenticationKey;
  }

  public void setAuthenticationKey(String authenticationKey) {
    this.authenticationKey = authenticationKey;
  }

  public WebHook company(Company company) {
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

  public WebHook id(Long id) {
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

  public WebHook paymentUpdated(Boolean paymentUpdated) {
    this.paymentUpdated = paymentUpdated;
    return this;
  }

   /**
   * Get paymentUpdated
   * @return paymentUpdated
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaymentUpdated() {
    return paymentUpdated;
  }

  public void setPaymentUpdated(Boolean paymentUpdated) {
    this.paymentUpdated = paymentUpdated;
  }

  public WebHook serverUrl(String serverUrl) {
    this.serverUrl = serverUrl;
    return this;
  }

   /**
   * Get serverUrl
   * @return serverUrl
  **/
  @ApiModelProperty(value = "")
  public String getServerUrl() {
    return serverUrl;
  }

  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  public WebHook subscriberCreated(Boolean subscriberCreated) {
    this.subscriberCreated = subscriberCreated;
    return this;
  }

   /**
   * Get subscriberCreated
   * @return subscriberCreated
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberCreated() {
    return subscriberCreated;
  }

  public void setSubscriberCreated(Boolean subscriberCreated) {
    this.subscriberCreated = subscriberCreated;
  }

  public WebHook subscriberUpdated(Boolean subscriberUpdated) {
    this.subscriberUpdated = subscriberUpdated;
    return this;
  }

   /**
   * Get subscriberUpdated
   * @return subscriberUpdated
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberUpdated() {
    return subscriberUpdated;
  }

  public void setSubscriberUpdated(Boolean subscriberUpdated) {
    this.subscriberUpdated = subscriberUpdated;
  }

  public WebHook subscriptionCreated(Boolean subscriptionCreated) {
    this.subscriptionCreated = subscriptionCreated;
    return this;
  }

   /**
   * Get subscriptionCreated
   * @return subscriptionCreated
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionCreated() {
    return subscriptionCreated;
  }

  public void setSubscriptionCreated(Boolean subscriptionCreated) {
    this.subscriptionCreated = subscriptionCreated;
  }

  public WebHook subscriptionEnded(Boolean subscriptionEnded) {
    this.subscriptionEnded = subscriptionEnded;
    return this;
  }

   /**
   * Get subscriptionEnded
   * @return subscriptionEnded
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionEnded() {
    return subscriptionEnded;
  }

  public void setSubscriptionEnded(Boolean subscriptionEnded) {
    this.subscriptionEnded = subscriptionEnded;
  }

  public WebHook subscriptionReactivated(Boolean subscriptionReactivated) {
    this.subscriptionReactivated = subscriptionReactivated;
    return this;
  }

   /**
   * Get subscriptionReactivated
   * @return subscriptionReactivated
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionReactivated() {
    return subscriptionReactivated;
  }

  public void setSubscriptionReactivated(Boolean subscriptionReactivated) {
    this.subscriptionReactivated = subscriptionReactivated;
  }

  public WebHook subscriptionRenewalFailed(Boolean subscriptionRenewalFailed) {
    this.subscriptionRenewalFailed = subscriptionRenewalFailed;
    return this;
  }

   /**
   * Get subscriptionRenewalFailed
   * @return subscriptionRenewalFailed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionRenewalFailed() {
    return subscriptionRenewalFailed;
  }

  public void setSubscriptionRenewalFailed(Boolean subscriptionRenewalFailed) {
    this.subscriptionRenewalFailed = subscriptionRenewalFailed;
  }

  public WebHook subscriptionRenewed(Boolean subscriptionRenewed) {
    this.subscriptionRenewed = subscriptionRenewed;
    return this;
  }

   /**
   * Get subscriptionRenewed
   * @return subscriptionRenewed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionRenewed() {
    return subscriptionRenewed;
  }

  public void setSubscriptionRenewed(Boolean subscriptionRenewed) {
    this.subscriptionRenewed = subscriptionRenewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHook webHook = (WebHook) o;
    return Objects.equals(this.authenticationKey, webHook.authenticationKey) &&
        Objects.equals(this.company, webHook.company) &&
        Objects.equals(this.id, webHook.id) &&
        Objects.equals(this.paymentUpdated, webHook.paymentUpdated) &&
        Objects.equals(this.serverUrl, webHook.serverUrl) &&
        Objects.equals(this.subscriberCreated, webHook.subscriberCreated) &&
        Objects.equals(this.subscriberUpdated, webHook.subscriberUpdated) &&
        Objects.equals(this.subscriptionCreated, webHook.subscriptionCreated) &&
        Objects.equals(this.subscriptionEnded, webHook.subscriptionEnded) &&
        Objects.equals(this.subscriptionReactivated, webHook.subscriptionReactivated) &&
        Objects.equals(this.subscriptionRenewalFailed, webHook.subscriptionRenewalFailed) &&
        Objects.equals(this.subscriptionRenewed, webHook.subscriptionRenewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationKey, company, id, paymentUpdated, serverUrl, subscriberCreated, subscriberUpdated, subscriptionCreated, subscriptionEnded, subscriptionReactivated, subscriptionRenewalFailed, subscriptionRenewed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHook {\n");
    
    sb.append("    authenticationKey: ").append(toIndentedString(authenticationKey)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentUpdated: ").append(toIndentedString(paymentUpdated)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    subscriberCreated: ").append(toIndentedString(subscriberCreated)).append("\n");
    sb.append("    subscriberUpdated: ").append(toIndentedString(subscriberUpdated)).append("\n");
    sb.append("    subscriptionCreated: ").append(toIndentedString(subscriptionCreated)).append("\n");
    sb.append("    subscriptionEnded: ").append(toIndentedString(subscriptionEnded)).append("\n");
    sb.append("    subscriptionReactivated: ").append(toIndentedString(subscriptionReactivated)).append("\n");
    sb.append("    subscriptionRenewalFailed: ").append(toIndentedString(subscriptionRenewalFailed)).append("\n");
    sb.append("    subscriptionRenewed: ").append(toIndentedString(subscriptionRenewed)).append("\n");
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

