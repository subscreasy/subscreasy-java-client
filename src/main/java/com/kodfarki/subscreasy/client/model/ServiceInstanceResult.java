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
import org.threeten.bp.OffsetDateTime;

/**
 * ServiceInstanceResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class ServiceInstanceResult {
  @SerializedName("capacity")
  private BigDecimal capacity = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("overUsage")
  private BigDecimal overUsage = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("NEW"),
    
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    FINISHED("FINISHED"),
    
    CANCELLED("CANCELLED"),
    
    IN_TRIAL("IN_TRIAL"),
    
    PAYMENT_DUE("PAYMENT_DUE");

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

  @SerializedName("type")
  private String type = null;

  @SerializedName("usage")
  private BigDecimal usage = null;

  public ServiceInstanceResult capacity(BigDecimal capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCapacity() {
    return capacity;
  }

  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }

  public ServiceInstanceResult endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ServiceInstanceResult id(Long id) {
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

  public ServiceInstanceResult name(String name) {
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

  public ServiceInstanceResult overUsage(BigDecimal overUsage) {
    this.overUsage = overUsage;
    return this;
  }

   /**
   * Get overUsage
   * @return overUsage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverUsage() {
    return overUsage;
  }

  public void setOverUsage(BigDecimal overUsage) {
    this.overUsage = overUsage;
  }

  public ServiceInstanceResult status(StatusEnum status) {
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

  public ServiceInstanceResult type(String type) {
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

  public ServiceInstanceResult usage(BigDecimal usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceResult serviceInstanceResult = (ServiceInstanceResult) o;
    return Objects.equals(this.capacity, serviceInstanceResult.capacity) &&
        Objects.equals(this.endDate, serviceInstanceResult.endDate) &&
        Objects.equals(this.id, serviceInstanceResult.id) &&
        Objects.equals(this.name, serviceInstanceResult.name) &&
        Objects.equals(this.overUsage, serviceInstanceResult.overUsage) &&
        Objects.equals(this.status, serviceInstanceResult.status) &&
        Objects.equals(this.type, serviceInstanceResult.type) &&
        Objects.equals(this.usage, serviceInstanceResult.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, endDate, id, name, overUsage, status, type, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceResult {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overUsage: ").append(toIndentedString(overUsage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

