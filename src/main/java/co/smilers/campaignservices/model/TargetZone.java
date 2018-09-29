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
 * TargetZone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-26T23:20:09.983Z")

public class TargetZone   {
  @JsonProperty("zoneCode")
  private Long zoneCode = null;

  @JsonProperty("campaignCode")
  private Long campaignCode = null;

  public TargetZone zoneCode(Long zoneCode) {
    this.zoneCode = zoneCode;
    return this;
  }

  /**
   * 
   * @return zoneCode
  **/
  @ApiModelProperty(value = "")


  public Long getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(Long zoneCode) {
    this.zoneCode = zoneCode;
  }

  public TargetZone campaignCode(Long campaignCode) {
    this.campaignCode = campaignCode;
    return this;
  }

  /**
   * 
   * @return campaignCode
  **/
  @ApiModelProperty(value = "")


  public Long getCampaignCode() {
    return campaignCode;
  }

  public void setCampaignCode(Long campaignCode) {
    this.campaignCode = campaignCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetZone targetZone = (TargetZone) o;
    return Objects.equals(this.zoneCode, targetZone.zoneCode) &&
        Objects.equals(this.campaignCode, targetZone.campaignCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneCode, campaignCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetZone {\n");
    
    sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
    sb.append("    campaignCode: ").append(toIndentedString(campaignCode)).append("\n");
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

