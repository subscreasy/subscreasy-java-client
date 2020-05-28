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
 * ServiceOfferingResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class ServiceOfferingResult {
  @SerializedName("capacity")
  private String capacity = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("unitName")
  private String unitName = null;

  @SerializedName("unitsPerPrice")
  private BigDecimal unitsPerPrice = null;

  public ServiceOfferingResult capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public ServiceOfferingResult id(Long id) {
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

  public ServiceOfferingResult name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceOfferingResult price(BigDecimal price) {
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

  public ServiceOfferingResult type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServiceOfferingResult unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

   /**
   * Get unitName
   * @return unitName
  **/
  @ApiModelProperty(value = "")
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public ServiceOfferingResult unitsPerPrice(BigDecimal unitsPerPrice) {
    this.unitsPerPrice = unitsPerPrice;
    return this;
  }

   /**
   * Get unitsPerPrice
   * @return unitsPerPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUnitsPerPrice() {
    return unitsPerPrice;
  }

  public void setUnitsPerPrice(BigDecimal unitsPerPrice) {
    this.unitsPerPrice = unitsPerPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOfferingResult serviceOfferingResult = (ServiceOfferingResult) o;
    return Objects.equals(this.capacity, serviceOfferingResult.capacity) &&
        Objects.equals(this.id, serviceOfferingResult.id) &&
        Objects.equals(this.name, serviceOfferingResult.name) &&
        Objects.equals(this.price, serviceOfferingResult.price) &&
        Objects.equals(this.type, serviceOfferingResult.type) &&
        Objects.equals(this.unitName, serviceOfferingResult.unitName) &&
        Objects.equals(this.unitsPerPrice, serviceOfferingResult.unitsPerPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, id, name, price, type, unitName, unitsPerPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOfferingResult {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    unitsPerPrice: ").append(toIndentedString(unitsPerPrice)).append("\n");
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

