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
import com.kodfarki.subscreasy.client.model.Company;
import com.kodfarki.subscreasy.client.model.Offer;
import com.kodfarki.subscreasy.client.model.Subscriber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-03T15:39:09.262+03:00")
public class Order {
  @SerializedName("buyer")
  private Subscriber buyer = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("offer")
  private Offer offer = null;

  @SerializedName("payment")
  private ChargingLog payment = null;

  @SerializedName("shippingAddress")
  private Long shippingAddress = null;

  @SerializedName("shippingCode")
  private String shippingCode = null;

  /**
   * Gets or Sets shippingCompany
   */
  @JsonAdapter(ShippingCompanyEnum.Adapter.class)
  public enum ShippingCompanyEnum {
    MNG("MNG"),
    
    SURAT("SURAT"),
    
    YURTICI("YURTICI");

    private String value;

    ShippingCompanyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingCompanyEnum fromValue(String text) {
      for (ShippingCompanyEnum b : ShippingCompanyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShippingCompanyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingCompanyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingCompanyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShippingCompanyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("shippingCompany")
  private ShippingCompanyEnum shippingCompany = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PREPARING("PREPARING"),
    
    SHIPPED("SHIPPED"),
    
    DELIVERED("DELIVERED"),
    
    CANCELLED("CANCELLED");

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

  @SerializedName("subscription")
  private Long subscription = null;

  public Order buyer(Subscriber buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @ApiModelProperty(required = true, value = "")
  public Subscriber getBuyer() {
    return buyer;
  }

  public void setBuyer(Subscriber buyer) {
    this.buyer = buyer;
  }

  public Order company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(required = true, value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Order createDate(OffsetDateTime createDate) {
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

  public Order id(Long id) {
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

  public Order offer(Offer offer) {
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @ApiModelProperty(required = true, value = "")
  public Offer getOffer() {
    return offer;
  }

  public void setOffer(Offer offer) {
    this.offer = offer;
  }

  public Order payment(ChargingLog payment) {
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

  public Order shippingAddress(Long shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public Long getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Long shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Order shippingCode(String shippingCode) {
    this.shippingCode = shippingCode;
    return this;
  }

   /**
   * Get shippingCode
   * @return shippingCode
  **/
  @ApiModelProperty(value = "")
  public String getShippingCode() {
    return shippingCode;
  }

  public void setShippingCode(String shippingCode) {
    this.shippingCode = shippingCode;
  }

  public Order shippingCompany(ShippingCompanyEnum shippingCompany) {
    this.shippingCompany = shippingCompany;
    return this;
  }

   /**
   * Get shippingCompany
   * @return shippingCompany
  **/
  @ApiModelProperty(value = "")
  public ShippingCompanyEnum getShippingCompany() {
    return shippingCompany;
  }

  public void setShippingCompany(ShippingCompanyEnum shippingCompany) {
    this.shippingCompany = shippingCompany;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order subscription(Long subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSubscription() {
    return subscription;
  }

  public void setSubscription(Long subscription) {
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
    Order order = (Order) o;
    return Objects.equals(this.buyer, order.buyer) &&
        Objects.equals(this.company, order.company) &&
        Objects.equals(this.createDate, order.createDate) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.offer, order.offer) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.shippingAddress, order.shippingAddress) &&
        Objects.equals(this.shippingCode, order.shippingCode) &&
        Objects.equals(this.shippingCompany, order.shippingCompany) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.subscription, order.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyer, company, createDate, id, offer, payment, shippingAddress, shippingCode, shippingCompany, status, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingCode: ").append(toIndentedString(shippingCode)).append("\n");
    sb.append("    shippingCompany: ").append(toIndentedString(shippingCompany)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

