/*
 * Authentication api
 * An API for authentication
 *
 * The version of the OpenAPI document: 1.0.0-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ch.heigvd.amt.gestioncours.dto;

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

/**
 * Subject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-13T15:03:23.879+01:00[Europe/Berlin]")
public class Subject {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREDITS_ETCS = "credits_etcs";
  @SerializedName(SERIALIZED_NAME_CREDITS_ETCS)
  private Long creditsEtcs;


  public Subject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Subject creditsEtcs(Long creditsEtcs) {
    
    this.creditsEtcs = creditsEtcs;
    return this;
  }

   /**
   * Get creditsEtcs
   * @return creditsEtcs
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getCreditsEtcs() {
    return creditsEtcs;
  }


  public void setCreditsEtcs(Long creditsEtcs) {
    this.creditsEtcs = creditsEtcs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subject subject = (Subject) o;
    return Objects.equals(this.name, subject.name) &&
        Objects.equals(this.creditsEtcs, subject.creditsEtcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, creditsEtcs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creditsEtcs: ").append(toIndentedString(creditsEtcs)).append("\n");
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

