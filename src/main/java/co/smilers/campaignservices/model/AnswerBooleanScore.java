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
 * Respuesta y puntaje otorgado por los usuarios a las preguntas SI o NO
 */
@ApiModel(description = "Respuesta y puntaje otorgado por los usuarios a las preguntas SI o NO")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T21:28:42.257Z")

public class AnswerBooleanScore   {
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

  @JsonProperty("yesAnswer")
  private Integer yesAnswer = null;

  @JsonProperty("noAnswer")
  private Integer noAnswer = null;

  @JsonProperty("score")
  private Integer score = null;

  @JsonProperty("registrationDate")
  private String registrationDate = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("userId")
  private String userId = null;

  public AnswerBooleanScore id(Long id) {
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

  public AnswerBooleanScore campaign(Campaign campaign) {
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

  public AnswerBooleanScore headquarter(Headquarter headquarter) {
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

  public AnswerBooleanScore zone(Zone zone) {
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

  public AnswerBooleanScore questionItem(QuestionItem questionItem) {
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

  public AnswerBooleanScore meterDevice(MeterDevice meterDevice) {
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

  public AnswerBooleanScore cityCode(Long cityCode) {
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

  public AnswerBooleanScore cityName(String cityName) {
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

  public AnswerBooleanScore yesAnswer(Integer yesAnswer) {
    this.yesAnswer = yesAnswer;
    return this;
  }

  /**
   * Calificación posítiva
   * @return yesAnswer
  **/
  @ApiModelProperty(value = "Calificación posítiva")


  public Integer getYesAnswer() {
    return yesAnswer;
  }

  public void setYesAnswer(Integer yesAnswer) {
    this.yesAnswer = yesAnswer;
  }

  public AnswerBooleanScore noAnswer(Integer noAnswer) {
    this.noAnswer = noAnswer;
    return this;
  }

  /**
   * Calificación negátiva
   * @return noAnswer
  **/
  @ApiModelProperty(value = "Calificación negátiva")


  public Integer getNoAnswer() {
    return noAnswer;
  }

  public void setNoAnswer(Integer noAnswer) {
    this.noAnswer = noAnswer;
  }

  public AnswerBooleanScore score(Integer score) {
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

  public AnswerBooleanScore registrationDate(String registrationDate) {
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

  public AnswerBooleanScore comment(String comment) {
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

  public AnswerBooleanScore userId(String userId) {
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
    AnswerBooleanScore answerBooleanScore = (AnswerBooleanScore) o;
    return Objects.equals(this.id, answerBooleanScore.id) &&
        Objects.equals(this.campaign, answerBooleanScore.campaign) &&
        Objects.equals(this.headquarter, answerBooleanScore.headquarter) &&
        Objects.equals(this.zone, answerBooleanScore.zone) &&
        Objects.equals(this.questionItem, answerBooleanScore.questionItem) &&
        Objects.equals(this.meterDevice, answerBooleanScore.meterDevice) &&
        Objects.equals(this.cityCode, answerBooleanScore.cityCode) &&
        Objects.equals(this.cityName, answerBooleanScore.cityName) &&
        Objects.equals(this.yesAnswer, answerBooleanScore.yesAnswer) &&
        Objects.equals(this.noAnswer, answerBooleanScore.noAnswer) &&
        Objects.equals(this.score, answerBooleanScore.score) &&
        Objects.equals(this.registrationDate, answerBooleanScore.registrationDate) &&
        Objects.equals(this.comment, answerBooleanScore.comment) &&
        Objects.equals(this.userId, answerBooleanScore.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaign, headquarter, zone, questionItem, meterDevice, cityCode, cityName, yesAnswer, noAnswer, score, registrationDate, comment, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerBooleanScore {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    headquarter: ").append(toIndentedString(headquarter)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    questionItem: ").append(toIndentedString(questionItem)).append("\n");
    sb.append("    meterDevice: ").append(toIndentedString(meterDevice)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    yesAnswer: ").append(toIndentedString(yesAnswer)).append("\n");
    sb.append("    noAnswer: ").append(toIndentedString(noAnswer)).append("\n");
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

