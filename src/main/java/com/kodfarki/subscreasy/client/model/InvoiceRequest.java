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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InvoiceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-19T15:02:48.500+03:00")
public class InvoiceRequest {
  @SerializedName("customerId")
  private Long customerId = null;

  @SerializedName("selectedDate")
  private OffsetDateTime selectedDate = null;

  @SerializedName("serviceUserId")
  private Long serviceUserId = null;

  public InvoiceRequest customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public InvoiceRequest selectedDate(OffsetDateTime selectedDate) {
    this.selectedDate = selectedDate;
    return this;
  }

   /**
   * Get selectedDate
   * @return selectedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSelectedDate() {
    return selectedDate;
  }

  public void setSelectedDate(OffsetDateTime selectedDate) {
    this.selectedDate = selectedDate;
  }

  public InvoiceRequest serviceUserId(Long serviceUserId) {
    this.serviceUserId = serviceUserId;
    return this;
  }

   /**
   * Get serviceUserId
   * @return serviceUserId
  **/
  @ApiModelProperty(value = "")
  public Long getServiceUserId() {
    return serviceUserId;
  }

  public void setServiceUserId(Long serviceUserId) {
    this.serviceUserId = serviceUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceRequest invoiceRequest = (InvoiceRequest) o;
    return Objects.equals(this.customerId, invoiceRequest.customerId) &&
        Objects.equals(this.selectedDate, invoiceRequest.selectedDate) &&
        Objects.equals(this.serviceUserId, invoiceRequest.serviceUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, selectedDate, serviceUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceRequest {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    selectedDate: ").append(toIndentedString(selectedDate)).append("\n");
    sb.append("    serviceUserId: ").append(toIndentedString(serviceUserId)).append("\n");
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

