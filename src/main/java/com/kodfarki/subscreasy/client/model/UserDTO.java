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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * UserDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-11T10:08:09.886+03:00")
public class UserDTO {
  @SerializedName("activated")
  private Boolean activated = null;

  @SerializedName("authorities")
  private List<String> authorities = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("langKey")
  private String langKey = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("resetDate")
  private String resetDate = null;

  @SerializedName("siteName")
  private String siteName = null;

  @SerializedName("subscriber")
  private Boolean subscriber = null;

  public UserDTO activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

   /**
   * Get activated
   * @return activated
  **/
  @ApiModelProperty(value = "")
  public Boolean isActivated() {
    return activated;
  }

  public void setActivated(Boolean activated) {
    this.activated = activated;
  }

  public UserDTO authorities(List<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public UserDTO addAuthoritiesItem(String authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<String>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

   /**
   * Get authorities
   * @return authorities
  **/
  @ApiModelProperty(value = "")
  public List<String> getAuthorities() {
    return authorities;
  }

  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }

  public UserDTO company(Company company) {
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

  public UserDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public UserDTO createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public UserDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDTO id(Long id) {
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

  public UserDTO imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public UserDTO langKey(String langKey) {
    this.langKey = langKey;
    return this;
  }

   /**
   * Get langKey
   * @return langKey
  **/
  @ApiModelProperty(value = "")
  public String getLangKey() {
    return langKey;
  }

  public void setLangKey(String langKey) {
    this.langKey = langKey;
  }

  public UserDTO lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public UserDTO lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public UserDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDTO login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDTO resetDate(String resetDate) {
    this.resetDate = resetDate;
    return this;
  }

   /**
   * Get resetDate
   * @return resetDate
  **/
  @ApiModelProperty(value = "")
  public String getResetDate() {
    return resetDate;
  }

  public void setResetDate(String resetDate) {
    this.resetDate = resetDate;
  }

  public UserDTO siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public UserDTO subscriber(Boolean subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriber() {
    return subscriber;
  }

  public void setSubscriber(Boolean subscriber) {
    this.subscriber = subscriber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.activated, userDTO.activated) &&
        Objects.equals(this.authorities, userDTO.authorities) &&
        Objects.equals(this.company, userDTO.company) &&
        Objects.equals(this.createdBy, userDTO.createdBy) &&
        Objects.equals(this.createdDate, userDTO.createdDate) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.firstName, userDTO.firstName) &&
        Objects.equals(this.id, userDTO.id) &&
        Objects.equals(this.imageUrl, userDTO.imageUrl) &&
        Objects.equals(this.langKey, userDTO.langKey) &&
        Objects.equals(this.lastModifiedBy, userDTO.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, userDTO.lastModifiedDate) &&
        Objects.equals(this.lastName, userDTO.lastName) &&
        Objects.equals(this.login, userDTO.login) &&
        Objects.equals(this.password, userDTO.password) &&
        Objects.equals(this.resetDate, userDTO.resetDate) &&
        Objects.equals(this.siteName, userDTO.siteName) &&
        Objects.equals(this.subscriber, userDTO.subscriber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activated, authorities, company, createdBy, createdDate, email, firstName, id, imageUrl, langKey, lastModifiedBy, lastModifiedDate, lastName, login, password, resetDate, siteName, subscriber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resetDate: ").append(toIndentedString(resetDate)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
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
