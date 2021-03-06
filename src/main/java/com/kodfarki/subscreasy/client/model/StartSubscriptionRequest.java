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
import com.kodfarki.subscreasy.client.model.Offer;
import com.kodfarki.subscreasy.client.model.PaymentCard;
import com.kodfarki.subscreasy.client.model.Subscriber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * StartSubscriptionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class StartSubscriptionRequest {
  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("companySiteName")
  private String companySiteName = null;

  @SerializedName("couponCode")
  private String couponCode = null;

  @SerializedName("editable")
  private Boolean editable = null;

  @SerializedName("offer")
  private Offer offer = null;

  @SerializedName("paymentCard")
  private PaymentCard paymentCard = null;

  /**
   * Gets or Sets paymentType
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    OFFLINE("OFFLINE"),
    
    CC("CC"),
    
    MOBILE("MOBILE");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String text) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paymentType")
  private PaymentTypeEnum paymentType = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("privacyPolicyUrl")
  private Boolean privacyPolicyUrl = null;

  /**
   * Gets or Sets productType
   */
  @JsonAdapter(ProductTypeEnum.Adapter.class)
  public enum ProductTypeEnum {
    PHYSICAL("PHYSICAL"),
    
    SERVICE("SERVICE");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String text) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProductTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProductTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("productType")
  private ProductTypeEnum productType = null;

  @SerializedName("subscriber")
  private Subscriber subscriber = null;

  @SerializedName("subscriberFromDb")
  private Subscriber subscriberFromDb = null;

  public StartSubscriptionRequest callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public StartSubscriptionRequest companySiteName(String companySiteName) {
    this.companySiteName = companySiteName;
    return this;
  }

   /**
   * Get companySiteName
   * @return companySiteName
  **/
  @ApiModelProperty(value = "")
  public String getCompanySiteName() {
    return companySiteName;
  }

  public void setCompanySiteName(String companySiteName) {
    this.companySiteName = companySiteName;
  }

  public StartSubscriptionRequest couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }

   /**
   * Get couponCode
   * @return couponCode
  **/
  @ApiModelProperty(value = "")
  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public StartSubscriptionRequest editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

   /**
   * Get editable
   * @return editable
  **/
  @ApiModelProperty(value = "")
  public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public StartSubscriptionRequest offer(Offer offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(value = "")
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public StartSubscriptionRequest paymentCard(PaymentCard paymentCard) {
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

  public StartSubscriptionRequest paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }

  public StartSubscriptionRequest price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public StartSubscriptionRequest privacyPolicyUrl(Boolean privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(Boolean privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public StartSubscriptionRequest productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public StartSubscriptionRequest subscriber(Subscriber subscriber) {
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

  public StartSubscriptionRequest subscriberFromDb(Subscriber subscriberFromDb) {
    this.subscriberFromDb = subscriberFromDb;
    return this;
  }

   /**
   * Get subscriberFromDb
   * @return subscriberFromDb
  **/
  @ApiModelProperty(value = "")
  public Subscriber getSubscriberFromDb() {
    return subscriberFromDb;
  }

  public void setSubscriberFromDb(Subscriber subscriberFromDb) {
    this.subscriberFromDb = subscriberFromDb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartSubscriptionRequest startSubscriptionRequest = (StartSubscriptionRequest) o;
    return Objects.equals(this.callbackUrl, startSubscriptionRequest.callbackUrl) &&
        Objects.equals(this.companySiteName, startSubscriptionRequest.companySiteName) &&
        Objects.equals(this.couponCode, startSubscriptionRequest.couponCode) &&
        Objects.equals(this.editable, startSubscriptionRequest.editable) &&
        Objects.equals(this.offer, startSubscriptionRequest.offer) &&
        Objects.equals(this.paymentCard, startSubscriptionRequest.paymentCard) &&
        Objects.equals(this.paymentType, startSubscriptionRequest.paymentType) &&
        Objects.equals(this.price, startSubscriptionRequest.price) &&
        Objects.equals(this.privacyPolicyUrl, startSubscriptionRequest.privacyPolicyUrl) &&
        Objects.equals(this.productType, startSubscriptionRequest.productType) &&
        Objects.equals(this.subscriber, startSubscriptionRequest.subscriber) &&
        Objects.equals(this.subscriberFromDb, startSubscriptionRequest.subscriberFromDb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, companySiteName, couponCode, editable, offer, paymentCard, paymentType, price, privacyPolicyUrl, productType, subscriber, subscriberFromDb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSubscriptionRequest {\n");
    
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    companySiteName: ").append(toIndentedString(companySiteName)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    subscriberFromDb: ").append(toIndentedString(subscriberFromDb)).append("\n");
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

