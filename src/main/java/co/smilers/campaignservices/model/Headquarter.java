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
 * Sedes que puede tener una cuenta
 */
@ApiModel(description = "Sedes que puede tener una cuenta")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T12:54:40.619Z")

public class Headquarter   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("city")
  private City city = null;

  @JsonProperty("account")
  private String account = null;

  public Headquarter code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Identificador único de la sede
   * @return code
  **/
  @ApiModelProperty(value = "Identificador único de la sede")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public Headquarter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la sede
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nombre de la sede")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Headquarter city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")

  @Valid

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Headquarter account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Cuenta asociada a la sede
   * @return account
  **/
  @ApiModelProperty(value = "Cuenta asociada a la sede")


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Headquarter headquarter = (Headquarter) o;
    return Objects.equals(this.code, headquarter.code) &&
        Objects.equals(this.name, headquarter.name) &&
        Objects.equals(this.city, headquarter.city) &&
        Objects.equals(this.account, headquarter.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, city, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Headquarter {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

