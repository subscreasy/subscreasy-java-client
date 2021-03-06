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
import com.kodfarki.subscreasy.client.model.Subsription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SwitchSubscriptionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-28T23:21:44.006+03:00")
public class SwitchSubscriptionResponse {
  @SerializedName("currentSubscription")
  private Subsription currentSubscription = null;

  @SerializedName("nextSubscription")
  private Subsription nextSubscription = null;

  public SwitchSubscriptionResponse currentSubscription(Subsription currentSubscription) {
    this.currentSubscription = currentSubscription;
    return this;
  }

   /**
   * Get currentSubscription
   * @return currentSubscription
  **/
  @ApiModelProperty(value = "")
  public Subsription getCurrentSubscription() {
    return currentSubscription;
  }

  public void setCurrentSubscription(Subsription currentSubscription) {
    this.currentSubscription = currentSubscription;
  }

  public SwitchSubscriptionResponse nextSubscription(Subsription nextSubscription) {
    this.nextSubscription = nextSubscription;
    return this;
  }

   /**
   * Get nextSubscription
   * @return nextSubscription
  **/
  @ApiModelProperty(value = "")
  public Subsription getNextSubscription() {
    return nextSubscription;
  }

  public void setNextSubscription(Subsription nextSubscription) {
    this.nextSubscription = nextSubscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchSubscriptionResponse switchSubscriptionResponse = (SwitchSubscriptionResponse) o;
    return Objects.equals(this.currentSubscription, switchSubscriptionResponse.currentSubscription) &&
        Objects.equals(this.nextSubscription, switchSubscriptionResponse.nextSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSubscription, nextSubscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchSubscriptionResponse {\n");
    
    sb.append("    currentSubscription: ").append(toIndentedString(currentSubscription)).append("\n");
    sb.append("    nextSubscription: ").append(toIndentedString(nextSubscription)).append("\n");
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

