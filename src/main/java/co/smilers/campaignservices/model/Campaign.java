package co.smilers.campaignservices.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Campañas de satisfacción de usuarios
 */
@ApiModel(description = "Campañas de satisfacción de usuarios")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T12:54:40.619Z")

public class Campaign   {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("isPublished")
  private Boolean isPublished = null;

  @JsonProperty("campaignHeaders")
  @Valid
  private List<CampaignHeader> campaignHeaders = null;

  @JsonProperty("questionItems")
  @Valid
  private List<QuestionItem> questionItems = null;

  @JsonProperty("campaignFooter")
  @Valid
  private List<CampaignFooter> campaignFooter = null;

  public Campaign code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Código único de la campaña
   * @return code
  **/
  @ApiModelProperty(value = "Código único de la campaña")


  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public Campaign title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Nombre o titulo de la campaña
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Nombre o titulo de la campaña")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Campaign description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción u objetivo de la campaña
   * @return description
  **/
  @ApiModelProperty(value = "Descripción u objetivo de la campaña")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Campaign startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Fecha de inicio de la campaña (yyyy-MM-dd HH:mm:ss)
   * @return startDate
  **/
  @ApiModelProperty(value = "Fecha de inicio de la campaña (yyyy-MM-dd HH:mm:ss)")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Campaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Fecha de finalización de la campaña (yyyy-MM-dd HH:mm:ss)
   * @return endDate
  **/
  @ApiModelProperty(value = "Fecha de finalización de la campaña (yyyy-MM-dd HH:mm:ss)")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Campaign isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Campaña activa para el público, para recibir calificaciones
   * @return isPublished
  **/
  @ApiModelProperty(value = "Campaña activa para el público, para recibir calificaciones")


  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public Campaign campaignHeaders(List<CampaignHeader> campaignHeaders) {
    this.campaignHeaders = campaignHeaders;
    return this;
  }

  public Campaign addCampaignHeadersItem(CampaignHeader campaignHeadersItem) {
    if (this.campaignHeaders == null) {
      this.campaignHeaders = new ArrayList<CampaignHeader>();
    }
    this.campaignHeaders.add(campaignHeadersItem);
    return this;
  }

  /**
   * Get campaignHeaders
   * @return campaignHeaders
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignHeader> getCampaignHeaders() {
    return campaignHeaders;
  }

  public void setCampaignHeaders(List<CampaignHeader> campaignHeaders) {
    this.campaignHeaders = campaignHeaders;
  }

  public Campaign questionItems(List<QuestionItem> questionItems) {
    this.questionItems = questionItems;
    return this;
  }

  public Campaign addQuestionItemsItem(QuestionItem questionItemsItem) {
    if (this.questionItems == null) {
      this.questionItems = new ArrayList<QuestionItem>();
    }
    this.questionItems.add(questionItemsItem);
    return this;
  }

  /**
   * Get questionItems
   * @return questionItems
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QuestionItem> getQuestionItems() {
    return questionItems;
  }

  public void setQuestionItems(List<QuestionItem> questionItems) {
    this.questionItems = questionItems;
  }

  public Campaign campaignFooter(List<CampaignFooter> campaignFooter) {
    this.campaignFooter = campaignFooter;
    return this;
  }

  public Campaign addCampaignFooterItem(CampaignFooter campaignFooterItem) {
    if (this.campaignFooter == null) {
      this.campaignFooter = new ArrayList<CampaignFooter>();
    }
    this.campaignFooter.add(campaignFooterItem);
    return this;
  }

  /**
   * Get campaignFooter
   * @return campaignFooter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignFooter> getCampaignFooter() {
    return campaignFooter;
  }

  public void setCampaignFooter(List<CampaignFooter> campaignFooter) {
    this.campaignFooter = campaignFooter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.code, campaign.code) &&
        Objects.equals(this.title, campaign.title) &&
        Objects.equals(this.description, campaign.description) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.isPublished, campaign.isPublished) &&
        Objects.equals(this.campaignHeaders, campaign.campaignHeaders) &&
        Objects.equals(this.questionItems, campaign.questionItems) &&
        Objects.equals(this.campaignFooter, campaign.campaignFooter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, description, startDate, endDate, isPublished, campaignHeaders, questionItems, campaignFooter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    campaignHeaders: ").append(toIndentedString(campaignHeaders)).append("\n");
    sb.append("    questionItems: ").append(toIndentedString(questionItems)).append("\n");
    sb.append("    campaignFooter: ").append(toIndentedString(campaignFooter)).append("\n");
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

