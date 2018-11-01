package co.smilers.campaignservices.controller;

import co.smilers.campaignservices.api.ReportsApi;
import co.smilers.campaignservices.service.ReportsService;
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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-29T12:03:08.353Z")

@CrossOrigin(origins = "*")
@Controller
public class ReportsApiController implements ReportsApi {

    private static final Logger log = LoggerFactory.getLogger(ReportsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final ReportsService reportsService;

    @org.springframework.beans.factory.annotation.Autowired
    public ReportsApiController(ObjectMapper objectMapper, HttpServletRequest request, ReportsService reportsService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.reportsService = reportsService;
    }

    @Override
    public ResponseEntity<List<Object>> reportCampaign(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign) {
        log.info("--reportCampaign " + account);
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

            list = reportsService.reportCampaign(account, startDateStr, endDateStr, headquarter, zone, campaign);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    public ResponseEntity<List<Object>> reportDetailAnswers(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--reportDetailAnswers " + account);
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

            list = reportsService.reportDetailAnswers(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Object>> reportDetailBooleanAnswers(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Pregunta") @Valid @RequestParam(value = "question", required = false) Integer question) {
        log.info("--reportDetailBooleanAnswers " + account);
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

            list = reportsService.reportDetailBooleanAnswers(account, startDateStr, endDateStr, headquarter, zone, campaign, question);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Object>> reportHeadquarter(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Fecha de inicio (milisegundos)") @Valid @RequestParam(value = "startDate", required = false) String startDate, @ApiParam(value = "Fecha de finalización (ilisegundos)") @Valid @RequestParam(value = "endDate", required = false) String endDate, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquarter", required = false) Integer headquarter) {
        log.info("--reportHeadquarter " + account);
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

            list = reportsService.reportHeadquarter(account, startDateStr, endDateStr, headquarter);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<Object>>(list, HttpStatus.OK);
    }

}
