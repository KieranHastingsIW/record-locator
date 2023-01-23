package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RLSPOSTAPISchema
 */

@JsonTypeName("RLS_POST_API_Schema")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-23T13:39:37.615092+13:00[Pacific/Auckland]")
public class RLSPOSTAPISchema {

  @JsonProperty("systemid")
  private Integer systemid;

  @JsonProperty("datatype")
  private Integer datatype;

  @JsonProperty("patientid")
  private String patientid;

  public RLSPOSTAPISchema systemid(Integer systemid) {
    this.systemid = systemid;
    return this;
  }

  /**
   * Get systemid
   * @return systemid
  */
  @NotNull 
  @Schema(name = "systemid", required = true)
  public Integer getSystemid() {
    return systemid;
  }

  public void setSystemid(Integer systemid) {
    this.systemid = systemid;
  }

  public RLSPOSTAPISchema datatype(Integer datatype) {
    this.datatype = datatype;
    return this;
  }

  /**
   * Get datatype
   * @return datatype
  */
  @NotNull 
  @Schema(name = "datatype", required = true)
  public Integer getDatatype() {
    return datatype;
  }

  public void setDatatype(Integer datatype) {
    this.datatype = datatype;
  }

  public RLSPOSTAPISchema patientid(String patientid) {
    this.patientid = patientid;
    return this;
  }

  /**
   * Get patientid
   * @return patientid
  */
  @NotNull @Size(min = 1) 
  @Schema(name = "patientid", required = true)
  public String getPatientid() {
    return patientid;
  }

  public void setPatientid(String patientid) {
    this.patientid = patientid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RLSPOSTAPISchema rlSPOSTAPISchema = (RLSPOSTAPISchema) o;
    return Objects.equals(this.systemid, rlSPOSTAPISchema.systemid) &&
        Objects.equals(this.datatype, rlSPOSTAPISchema.datatype) &&
        Objects.equals(this.patientid, rlSPOSTAPISchema.patientid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemid, datatype, patientid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RLSPOSTAPISchema {\n");
    sb.append("    systemid: ").append(toIndentedString(systemid)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
    sb.append("    patientid: ").append(toIndentedString(patientid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

