package co.smilers.campaignservices.controller;

import co.smilers.campaignservices.api.DashboardApi;
import co.smilers.campaignservices.service.DashboardService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-30T00:29:46.002Z")

@CrossOrigin(origins = "*")
@Controller
public class DashboardApiController implements DashboardApi {

    private static final Logger log = LoggerFactory.getLogger(DashboardApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final DashboardService dashboardService;

    @org.springframework.beans.factory.annotation.Autowired
    public DashboardApiController(ObjectMapper objectMapper, HttpServletRequest request, DashboardService dashboardService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.dashboardService = dashboardService;
    }

    @Override
    public ResponseEntity<List<Object>> assessmentsDay(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--assessmentsDay " + account);
        List<Object> list = new ArrayList<>();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            list = dashboardService.assessmentsDay(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Object>> assessmentsHour(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--assessmentsHour " + account);
        List<Object> list = new ArrayList<>();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            list = dashboardService.assessmentsHour(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Object>> campaignRanking(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--campaignRanking " + account);
        List<Object> list = new ArrayList<>();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            list = dashboardService.campaignRanking(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    public ResponseEntity<Object> generalCSATIndicator(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--generalCSATIndicator " + account);
        Object object = new Object();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            object = dashboardService.generalCSATIndicator(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>(object, HttpStatus.OK);
    }

    public ResponseEntity<Object> generalExpectedCSATIndicator(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account,@ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate,@ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate,@ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter,@ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone,@ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign,@ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--generalExpectedCSATIndicator " + account);
        Object object = new Object();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            object = dashboardService.generalExpectedCSATIndicator(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>(object, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> generalRequestAssistanceIndicator(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--generalRequestAssistanceIndicator " + account);
        Object object = new Object();
        try {
            String startDateStr = "";
            String endDateStr = "";
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            if (startDate != null && startDate.length() > 0 && !"0".equals(startDate)) {
                Date date = new Date(Long.valueOf(startDate));
                startDateStr = dateFormat.format(date);
            }

            if (endDate != null && endDate.length() > 0 && !"0".equals(endDate)) {
                Date date = new Date(Long.valueOf(endDate));
                endDateStr = dateFormat.format(date);
            }

            log.error("--startDateStr: " + startDateStr);
            log.error("--endDateStr: " + endDateStr);

            object = dashboardService.requestAssistanceIndicator(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<Object>(object, HttpStatus.OK);
    }

}
