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
 * Solicitud de asistencia
 */
@ApiModel(description = "Solicitud de asistencia")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-13T11:28:48.392Z")

public class RequestAssistance   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("campaign")
  private Campaign campaign = null;

  @JsonProperty("headquarter")
  private Headquarter headquarter = null;

  @JsonProperty("zone")
  private Zone zone = null;

  @JsonProperty("questionItem")
  private QuestionItem questionItem = null;

  @JsonProperty("meterDevice")
  private MeterDevice meterDevice = null;

  @JsonProperty("cityCode")
  private Long cityCode = null;

  @JsonProperty("registrationDate")
  private String registrationDate = null;

  public RequestAssistance id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único de la solicitud
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único de la solicitud")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RequestAssistance campaign(Campaign campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }

  public RequestAssistance headquarter(Headquarter headquarter) {
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

  public RequestAssistance zone(Zone zone) {
    this.zone = zone;
    return this;
  }

  /**
   * Get zone
   * @return zone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Zone getZone() {
    return zone;
  }

  public void setZone(Zone zone) {
    this.zone = zone;
  }

  public RequestAssistance questionItem(QuestionItem questionItem) {
    this.questionItem = questionItem;
    return this;
  }

  /**
   * Get questionItem
   * @return questionItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QuestionItem getQuestionItem() {
    return questionItem;
  }

  public void setQuestionItem(QuestionItem questionItem) {
    this.questionItem = questionItem;
  }

  public RequestAssistance meterDevice(MeterDevice meterDevice) {
    this.meterDevice = meterDevice;
    return this;
  }

  /**
   * Get meterDevice
   * @return meterDevice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MeterDevice getMeterDevice() {
    return meterDevice;
  }

  public void setMeterDevice(MeterDevice meterDevice) {
    this.meterDevice = meterDevice;
  }

  public RequestAssistance cityCode(Long cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  /**
   * 
   * @return cityCode
  **/
  @ApiModelProperty(value = "")


  public Long getCityCode() {
    return cityCode;
  }

  public void setCityCode(Long cityCode) {
    this.cityCode = cityCode;
  }

  public RequestAssistance registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Fecha en que se realizó la solicitud (yyyy-MM-dd HH:mm:ss)
   * @return registrationDate
  **/
  @ApiModelProperty(value = "Fecha en que se realizó la solicitud (yyyy-MM-dd HH:mm:ss)")


  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestAssistance requestAssistance = (RequestAssistance) o;
    return Objects.equals(this.id, requestAssistance.id) &&
        Objects.equals(this.campaign, requestAssistance.campaign) &&
        Objects.equals(this.headquarter, requestAssistance.headquarter) &&
        Objects.equals(this.zone, requestAssistance.zone) &&
        Objects.equals(this.questionItem, requestAssistance.questionItem) &&
        Objects.equals(this.meterDevice, requestAssistance.meterDevice) &&
        Objects.equals(this.cityCode, requestAssistance.cityCode) &&
        Objects.equals(this.registrationDate, requestAssistance.registrationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaign, headquarter, zone, questionItem, meterDevice, cityCode, registrationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAssistance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    questionItem: ").append(toIndentedString(questionItem)).append("\n");
    sb.append("    meterDevice: ").append(toIndentedString(meterDevice)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
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

