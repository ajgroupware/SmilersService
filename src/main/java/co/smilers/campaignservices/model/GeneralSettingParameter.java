package co.smilers.campaignservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parametros generales de configuración
 */
@ApiModel(description = "Parametros generales de configuración")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-06T22:57:01.908Z")

public class GeneralSettingParameter   {
  @JsonProperty("parameterKey")
  private String parameterKey = null;

  @JsonProperty("parameterValue")
  private String parameterValue = null;

  public GeneralSettingParameter parameterKey(String parameterKey) {
    this.parameterKey = parameterKey;
    return this;
  }

  /**
   * Llave que identifica el parámetro
   * @return parameterKey
  **/
  @ApiModelProperty(value = "Llave que identifica el parámetro")


  public String getParameterKey() {
    return parameterKey;
  }

  public void setParameterKey(String parameterKey) {
    this.parameterKey = parameterKey;
  }

  public GeneralSettingParameter parameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

  /**
   * Valor del parámetro
   * @return parameterValue
  **/
  @ApiModelProperty(value = "Valor del parámetro")


  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralSettingParameter generalSettingParameter = (GeneralSettingParameter) o;
    return Objects.equals(this.parameterKey, generalSettingParameter.parameterKey) &&
        Objects.equals(this.parameterValue, generalSettingParameter.parameterValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterKey, parameterValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralSettingParameter {\n");
    
    sb.append("    parameterKey: ").append(toIndentedString(parameterKey)).append("\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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

