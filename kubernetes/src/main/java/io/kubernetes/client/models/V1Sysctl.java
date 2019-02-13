/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.12.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

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
 * Sysctl defines a kernel parameter to be set
 */
@ApiModel(description = "Sysctl defines a kernel parameter to be set")

public class V1Sysctl {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public V1Sysctl name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of a property to set
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of a property to set")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Sysctl value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of a property to set
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value of a property to set")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Sysctl v1Sysctl = (V1Sysctl) o;
    return Objects.equals(this.name, v1Sysctl.name) &&
        Objects.equals(this.value, v1Sysctl.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Sysctl {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
