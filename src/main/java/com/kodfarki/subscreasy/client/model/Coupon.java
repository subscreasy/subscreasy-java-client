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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Coupon
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-10T21:13:53.160+03:00")
public class Coupon {
  @SerializedName("code")
  private String code = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("currentUsage")
  private Integer currentUsage = null;

  @SerializedName("discountAmount")
  private BigDecimal discountAmount = null;

  /**
   * Gets or Sets discountType
   */
  @JsonAdapter(DiscountTypeEnum.Adapter.class)
  public enum DiscountTypeEnum {
    FIXED("FIXED"),
    
    PERCENTAGE("PERCENTAGE");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DiscountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DiscountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("discountType")
  private DiscountTypeEnum discountType = null;

  @SerializedName("expireDate")
  private OffsetDateTime expireDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("maxLimit")
  private Integer maxLimit = null;

  public Coupon code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Coupon company(Company company) {
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

  public Coupon currentUsage(Integer currentUsage) {
    this.currentUsage = currentUsage;
    return this;
  }

   /**
   * Get currentUsage
   * @return currentUsage
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentUsage() {
    return currentUsage;
  }

  public void setCurrentUsage(Integer currentUsage) {
    this.currentUsage = currentUsage;
  }

  public Coupon discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Coupon discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Get discountType
   * @return discountType
  **/
  @ApiModelProperty(required = true, value = "")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public Coupon expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }

  public Coupon id(Long id) {
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

  public Coupon maxLimit(Integer maxLimit) {
    this.maxLimit = maxLimit;
    return this;
  }

   /**
   * Get maxLimit
   * @return maxLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMaxLimit() {
    return maxLimit;
  }

  public void setMaxLimit(Integer maxLimit) {
    this.maxLimit = maxLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coupon coupon = (Coupon) o;
    return Objects.equals(this.code, coupon.code) &&
        Objects.equals(this.company, coupon.company) &&
        Objects.equals(this.currentUsage, coupon.currentUsage) &&
        Objects.equals(this.discountAmount, coupon.discountAmount) &&
        Objects.equals(this.discountType, coupon.discountType) &&
        Objects.equals(this.expireDate, coupon.expireDate) &&
        Objects.equals(this.id, coupon.id) &&
        Objects.equals(this.maxLimit, coupon.maxLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, company, currentUsage, discountAmount, discountType, expireDate, id, maxLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coupon {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    currentUsage: ").append(toIndentedString(currentUsage)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxLimit: ").append(toIndentedString(maxLimit)).append("\n");
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

