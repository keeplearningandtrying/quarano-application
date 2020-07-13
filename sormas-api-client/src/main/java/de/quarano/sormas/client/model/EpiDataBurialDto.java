/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.44.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.quarano.sormas.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.quarano.sormas.client.model.LocationDto;
import de.quarano.sormas.client.model.YesNoUnknown;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
/**
 * EpiDataBurialDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-09T17:56:16.099120+02:00[Europe/Berlin]")
public class EpiDataBurialDto {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("burialPersonName")
  private String burialPersonName = null;

  @JsonProperty("burialRelation")
  private String burialRelation = null;

  @JsonProperty("burialDateFrom")
  private OffsetDateTime burialDateFrom = null;

  @JsonProperty("burialDateTo")
  private OffsetDateTime burialDateTo = null;

  @JsonProperty("burialAddress")
  private LocationDto burialAddress = null;

  @JsonProperty("burialIll")
  private YesNoUnknown burialIll = null;

  @JsonProperty("burialTouching")
  private YesNoUnknown burialTouching = null;

  public EpiDataBurialDto creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public EpiDataBurialDto changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Get changeDate
   * @return changeDate
  **/
  @Schema(description = "")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public EpiDataBurialDto uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public EpiDataBurialDto burialPersonName(String burialPersonName) {
    this.burialPersonName = burialPersonName;
    return this;
  }

   /**
   * Get burialPersonName
   * @return burialPersonName
  **/
  @Schema(description = "")
  public String getBurialPersonName() {
    return burialPersonName;
  }

  public void setBurialPersonName(String burialPersonName) {
    this.burialPersonName = burialPersonName;
  }

  public EpiDataBurialDto burialRelation(String burialRelation) {
    this.burialRelation = burialRelation;
    return this;
  }

   /**
   * Get burialRelation
   * @return burialRelation
  **/
  @Schema(description = "")
  public String getBurialRelation() {
    return burialRelation;
  }

  public void setBurialRelation(String burialRelation) {
    this.burialRelation = burialRelation;
  }

  public EpiDataBurialDto burialDateFrom(OffsetDateTime burialDateFrom) {
    this.burialDateFrom = burialDateFrom;
    return this;
  }

   /**
   * Get burialDateFrom
   * @return burialDateFrom
  **/
  @Schema(description = "")
  public OffsetDateTime getBurialDateFrom() {
    return burialDateFrom;
  }

  public void setBurialDateFrom(OffsetDateTime burialDateFrom) {
    this.burialDateFrom = burialDateFrom;
  }

  public EpiDataBurialDto burialDateTo(OffsetDateTime burialDateTo) {
    this.burialDateTo = burialDateTo;
    return this;
  }

   /**
   * Get burialDateTo
   * @return burialDateTo
  **/
  @Schema(description = "")
  public OffsetDateTime getBurialDateTo() {
    return burialDateTo;
  }

  public void setBurialDateTo(OffsetDateTime burialDateTo) {
    this.burialDateTo = burialDateTo;
  }

  public EpiDataBurialDto burialAddress(LocationDto burialAddress) {
    this.burialAddress = burialAddress;
    return this;
  }

   /**
   * Get burialAddress
   * @return burialAddress
  **/
  @Schema(description = "")
  public LocationDto getBurialAddress() {
    return burialAddress;
  }

  public void setBurialAddress(LocationDto burialAddress) {
    this.burialAddress = burialAddress;
  }

  public EpiDataBurialDto burialIll(YesNoUnknown burialIll) {
    this.burialIll = burialIll;
    return this;
  }

   /**
   * Get burialIll
   * @return burialIll
  **/
  @Schema(description = "")
  public YesNoUnknown getBurialIll() {
    return burialIll;
  }

  public void setBurialIll(YesNoUnknown burialIll) {
    this.burialIll = burialIll;
  }

  public EpiDataBurialDto burialTouching(YesNoUnknown burialTouching) {
    this.burialTouching = burialTouching;
    return this;
  }

   /**
   * Get burialTouching
   * @return burialTouching
  **/
  @Schema(description = "")
  public YesNoUnknown getBurialTouching() {
    return burialTouching;
  }

  public void setBurialTouching(YesNoUnknown burialTouching) {
    this.burialTouching = burialTouching;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EpiDataBurialDto epiDataBurialDto = (EpiDataBurialDto) o;
    return Objects.equals(this.creationDate, epiDataBurialDto.creationDate) &&
        Objects.equals(this.changeDate, epiDataBurialDto.changeDate) &&
        Objects.equals(this.uuid, epiDataBurialDto.uuid) &&
        Objects.equals(this.burialPersonName, epiDataBurialDto.burialPersonName) &&
        Objects.equals(this.burialRelation, epiDataBurialDto.burialRelation) &&
        Objects.equals(this.burialDateFrom, epiDataBurialDto.burialDateFrom) &&
        Objects.equals(this.burialDateTo, epiDataBurialDto.burialDateTo) &&
        Objects.equals(this.burialAddress, epiDataBurialDto.burialAddress) &&
        Objects.equals(this.burialIll, epiDataBurialDto.burialIll) &&
        Objects.equals(this.burialTouching, epiDataBurialDto.burialTouching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, changeDate, uuid, burialPersonName, burialRelation, burialDateFrom, burialDateTo, burialAddress, burialIll, burialTouching);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpiDataBurialDto {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    burialPersonName: ").append(toIndentedString(burialPersonName)).append("\n");
    sb.append("    burialRelation: ").append(toIndentedString(burialRelation)).append("\n");
    sb.append("    burialDateFrom: ").append(toIndentedString(burialDateFrom)).append("\n");
    sb.append("    burialDateTo: ").append(toIndentedString(burialDateTo)).append("\n");
    sb.append("    burialAddress: ").append(toIndentedString(burialAddress)).append("\n");
    sb.append("    burialIll: ").append(toIndentedString(burialIll)).append("\n");
    sb.append("    burialTouching: ").append(toIndentedString(burialTouching)).append("\n");
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
