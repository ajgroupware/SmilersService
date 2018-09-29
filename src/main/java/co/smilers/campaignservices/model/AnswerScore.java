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
 * Respuesta y puntaje otorgado por los usuarios a las campañas
 */
@ApiModel(description = "Respuesta y puntaje otorgado por los usuarios a las campañas")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-26T02:42:42.543Z")

public class AnswerScore   {
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

  @JsonProperty("cityName")
  private String cityName = null;

  @JsonProperty("excellent")
  private Integer excellent = null;

  @JsonProperty("good")
  private Integer good = null;

  @JsonProperty("moderate")
  private Integer moderate = null;

  @JsonProperty("bad")
  private Integer bad = null;

  @JsonProperty("poor")
  private Integer poor = null;

  @JsonProperty("score")
  private Integer score = null;

  @JsonProperty("registrationDate")
  private String registrationDate = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("userId")
  private String userId = null;

  public AnswerScore id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único de la respuesta
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único de la respuesta")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AnswerScore campaign(Campaign campaign) {
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

  public AnswerScore headquarter(Headquarter headquarter) {
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

  public AnswerScore zone(Zone zone) {
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

  public AnswerScore questionItem(QuestionItem questionItem) {
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

  public AnswerScore meterDevice(MeterDevice meterDevice) {
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

  public AnswerScore cityCode(Long cityCode) {
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

  public AnswerScore cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

  /**
   * 
   * @return cityName
  **/
  @ApiModelProperty(value = "")


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public AnswerScore excellent(Integer excellent) {
    this.excellent = excellent;
    return this;
  }

  /**
   * Calificación excelente 5
   * @return excellent
  **/
  @ApiModelProperty(value = "Calificación excelente 5")


  public Integer getExcellent() {
    return excellent;
  }

  public void setExcellent(Integer excellent) {
    this.excellent = excellent;
  }

  public AnswerScore good(Integer good) {
    this.good = good;
    return this;
  }

  /**
   * Calificación buena 4
   * @return good
  **/
  @ApiModelProperty(value = "Calificación buena 4")


  public Integer getGood() {
    return good;
  }

  public void setGood(Integer good) {
    this.good = good;
  }

  public AnswerScore moderate(Integer moderate) {
    this.moderate = moderate;
    return this;
  }

  /**
   * Calificación regular 3
   * @return moderate
  **/
  @ApiModelProperty(value = "Calificación regular 3")


  public Integer getModerate() {
    return moderate;
  }

  public void setModerate(Integer moderate) {
    this.moderate = moderate;
  }

  public AnswerScore bad(Integer bad) {
    this.bad = bad;
    return this;
  }

  /**
   * Calificación mala 2
   * @return bad
  **/
  @ApiModelProperty(value = "Calificación mala 2")


  public Integer getBad() {
    return bad;
  }

  public void setBad(Integer bad) {
    this.bad = bad;
  }

  public AnswerScore poor(Integer poor) {
    this.poor = poor;
    return this;
  }

  /**
   * Calificación deficiente 1
   * @return poor
  **/
  @ApiModelProperty(value = "Calificación deficiente 1")


  public Integer getPoor() {
    return poor;
  }

  public void setPoor(Integer poor) {
    this.poor = poor;
  }

  public AnswerScore score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Calificación total
   * @return score
  **/
  @ApiModelProperty(value = "Calificación total")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public AnswerScore registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Fecha en que se realizó la calificación
   * @return registrationDate
  **/
  @ApiModelProperty(value = "Fecha en que se realizó la calificación")


  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }

  public AnswerScore comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Comentario del usuario
   * @return comment
  **/
  @ApiModelProperty(value = "Comentario del usuario")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AnswerScore userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Identificación del usuario que califica
   * @return userId
  **/
  @ApiModelProperty(value = "Identificación del usuario que califica")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerScore answerScore = (AnswerScore) o;
    return Objects.equals(this.id, answerScore.id) &&
        Objects.equals(this.campaign, answerScore.campaign) &&
        Objects.equals(this.headquarter, answerScore.headquarter) &&
        Objects.equals(this.zone, answerScore.zone) &&
        Objects.equals(this.questionItem, answerScore.questionItem) &&
        Objects.equals(this.meterDevice, answerScore.meterDevice) &&
        Objects.equals(this.cityCode, answerScore.cityCode) &&
        Objects.equals(this.cityName, answerScore.cityName) &&
        Objects.equals(this.excellent, answerScore.excellent) &&
        Objects.equals(this.good, answerScore.good) &&
        Objects.equals(this.moderate, answerScore.moderate) &&
        Objects.equals(this.bad, answerScore.bad) &&
        Objects.equals(this.poor, answerScore.poor) &&
        Objects.equals(this.score, answerScore.score) &&
        Objects.equals(this.registrationDate, answerScore.registrationDate) &&
        Objects.equals(this.comment, answerScore.comment) &&
        Objects.equals(this.userId, answerScore.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaign, headquarter, zone, questionItem, meterDevice, cityCode, cityName, excellent, good, moderate, bad, poor, score, registrationDate, comment, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerScore {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    questionItem: ").append(toIndentedString(questionItem)).append("\n");
    sb.append("    meterDevice: ").append(toIndentedString(meterDevice)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    excellent: ").append(toIndentedString(excellent)).append("\n");
    sb.append("    good: ").append(toIndentedString(good)).append("\n");
    sb.append("    moderate: ").append(toIndentedString(moderate)).append("\n");
    sb.append("    bad: ").append(toIndentedString(bad)).append("\n");
    sb.append("    poor: ").append(toIndentedString(poor)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

