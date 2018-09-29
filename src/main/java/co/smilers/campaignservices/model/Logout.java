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
 * Logout
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T11:06:30.112Z")

public class Logout   {
  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("idPush")
  private String idPush = null;

  public Logout userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Logout idPush(String idPush) {
    this.idPush = idPush;
    return this;
  }

  /**
   * Get idPush
   * @return idPush
  **/
  @ApiModelProperty(value = "")


  public String getIdPush() {
    return idPush;
  }

  public void setIdPush(String idPush) {
    this.idPush = idPush;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Logout logout = (Logout) o;
    return Objects.equals(this.userName, logout.userName) &&
        Objects.equals(this.idPush, logout.idPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, idPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Logout {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    idPush: ").append(toIndentedString(idPush)).append("\n");
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

