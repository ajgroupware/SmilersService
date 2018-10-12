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
 * Definición de las preguntas de una campaña
 */
@ApiModel(description = "Definición de las preguntas de una campaña")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T22:19:45.279Z")

public class QuestionItem   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("designOrder")
  private Integer designOrder = null;

  @JsonProperty("designColor")
  private String designColor = null;

  @JsonProperty("minScore")
  private Double minScore = null;

  @JsonProperty("isPublished")
  private Boolean isPublished = null;

  @JsonProperty("receiveComment")
  private Boolean receiveComment = null;

  @JsonProperty("sendSmsNotification")
  private Boolean sendSmsNotification = null;

  @JsonProperty("questionType")
  private String questionType = null;

  public QuestionItem code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Identificador único de la pregunta
   * @return code
  **/
  @ApiModelProperty(value = "Identificador único de la pregunta")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public QuestionItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Pregunta
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Pregunta")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public QuestionItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción o soporte de ayuda a la pregunta
   * @return description
  **/
  @ApiModelProperty(value = "Descripción o soporte de ayuda a la pregunta")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuestionItem designOrder(Integer designOrder) {
    this.designOrder = designOrder;
    return this;
  }

  /**
   * Orden en que se listan las preguntas
   * @return designOrder
  **/
  @ApiModelProperty(value = "Orden en que se listan las preguntas")


  public Integer getDesignOrder() {
    return designOrder;
  }

  public void setDesignOrder(Integer designOrder) {
    this.designOrder = designOrder;
  }

  public QuestionItem designColor(String designColor) {
    this.designColor = designColor;
    return this;
  }

  /**
   * Color exadecimal de la pregunta
   * @return designColor
  **/
  @ApiModelProperty(value = "Color exadecimal de la pregunta")


  public String getDesignColor() {
    return designColor;
  }

  public void setDesignColor(String designColor) {
    this.designColor = designColor;
  }

  public QuestionItem minScore(Double minScore) {
    this.minScore = minScore;
    return this;
  }

  /**
   * Calificación mínima recidida por un usuario para generar alerta
   * @return minScore
  **/
  @ApiModelProperty(value = "Calificación mínima recidida por un usuario para generar alerta")


  public Double getMinScore() {
    return minScore;
  }

  public void setMinScore(Double minScore) {
    this.minScore = minScore;
  }

  public QuestionItem isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Encabezado activo o listo para visualizar
   * @return isPublished
  **/
  @ApiModelProperty(value = "Encabezado activo o listo para visualizar")


  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public QuestionItem receiveComment(Boolean receiveComment) {
    this.receiveComment = receiveComment;
    return this;
  }

  /**
   * Indica si la pregunta habilita comentario
   * @return receiveComment
  **/
  @ApiModelProperty(value = "Indica si la pregunta habilita comentario")


  public Boolean isReceiveComment() {
    return receiveComment;
  }

  public void setReceiveComment(Boolean receiveComment) {
    this.receiveComment = receiveComment;
  }

  public QuestionItem sendSmsNotification(Boolean sendSmsNotification) {
    this.sendSmsNotification = sendSmsNotification;
    return this;
  }

  /**
   * Indica la posibilidad de enviar notificación de Alerta SMS
   * @return sendSmsNotification
  **/
  @ApiModelProperty(value = "Indica la posibilidad de enviar notificación de Alerta SMS")


  public Boolean isSendSmsNotification() {
    return sendSmsNotification;
  }

  public void setSendSmsNotification(Boolean sendSmsNotification) {
    this.sendSmsNotification = sendSmsNotification;
  }

  public QuestionItem questionType(String questionType) {
    this.questionType = questionType;
    return this;
  }

  /**
   * Tipo de pregunta
   * @return questionType
  **/
  @ApiModelProperty(value = "Tipo de pregunta")


  public String getQuestionType() {
    return questionType;
  }

  public void setQuestionType(String questionType) {
    this.questionType = questionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionItem questionItem = (QuestionItem) o;
    return Objects.equals(this.code, questionItem.code) &&
        Objects.equals(this.title, questionItem.title) &&
        Objects.equals(this.description, questionItem.description) &&
        Objects.equals(this.designOrder, questionItem.designOrder) &&
        Objects.equals(this.designColor, questionItem.designColor) &&
        Objects.equals(this.minScore, questionItem.minScore) &&
        Objects.equals(this.isPublished, questionItem.isPublished) &&
        Objects.equals(this.receiveComment, questionItem.receiveComment) &&
        Objects.equals(this.sendSmsNotification, questionItem.sendSmsNotification) &&
        Objects.equals(this.questionType, questionItem.questionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, description, designOrder, designColor, minScore, isPublished, receiveComment, sendSmsNotification, questionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionItem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    designOrder: ").append(toIndentedString(designOrder)).append("\n");
    sb.append("    designColor: ").append(toIndentedString(designColor)).append("\n");
    sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    receiveComment: ").append(toIndentedString(receiveComment)).append("\n");
    sb.append("    sendSmsNotification: ").append(toIndentedString(sendSmsNotification)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
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

