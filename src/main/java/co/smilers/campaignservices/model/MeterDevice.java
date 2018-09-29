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
 * Dispositivo medidor de campañas
 */
@ApiModel(description = "Dispositivo medidor de campañas")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-06T03:01:00.518Z")

public class MeterDevice   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("deviceSerial")
  private String deviceSerial = null;

  @JsonProperty("deviceVersionOs")
  private String deviceVersionOs = null;

  @JsonProperty("deviceIdPush")
  private String deviceIdPush = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("currentUser")
  private String currentUser = null;

  public MeterDevice id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único del medidor
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único del medidor")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MeterDevice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre del medidor
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nombre del medidor")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MeterDevice deviceSerial(String deviceSerial) {
    this.deviceSerial = deviceSerial;
    return this;
  }

  /**
   * Serial del dispositivo
   * @return deviceSerial
  **/
  @ApiModelProperty(value = "Serial del dispositivo")


  public String getDeviceSerial() {
    return deviceSerial;
  }

  public void setDeviceSerial(String deviceSerial) {
    this.deviceSerial = deviceSerial;
  }

  public MeterDevice deviceVersionOs(String deviceVersionOs) {
    this.deviceVersionOs = deviceVersionOs;
    return this;
  }

  /**
   * Versión del sistema operativo
   * @return deviceVersionOs
  **/
  @ApiModelProperty(value = "Versión del sistema operativo")


  public String getDeviceVersionOs() {
    return deviceVersionOs;
  }

  public void setDeviceVersionOs(String deviceVersionOs) {
    this.deviceVersionOs = deviceVersionOs;
  }

  public MeterDevice deviceIdPush(String deviceIdPush) {
    this.deviceIdPush = deviceIdPush;
    return this;
  }

  /**
   * Id push del dispositivo
   * @return deviceIdPush
  **/
  @ApiModelProperty(value = "Id push del dispositivo")


  public String getDeviceIdPush() {
    return deviceIdPush;
  }

  public void setDeviceIdPush(String deviceIdPush) {
    this.deviceIdPush = deviceIdPush;
  }

  public MeterDevice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción para identificar mejor el dispositivo
   * @return description
  **/
  @ApiModelProperty(value = "Descripción para identificar mejor el dispositivo")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MeterDevice currentUser(String currentUser) {
    this.currentUser = currentUser;
    return this;
  }

  /**
   * Usuario actual
   * @return currentUser
  **/
  @ApiModelProperty(value = "Usuario actual")


  public String getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(String currentUser) {
    this.currentUser = currentUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeterDevice meterDevice = (MeterDevice) o;
    return Objects.equals(this.id, meterDevice.id) &&
        Objects.equals(this.name, meterDevice.name) &&
        Objects.equals(this.deviceSerial, meterDevice.deviceSerial) &&
        Objects.equals(this.deviceVersionOs, meterDevice.deviceVersionOs) &&
        Objects.equals(this.deviceIdPush, meterDevice.deviceIdPush) &&
        Objects.equals(this.description, meterDevice.description) &&
        Objects.equals(this.currentUser, meterDevice.currentUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deviceSerial, deviceVersionOs, deviceIdPush, description, currentUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeterDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deviceSerial: ").append(toIndentedString(deviceSerial)).append("\n");
    sb.append("    deviceVersionOs: ").append(toIndentedString(deviceVersionOs)).append("\n");
    sb.append("    deviceIdPush: ").append(toIndentedString(deviceIdPush)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentUser: ").append(toIndentedString(currentUser)).append("\n");
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

