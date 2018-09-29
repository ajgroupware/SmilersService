package co.smilers.campaignservices.controller;

import co.smilers.campaignservices.api.AccountApi;
import co.smilers.campaignservices.model.*;
import co.smilers.campaignservices.service.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-24T16:35:40.729Z")

@CrossOrigin(origins = "*")
@Controller
public class AccountApiController implements AccountApi {

    private static final Logger log = LoggerFactory.getLogger(AccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final AccountService accountService;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountApiController(ObjectMapper objectMapper, HttpServletRequest request, AccountService accountService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.accountService = accountService;
    }

    public ResponseEntity<User> login(@ApiParam(value = "Objecto Login usuario y contraseña" ,required=true )  @Valid @RequestBody Login login) {
        log.info("--login ");
        User user = new User();
        try {
            user = accountService.login(login.getUserName(), login.getPassword());
            log.info("--user " + user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user==null || user.getUserName() == null) {
            return new ResponseEntity<User>(user, HttpStatus.UNAUTHORIZED);
        } else {
            try {
                //Buscar los usuarios activos actuales
                int activedUsers = accountService.activeUser(user.getAccount().getCode());
                log.info("--activedUsers " + activedUsers);
                log.info("--max  activedUsers " + user.getAccount().getActivedUsers());
                if (activedUsers >= user.getAccount().getActivedUsers().intValue() ) {
                    return new ResponseEntity<User>(new User(), HttpStatus.UNAUTHORIZED);
                } else {
                    //Registrar usuario activo
                    try {
                        accountService.addActiveUser(user.getAccount().getCode(), login);
                    } catch (SQLException e) {
                        log.info("--Error " + e.getMessage());
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
                return new ResponseEntity<User>(new User(), HttpStatus.UNAUTHORIZED);
            }
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }

    }

    @Override
    public ResponseEntity<ModelApiResponse> logout(@ApiParam(value = "Objecto Logout usuario y idPush", required = true) @Valid @RequestBody Logout logout) {
        log.info("--logout ");

        try {
            User user = accountService.getUser(logout.getUserName());
            log.info("--user " + user);
            accountService.removeActiveUser(user.getAccount().getCode(), logout);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ModelApiResponse> registerMeterDevice(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Objecto Dispositivo", required = true) @Valid @RequestBody MeterDevice meterDevice) {
        log.info("--registerMeterDevice " + account);

        try {
            accountService.addMeterDevice(account, meterDevice);
            log.info("--addMeterDevice ");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

}
