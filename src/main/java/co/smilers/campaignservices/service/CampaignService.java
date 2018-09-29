package co.smilers.campaignservices.service;

import co.smilers.campaignservices.model.*;
import co.smilers.campaignservices.utils.ConstantsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService {

    private static final Logger logger = LoggerFactory.getLogger(CampaignService.class);

    @Autowired
    private Connection postgresDBConnection;



    public List<Campaign> listCampaign(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listCampaign ", schema);
        List<Campaign> campaigns = new ArrayList<>();
        //select
        String query = "SELECT code" +
                ", title" +
                ", description" +
                ", start_date" +
                ", end_date" +
                ", is_published" +
                " FROM %s.campaign";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                Campaign campaign = new Campaign();
                Long code            = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                String startDateStr  = rs.getString(4);
                String endDateStr    = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);

                campaign.setCode(code);
                campaign.setTitle(title);
                campaign.setDescription(description);
                campaign.setStartDate(startDateStr);
                campaign.setEndDate(endDateStr);
                campaign.setIsPublished(isPublished);

                campaigns.add(campaign);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return campaigns;
    }

    public List<GeneralHeader> listGeneralHeader(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listGeneralHeader ", schema);
        List<GeneralHeader> generalHeaders  = new ArrayList<>();
        //select
        String query = "SELECT id" +
                ", title" +
                ", description" +
                ", design_order" +
                ", design_color" +
                ", is_published" +
                " FROM %s.general_header";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                GeneralHeader generalHeader = new GeneralHeader();
                Long id              = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                Integer designOrder  = rs.getInt(4);
                String designColor   = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);

                generalHeader.setId(id);
                generalHeader.setTitle(title);
                generalHeader.setDescription(description);
                generalHeader.setDesignOrder(designOrder);
                generalHeader.setDesignColor(designColor);
                generalHeader.setIsPublished(isPublished);

                generalHeaders.add(generalHeader);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return generalHeaders;
    }

    public List<CampaignFooter> listCampaignFooter(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listCampaignFooter ", schema);
        List<CampaignFooter> campaignFooters  = new ArrayList<>();
        //select
        String query = "SELECT id" +
                ", title" +
                ", description" +
                ", design_order" +
                ", design_color" +
                ", is_published" +
                " FROM %s.campaign_footer";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                CampaignFooter campaignFooter = new CampaignFooter();
                Long id              = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                Integer designOrder  = rs.getInt(4);
                String designColor   = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);

                campaignFooter.setId(id);
                campaignFooter.setTitle(title);
                campaignFooter.setDescription(description);
                campaignFooter.setDesignOrder(designOrder);
                campaignFooter.setDesignColor(designColor);
                campaignFooter.setIsPublished(isPublished);

                campaignFooters.add(campaignFooter);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return campaignFooters;
    }

    public List<GeneralQuestionItem> listGeneralQuestion(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listGeneralQuestion ", schema);
        List<GeneralQuestionItem> generalQuestionItems  = new ArrayList<>();
        //select
        String query = "SELECT code" +
                ", title" +
                ", description" +
                ", design_order" +
                ", design_color" +
                ", is_published" +
                ", min_score" +
                ", receive_comment" +
                ", send_sms_notification" +
                " FROM %s.general_question_item";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                GeneralQuestionItem generalQuestion = new GeneralQuestionItem();
                Long code            = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                Integer designOrder  = rs.getInt(4);
                String designColor   = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);
                Double minScore              = rs.getDouble(7);
                Boolean receiveComment       = rs.getBoolean(8);
                Boolean sendSmsNotification  = rs.getBoolean(9);

                generalQuestion.setCode(code);
                generalQuestion.setTitle(title);
                generalQuestion.setDescription(description);
                generalQuestion.setDesignOrder(designOrder);
                generalQuestion.setDesignColor(designColor);
                generalQuestion.setIsPublished(isPublished);
                generalQuestion.setMinScore(minScore);
                generalQuestion.setReceiveComment(receiveComment);
                generalQuestion.setSendSmsNotification(sendSmsNotification);

                generalQuestionItems.add(generalQuestion);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return generalQuestionItems;
    }

    public List<QuestionItem> listQuestionItem(String schema, Long campaignCode) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listQuestionItem ", schema);
        List<QuestionItem> questionItems  = new ArrayList<>();
        //select
        String queryStr = "SELECT code" +
                ", title" +
                ", description" +
                ", design_order" +
                ", design_color" +
                ", is_published" +
                ", min_score" +
                ", receive_comment" +
                ", send_sms_notification" +
                " FROM %s.question_item WHERE campaign_code = ?";

        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            //Statement st = postgresDBConnection.createStatement();
            String query = String.format(queryStr, schema);
            pstmt = postgresDBConnection.prepareStatement(query);
            pstmt.setLong(1, campaignCode);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                QuestionItem questionItem = new QuestionItem();
                Long code            = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                Integer designOrder  = rs.getInt(4);
                String designColor   = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);
                Double minScore              = rs.getDouble(7);
                Boolean receiveComment       = rs.getBoolean(8);
                Boolean sendSmsNotification  = rs.getBoolean(9);

                questionItem.setCode(code);
                questionItem.setTitle(title);
                questionItem.setDescription(description);
                questionItem.setDesignOrder(designOrder);
                questionItem.setDesignColor(designColor);
                questionItem.setIsPublished(isPublished);
                questionItem.setMinScore(minScore);
                questionItem.setReceiveComment(receiveComment);
                questionItem.setSendSmsNotification(sendSmsNotification);

                questionItems.add(questionItem);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return questionItems;
    }

    public List<QuestionItem> listQuestionItem(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listQuestionItem ", schema);
        List<QuestionItem> questionItems  = new ArrayList<>();
        //select
        String queryStr = "SELECT code" +
                ", title" +
                ", description" +
                ", design_order" +
                ", design_color" +
                ", is_published" +
                ", min_score" +
                ", receive_comment" +
                ", send_sms_notification" +
                " FROM %s.question_item";

        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            //Statement st = postgresDBConnection.createStatement();
            String query = String.format(queryStr, schema);
            pstmt = postgresDBConnection.prepareStatement(query);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                QuestionItem questionItem = new QuestionItem();
                Long code            = rs.getLong(1);
                String title         = rs.getString(2);
                String description   = rs.getString(3);
                Integer designOrder  = rs.getInt(4);
                String designColor   = rs.getString(5);
                Boolean isPublished  = rs.getBoolean(6);
                Double minScore              = rs.getDouble(7);
                Boolean receiveComment       = rs.getBoolean(8);
                Boolean sendSmsNotification  = rs.getBoolean(9);

                questionItem.setCode(code);
                questionItem.setTitle(title);
                questionItem.setDescription(description);
                questionItem.setDesignOrder(designOrder);
                questionItem.setDesignColor(designColor);
                questionItem.setIsPublished(isPublished);
                questionItem.setMinScore(minScore);
                questionItem.setReceiveComment(receiveComment);
                questionItem.setSendSmsNotification(sendSmsNotification);

                questionItems.add(questionItem);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return questionItems;
    }

    public String addAnswer(String schema, List<AnswerScore> answerScores) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--addAnswer ", schema);
        String response = "OK";
        String sql = "INSERT INTO %s.answer_score(" +
                " campaign_code" +
                ", headquarter_code" +
                ", zone_code" +
                ", city_code" +
                ", city_name" +

                ", excellent" +
                ", good" +
                ", moderate" +
                ", bad" +
                ", poor" +

                ", score" +
                ", meter_device_id" +
                ", question_item_code" +
                ", comment " +
                ", user_id" +
                //", registration_date" +
                ") " +
                " VALUES (?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +

                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                //", ?" +
                ");";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {
            // now loop
            for (AnswerScore answerScore : answerScores) {
                pstmt.setLong(1, answerScore.getCampaign().getCode());
                pstmt.setLong(2, answerScore.getHeadquarter().getCode());
                pstmt.setLong(3, answerScore.getZone().getCode());

                if (answerScore.getCityCode() != null) {
                    pstmt.setLong(4, answerScore.getCityCode());
                } else {
                    pstmt.setNull(4, Types.INTEGER);
                }

                if (answerScore.getCityName() != null) {
                    pstmt.setString(5, answerScore.getCityName());
                } else {
                    pstmt.setNull(5, Types.VARCHAR);
                }

                pstmt.setInt(6, answerScore.getExcellent());
                pstmt.setInt(7, answerScore.getGood());
                pstmt.setInt(8, answerScore.getModerate());
                pstmt.setInt(9, answerScore.getBad());
                pstmt.setInt(10, answerScore.getPoor());
                pstmt.setDouble(11, answerScore.getScore());

                if (answerScore.getMeterDevice() != null) {
                    pstmt.setLong(12, answerScore.getMeterDevice().getId());
                } else {
                    pstmt.setNull(12, Types.INTEGER);
                }

                pstmt.setLong(13, answerScore.getQuestionItem().getCode());

                if (answerScore.getComment() != null) {
                    pstmt.setString(14, answerScore.getComment());
                } else {
                    pstmt.setNull(14, Types.VARCHAR);
                }

                if (answerScore.getUserId() != null) {
                    pstmt.setString(15, answerScore.getUserId());
                } else {
                    pstmt.setNull(15, Types.VARCHAR);
                }

                pstmt.executeUpdate();
                logger.info("--Answer recorded");
            }

            postgresDBConnection.commit();

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            postgresDBConnection.rollback();
            throw new SQLException(e.getCause());
        } finally {
            // close the statement when all the INSERT's are finished
            pstmt.close();
        }

        return response;
    }

    public String addRequestAssistance(String schema, List<RequestAssistance> requestAssistances) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--addRequestAssistance ", schema);
        String response = "OK";
        String sql = "INSERT INTO %s.request_assistance(" +
                " campaign_code" +
                ", headquarter_code" +
                ", zone_code" +
                ", city_code" +
                ", meter_device_id" +
                ", question_item_code" +
                //", registration_date" +
                ") " +
                " VALUES (?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                //", ?" +
                ");";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {
            // now loop
            for (RequestAssistance requestAssistance : requestAssistances) {

                if (requestAssistance.getCampaign() != null) {
                    pstmt.setLong(1, requestAssistance.getCampaign().getCode());
                } else {
                    pstmt.setNull(1, Types.INTEGER);
                }

                pstmt.setLong(2, requestAssistance.getHeadquarter().getCode());
                pstmt.setLong(3, requestAssistance.getZone().getCode());

                if (requestAssistance.getCityCode() != null) {
                    pstmt.setLong(4, requestAssistance.getCityCode());
                } else {
                    pstmt.setNull(4, Types.INTEGER);
                }


                if (requestAssistance.getMeterDevice() != null) {
                    pstmt.setLong(5, requestAssistance.getMeterDevice().getId());
                } else {
                    pstmt.setNull(5, Types.INTEGER);
                }

                if (requestAssistance.getQuestionItem() != null) {
                    pstmt.setLong(6, requestAssistance.getQuestionItem().getCode());
                } else {
                    pstmt.setNull(6, Types.INTEGER);
                }

                pstmt.executeUpdate();
                logger.info("--RequestAssistance recorded");
            }

            postgresDBConnection.commit();

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            postgresDBConnection.rollback();
            throw new SQLException(e.getCause());
        } finally {
            // close the statement when all the INSERT's are finished
            pstmt.close();
        }

        return response;
    }

    public String addAnswerGeneral(String schema, List<AnswerGeneralScore> answerScores) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--addAnswerGeneral ", schema);
        String response = "OK";
        String sql = "INSERT INTO %s.answer_general_score(" +
                " headquarter_code" +
                ", zone_code" +
                ", city_code" +
                ", city_name" +

                ", excellent" +
                ", good" +
                ", moderate" +
                ", bad" +
                ", poor" +

                ", score" +
                ", meter_device_id" +
                ", question_item_code" +
                ", comment " +
                ", user_id" +
                //", registration_date" +
                ") " +
                " VALUES (?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +

                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                //", ?" +
                ");";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {
            // now loop
            for (AnswerGeneralScore answerScore : answerScores) {
                pstmt.setLong(1, answerScore.getHeadquarter().getCode());
                pstmt.setLong(2, answerScore.getZone().getCode());

                if (answerScore.getCityCode() != null) {
                    pstmt.setLong(3, answerScore.getCityCode());
                } else {
                    pstmt.setNull(3, Types.INTEGER);
                }

                if (answerScore.getCityName() != null) {
                    pstmt.setString(4, answerScore.getCityName());
                } else {
                    pstmt.setNull(4, Types.VARCHAR);
                }

                pstmt.setInt(5, answerScore.getExcellent());
                pstmt.setInt(6, answerScore.getGood());
                pstmt.setInt(7, answerScore.getModerate());
                pstmt.setInt(8, answerScore.getBad());
                pstmt.setInt(9, answerScore.getPoor());
                pstmt.setDouble(10, answerScore.getScore());

                if (answerScore.getMeterDevice() != null) {
                    pstmt.setLong(11, answerScore.getMeterDevice().getId());
                } else {
                    pstmt.setNull(11, Types.INTEGER);
                }

                pstmt.setLong(12, answerScore.getQuestionItem().getCode());

                if (answerScore.getComment() != null) {
                    pstmt.setString(13, answerScore.getComment());
                } else {
                    pstmt.setNull(13, Types.VARCHAR);
                }

                if (answerScore.getUserId() != null) {
                    pstmt.setString(14, answerScore.getUserId());
                } else {
                    pstmt.setNull(14, Types.VARCHAR);
                }

                pstmt.executeUpdate();
                logger.info("--Answer recorded");
            }

            postgresDBConnection.commit();

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            postgresDBConnection.rollback();
            throw new SQLException(e.getCause());
        } finally {
            // close the statement when all the INSERT's are finished
            pstmt.close();
        }

        return response;
    }

    public List<TargetZone> listTargetZone(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listTargetZone ", schema);
        List<TargetZone> targetZones = new ArrayList<>();
        //select
        String query = "SELECT zone_code" +
                ", campaign_code" +
                " FROM %s.target_zone";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                TargetZone targetZone = new TargetZone();
                Long zoneCode      = rs.getLong(1);
                Long campaignCode  = rs.getLong(2);

                targetZone.setZoneCode(zoneCode);
                targetZone.setCampaignCode(campaignCode);

                targetZones.add(targetZone);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return targetZones;
    }

    public List<SmsCellPhone> listSmsCellPhone(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--listSmsCellPhone ", schema);
        List<SmsCellPhone> smsCellPhones = new ArrayList<>();
        //select
        String query = "SELECT id " +
                ", cell_phone_number" +
                ", headquarter_code" +
                ", zone_code" +
                ", campaign_code" +
                ", is_active" +
                ", email" +
                " FROM %s.sms_cell_phone";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                SmsCellPhone smsCellPhone = new SmsCellPhone();
                Long id                 = rs.getLong(1);
                String cellPhoneNumber  = rs.getString(2);
                Long headquarterCode    = rs.getLong(3);
                Long zoneCode           = rs.getLong(4);
                Long campaignCode       = rs.getLong(5);
                Boolean isActive        = rs.getBoolean(6);
                String email            = rs.getString(7);

                smsCellPhone.setId(id);
                smsCellPhone.setCellPhoneNumber(cellPhoneNumber);
                smsCellPhone.setHeadquarterCode(headquarterCode);
                smsCellPhone.setZoneCode(zoneCode);
                smsCellPhone.setCampaignCode(campaignCode);
                smsCellPhone.setIsActive(isActive);
                smsCellPhone.setEmail(email);

                smsCellPhones.add(smsCellPhone);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.SQL_EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error(ConstantsUtil.PRINT_2_P, ConstantsUtil.EXCEPTION_TAG, e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return smsCellPhones;
    }
}
