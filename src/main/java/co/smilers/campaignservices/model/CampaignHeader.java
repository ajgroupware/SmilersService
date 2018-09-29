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
 * Encabezado de la campaña
 */
@ApiModel(description = "Encabezado de la campaña")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T12:54:40.619Z")

public class CampaignHeader   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("designOrder")
  private Integer designOrder = null;

  @JsonProperty("designColor")
  private String designColor = null;

  @JsonProperty("isPublished")
  private Boolean isPublished = null;

  public CampaignHeader id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único del encabezado
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único del encabezado")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CampaignHeader title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Titulo del encabezado o bienvenida
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Titulo del encabezado o bienvenida")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CampaignHeader description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción o ayuda del encabezado
   * @return description
  **/
  @ApiModelProperty(value = "Descripción o ayuda del encabezado")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CampaignHeader designOrder(Integer designOrder) {
    this.designOrder = designOrder;
    return this;
  }

  /**
   * Orden en que se lista el encabezado
   * @return designOrder
  **/
  @ApiModelProperty(value = "Orden en que se lista el encabezado")


  public Integer getDesignOrder() {
    return designOrder;
  }

  public void setDesignOrder(Integer designOrder) {
    this.designOrder = designOrder;
  }

  public CampaignHeader designColor(String designColor) {
    this.designColor = designColor;
    return this;
  }

  /**
   * Color del encabezado
   * @return designColor
  **/
  @ApiModelProperty(value = "Color del encabezado")


  public String getDesignColor() {
    return designColor;
  }

  public void setDesignColor(String designColor) {
    this.designColor = designColor;
  }

  public CampaignHeader isPublished(Boolean isPublished) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignHeader campaignHeader = (CampaignHeader) o;
    return Objects.equals(this.id, campaignHeader.id) &&
        Objects.equals(this.title, campaignHeader.title) &&
        Objects.equals(this.description, campaignHeader.description) &&
        Objects.equals(this.designOrder, campaignHeader.designOrder) &&
        Objects.equals(this.designColor, campaignHeader.designColor) &&
        Objects.equals(this.isPublished, campaignHeader.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, designOrder, designColor, isPublished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignHeader {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    designOrder: ").append(toIndentedString(designOrder)).append("\n");
    sb.append("    designColor: ").append(toIndentedString(designColor)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

