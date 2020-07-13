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
import de.quarano.sormas.client.model.ClassificationCriteriaDto;
import de.quarano.sormas.client.model.Disease;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
/**
 * DiseaseClassificationCriteriaDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-09T17:56:16.099120+02:00[Europe/Berlin]")
public class DiseaseClassificationCriteriaDto {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("disease")
  private Disease disease = null;

  @JsonProperty("suspectCriteria")
  private ClassificationCriteriaDto suspectCriteria = null;

  @JsonProperty("probableCriteria")
  private ClassificationCriteriaDto probableCriteria = null;

  @JsonProperty("confirmedCriteria")
  private ClassificationCriteriaDto confirmedCriteria = null;

  @JsonProperty("notACaseCriteria")
  private ClassificationCriteriaDto notACaseCriteria = null;

  public DiseaseClassificationCriteriaDto creationDate(OffsetDateTime creationDate) {
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

  public DiseaseClassificationCriteriaDto changeDate(OffsetDateTime changeDate) {
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

  public DiseaseClassificationCriteriaDto uuid(String uuid) {
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

  public DiseaseClassificationCriteriaDto disease(Disease disease) {
    this.disease = disease;
    return this;
  }

   /**
   * Get disease
   * @return disease
  **/
  @Schema(description = "")
  public Disease getDisease() {
    return disease;
  }

  public void setDisease(Disease disease) {
    this.disease = disease;
  }

  public DiseaseClassificationCriteriaDto suspectCriteria(ClassificationCriteriaDto suspectCriteria) {
    this.suspectCriteria = suspectCriteria;
    return this;
  }

   /**
   * Get suspectCriteria
   * @return suspectCriteria
  **/
  @Schema(description = "")
  public ClassificationCriteriaDto getSuspectCriteria() {
    return suspectCriteria;
  }

  public void setSuspectCriteria(ClassificationCriteriaDto suspectCriteria) {
    this.suspectCriteria = suspectCriteria;
  }

  public DiseaseClassificationCriteriaDto probableCriteria(ClassificationCriteriaDto probableCriteria) {
    this.probableCriteria = probableCriteria;
    return this;
  }

   /**
   * Get probableCriteria
   * @return probableCriteria
  **/
  @Schema(description = "")
  public ClassificationCriteriaDto getProbableCriteria() {
    return probableCriteria;
  }

  public void setProbableCriteria(ClassificationCriteriaDto probableCriteria) {
    this.probableCriteria = probableCriteria;
  }

  public DiseaseClassificationCriteriaDto confirmedCriteria(ClassificationCriteriaDto confirmedCriteria) {
    this.confirmedCriteria = confirmedCriteria;
    return this;
  }

   /**
   * Get confirmedCriteria
   * @return confirmedCriteria
  **/
  @Schema(description = "")
  public ClassificationCriteriaDto getConfirmedCriteria() {
    return confirmedCriteria;
  }

  public void setConfirmedCriteria(ClassificationCriteriaDto confirmedCriteria) {
    this.confirmedCriteria = confirmedCriteria;
  }

  public DiseaseClassificationCriteriaDto notACaseCriteria(ClassificationCriteriaDto notACaseCriteria) {
    this.notACaseCriteria = notACaseCriteria;
    return this;
  }

   /**
   * Get notACaseCriteria
   * @return notACaseCriteria
  **/
  @Schema(description = "")
  public ClassificationCriteriaDto getNotACaseCriteria() {
    return notACaseCriteria;
  }

  public void setNotACaseCriteria(ClassificationCriteriaDto notACaseCriteria) {
    this.notACaseCriteria = notACaseCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiseaseClassificationCriteriaDto diseaseClassificationCriteriaDto = (DiseaseClassificationCriteriaDto) o;
    return Objects.equals(this.creationDate, diseaseClassificationCriteriaDto.creationDate) &&
        Objects.equals(this.changeDate, diseaseClassificationCriteriaDto.changeDate) &&
        Objects.equals(this.uuid, diseaseClassificationCriteriaDto.uuid) &&
        Objects.equals(this.disease, diseaseClassificationCriteriaDto.disease) &&
        Objects.equals(this.suspectCriteria, diseaseClassificationCriteriaDto.suspectCriteria) &&
        Objects.equals(this.probableCriteria, diseaseClassificationCriteriaDto.probableCriteria) &&
        Objects.equals(this.confirmedCriteria, diseaseClassificationCriteriaDto.confirmedCriteria) &&
        Objects.equals(this.notACaseCriteria, diseaseClassificationCriteriaDto.notACaseCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, changeDate, uuid, disease, suspectCriteria, probableCriteria, confirmedCriteria, notACaseCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiseaseClassificationCriteriaDto {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    disease: ").append(toIndentedString(disease)).append("\n");
    sb.append("    suspectCriteria: ").append(toIndentedString(suspectCriteria)).append("\n");
    sb.append("    probableCriteria: ").append(toIndentedString(probableCriteria)).append("\n");
    sb.append("    confirmedCriteria: ").append(toIndentedString(confirmedCriteria)).append("\n");
    sb.append("    notACaseCriteria: ").append(toIndentedString(notACaseCriteria)).append("\n");
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
