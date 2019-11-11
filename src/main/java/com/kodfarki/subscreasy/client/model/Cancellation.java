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

/**
 * Cancellation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-11T10:08:09.886+03:00")
public class Cancellation {
  /**
   * Gets or Sets cancellationType
   */
  @JsonAdapter(CancellationTypeEnum.Adapter.class)
  public enum CancellationTypeEnum {
    IMMEDIATE("IMMEDIATE"),
    
    ENDOFTHEPERIOD("ENDOFTHEPERIOD");

    private String value;

    CancellationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CancellationTypeEnum fromValue(String text) {
      for (CancellationTypeEnum b : CancellationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CancellationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CancellationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CancellationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CancellationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("cancellationType")
  private CancellationTypeEnum cancellationType = null;

  @SerializedName("subscriberId")
  private Long subscriberId = null;

  @SerializedName("subscriptionId")
  private Long subscriptionId = null;

  public Cancellation cancellationType(CancellationTypeEnum cancellationType) {
    this.cancellationType = cancellationType;
    return this;
  }

   /**
   * Get cancellationType
   * @return cancellationType
  **/
  @ApiModelProperty(value = "")
  public CancellationTypeEnum getCancellationType() {
    return cancellationType;
  }

  public void setCancellationType(CancellationTypeEnum cancellationType) {
    this.cancellationType = cancellationType;
  }

  public Cancellation subscriberId(Long subscriberId) {
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

  public Cancellation subscriptionId(Long subscriptionId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cancellation cancellation = (Cancellation) o;
    return Objects.equals(this.cancellationType, cancellation.cancellationType) &&
        Objects.equals(this.subscriberId, cancellation.subscriberId) &&
        Objects.equals(this.subscriptionId, cancellation.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationType, subscriberId, subscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cancellation {\n");
    
    sb.append("    cancellationType: ").append(toIndentedString(cancellationType)).append("\n");
    sb.append("    subscriberId: ").append(toIndentedString(subscriberId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

