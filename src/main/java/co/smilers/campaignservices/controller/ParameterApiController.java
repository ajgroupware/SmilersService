package co.smilers.campaignservices.controller;

import co.smilers.campaignservices.api.ParameterApi;
import co.smilers.campaignservices.model.GeneralSettingParameter;
import co.smilers.campaignservices.model.Headquarter;
import co.smilers.campaignservices.model.ModelApiResponse;
import co.smilers.campaignservices.model.Zone;
import co.smilers.campaignservices.service.ParameterService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T12:54:40.619Z")

@CrossOrigin(origins = "*")
@Controller
public class ParameterApiController implements ParameterApi {

    private static final Logger log = LoggerFactory.getLogger(ParameterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private final ParameterService parameterService;

    @org.springframework.beans.factory.annotation.Autowired
    public ParameterApiController(ObjectMapper objectMapper, HttpServletRequest request, ParameterService parameterService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.parameterService = parameterService;
    }

    public ResponseEntity<ModelApiResponse> addHeadquarter(@ApiParam(value = "Objecto Sede que será agregado" ,required=true )  @Valid @RequestBody Headquarter headquarter) {


        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> addZone(@ApiParam(value = "Objecto zona que será agregado" ,required=true )  @Valid @RequestBody Zone zone) {


        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Headquarter> headquarterByAccount(@ApiParam(value = "Cuenta activa y asociada a la sede",required=true) @PathVariable("account") String account) {


        return new ResponseEntity<Headquarter>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<GeneralSettingParameter>> listGeneralSettingParameter(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account) {
        log.info("--listGeneralSettingParameter " + account);

        List<GeneralSettingParameter> list = new ArrayList<>();
        try {
            list = parameterService.listGeneralSettingParameter(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<GeneralSettingParameter>>(list, HttpStatus.OK);
    }

    public ResponseEntity<List<Headquarter>> listHeadquarter(@ApiParam(value = "Cuenta asociada") @Valid @RequestParam(value = "account", required = false) String account,@ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Teléfono") @Valid @RequestParam(value = "city", required = false) Integer city) {

        log.info("--listHeadquarter " + account);
        List<Headquarter> list = new ArrayList<>();
        try {
            list = parameterService.listHeadquarter(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Headquarter>>(list, HttpStatus.OK);
    }

    public ResponseEntity<List<Zone>> listZone(@ApiParam(value = "Cuenta asociada") @Valid @RequestParam(value = "account", required = false) String account, @ApiParam(value = "Nombre") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter) {


        log.info("--listZone " + account);
        List<Zone> list = new ArrayList<>();
        try {
            list = parameterService.listZone(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Zone>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<byte[]> logo(@ApiParam(value = "Cuenta de usuario", required = true) @PathVariable("account") String account) {
        log.info("--logo " + account);
        byte[] imageData = parameterService.getImage(account);
        HttpHeaders headers = new HttpHeaders();
        headers.setCacheControl(CacheControl.noCache().getHeaderValue());
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(imageData, headers, HttpStatus.OK);
        return responseEntity;
    }

    public ResponseEntity<ModelApiResponse> updateHeadquarter(@ApiParam(value = "Objecto sede que será actualizado" ,required=true )  @Valid @RequestBody Headquarter headquarter) {


        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> updateZone(@ApiParam(value = "Objecto sede que será actualizado" ,required=true )  @Valid @RequestBody Zone zone) {


        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadLogo(@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile logo, @ApiParam(value = "Usuario asociado a la imagen") @RequestParam(value = "account", required = false) String account) {
        System.out.println("--start uploadLogo ");
        try {
            parameterService.saveImage(account, logo.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Zone> zoneByAccount(@ApiParam(value = "Cuenta activa y asociada a la sede",required=true) @PathVariable("account") String account) {


        return new ResponseEntity<Zone>(HttpStatus.NOT_IMPLEMENTED);
    }

}
