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
import com.kodfarki.subscreasy.client.model.SavedCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * ChargingLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-11T10:08:09.886+03:00")
public class ChargingLog {
  @SerializedName("appliedCoupon")
  private Long appliedCoupon = null;

  @SerializedName("authCode")
  private String authCode = null;

  @SerializedName("companyId")
  private Long companyId = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("errorText")
  private String errorText = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("invoiceId")
  private Long invoiceId = null;

  @SerializedName("jobId")
  private Long jobId = null;

  @SerializedName("offerId")
  private Long offerId = null;

  @SerializedName("parentId")
  private Long parentId = null;

  /**
   * Gets or Sets paymentGateway
   */
  @JsonAdapter(PaymentGatewayEnum.Adapter.class)
  public enum PaymentGatewayEnum {
    OFFLINE("OFFLINE"),
    
    IYZICO("IYZICO"),
    
    PAYU("PAYU"),
    
    PAYTR("PAYTR"),
    
    MOBILEXPRESS("MOBILEXPRESS");

    private String value;

    PaymentGatewayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentGatewayEnum fromValue(String text) {
      for (PaymentGatewayEnum b : PaymentGatewayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentGatewayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentGatewayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentGatewayEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentGatewayEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paymentGateway")
  private PaymentGatewayEnum paymentGateway = null;

  @SerializedName("paymentId")
  private String paymentId = null;

  @SerializedName("price")
  private BigDecimal price = null;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    START("START"),
    
    RENEWAL("RENEWAL"),
    
    OVER_USAGE("OVER_USAGE"),
    
    REFUND("REFUND"),
    
    SAVE_CARD("SAVE_CARD"),
    
    TRIAL_PERIOD("TRIAL_PERIOD");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reason")
  private ReasonEnum reason = null;

  @SerializedName("refundDate")
  private OffsetDateTime refundDate = null;

  @SerializedName("savedCard")
  private SavedCard savedCard = null;

  @SerializedName("savedCardId")
  private Long savedCardId = null;

  @SerializedName("serviceInstanceId")
  private Long serviceInstanceId = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_PAID("NOT_PAID"),
    
    PAID("PAID"),
    
    FAIL("FAIL"),
    
    REFUNDED("REFUNDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("subscriberId")
  private Long subscriberId = null;

  @SerializedName("subscriberSecureId")
  private String subscriberSecureId = null;

  @SerializedName("subscriptionId")
  private Long subscriptionId = null;

  @SerializedName("threeds")
  private Boolean threeds = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  public ChargingLog appliedCoupon(Long appliedCoupon) {
    this.appliedCoupon = appliedCoupon;
    return this;
  }

   /**
   * Get appliedCoupon
   * @return appliedCoupon
  **/
  @ApiModelProperty(value = "")
  public Long getAppliedCoupon() {
    return appliedCoupon;
  }

  public void setAppliedCoupon(Long appliedCoupon) {
    this.appliedCoupon = appliedCoupon;
  }

  public ChargingLog authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Get authCode
   * @return authCode
  **/
  @ApiModelProperty(value = "")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public ChargingLog companyId(Long companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }

  public ChargingLog createDate(OffsetDateTime createDate) {
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

  public ChargingLog currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ChargingLog errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ChargingLog errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }

   /**
   * Get errorText
   * @return errorText
  **/
  @ApiModelProperty(value = "")
  public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }

  public ChargingLog id(Long id) {
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

  public ChargingLog invoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(value = "")
  public Long getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Long invoiceId) {
    this.invoiceId = invoiceId;
  }

  public ChargingLog jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(value = "")
  public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public ChargingLog offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")
  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }

  public ChargingLog parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public ChargingLog paymentGateway(PaymentGatewayEnum paymentGateway) {
    this.paymentGateway = paymentGateway;
    return this;
  }

   /**
   * Get paymentGateway
   * @return paymentGateway
  **/
  @ApiModelProperty(value = "")
  public PaymentGatewayEnum getPaymentGateway() {
    return paymentGateway;
  }

  public void setPaymentGateway(PaymentGatewayEnum paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public ChargingLog paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public ChargingLog price(BigDecimal price) {
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

  public ChargingLog reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ChargingLog refundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
    return this;
  }

   /**
   * Get refundDate
   * @return refundDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
  }

  public ChargingLog savedCard(SavedCard savedCard) {
    this.savedCard = savedCard;
    return this;
  }

   /**
   * Get savedCard
   * @return savedCard
  **/
  @ApiModelProperty(value = "")
  public SavedCard getSavedCard() {
    return savedCard;
  }

  public void setSavedCard(SavedCard savedCard) {
    this.savedCard = savedCard;
  }

  public ChargingLog savedCardId(Long savedCardId) {
    this.savedCardId = savedCardId;
    return this;
  }

   /**
   * Get savedCardId
   * @return savedCardId
  **/
  @ApiModelProperty(value = "")
  public Long getSavedCardId() {
    return savedCardId;
  }

  public void setSavedCardId(Long savedCardId) {
    this.savedCardId = savedCardId;
  }

  public ChargingLog serviceInstanceId(Long serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
    return this;
  }

   /**
   * Get serviceInstanceId
   * @return serviceInstanceId
  **/
  @ApiModelProperty(value = "")
  public Long getServiceInstanceId() {
    return serviceInstanceId;
  }

  public void setServiceInstanceId(Long serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
  }

  public ChargingLog status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ChargingLog subscriberId(Long subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

   /**
   * Get subscriberId
   * @return subscriberId
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(Long subscriberId) {
    this.subscriberId = subscriberId;
  }

  public ChargingLog subscriberSecureId(String subscriberSecureId) {
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

  public ChargingLog subscriptionId(Long subscriptionId) {
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

  public ChargingLog threeds(Boolean threeds) {
    this.threeds = threeds;
    return this;
  }

   /**
   * Get threeds
   * @return threeds
  **/
  @ApiModelProperty(value = "")
  public Boolean isThreeds() {
    return threeds;
  }

  public void setThreeds(Boolean threeds) {
    this.threeds = threeds;
  }

  public ChargingLog transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingLog chargingLog = (ChargingLog) o;
    return Objects.equals(this.appliedCoupon, chargingLog.appliedCoupon) &&
        Objects.equals(this.authCode, chargingLog.authCode) &&
        Objects.equals(this.companyId, chargingLog.companyId) &&
        Objects.equals(this.createDate, chargingLog.createDate) &&
        Objects.equals(this.currency, chargingLog.currency) &&
        Objects.equals(this.errorCode, chargingLog.errorCode) &&
        Objects.equals(this.errorText, chargingLog.errorText) &&
        Objects.equals(this.id, chargingLog.id) &&
        Objects.equals(this.invoiceId, chargingLog.invoiceId) &&
        Objects.equals(this.jobId, chargingLog.jobId) &&
        Objects.equals(this.offerId, chargingLog.offerId) &&
        Objects.equals(this.parentId, chargingLog.parentId) &&
        Objects.equals(this.paymentGateway, chargingLog.paymentGateway) &&
        Objects.equals(this.paymentId, chargingLog.paymentId) &&
        Objects.equals(this.price, chargingLog.price) &&
        Objects.equals(this.reason, chargingLog.reason) &&
        Objects.equals(this.refundDate, chargingLog.refundDate) &&
        Objects.equals(this.savedCard, chargingLog.savedCard) &&
        Objects.equals(this.savedCardId, chargingLog.savedCardId) &&
        Objects.equals(this.serviceInstanceId, chargingLog.serviceInstanceId) &&
        Objects.equals(this.status, chargingLog.status) &&
        Objects.equals(this.subscriberId, chargingLog.subscriberId) &&
        Objects.equals(this.subscriberSecureId, chargingLog.subscriberSecureId) &&
        Objects.equals(this.subscriptionId, chargingLog.subscriptionId) &&
        Objects.equals(this.threeds, chargingLog.threeds) &&
        Objects.equals(this.transactionId, chargingLog.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedCoupon, authCode, companyId, createDate, currency, errorCode, errorText, id, invoiceId, jobId, offerId, parentId, paymentGateway, paymentId, price, reason, refundDate, savedCard, savedCardId, serviceInstanceId, status, subscriberId, subscriberSecureId, subscriptionId, threeds, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingLog {\n");
    
    sb.append("    appliedCoupon: ").append(toIndentedString(appliedCoupon)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    savedCard: ").append(toIndentedString(savedCard)).append("\n");
    sb.append("    savedCardId: ").append(toIndentedString(savedCardId)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    subscriberSecureId: ").append(toIndentedString(subscriberSecureId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    threeds: ").append(toIndentedString(threeds)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

