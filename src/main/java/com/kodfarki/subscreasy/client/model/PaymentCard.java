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

/**
 * PaymentCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class PaymentCard {
  @SerializedName("cardAlias")
  private String cardAlias = null;

  @SerializedName("cardFamily")
  private String cardFamily = null;

  @SerializedName("cardHolderName")
  private String cardHolderName = null;

  @SerializedName("cardNumber")
  private String cardNumber = null;

  @SerializedName("cardToken")
  private String cardToken = null;

  @SerializedName("cardUserKey")
  private String cardUserKey = null;

  @SerializedName("cvc")
  private String cvc = null;

  @SerializedName("expireMonth")
  private String expireMonth = null;

  @SerializedName("expireYear")
  private String expireYear = null;

  @SerializedName("registerCard")
  private Integer registerCard = null;

  public PaymentCard cardAlias(String cardAlias) {
    this.cardAlias = cardAlias;
    return this;
  }

   /**
   * Get cardAlias
   * @return cardAlias
  **/
  @ApiModelProperty(value = "")
  public String getCardAlias() {
    return cardAlias;
  }

  public void setCardAlias(String cardAlias) {
    this.cardAlias = cardAlias;
  }

  public PaymentCard cardFamily(String cardFamily) {
    this.cardFamily = cardFamily;
    return this;
  }

   /**
   * Get cardFamily
   * @return cardFamily
  **/
  @ApiModelProperty(value = "")
  public String getCardFamily() {
    return cardFamily;
  }

  public void setCardFamily(String cardFamily) {
    this.cardFamily = cardFamily;
  }

  public PaymentCard cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Get cardHolderName
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "")
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public PaymentCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public PaymentCard cardToken(String cardToken) {
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @ApiModelProperty(value = "")
  public String getCardToken() {
    return cardToken;
  }

  public void setCardToken(String cardToken) {
    this.cardToken = cardToken;
  }

  public PaymentCard cardUserKey(String cardUserKey) {
    this.cardUserKey = cardUserKey;
    return this;
  }

   /**
   * Get cardUserKey
   * @return cardUserKey
  **/
  @ApiModelProperty(value = "")
  public String getCardUserKey() {
    return cardUserKey;
  }

  public void setCardUserKey(String cardUserKey) {
    this.cardUserKey = cardUserKey;
  }

  public PaymentCard cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * Get cvc
   * @return cvc
  **/
  @ApiModelProperty(value = "")
  public String getCvc() {
    return cvc;
  }

  public void setCvc(String cvc) {
    this.cvc = cvc;
  }

  public PaymentCard expireMonth(String expireMonth) {
    this.expireMonth = expireMonth;
    return this;
  }

   /**
   * Get expireMonth
   * @return expireMonth
  **/
  @ApiModelProperty(value = "")
  public String getExpireMonth() {
    return expireMonth;
  }

  public void setExpireMonth(String expireMonth) {
    this.expireMonth = expireMonth;
  }

  public PaymentCard expireYear(String expireYear) {
    this.expireYear = expireYear;
    return this;
  }

   /**
   * Get expireYear
   * @return expireYear
  **/
  @ApiModelProperty(value = "")
  public String getExpireYear() {
    return expireYear;
  }

  public void setExpireYear(String expireYear) {
    this.expireYear = expireYear;
  }

  public PaymentCard registerCard(Integer registerCard) {
    this.registerCard = registerCard;
    return this;
  }

   /**
   * Get registerCard
   * @return registerCard
  **/
  @ApiModelProperty(value = "")
  public Integer getRegisterCard() {
    return registerCard;
  }

  public void setRegisterCard(Integer registerCard) {
    this.registerCard = registerCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCard paymentCard = (PaymentCard) o;
    return Objects.equals(this.cardAlias, paymentCard.cardAlias) &&
        Objects.equals(this.cardFamily, paymentCard.cardFamily) &&
        Objects.equals(this.cardHolderName, paymentCard.cardHolderName) &&
        Objects.equals(this.cardNumber, paymentCard.cardNumber) &&
        Objects.equals(this.cardToken, paymentCard.cardToken) &&
        Objects.equals(this.cardUserKey, paymentCard.cardUserKey) &&
        Objects.equals(this.cvc, paymentCard.cvc) &&
        Objects.equals(this.expireMonth, paymentCard.expireMonth) &&
        Objects.equals(this.expireYear, paymentCard.expireYear) &&
        Objects.equals(this.registerCard, paymentCard.registerCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAlias, cardFamily, cardHolderName, cardNumber, cardToken, cardUserKey, cvc, expireMonth, expireYear, registerCard);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCard {\n");
    
    sb.append("    cardAlias: ").append(toIndentedString(cardAlias)).append("\n");
    sb.append("    cardFamily: ").append(toIndentedString(cardFamily)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    cardUserKey: ").append(toIndentedString(cardUserKey)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    expireMonth: ").append(toIndentedString(expireMonth)).append("\n");
    sb.append("    expireYear: ").append(toIndentedString(expireYear)).append("\n");
    sb.append("    registerCard: ").append(toIndentedString(registerCard)).append("\n");
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

