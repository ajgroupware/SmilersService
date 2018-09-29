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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-26T23:20:09.983Z")

public class AnswerGeneralScore   {
  @JsonProperty("id")
  private Long id = null;

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

  public AnswerGeneralScore id(Long id) {
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

  public AnswerGeneralScore headquarter(Headquarter headquarter) {
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

  public AnswerGeneralScore zone(Zone zone) {
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

  public AnswerGeneralScore questionItem(QuestionItem questionItem) {
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

  public AnswerGeneralScore meterDevice(MeterDevice meterDevice) {
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

  public AnswerGeneralScore cityCode(Long cityCode) {
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

  public AnswerGeneralScore cityName(String cityName) {
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

  public AnswerGeneralScore excellent(Integer excellent) {
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

  public AnswerGeneralScore good(Integer good) {
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

  public AnswerGeneralScore moderate(Integer moderate) {
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

  public AnswerGeneralScore bad(Integer bad) {
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

  public AnswerGeneralScore poor(Integer poor) {
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

  public AnswerGeneralScore score(Integer score) {
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

  public AnswerGeneralScore registrationDate(String registrationDate) {
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

  public AnswerGeneralScore comment(String comment) {
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

  public AnswerGeneralScore userId(String userId) {
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
    AnswerGeneralScore answerGeneralScore = (AnswerGeneralScore) o;
    return Objects.equals(this.id, answerGeneralScore.id) &&
        Objects.equals(this.headquarter, answerGeneralScore.headquarter) &&
        Objects.equals(this.zone, answerGeneralScore.zone) &&
        Objects.equals(this.questionItem, answerGeneralScore.questionItem) &&
        Objects.equals(this.meterDevice, answerGeneralScore.meterDevice) &&
        Objects.equals(this.cityCode, answerGeneralScore.cityCode) &&
        Objects.equals(this.cityName, answerGeneralScore.cityName) &&
        Objects.equals(this.excellent, answerGeneralScore.excellent) &&
        Objects.equals(this.good, answerGeneralScore.good) &&
        Objects.equals(this.moderate, answerGeneralScore.moderate) &&
        Objects.equals(this.bad, answerGeneralScore.bad) &&
        Objects.equals(this.poor, answerGeneralScore.poor) &&
        Objects.equals(this.score, answerGeneralScore.score) &&
        Objects.equals(this.registrationDate, answerGeneralScore.registrationDate) &&
        Objects.equals(this.comment, answerGeneralScore.comment) &&
        Objects.equals(this.userId, answerGeneralScore.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, headquarter, zone, questionItem, meterDevice, cityCode, cityName, excellent, good, moderate, bad, poor, score, registrationDate, comment, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerGeneralScore {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

