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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PointOfEntryReferenceDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-09T17:56:16.099120+02:00[Europe/Berlin]")
public class PointOfEntryReferenceDto {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("otherPointOfEntry")
  private Boolean otherPointOfEntry = null;

  public PointOfEntryReferenceDto uuid(String uuid) {
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

  public PointOfEntryReferenceDto caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @Schema(description = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public PointOfEntryReferenceDto otherPointOfEntry(Boolean otherPointOfEntry) {
    this.otherPointOfEntry = otherPointOfEntry;
    return this;
  }

   /**
   * Get otherPointOfEntry
   * @return otherPointOfEntry
  **/
  @Schema(description = "")
  public Boolean isOtherPointOfEntry() {
    return otherPointOfEntry;
  }

  public void setOtherPointOfEntry(Boolean otherPointOfEntry) {
    this.otherPointOfEntry = otherPointOfEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfEntryReferenceDto pointOfEntryReferenceDto = (PointOfEntryReferenceDto) o;
    return Objects.equals(this.uuid, pointOfEntryReferenceDto.uuid) &&
        Objects.equals(this.caption, pointOfEntryReferenceDto.caption) &&
        Objects.equals(this.otherPointOfEntry, pointOfEntryReferenceDto.otherPointOfEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, caption, otherPointOfEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfEntryReferenceDto {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    otherPointOfEntry: ").append(toIndentedString(otherPointOfEntry)).append("\n");
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
