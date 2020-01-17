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
import com.kodfarki.subscreasy.client.model.Offer;
import com.kodfarki.subscreasy.client.model.ServiceOffering;
import com.kodfarki.subscreasy.client.model.Subsription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * ServiceInstance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T11:44:26.783+03:00")
public class ServiceInstance {
  @SerializedName("capacity")
  private BigDecimal capacity = null;

  @SerializedName("currentUsage")
  private BigDecimal currentUsage = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numberOfUnits")
  private Integer numberOfUnits = null;

  @SerializedName("offer")
  private Offer offer = null;

  @SerializedName("overUsage")
  private BigDecimal overUsage = null;

  @SerializedName("overUsageQuota")
  private BigDecimal overUsageQuota = null;

  /**
   * Gets or Sets quotaOrigin
   */
  @JsonAdapter(QuotaOriginEnum.Adapter.class)
  public enum QuotaOriginEnum {
    SUBS("SUBS"),
    
    OVER("OVER");

    private String value;

    QuotaOriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuotaOriginEnum fromValue(String text) {
      for (QuotaOriginEnum b : QuotaOriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QuotaOriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuotaOriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuotaOriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QuotaOriginEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("quotaOrigin")
  private QuotaOriginEnum quotaOrigin = null;

  @SerializedName("serviceOffering")
  private ServiceOffering serviceOffering = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

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

  @SerializedName("subscriberId")
  private String subscriberId = null;

  @SerializedName("subscription")
  private Subsription subscription = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONOFF("ONOFF"),
    
    SEAT_BASED("SEAT_BASED"),
    
    USAGE_BASED("USAGE_BASED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("version")
  private Long version = null;

  public ServiceInstance capacity(BigDecimal capacity) {
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

  public ServiceInstance currentUsage(BigDecimal currentUsage) {
    this.currentUsage = currentUsage;
    return this;
  }

   /**
   * Get currentUsage
   * @return currentUsage
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrentUsage() {
    return currentUsage;
  }

  public void setCurrentUsage(BigDecimal currentUsage) {
    this.currentUsage = currentUsage;
  }

  public ServiceInstance endDate(OffsetDateTime endDate) {
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

  public ServiceInstance id(Long id) {
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

  public ServiceInstance name(String name) {
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

  public ServiceInstance numberOfUnits(Integer numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

   /**
   * Get numberOfUnits
   * @return numberOfUnits
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Integer numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public ServiceInstance offer(Offer offer) {
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

  public ServiceInstance overUsage(BigDecimal overUsage) {
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

  public ServiceInstance overUsageQuota(BigDecimal overUsageQuota) {
    this.overUsageQuota = overUsageQuota;
    return this;
  }

   /**
   * Get overUsageQuota
   * @return overUsageQuota
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverUsageQuota() {
    return overUsageQuota;
  }

  public void setOverUsageQuota(BigDecimal overUsageQuota) {
    this.overUsageQuota = overUsageQuota;
  }

  public ServiceInstance quotaOrigin(QuotaOriginEnum quotaOrigin) {
    this.quotaOrigin = quotaOrigin;
    return this;
  }

   /**
   * Get quotaOrigin
   * @return quotaOrigin
  **/
  @ApiModelProperty(value = "")
  public QuotaOriginEnum getQuotaOrigin() {
    return quotaOrigin;
  }

  public void setQuotaOrigin(QuotaOriginEnum quotaOrigin) {
    this.quotaOrigin = quotaOrigin;
  }

  public ServiceInstance serviceOffering(ServiceOffering serviceOffering) {
    this.serviceOffering = serviceOffering;
    return this;
  }

   /**
   * Get serviceOffering
   * @return serviceOffering
  **/
  @ApiModelProperty(value = "")
  public ServiceOffering getServiceOffering() {
    return serviceOffering;
  }

  public void setServiceOffering(ServiceOffering serviceOffering) {
    this.serviceOffering = serviceOffering;
  }

  public ServiceInstance startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ServiceInstance status(StatusEnum status) {
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

  public ServiceInstance subscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
    return this;
  }

   /**
   * Get subscriberId
   * @return subscriberId
  **/
  @ApiModelProperty(value = "")
  public String getSubscriberId() {
    return subscriberId;
  }

  public void setSubscriberId(String subscriberId) {
    this.subscriberId = subscriberId;
  }

  public ServiceInstance subscription(Subsription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public Subsription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subsription subscription) {
    this.subscription = subscription;
  }

  public ServiceInstance type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ServiceInstance version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstance serviceInstance = (ServiceInstance) o;
    return Objects.equals(this.capacity, serviceInstance.capacity) &&
        Objects.equals(this.currentUsage, serviceInstance.currentUsage) &&
        Objects.equals(this.endDate, serviceInstance.endDate) &&
        Objects.equals(this.id, serviceInstance.id) &&
        Objects.equals(this.name, serviceInstance.name) &&
        Objects.equals(this.numberOfUnits, serviceInstance.numberOfUnits) &&
        Objects.equals(this.offer, serviceInstance.offer) &&
        Objects.equals(this.overUsage, serviceInstance.overUsage) &&
        Objects.equals(this.overUsageQuota, serviceInstance.overUsageQuota) &&
        Objects.equals(this.quotaOrigin, serviceInstance.quotaOrigin) &&
        Objects.equals(this.serviceOffering, serviceInstance.serviceOffering) &&
        Objects.equals(this.startDate, serviceInstance.startDate) &&
        Objects.equals(this.status, serviceInstance.status) &&
        Objects.equals(this.subscriberId, serviceInstance.subscriberId) &&
        Objects.equals(this.subscription, serviceInstance.subscription) &&
        Objects.equals(this.type, serviceInstance.type) &&
        Objects.equals(this.version, serviceInstance.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, currentUsage, endDate, id, name, numberOfUnits, offer, overUsage, overUsageQuota, quotaOrigin, serviceOffering, startDate, status, subscriberId, subscription, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstance {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    currentUsage: ").append(toIndentedString(currentUsage)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    overUsage: ").append(toIndentedString(overUsage)).append("\n");
    sb.append("    overUsageQuota: ").append(toIndentedString(overUsageQuota)).append("\n");
    sb.append("    quotaOrigin: ").append(toIndentedString(quotaOrigin)).append("\n");
    sb.append("    serviceOffering: ").append(toIndentedString(serviceOffering)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

