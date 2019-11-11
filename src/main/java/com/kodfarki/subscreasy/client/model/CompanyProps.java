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
import com.kodfarki.subscreasy.client.model.Company;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CompanyProps
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-11T10:08:09.886+03:00")
public class CompanyProps {
  @SerializedName("billingDate")
  private Integer billingDate = null;

  @SerializedName("billingInformationMandatory")
  private Boolean billingInformationMandatory = null;

  @SerializedName("billingThresholdDays")
  private Integer billingThresholdDays = null;

  @SerializedName("branding")
  private Boolean branding = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("contactEmail")
  private String contactEmail = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("hostedPageCSSPath")
  private String hostedPageCSSPath = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("logoPath")
  private String logoPath = null;

  @SerializedName("mobilExpressApiPassword")
  private String mobilExpressApiPassword = null;

  @SerializedName("mobilExpressMerchantKey")
  private String mobilExpressMerchantKey = null;

  @SerializedName("mobilExpressPosid")
  private Integer mobilExpressPosid = null;

  /**
   * Gets or Sets mobilePaymentGateway
   */
  @JsonAdapter(MobilePaymentGatewayEnum.Adapter.class)
  public enum MobilePaymentGatewayEnum {
    DISABLED("DISABLED"),
    
    WIRECARD("WIRECARD");

    private String value;

    MobilePaymentGatewayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MobilePaymentGatewayEnum fromValue(String text) {
      for (MobilePaymentGatewayEnum b : MobilePaymentGatewayEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MobilePaymentGatewayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MobilePaymentGatewayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MobilePaymentGatewayEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MobilePaymentGatewayEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mobilePaymentGateway")
  private MobilePaymentGatewayEnum mobilePaymentGateway = null;

  @SerializedName("notifyNewSubscription")
  private Boolean notifyNewSubscription = null;

  @SerializedName("notifyRenewal")
  private Boolean notifyRenewal = null;

  @SerializedName("notifySubscriptionCancellation")
  private Boolean notifySubscriptionCancellation = null;

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

  @SerializedName("paymentGatewayApiKey")
  private String paymentGatewayApiKey = null;

  @SerializedName("paymentGatewaySecurityKey")
  private String paymentGatewaySecurityKey = null;

  @SerializedName("paytrDirectApiEnabled")
  private Boolean paytrDirectApiEnabled = null;

  @SerializedName("paytrMerchantId")
  private Integer paytrMerchantId = null;

  @SerializedName("payuMerchantKeyRenewals")
  private String payuMerchantKeyRenewals = null;

  @SerializedName("payuSecretKeyRenewals")
  private String payuSecretKeyRenewals = null;

  @SerializedName("privacyPolicyUrl")
  private String privacyPolicyUrl = null;

  @SerializedName("sendDailyReports")
  private String sendDailyReports = null;

  @SerializedName("subscreasyApiKey")
  private String subscreasyApiKey = null;

  @SerializedName("subscreasySecureKey")
  private String subscreasySecureKey = null;

  @SerializedName("wirecardErrorMessage")
  private String wirecardErrorMessage = null;

  @SerializedName("wirecardPin")
  private String wirecardPin = null;

  @SerializedName("wirecardSuccessfulMessage")
  private String wirecardSuccessfulMessage = null;

  @SerializedName("wirecardTurkcellServisId")
  private String wirecardTurkcellServisId = null;

  @SerializedName("wirecardUserCode")
  private String wirecardUserCode = null;

  public CompanyProps billingDate(Integer billingDate) {
    this.billingDate = billingDate;
    return this;
  }

   /**
   * Get billingDate
   * @return billingDate
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(Integer billingDate) {
    this.billingDate = billingDate;
  }

  public CompanyProps billingInformationMandatory(Boolean billingInformationMandatory) {
    this.billingInformationMandatory = billingInformationMandatory;
    return this;
  }

   /**
   * Get billingInformationMandatory
   * @return billingInformationMandatory
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isBillingInformationMandatory() {
    return billingInformationMandatory;
  }

  public void setBillingInformationMandatory(Boolean billingInformationMandatory) {
    this.billingInformationMandatory = billingInformationMandatory;
  }

  public CompanyProps billingThresholdDays(Integer billingThresholdDays) {
    this.billingThresholdDays = billingThresholdDays;
    return this;
  }

   /**
   * Get billingThresholdDays
   * @return billingThresholdDays
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingThresholdDays() {
    return billingThresholdDays;
  }

  public void setBillingThresholdDays(Integer billingThresholdDays) {
    this.billingThresholdDays = billingThresholdDays;
  }

  public CompanyProps branding(Boolean branding) {
    this.branding = branding;
    return this;
  }

   /**
   * Get branding
   * @return branding
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isBranding() {
    return branding;
  }

  public void setBranding(Boolean branding) {
    this.branding = branding;
  }

  public CompanyProps callbackUrl(String callbackUrl) {
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

  public CompanyProps company(Company company) {
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

  public CompanyProps contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

   /**
   * Get contactEmail
   * @return contactEmail
  **/
  @ApiModelProperty(value = "")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public CompanyProps domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public CompanyProps hostedPageCSSPath(String hostedPageCSSPath) {
    this.hostedPageCSSPath = hostedPageCSSPath;
    return this;
  }

   /**
   * Get hostedPageCSSPath
   * @return hostedPageCSSPath
  **/
  @ApiModelProperty(value = "")
  public String getHostedPageCSSPath() {
    return hostedPageCSSPath;
  }

  public void setHostedPageCSSPath(String hostedPageCSSPath) {
    this.hostedPageCSSPath = hostedPageCSSPath;
  }

  public CompanyProps id(Long id) {
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

  public CompanyProps logoPath(String logoPath) {
    this.logoPath = logoPath;
    return this;
  }

   /**
   * Get logoPath
   * @return logoPath
  **/
  @ApiModelProperty(value = "")
  public String getLogoPath() {
    return logoPath;
  }

  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }

  public CompanyProps mobilExpressApiPassword(String mobilExpressApiPassword) {
    this.mobilExpressApiPassword = mobilExpressApiPassword;
    return this;
  }

   /**
   * Get mobilExpressApiPassword
   * @return mobilExpressApiPassword
  **/
  @ApiModelProperty(value = "")
  public String getMobilExpressApiPassword() {
    return mobilExpressApiPassword;
  }

  public void setMobilExpressApiPassword(String mobilExpressApiPassword) {
    this.mobilExpressApiPassword = mobilExpressApiPassword;
  }

  public CompanyProps mobilExpressMerchantKey(String mobilExpressMerchantKey) {
    this.mobilExpressMerchantKey = mobilExpressMerchantKey;
    return this;
  }

   /**
   * Get mobilExpressMerchantKey
   * @return mobilExpressMerchantKey
  **/
  @ApiModelProperty(value = "")
  public String getMobilExpressMerchantKey() {
    return mobilExpressMerchantKey;
  }

  public void setMobilExpressMerchantKey(String mobilExpressMerchantKey) {
    this.mobilExpressMerchantKey = mobilExpressMerchantKey;
  }

  public CompanyProps mobilExpressPosid(Integer mobilExpressPosid) {
    this.mobilExpressPosid = mobilExpressPosid;
    return this;
  }

   /**
   * Get mobilExpressPosid
   * @return mobilExpressPosid
  **/
  @ApiModelProperty(value = "")
  public Integer getMobilExpressPosid() {
    return mobilExpressPosid;
  }

  public void setMobilExpressPosid(Integer mobilExpressPosid) {
    this.mobilExpressPosid = mobilExpressPosid;
  }

  public CompanyProps mobilePaymentGateway(MobilePaymentGatewayEnum mobilePaymentGateway) {
    this.mobilePaymentGateway = mobilePaymentGateway;
    return this;
  }

   /**
   * Get mobilePaymentGateway
   * @return mobilePaymentGateway
  **/
  @ApiModelProperty(value = "")
  public MobilePaymentGatewayEnum getMobilePaymentGateway() {
    return mobilePaymentGateway;
  }

  public void setMobilePaymentGateway(MobilePaymentGatewayEnum mobilePaymentGateway) {
    this.mobilePaymentGateway = mobilePaymentGateway;
  }

  public CompanyProps notifyNewSubscription(Boolean notifyNewSubscription) {
    this.notifyNewSubscription = notifyNewSubscription;
    return this;
  }

   /**
   * Get notifyNewSubscription
   * @return notifyNewSubscription
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isNotifyNewSubscription() {
    return notifyNewSubscription;
  }

  public void setNotifyNewSubscription(Boolean notifyNewSubscription) {
    this.notifyNewSubscription = notifyNewSubscription;
  }

  public CompanyProps notifyRenewal(Boolean notifyRenewal) {
    this.notifyRenewal = notifyRenewal;
    return this;
  }

   /**
   * Get notifyRenewal
   * @return notifyRenewal
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isNotifyRenewal() {
    return notifyRenewal;
  }

  public void setNotifyRenewal(Boolean notifyRenewal) {
    this.notifyRenewal = notifyRenewal;
  }

  public CompanyProps notifySubscriptionCancellation(Boolean notifySubscriptionCancellation) {
    this.notifySubscriptionCancellation = notifySubscriptionCancellation;
    return this;
  }

   /**
   * Get notifySubscriptionCancellation
   * @return notifySubscriptionCancellation
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isNotifySubscriptionCancellation() {
    return notifySubscriptionCancellation;
  }

  public void setNotifySubscriptionCancellation(Boolean notifySubscriptionCancellation) {
    this.notifySubscriptionCancellation = notifySubscriptionCancellation;
  }

  public CompanyProps paymentGateway(PaymentGatewayEnum paymentGateway) {
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

  public CompanyProps paymentGatewayApiKey(String paymentGatewayApiKey) {
    this.paymentGatewayApiKey = paymentGatewayApiKey;
    return this;
  }

   /**
   * Get paymentGatewayApiKey
   * @return paymentGatewayApiKey
  **/
  @ApiModelProperty(value = "")
  public String getPaymentGatewayApiKey() {
    return paymentGatewayApiKey;
  }

  public void setPaymentGatewayApiKey(String paymentGatewayApiKey) {
    this.paymentGatewayApiKey = paymentGatewayApiKey;
  }

  public CompanyProps paymentGatewaySecurityKey(String paymentGatewaySecurityKey) {
    this.paymentGatewaySecurityKey = paymentGatewaySecurityKey;
    return this;
  }

   /**
   * Get paymentGatewaySecurityKey
   * @return paymentGatewaySecurityKey
  **/
  @ApiModelProperty(value = "")
  public String getPaymentGatewaySecurityKey() {
    return paymentGatewaySecurityKey;
  }

  public void setPaymentGatewaySecurityKey(String paymentGatewaySecurityKey) {
    this.paymentGatewaySecurityKey = paymentGatewaySecurityKey;
  }

  public CompanyProps paytrDirectApiEnabled(Boolean paytrDirectApiEnabled) {
    this.paytrDirectApiEnabled = paytrDirectApiEnabled;
    return this;
  }

   /**
   * Get paytrDirectApiEnabled
   * @return paytrDirectApiEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaytrDirectApiEnabled() {
    return paytrDirectApiEnabled;
  }

  public void setPaytrDirectApiEnabled(Boolean paytrDirectApiEnabled) {
    this.paytrDirectApiEnabled = paytrDirectApiEnabled;
  }

  public CompanyProps paytrMerchantId(Integer paytrMerchantId) {
    this.paytrMerchantId = paytrMerchantId;
    return this;
  }

   /**
   * Get paytrMerchantId
   * @return paytrMerchantId
  **/
  @ApiModelProperty(value = "")
  public Integer getPaytrMerchantId() {
    return paytrMerchantId;
  }

  public void setPaytrMerchantId(Integer paytrMerchantId) {
    this.paytrMerchantId = paytrMerchantId;
  }

  public CompanyProps payuMerchantKeyRenewals(String payuMerchantKeyRenewals) {
    this.payuMerchantKeyRenewals = payuMerchantKeyRenewals;
    return this;
  }

   /**
   * Get payuMerchantKeyRenewals
   * @return payuMerchantKeyRenewals
  **/
  @ApiModelProperty(value = "")
  public String getPayuMerchantKeyRenewals() {
    return payuMerchantKeyRenewals;
  }

  public void setPayuMerchantKeyRenewals(String payuMerchantKeyRenewals) {
    this.payuMerchantKeyRenewals = payuMerchantKeyRenewals;
  }

  public CompanyProps payuSecretKeyRenewals(String payuSecretKeyRenewals) {
    this.payuSecretKeyRenewals = payuSecretKeyRenewals;
    return this;
  }

   /**
   * Get payuSecretKeyRenewals
   * @return payuSecretKeyRenewals
  **/
  @ApiModelProperty(value = "")
  public String getPayuSecretKeyRenewals() {
    return payuSecretKeyRenewals;
  }

  public void setPayuSecretKeyRenewals(String payuSecretKeyRenewals) {
    this.payuSecretKeyRenewals = payuSecretKeyRenewals;
  }

  public CompanyProps privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @ApiModelProperty(value = "")
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public CompanyProps sendDailyReports(String sendDailyReports) {
    this.sendDailyReports = sendDailyReports;
    return this;
  }

   /**
   * Get sendDailyReports
   * @return sendDailyReports
  **/
  @ApiModelProperty(value = "")
  public String getSendDailyReports() {
    return sendDailyReports;
  }

  public void setSendDailyReports(String sendDailyReports) {
    this.sendDailyReports = sendDailyReports;
  }

  public CompanyProps subscreasyApiKey(String subscreasyApiKey) {
    this.subscreasyApiKey = subscreasyApiKey;
    return this;
  }

   /**
   * Get subscreasyApiKey
   * @return subscreasyApiKey
  **/
  @ApiModelProperty(value = "")
  public String getSubscreasyApiKey() {
    return subscreasyApiKey;
  }

  public void setSubscreasyApiKey(String subscreasyApiKey) {
    this.subscreasyApiKey = subscreasyApiKey;
  }

  public CompanyProps subscreasySecureKey(String subscreasySecureKey) {
    this.subscreasySecureKey = subscreasySecureKey;
    return this;
  }

   /**
   * Get subscreasySecureKey
   * @return subscreasySecureKey
  **/
  @ApiModelProperty(value = "")
  public String getSubscreasySecureKey() {
    return subscreasySecureKey;
  }

  public void setSubscreasySecureKey(String subscreasySecureKey) {
    this.subscreasySecureKey = subscreasySecureKey;
  }

  public CompanyProps wirecardErrorMessage(String wirecardErrorMessage) {
    this.wirecardErrorMessage = wirecardErrorMessage;
    return this;
  }

   /**
   * Get wirecardErrorMessage
   * @return wirecardErrorMessage
  **/
  @ApiModelProperty(value = "")
  public String getWirecardErrorMessage() {
    return wirecardErrorMessage;
  }

  public void setWirecardErrorMessage(String wirecardErrorMessage) {
    this.wirecardErrorMessage = wirecardErrorMessage;
  }

  public CompanyProps wirecardPin(String wirecardPin) {
    this.wirecardPin = wirecardPin;
    return this;
  }

   /**
   * Get wirecardPin
   * @return wirecardPin
  **/
  @ApiModelProperty(value = "")
  public String getWirecardPin() {
    return wirecardPin;
  }

  public void setWirecardPin(String wirecardPin) {
    this.wirecardPin = wirecardPin;
  }

  public CompanyProps wirecardSuccessfulMessage(String wirecardSuccessfulMessage) {
    this.wirecardSuccessfulMessage = wirecardSuccessfulMessage;
    return this;
  }

   /**
   * Get wirecardSuccessfulMessage
   * @return wirecardSuccessfulMessage
  **/
  @ApiModelProperty(value = "")
  public String getWirecardSuccessfulMessage() {
    return wirecardSuccessfulMessage;
  }

  public void setWirecardSuccessfulMessage(String wirecardSuccessfulMessage) {
    this.wirecardSuccessfulMessage = wirecardSuccessfulMessage;
  }

  public CompanyProps wirecardTurkcellServisId(String wirecardTurkcellServisId) {
    this.wirecardTurkcellServisId = wirecardTurkcellServisId;
    return this;
  }

   /**
   * Get wirecardTurkcellServisId
   * @return wirecardTurkcellServisId
  **/
  @ApiModelProperty(value = "")
  public String getWirecardTurkcellServisId() {
    return wirecardTurkcellServisId;
  }

  public void setWirecardTurkcellServisId(String wirecardTurkcellServisId) {
    this.wirecardTurkcellServisId = wirecardTurkcellServisId;
  }

  public CompanyProps wirecardUserCode(String wirecardUserCode) {
    this.wirecardUserCode = wirecardUserCode;
    return this;
  }

   /**
   * Get wirecardUserCode
   * @return wirecardUserCode
  **/
  @ApiModelProperty(value = "")
  public String getWirecardUserCode() {
    return wirecardUserCode;
  }

  public void setWirecardUserCode(String wirecardUserCode) {
    this.wirecardUserCode = wirecardUserCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyProps companyProps = (CompanyProps) o;
    return Objects.equals(this.billingDate, companyProps.billingDate) &&
        Objects.equals(this.billingInformationMandatory, companyProps.billingInformationMandatory) &&
        Objects.equals(this.billingThresholdDays, companyProps.billingThresholdDays) &&
        Objects.equals(this.branding, companyProps.branding) &&
        Objects.equals(this.callbackUrl, companyProps.callbackUrl) &&
        Objects.equals(this.company, companyProps.company) &&
        Objects.equals(this.contactEmail, companyProps.contactEmail) &&
        Objects.equals(this.domainName, companyProps.domainName) &&
        Objects.equals(this.hostedPageCSSPath, companyProps.hostedPageCSSPath) &&
        Objects.equals(this.id, companyProps.id) &&
        Objects.equals(this.logoPath, companyProps.logoPath) &&
        Objects.equals(this.mobilExpressApiPassword, companyProps.mobilExpressApiPassword) &&
        Objects.equals(this.mobilExpressMerchantKey, companyProps.mobilExpressMerchantKey) &&
        Objects.equals(this.mobilExpressPosid, companyProps.mobilExpressPosid) &&
        Objects.equals(this.mobilePaymentGateway, companyProps.mobilePaymentGateway) &&
        Objects.equals(this.notifyNewSubscription, companyProps.notifyNewSubscription) &&
        Objects.equals(this.notifyRenewal, companyProps.notifyRenewal) &&
        Objects.equals(this.notifySubscriptionCancellation, companyProps.notifySubscriptionCancellation) &&
        Objects.equals(this.paymentGateway, companyProps.paymentGateway) &&
        Objects.equals(this.paymentGatewayApiKey, companyProps.paymentGatewayApiKey) &&
        Objects.equals(this.paymentGatewaySecurityKey, companyProps.paymentGatewaySecurityKey) &&
        Objects.equals(this.paytrDirectApiEnabled, companyProps.paytrDirectApiEnabled) &&
        Objects.equals(this.paytrMerchantId, companyProps.paytrMerchantId) &&
        Objects.equals(this.payuMerchantKeyRenewals, companyProps.payuMerchantKeyRenewals) &&
        Objects.equals(this.payuSecretKeyRenewals, companyProps.payuSecretKeyRenewals) &&
        Objects.equals(this.privacyPolicyUrl, companyProps.privacyPolicyUrl) &&
        Objects.equals(this.sendDailyReports, companyProps.sendDailyReports) &&
        Objects.equals(this.subscreasyApiKey, companyProps.subscreasyApiKey) &&
        Objects.equals(this.subscreasySecureKey, companyProps.subscreasySecureKey) &&
        Objects.equals(this.wirecardErrorMessage, companyProps.wirecardErrorMessage) &&
        Objects.equals(this.wirecardPin, companyProps.wirecardPin) &&
        Objects.equals(this.wirecardSuccessfulMessage, companyProps.wirecardSuccessfulMessage) &&
        Objects.equals(this.wirecardTurkcellServisId, companyProps.wirecardTurkcellServisId) &&
        Objects.equals(this.wirecardUserCode, companyProps.wirecardUserCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDate, billingInformationMandatory, billingThresholdDays, branding, callbackUrl, company, contactEmail, domainName, hostedPageCSSPath, id, logoPath, mobilExpressApiPassword, mobilExpressMerchantKey, mobilExpressPosid, mobilePaymentGateway, notifyNewSubscription, notifyRenewal, notifySubscriptionCancellation, paymentGateway, paymentGatewayApiKey, paymentGatewaySecurityKey, paytrDirectApiEnabled, paytrMerchantId, payuMerchantKeyRenewals, payuSecretKeyRenewals, privacyPolicyUrl, sendDailyReports, subscreasyApiKey, subscreasySecureKey, wirecardErrorMessage, wirecardPin, wirecardSuccessfulMessage, wirecardTurkcellServisId, wirecardUserCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyProps {\n");
    
    sb.append("    billingDate: ").append(toIndentedString(billingDate)).append("\n");
    sb.append("    billingInformationMandatory: ").append(toIndentedString(billingInformationMandatory)).append("\n");
    sb.append("    billingThresholdDays: ").append(toIndentedString(billingThresholdDays)).append("\n");
    sb.append("    branding: ").append(toIndentedString(branding)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    hostedPageCSSPath: ").append(toIndentedString(hostedPageCSSPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    mobilExpressApiPassword: ").append(toIndentedString(mobilExpressApiPassword)).append("\n");
    sb.append("    mobilExpressMerchantKey: ").append(toIndentedString(mobilExpressMerchantKey)).append("\n");
    sb.append("    mobilExpressPosid: ").append(toIndentedString(mobilExpressPosid)).append("\n");
    sb.append("    mobilePaymentGateway: ").append(toIndentedString(mobilePaymentGateway)).append("\n");
    sb.append("    notifyNewSubscription: ").append(toIndentedString(notifyNewSubscription)).append("\n");
    sb.append("    notifyRenewal: ").append(toIndentedString(notifyRenewal)).append("\n");
    sb.append("    notifySubscriptionCancellation: ").append(toIndentedString(notifySubscriptionCancellation)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    paymentGatewayApiKey: ").append(toIndentedString(paymentGatewayApiKey)).append("\n");
    sb.append("    paymentGatewaySecurityKey: ").append(toIndentedString(paymentGatewaySecurityKey)).append("\n");
    sb.append("    paytrDirectApiEnabled: ").append(toIndentedString(paytrDirectApiEnabled)).append("\n");
    sb.append("    paytrMerchantId: ").append(toIndentedString(paytrMerchantId)).append("\n");
    sb.append("    payuMerchantKeyRenewals: ").append(toIndentedString(payuMerchantKeyRenewals)).append("\n");
    sb.append("    payuSecretKeyRenewals: ").append(toIndentedString(payuSecretKeyRenewals)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    sendDailyReports: ").append(toIndentedString(sendDailyReports)).append("\n");
    sb.append("    subscreasyApiKey: ").append(toIndentedString(subscreasyApiKey)).append("\n");
    sb.append("    subscreasySecureKey: ").append(toIndentedString(subscreasySecureKey)).append("\n");
    sb.append("    wirecardErrorMessage: ").append(toIndentedString(wirecardErrorMessage)).append("\n");
    sb.append("    wirecardPin: ").append(toIndentedString(wirecardPin)).append("\n");
    sb.append("    wirecardSuccessfulMessage: ").append(toIndentedString(wirecardSuccessfulMessage)).append("\n");
    sb.append("    wirecardTurkcellServisId: ").append(toIndentedString(wirecardTurkcellServisId)).append("\n");
    sb.append("    wirecardUserCode: ").append(toIndentedString(wirecardUserCode)).append("\n");
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

