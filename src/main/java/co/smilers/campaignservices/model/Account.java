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
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T11:44:30.625Z")

public class Account   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("activedUsers")
  private Integer activedUsers = null;

  public Account id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único de la cuenta
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único de la cuenta")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Código de la cuenta
   * @return code
  **/
  @ApiModelProperty(value = "Código de la cuenta")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la cuenta
   * @return name
  **/
  @ApiModelProperty(value = "Nombre de la cuenta")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account activedUsers(Integer activedUsers) {
    this.activedUsers = activedUsers;
    return this;
  }

  /**
   * Usuarios permitidos
   * @return activedUsers
  **/
  @ApiModelProperty(value = "Usuarios permitidos")


  public Integer getActivedUsers() {
    return activedUsers;
  }

  public void setActivedUsers(Integer activedUsers) {
    this.activedUsers = activedUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.code, account.code) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.activedUsers, account.activedUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, activedUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activedUsers: ").append(toIndentedString(activedUsers)).append("\n");
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

