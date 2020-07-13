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
import de.quarano.sormas.client.model.Disease;
import de.quarano.sormas.client.model.FacilityReferenceDto;
import de.quarano.sormas.client.model.PathogenTestResultType;
import de.quarano.sormas.client.model.PathogenTestType;
import de.quarano.sormas.client.model.SampleReferenceDto;
import de.quarano.sormas.client.model.UserReferenceDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
/**
 * PathogenTestDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-09T17:56:16.099120+02:00[Europe/Berlin]")
public class PathogenTestDto {
  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("sample")
  private SampleReferenceDto sample = null;

  @JsonProperty("testedDisease")
  private Disease testedDisease = null;

  @JsonProperty("testedDiseaseDetails")
  private String testedDiseaseDetails = null;

  @JsonProperty("testType")
  private PathogenTestType testType = null;

  @JsonProperty("testTypeText")
  private String testTypeText = null;

  @JsonProperty("testDateTime")
  private OffsetDateTime testDateTime = null;

  @JsonProperty("lab")
  private FacilityReferenceDto lab = null;

  @JsonProperty("labDetails")
  private String labDetails = null;

  @JsonProperty("labUser")
  private UserReferenceDto labUser = null;

  @JsonProperty("testResult")
  private PathogenTestResultType testResult = null;

  @JsonProperty("testResultText")
  private String testResultText = null;

  @JsonProperty("testResultVerified")
  private Boolean testResultVerified = null;

  @JsonProperty("fourFoldIncreaseAntibodyTiter")
  private Boolean fourFoldIncreaseAntibodyTiter = null;

  @JsonProperty("serotype")
  private String serotype = null;

  @JsonProperty("cqValue")
  private Float cqValue = null;

  public PathogenTestDto creationDate(OffsetDateTime creationDate) {
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

  public PathogenTestDto changeDate(OffsetDateTime changeDate) {
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

  public PathogenTestDto uuid(String uuid) {
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

  public PathogenTestDto sample(SampleReferenceDto sample) {
    this.sample = sample;
    return this;
  }

   /**
   * Get sample
   * @return sample
  **/
  @Schema(required = true, description = "")
  public SampleReferenceDto getSample() {
    return sample;
  }

  public void setSample(SampleReferenceDto sample) {
    this.sample = sample;
  }

  public PathogenTestDto testedDisease(Disease testedDisease) {
    this.testedDisease = testedDisease;
    return this;
  }

   /**
   * Get testedDisease
   * @return testedDisease
  **/
  @Schema(required = true, description = "")
  public Disease getTestedDisease() {
    return testedDisease;
  }

  public void setTestedDisease(Disease testedDisease) {
    this.testedDisease = testedDisease;
  }

  public PathogenTestDto testedDiseaseDetails(String testedDiseaseDetails) {
    this.testedDiseaseDetails = testedDiseaseDetails;
    return this;
  }

   /**
   * Get testedDiseaseDetails
   * @return testedDiseaseDetails
  **/
  @Schema(description = "")
  public String getTestedDiseaseDetails() {
    return testedDiseaseDetails;
  }

  public void setTestedDiseaseDetails(String testedDiseaseDetails) {
    this.testedDiseaseDetails = testedDiseaseDetails;
  }

  public PathogenTestDto testType(PathogenTestType testType) {
    this.testType = testType;
    return this;
  }

   /**
   * Get testType
   * @return testType
  **/
  @Schema(required = true, description = "")
  public PathogenTestType getTestType() {
    return testType;
  }

  public void setTestType(PathogenTestType testType) {
    this.testType = testType;
  }

  public PathogenTestDto testTypeText(String testTypeText) {
    this.testTypeText = testTypeText;
    return this;
  }

   /**
   * Get testTypeText
   * @return testTypeText
  **/
  @Schema(description = "")
  public String getTestTypeText() {
    return testTypeText;
  }

  public void setTestTypeText(String testTypeText) {
    this.testTypeText = testTypeText;
  }

  public PathogenTestDto testDateTime(OffsetDateTime testDateTime) {
    this.testDateTime = testDateTime;
    return this;
  }

   /**
   * Get testDateTime
   * @return testDateTime
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getTestDateTime() {
    return testDateTime;
  }

  public void setTestDateTime(OffsetDateTime testDateTime) {
    this.testDateTime = testDateTime;
  }

  public PathogenTestDto lab(FacilityReferenceDto lab) {
    this.lab = lab;
    return this;
  }

   /**
   * Get lab
   * @return lab
  **/
  @Schema(required = true, description = "")
  public FacilityReferenceDto getLab() {
    return lab;
  }

  public void setLab(FacilityReferenceDto lab) {
    this.lab = lab;
  }

  public PathogenTestDto labDetails(String labDetails) {
    this.labDetails = labDetails;
    return this;
  }

   /**
   * Get labDetails
   * @return labDetails
  **/
  @Schema(description = "")
  public String getLabDetails() {
    return labDetails;
  }

  public void setLabDetails(String labDetails) {
    this.labDetails = labDetails;
  }

  public PathogenTestDto labUser(UserReferenceDto labUser) {
    this.labUser = labUser;
    return this;
  }

   /**
   * Get labUser
   * @return labUser
  **/
  @Schema(required = true, description = "")
  public UserReferenceDto getLabUser() {
    return labUser;
  }

  public void setLabUser(UserReferenceDto labUser) {
    this.labUser = labUser;
  }

  public PathogenTestDto testResult(PathogenTestResultType testResult) {
    this.testResult = testResult;
    return this;
  }

   /**
   * Get testResult
   * @return testResult
  **/
  @Schema(required = true, description = "")
  public PathogenTestResultType getTestResult() {
    return testResult;
  }

  public void setTestResult(PathogenTestResultType testResult) {
    this.testResult = testResult;
  }

  public PathogenTestDto testResultText(String testResultText) {
    this.testResultText = testResultText;
    return this;
  }

   /**
   * Get testResultText
   * @return testResultText
  **/
  @Schema(required = true, description = "")
  public String getTestResultText() {
    return testResultText;
  }

  public void setTestResultText(String testResultText) {
    this.testResultText = testResultText;
  }

  public PathogenTestDto testResultVerified(Boolean testResultVerified) {
    this.testResultVerified = testResultVerified;
    return this;
  }

   /**
   * Get testResultVerified
   * @return testResultVerified
  **/
  @Schema(required = true, description = "")
  public Boolean isTestResultVerified() {
    return testResultVerified;
  }

  public void setTestResultVerified(Boolean testResultVerified) {
    this.testResultVerified = testResultVerified;
  }

  public PathogenTestDto fourFoldIncreaseAntibodyTiter(Boolean fourFoldIncreaseAntibodyTiter) {
    this.fourFoldIncreaseAntibodyTiter = fourFoldIncreaseAntibodyTiter;
    return this;
  }

   /**
   * Get fourFoldIncreaseAntibodyTiter
   * @return fourFoldIncreaseAntibodyTiter
  **/
  @Schema(description = "")
  public Boolean isFourFoldIncreaseAntibodyTiter() {
    return fourFoldIncreaseAntibodyTiter;
  }

  public void setFourFoldIncreaseAntibodyTiter(Boolean fourFoldIncreaseAntibodyTiter) {
    this.fourFoldIncreaseAntibodyTiter = fourFoldIncreaseAntibodyTiter;
  }

  public PathogenTestDto serotype(String serotype) {
    this.serotype = serotype;
    return this;
  }

   /**
   * Get serotype
   * @return serotype
  **/
  @Schema(description = "")
  public String getSerotype() {
    return serotype;
  }

  public void setSerotype(String serotype) {
    this.serotype = serotype;
  }

  public PathogenTestDto cqValue(Float cqValue) {
    this.cqValue = cqValue;
    return this;
  }

   /**
   * Get cqValue
   * @return cqValue
  **/
  @Schema(description = "")
  public Float getCqValue() {
    return cqValue;
  }

  public void setCqValue(Float cqValue) {
    this.cqValue = cqValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PathogenTestDto pathogenTestDto = (PathogenTestDto) o;
    return Objects.equals(this.creationDate, pathogenTestDto.creationDate) &&
        Objects.equals(this.changeDate, pathogenTestDto.changeDate) &&
        Objects.equals(this.uuid, pathogenTestDto.uuid) &&
        Objects.equals(this.sample, pathogenTestDto.sample) &&
        Objects.equals(this.testedDisease, pathogenTestDto.testedDisease) &&
        Objects.equals(this.testedDiseaseDetails, pathogenTestDto.testedDiseaseDetails) &&
        Objects.equals(this.testType, pathogenTestDto.testType) &&
        Objects.equals(this.testTypeText, pathogenTestDto.testTypeText) &&
        Objects.equals(this.testDateTime, pathogenTestDto.testDateTime) &&
        Objects.equals(this.lab, pathogenTestDto.lab) &&
        Objects.equals(this.labDetails, pathogenTestDto.labDetails) &&
        Objects.equals(this.labUser, pathogenTestDto.labUser) &&
        Objects.equals(this.testResult, pathogenTestDto.testResult) &&
        Objects.equals(this.testResultText, pathogenTestDto.testResultText) &&
        Objects.equals(this.testResultVerified, pathogenTestDto.testResultVerified) &&
        Objects.equals(this.fourFoldIncreaseAntibodyTiter, pathogenTestDto.fourFoldIncreaseAntibodyTiter) &&
        Objects.equals(this.serotype, pathogenTestDto.serotype) &&
        Objects.equals(this.cqValue, pathogenTestDto.cqValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, changeDate, uuid, sample, testedDisease, testedDiseaseDetails, testType, testTypeText, testDateTime, lab, labDetails, labUser, testResult, testResultText, testResultVerified, fourFoldIncreaseAntibodyTiter, serotype, cqValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PathogenTestDto {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    testedDisease: ").append(toIndentedString(testedDisease)).append("\n");
    sb.append("    testedDiseaseDetails: ").append(toIndentedString(testedDiseaseDetails)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    testTypeText: ").append(toIndentedString(testTypeText)).append("\n");
    sb.append("    testDateTime: ").append(toIndentedString(testDateTime)).append("\n");
    sb.append("    lab: ").append(toIndentedString(lab)).append("\n");
    sb.append("    labDetails: ").append(toIndentedString(labDetails)).append("\n");
    sb.append("    labUser: ").append(toIndentedString(labUser)).append("\n");
    sb.append("    testResult: ").append(toIndentedString(testResult)).append("\n");
    sb.append("    testResultText: ").append(toIndentedString(testResultText)).append("\n");
    sb.append("    testResultVerified: ").append(toIndentedString(testResultVerified)).append("\n");
    sb.append("    fourFoldIncreaseAntibodyTiter: ").append(toIndentedString(fourFoldIncreaseAntibodyTiter)).append("\n");
    sb.append("    serotype: ").append(toIndentedString(serotype)).append("\n");
    sb.append("    cqValue: ").append(toIndentedString(cqValue)).append("\n");
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
