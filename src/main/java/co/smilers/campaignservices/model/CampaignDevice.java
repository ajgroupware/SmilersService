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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-26T23:20:09.983Z")

public class CampaignDevice   {
  @JsonProperty("campaignCode")
  private Long campaignCode = null;

  @JsonProperty("deviceId")
  private Long deviceId = null;

  public CampaignDevice campaignCode(Long campaignCode) {
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

  public CampaignDevice deviceId(Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Dispositivo medidor asociado
   * @return deviceId
  **/
  @ApiModelProperty(value = "Dispositivo medidor asociado")


  public Long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Long deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDevice campaignDevice = (CampaignDevice) o;
    return Objects.equals(this.campaignCode, campaignDevice.campaignCode) &&
        Objects.equals(this.deviceId, campaignDevice.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignCode, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDevice {\n");
    
    sb.append("    campaignCode: ").append(toIndentedString(campaignCode)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

