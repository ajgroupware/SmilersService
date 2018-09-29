package co.smilers.campaignservices.service;

import co.smilers.campaignservices.model.Campaign;
import co.smilers.campaignservices.utils.ConstantsUtil;
import co.smilers.campaignservices.utils.QueryUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportsService {

    private static final Logger logger = LoggerFactory.getLogger(ReportsService.class);

    @Autowired
    private Connection postgresDBConnection;


    public List<Object> reportDetailAnswers(String schema, String startDate,  String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--reportDetailAnswers " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * , (case" +
                "    when score=1 then 'Deficiente'" +
                "    when score=2 then 'Malo'" +
                "    when score=3 then 'Regular'" +
                "    when score=4 then 'Bueno'" +
                "    when score=5 then 'Excelente'" +
                "    else  ''" +
                "  end )::varchar eval " +
                " from main.report_detail_answers(" +
                "'%s', " +
                "'%s', " +
                "'%s', " +
                "%d, " +
                "%d, " +
                "%d, " +
                "%d " +
                ")";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();

            rs = st.executeQuery(String.format(query, schema, startDate, endDate, headquarter, zone, campaign, question));
            while(rs.next()) {
                Map<String, Object> object = new HashMap<>();

                Long id = rs.getLong(1);
                String indicador = rs.getString(2);
                Long city_code   = rs.getLong(3);
                String city_name = rs.getString(4);
                Long headquarter_code   = rs.getLong(5);
                String headquarter_name = rs.getString(6);

                Long zone_code   = rs.getLong(7);
                String zone_name = rs.getString(8);

                Long campaign_code   = rs.getLong(9);
                String campaign_name = rs.getString(10);


                Long meter_device_id   = rs.getLong(11);
                String meter_device_name = rs.getString(12);

                Long question_item_code   = rs.getLong(13);
                String question_item_name = rs.getString(14);

                String registration_date = rs.getString(15);
                String registration_time = rs.getString(16);

                Integer excellent = rs.getInt(17);
                Integer good = rs.getInt(18);
                Integer moderate = rs.getInt(19);
                Integer bad = rs.getInt(20);
                Integer poor = rs.getInt(21);

                Integer score = rs.getInt(22);

                String comment = rs.getString(23);
                String user_id = rs.getString(24);
                String eval = rs.getString(25);

                object.put("id", id);
                object.put("indicador", indicador);
                object.put("city_code", city_code);
                object.put("city_name", city_name);
                object.put("headquarter_code", headquarter_code);
                object.put("headquarter_name", headquarter_name);
                object.put("zone_code", zone_code);
                object.put("zone_name", zone_name);
                object.put("campaign_code", campaign_code);
                object.put("campaign_name", campaign_name);
                object.put("meter_device_id", meter_device_id);
                object.put("meter_device_name", meter_device_name);
                object.put("question_item_code", question_item_code);
                object.put("question_item_name", question_item_name);
                object.put("registration_date", registration_date);
                object.put("registration_time", registration_time);

                object.put("excellent", excellent);
                object.put("good", good);
                object.put("moderate", moderate);
                object.put("bad", bad);

                object.put("poor", poor);
                object.put("score", score);
                object.put("comment", comment);
                object.put("user_id", user_id);
                object.put("eval", eval);

                report.add(object);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.SQL_EXCEPTION_TAG + e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error("--Exception: " + e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return report;
    }

    public List<Object> reportCampaign(String schema, String startDate,  String endDate, Integer headquarter, Integer zone, Integer campaign) throws SQLException {
        logger.info("--reportCampaign " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * from main.report_campaign(" +
                "'%s', " +
                "'%s', " +
                "'%s', " +
                "%d, " +
                "%d, " +
                "%d, " +
                "0 " +
                ")";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();

            rs = st.executeQuery(String.format(query, schema, startDate, endDate, headquarter, zone, campaign));
            while(rs.next()) {
                Map<String, Object> object = new HashMap<>();

                Long campaign_code   = rs.getLong(1);
                String campaign_name   = rs.getString(2);
                Long question_item_code   = rs.getLong(3);
                String question_item_name   = rs.getString(4);
                Long totalExcellent   = rs.getLong(5);
                Long totalGood        = rs.getLong(6);
                Long totalModerate    = rs.getLong(7);
                Long totalBad         = rs.getLong(8);
                Long totalPoor        = rs.getLong(9);
                Long total            = rs.getLong(10);
                Double csat           = rs.getDouble(11);

                object.put("campaign_code", campaign_code);
                object.put("campaign_name", campaign_name);
                object.put("question_item_code", question_item_code);
                object.put("question_item_name", question_item_name);
                object.put("total_excellent", totalExcellent);
                object.put("total_good", totalGood);
                object.put("total_moderate", totalModerate);
                object.put("total_bad", totalBad);
                object.put("total_poor", totalPoor);
                object.put("total", total);
                object.put("csat", csat);
                report.add(object);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.SQL_EXCEPTION_TAG + e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error("--Exception: " + e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return report;
    }

    public List<Object> reportHeadquarter(String schema, String startDate,  String endDate, Integer headquarter) throws SQLException {
        logger.info("--reportHeadquarter " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * from main.report_headquarter(" +
                "'%s', " +
                "'%s', " +
                "'%s', " +
                "%d, " +
                "0, " +
                "0, " +
                "0 " +
                ")";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();

            rs = st.executeQuery(String.format(query, schema, startDate, endDate, headquarter));
            while(rs.next()) {
                Map<String, Object> object = new HashMap<>();

                Long headquarter_code   = rs.getLong(1);
                String headquarter_name   = rs.getString(2);
                Long totalExcellent   = rs.getLong(3);
                Long totalGood        = rs.getLong(4);
                Long totalModerate    = rs.getLong(5);
                Long totalBad         = rs.getLong(6);
                Long totalPoor        = rs.getLong(7);
                Long total            = rs.getLong(8);
                Double csat           = rs.getDouble(9);


                object.put("headquarter_code", headquarter_code);
                object.put("headquarter_name", headquarter_name);
                object.put("total_excellent", totalExcellent);
                object.put("total_good", totalGood);
                object.put("total_moderate", totalModerate);
                object.put("total_bad", totalBad);
                object.put("total_poor", totalPoor);
                object.put("total", total);
                object.put("csat", csat);
                report.add(object);
            }

        } catch (SQLException e) {
            logger.error(ConstantsUtil.SQL_EXCEPTION_TAG + e.getMessage());
            throw new SQLException(e.getCause());
        } catch (Exception e) {
            logger.error("--Exception: " + e.getMessage());
            throw new SQLException(e.getCause());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return report;
    }

}
