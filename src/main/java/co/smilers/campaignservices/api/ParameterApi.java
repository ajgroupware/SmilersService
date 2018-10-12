/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package co.smilers.campaignservices.api;

import co.smilers.campaignservices.model.*;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T21:28:42.257Z")

@Api(value = "parameter", description = "the parameter API")
public interface ParameterApi {

    @ApiOperation(value = "Nueva sede", nickname = "addHeadquarter", notes = "Agregar nueva sede asociada a una cuenta", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/parameter/headquarter",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addHeadquarter(@ApiParam(value = "Objecto Sede que será agregado", required = true) @Valid @RequestBody Headquarter headquarter);


    @ApiOperation(value = "Nueva zona", nickname = "addZone", notes = "Agregar nueva zona asociada a una cuenta", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/parameter/zone",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addZone(@ApiParam(value = "Objecto zona que será agregado", required = true) @Valid @RequestBody Zone zone);


    @ApiOperation(value = "Lista las sedes de una cuenta", nickname = "headquarterByAccount", notes = "Lista las asociado a una cuenta", response = Headquarter.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Headquarter.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/headquarter/{account}",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<Headquarter> headquarterByAccount(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account);


    @ApiOperation(value = "Lista las ciudades", nickname = "listCity", notes = "Lista las ciudades", response = City.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = City.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/city",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<City>> listCity();


    @ApiOperation(value = "Lista los parámetros generales", nickname = "listGeneralSettingParameter", notes = "Lista los parámetros generales configurados en una cuenta", response = GeneralSettingParameter.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeneralSettingParameter.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/generalSettingParameter/{account}",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<GeneralSettingParameter>> listGeneralSettingParameter(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account);


    @ApiOperation(value = "Lista las sedes de una cuenta", nickname = "listHeadquarter", notes = "Lista las sedes de una cuenta - filtra por diferentes parámetros", response = Headquarter.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Headquarter.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/headquarter",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Headquarter>> listHeadquarter(@ApiParam(value = "Cuenta asociada") @Valid @RequestParam(value = "account", required = false) String account, @ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Teléfono") @Valid @RequestParam(value = "city", required = false) Integer city);


    @ApiOperation(value = "Lista las zonas de una cuenta", nickname = "listZone", notes = "Lista las zona de una cuenta - filtra por diferentes parámetros", response = Zone.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Zone.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/zone",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Zone>> listZone(@ApiParam(value = "Cuenta asociada") @Valid @RequestParam(value = "account", required = false) String account, @ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter);


    @ApiOperation(value = "Imagen/ Logo de la cuenta", nickname = "logo", notes = "Muestra la imagen o logo del usuario", tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/logo/{account}",
        produces = { "image/png" }, 
        method = RequestMethod.GET)
    ResponseEntity<byte[]> logo(@ApiParam(value = "Cuenta de usuario", required = true) @PathVariable("account") String account);


    @ApiOperation(value = "Actualiza sede", nickname = "updateHeadquarter", notes = "Actualiza uns sede", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Experiencia not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/parameter/headquarter",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> updateHeadquarter(@ApiParam(value = "Objecto sede que será actualizado", required = true) @Valid @RequestBody Headquarter headquarter);


    @ApiOperation(value = "Actualiza zona", nickname = "updateZone", notes = "Actualiza una zona", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Experiencia not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/parameter/zone",
        produces = { "application/xml; charset=utf-8", "application/json; charset=utf-8" }, 
        consumes = { "application/json; charset=utf-8", "application/xml; charset=utf-8" },
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> updateZone(@ApiParam(value = "Objecto sede que será actualizado", required = true) @Valid @RequestBody Zone zone);


    @ApiOperation(value = "Permite subir el logo", nickname = "uploadLogo", notes = "Permite subir una imagen asociado a un usuario.", response = ModelApiResponse.class, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "successful operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Bad request"),
        @ApiResponse(code = 500, message = "Server error") })
    @RequestMapping(value = "/parameter/uploadLogo",
        produces = { "application/json; charset=utf-8" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> uploadLogo(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile logo, @ApiParam(value = "Usuario asociado a la imagen") @RequestParam(value = "account", required = false) String account);


    @ApiOperation(value = "Lista las sedes de una cuenta", nickname = "zoneByAccount", notes = "Lista las asociado a una cuenta", response = Zone.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "read:buttons", description = "read your experience"),
            @AuthorizationScope(scope = "write:buttons", description = "modify experience in your account")
            })
    }, tags={ "parameter", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Zone.class),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 401, message = "Unauthorized user") })
    @RequestMapping(value = "/parameter/zone/{account}",
        produces = { "application/json; charset=utf-8", "application/xml; charset=utf-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<Zone> zoneByAccount(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account);

}
