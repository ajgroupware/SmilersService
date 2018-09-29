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
 * Zonas en las que se distrubuye una sede
 */
@ApiModel(description = "Zonas en las que se distrubuye una sede")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T12:54:40.619Z")

public class Zone   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("headquarter")
  private Headquarter headquarter = null;

  @JsonProperty("account")
  private String account = null;

  public Zone code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Identificador único de la zona
   * @return code
  **/
  @ApiModelProperty(value = "Identificador único de la zona")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public Zone name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la zona
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nombre de la zona")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Zone headquarter(Headquarter headquarter) {
    this.headquarter = headquarter;
    return this;
  }

  /**
   * Get headquarter
   * @return headquarter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Headquarter getHeadquarter() {
    return headquarter;
  }

  public void setHeadquarter(Headquarter headquarter) {
    this.headquarter = headquarter;
  }

  public Zone account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Cuenta asociada a la zona
   * @return account
  **/
  @ApiModelProperty(value = "Cuenta asociada a la zona")


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
    Zone zone = (Zone) o;
    return Objects.equals(this.code, zone.code) &&
        Objects.equals(this.name, zone.name) &&
        Objects.equals(this.headquarter, zone.headquarter) &&
        Objects.equals(this.account, zone.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, headquarter, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zone {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
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

