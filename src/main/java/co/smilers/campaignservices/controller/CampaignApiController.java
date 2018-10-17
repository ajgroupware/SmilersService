package co.smilers.campaignservices.controller;

import co.smilers.campaignservices.api.CampaignApi;
import co.smilers.campaignservices.model.*;
import co.smilers.campaignservices.service.CampaignService;
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
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-23T17:21:39.997Z")

@CrossOrigin(origins = "*")
@Controller
public class CampaignApiController implements CampaignApi {

    private static final Logger log = LoggerFactory.getLogger(CampaignApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CampaignService campaignService;

    @org.springframework.beans.factory.annotation.Autowired
    public CampaignApiController(ObjectMapper objectMapper, HttpServletRequest request, CampaignService campaignService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.campaignService = campaignService;
    }

    @Override
    public ResponseEntity<ModelApiResponse> addAnswerBooleanScore(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Objecto de resultado que será agregado", required = true) @Valid @RequestBody List<AnswerBooleanScore> answerBooleanScore) {
        log.info("--answerBooleanScoreSize " + answerBooleanScore.size());
        log.info("--answerBooleanScore " + answerBooleanScore);

        try {
            String response = campaignService.addBooleanAnswer(account, answerBooleanScore);
            return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<ModelApiResponse> addAnswerGeneralScore(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Objecto de resultado que será agregado", required = true) @Valid @RequestBody List<AnswerGeneralScore> answerGeneralScore) {
        log.info("--addAnswerGeneralScore " + answerGeneralScore.size());

        try {
            String response = campaignService.addAnswerGeneral(account, answerGeneralScore);
            return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ModelApiResponse> addAnswerScore(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Objecto de resultado que será agregado", required = true) @Valid @RequestBody List<AnswerScore> answerScore) {
        log.info("--answerScoreSize " + answerScore.size());
        log.info("--answerScore " + answerScore);

        try {
            String response = campaignService.addAnswer(account, answerScore);
            return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    public ResponseEntity<ModelApiResponse> addCampaign(@ApiParam(value = "Objecto Campaña que será agregado" ,required=true )  @Valid @RequestBody Campaign campaign) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml; charset=utf-8")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("<null>  <code>123</code>  <type>aeiou</type>  <message>aeiou</message></null>", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml; charset=utf-8", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/json; charset=utf-8")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json; charset=utf-8", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<ModelApiResponse> addRequestAssistance(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Objecto de solicitud", required = true) @Valid @RequestBody List<RequestAssistance> requestAssistance) {
        log.info("--addRequestAssistanceSize " + requestAssistance.size());
        log.info("--addRequestAssistance " + requestAssistance);

        try {
            String response = campaignService.addRequestAssistance(account, requestAssistance);
            return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Campaign>> listCampaign(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "user", required = true) String user,@ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title,@ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description,@ApiParam(value = "Fecha de inicio de la campaña yyyy-MM-dd HH:mm:ss") @Valid @RequestParam(value = "startDate", required = false) String startDate,@ApiParam(value = "Fecha fin de la campaña yyyy-MM-dd HH:mm:ss") @Valid @RequestParam(value = "endDate", required = false) String endDate,@ApiParam(value = "Campañas publicadas") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished,@ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone) {
        log.info("--listCampaign " + user);
        List<Campaign> list = new ArrayList<>();
        try {
            list = campaignService.listCampaign(user);
            for (Campaign campaign : list) {
                List<QuestionItem> listQuestionItem = campaignService.listQuestionItem(user, campaign.getCode());
                campaign.setQuestionItems(listQuestionItem);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<Campaign>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<CampaignDevice>> listCampaignDevice(String account, @Valid Integer zone, @Valid Integer campaign, @Valid String idPush) {
        return null;
    }

    @Override
    public ResponseEntity<List<CampaignFooter>> listCampaignFooter(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "account", required = true) String account, @ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title, @ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description, @ApiParam(value = "Encabezado publicado") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign) {
        log.info("--listCampaignFooter " + account);
        List<CampaignFooter> list = new ArrayList<>();
        try {
            list = campaignService.listCampaignFooter(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<CampaignFooter>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<QuestionItem>> listFooterQuestion(@NotNull @ApiParam(value = "Usuario asociado a la cuenta", required = true) @Valid @RequestParam(value = "user", required = true) String user, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title, @ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description, @ApiParam(value = "Pregunta publicada") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished) {
        log.info("--listFooterQuestion " + user);

        List<QuestionItem> listQuestionItem = new ArrayList<>();
        try {
            listQuestionItem = campaignService.listFooterQuestion(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<QuestionItem>>(listQuestionItem, HttpStatus.OK);
    }


    public ResponseEntity<List<GeneralHeader>> listGeneralHeader(@NotNull @ApiParam(value = "Usuario asociado a la cuenta de la campaña", required = true) @Valid @RequestParam(value = "user", required = true) String user, @ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title, @ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description, @ApiParam(value = "Encabezado publicado") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished) {
        log.info("--listGeneralHeader " + user);
        List<GeneralHeader> list = new ArrayList<>();
        try {
            list = campaignService.listGeneralHeader(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<GeneralHeader>>(list, HttpStatus.OK);
    }

    public ResponseEntity<List<GeneralQuestionItem>> listGeneralQuestion(@NotNull @ApiParam(value = "Usuario asociado a la cuenta", required = true) @Valid @RequestParam(value = "user", required = true) String user, @ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title, @ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description, @ApiParam(value = "Pregunta publicada") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished) {
        log.info("--listGeneralQuestion " + user);
        List<GeneralQuestionItem> list = new ArrayList<>();
        try {
            list = campaignService.listGeneralQuestion(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<GeneralQuestionItem>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<QuestionItem>> listQuestion(@NotNull @ApiParam(value = "Usuario asociado a la cuenta", required = true) @Valid @RequestParam(value = "user", required = true) String user, @ApiParam(value = "Título") @Valid @RequestParam(value = "title", required = false) String title, @ApiParam(value = "Descripción") @Valid @RequestParam(value = "description", required = false) String description, @ApiParam(value = "Pregunta publicada") @Valid @RequestParam(value = "isPublished", required = false) Boolean isPublished) {
        log.info("--listQuestion " + user);

        List<QuestionItem> listQuestionItem = new ArrayList<>();
        try {
            listQuestionItem = campaignService.listQuestionItem(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<List<QuestionItem>>(listQuestionItem, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<SmsCellPhone>> listSmsCellPhone(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign, @ApiParam(value = "Sede") @Valid @RequestParam(value = "headquaeter", required = false) Integer headquaeter) {
        log.info("--listSmsCellPhone " + account);
        List<SmsCellPhone> list = new ArrayList<>();
        try {
            list = campaignService.listSmsCellPhone(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<SmsCellPhone>>(list, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TargetZone>> listTargetZone(@ApiParam(value = "Cuenta activa y asociada a la sede", required = true) @PathVariable("account") String account, @ApiParam(value = "Zona") @Valid @RequestParam(value = "zone", required = false) Integer zone, @ApiParam(value = "Campaña") @Valid @RequestParam(value = "campaign", required = false) Integer campaign) {
        log.info("--listTargetZone " + account);
        List<TargetZone> list = new ArrayList<>();
        try {
            list = campaignService.listTargetZone(account);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<List<TargetZone>>(list, HttpStatus.OK);
    }

}
