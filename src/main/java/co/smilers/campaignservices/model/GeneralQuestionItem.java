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
 * Definición de las preguntas generales
 */
@ApiModel(description = "Definición de las preguntas generales")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T16:46:37.371Z")

public class GeneralQuestionItem   {
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

  public GeneralQuestionItem code(Long code) {
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

  public GeneralQuestionItem title(String title) {
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

  public GeneralQuestionItem description(String description) {
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

  public GeneralQuestionItem designOrder(Integer designOrder) {
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

  public GeneralQuestionItem designColor(String designColor) {
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

  public GeneralQuestionItem minScore(Double minScore) {
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

  public GeneralQuestionItem isPublished(Boolean isPublished) {
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

  public GeneralQuestionItem receiveComment(Boolean receiveComment) {
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

  public GeneralQuestionItem sendSmsNotification(Boolean sendSmsNotification) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralQuestionItem generalQuestionItem = (GeneralQuestionItem) o;
    return Objects.equals(this.code, generalQuestionItem.code) &&
        Objects.equals(this.title, generalQuestionItem.title) &&
        Objects.equals(this.description, generalQuestionItem.description) &&
        Objects.equals(this.designOrder, generalQuestionItem.designOrder) &&
        Objects.equals(this.designColor, generalQuestionItem.designColor) &&
        Objects.equals(this.minScore, generalQuestionItem.minScore) &&
        Objects.equals(this.isPublished, generalQuestionItem.isPublished) &&
        Objects.equals(this.receiveComment, generalQuestionItem.receiveComment) &&
        Objects.equals(this.sendSmsNotification, generalQuestionItem.sendSmsNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, description, designOrder, designColor, minScore, isPublished, receiveComment, sendSmsNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralQuestionItem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    designOrder: ").append(toIndentedString(designOrder)).append("\n");
    sb.append("    designColor: ").append(toIndentedString(designColor)).append("\n");
    sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    receiveComment: ").append(toIndentedString(receiveComment)).append("\n");
    sb.append("    sendSmsNotification: ").append(toIndentedString(sendSmsNotification)).append("\n");
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

