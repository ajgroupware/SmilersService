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
 * Dispositivos medidores asociados a una campaña
 */
@ApiModel(description = "Dispositivos medidores asociados a una campaña")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-06T22:57:01.908Z")

public class SmsCellPhone   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("cellPhoneNumber")
  private String cellPhoneNumber = null;

  @JsonProperty("campaignCode")
  private Long campaignCode = null;

  @JsonProperty("headquarterCode")
  private Long headquarterCode = null;

  @JsonProperty("zoneCode")
  private Long zoneCode = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  public SmsCellPhone id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SmsCellPhone cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

  /**
   * Get cellPhoneNumber
   * @return cellPhoneNumber
  **/
  @ApiModelProperty(value = "")


  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public SmsCellPhone campaignCode(Long campaignCode) {
    this.campaignCode = campaignCode;
    return this;
  }

  /**
   * Campaña asociada
   * @return campaignCode
  **/
  @ApiModelProperty(value = "Campaña asociada")


  public Long getCampaignCode() {
    return campaignCode;
  }

  public void setCampaignCode(Long campaignCode) {
    this.campaignCode = campaignCode;
  }

  public SmsCellPhone headquarterCode(Long headquarterCode) {
    this.headquarterCode = headquarterCode;
    return this;
  }

  /**
   * Sede asociada
   * @return headquarterCode
  **/
  @ApiModelProperty(value = "Sede asociada")


  public Long getHeadquarterCode() {
    return headquarterCode;
  }

  public void setHeadquarterCode(Long headquarterCode) {
    this.headquarterCode = headquarterCode;
  }

  public SmsCellPhone zoneCode(Long zoneCode) {
    this.zoneCode = zoneCode;
    return this;
  }

  /**
   * Zona asociada
   * @return zoneCode
  **/
  @ApiModelProperty(value = "Zona asociada")


  public Long getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(Long zoneCode) {
    this.zoneCode = zoneCode;
  }

  public SmsCellPhone email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Correo electrónico al que se envia mensaje
   * @return email
  **/
  @ApiModelProperty(value = "Correo electrónico al que se envia mensaje")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SmsCellPhone isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Si está habilitado
   * @return isActive
  **/
  @ApiModelProperty(value = "Si está habilitado")


  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsCellPhone smsCellPhone = (SmsCellPhone) o;
    return Objects.equals(this.id, smsCellPhone.id) &&
        Objects.equals(this.cellPhoneNumber, smsCellPhone.cellPhoneNumber) &&
        Objects.equals(this.campaignCode, smsCellPhone.campaignCode) &&
        Objects.equals(this.headquarterCode, smsCellPhone.headquarterCode) &&
        Objects.equals(this.zoneCode, smsCellPhone.zoneCode) &&
        Objects.equals(this.email, smsCellPhone.email) &&
        Objects.equals(this.isActive, smsCellPhone.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cellPhoneNumber, campaignCode, headquarterCode, zoneCode, email, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsCellPhone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cellPhoneNumber: ").append(toIndentedString(cellPhoneNumber)).append("\n");
    sb.append("    campaignCode: ").append(toIndentedString(campaignCode)).append("\n");
    sb.append("    headquarterCode: ").append(toIndentedString(headquarterCode)).append("\n");
    sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

