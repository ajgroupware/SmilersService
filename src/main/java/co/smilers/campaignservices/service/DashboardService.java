package co.smilers.campaignservices.service;

import co.smilers.campaignservices.utils.QueryUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DashboardService {

    private static final Logger logger = LoggerFactory.getLogger(DashboardService.class);

    @Autowired
    private Connection postgresDBConnection;

    public Object generalCSATIndicator(String schema, String startDate,  String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--generalCSATIndicator " + schema);
        Map<String, Object> object = new HashMap<>();
        //select
        String query = "select * from main.dashboard_general_csat_indicator(" +
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
                Long totalExcellent   = rs.getLong(1);
                Long totalGood        = rs.getLong(2);
                Long totalModerate    = rs.getLong(3);
                Long totalBad         = rs.getLong(4);
                Long totalPoor        = rs.getLong(5);
                Long total            = rs.getLong(6);
                Double csat           = rs.getDouble(7);

                object.put("total_excellent", totalExcellent);
                object.put("total_good", totalGood);
                object.put("total_moderate", totalModerate);
                object.put("total_bad", totalBad);
                object.put("total_poor", totalPoor);
                object.put("total", total);
                object.put("csat", csat);

            }
        } catch (SQLException e) {
            logger.error("--SQLException: " + e.getMessage());
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
        return object;
    }

    public Object generalExpectedCSATIndicator(String schema, String startDate,  String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--generalExpectedCSATIndicator " + schema);
        Map<String, Object> object = new HashMap<>();
        //select
        String query = "select * from main.dashboard_general_expected_csat_indicator(" +
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
                Double minCsat   = rs.getDouble(1);
                Double csat        = rs.getDouble(2);

                object.put("min_csat", minCsat);
                object.put("csat", csat);

            }
        } catch (SQLException e) {
            logger.error("--SQLException: " + e.getMessage());
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
        return object;
    }

    public Object requestAssistanceIndicator(String schema, String startDate,  String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--generalExpectedCSATIndicator " + schema);
        Map<String, Object> object = new HashMap<>();
        //select
        String query = "select * from main.dashboard_request_assistance_indicator(" +
                "'%s', " +
                "'%s', " +
                "'%s', " +
                "%d, " +
                "%d, " +
                "%d, " +
                "%d " +
                ")";

        ResultSet rs = null;
        Statement st = null;
        try {
            st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema, startDate, endDate, headquarter, zone, campaign, question));
            while(rs.next()) {
                Integer total   = rs.getInt(1);

                object.put("total_assistance", total);

            }
        } catch (SQLException e) {
            logger.error("--SQLException: " + e.getMessage());
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

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return object;
    }

    public List<Object> campaignRanking(String schema, String startDate, String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--campaignRanking " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * from main.dashboard_campaign_ranking(" +
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
                Long campaignCode   = rs.getLong(1);
                String campaignName   = rs.getString(2);
                Long totalExcellent   = rs.getLong(3);
                Long totalGood        = rs.getLong(4);
                Long totalModerate    = rs.getLong(5);
                Long totalBad         = rs.getLong(6);
                Long totalPoor        = rs.getLong(7);
                Long total            = rs.getLong(8);
                Double csat           = rs.getDouble(9);

                object.put("campaign_code", campaignCode);
                object.put("campaign_name", campaignName);
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
            logger.error("--SQLException: " + e.getMessage());
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

    public List<Object> assessmentsDay(String schema, String startDate, String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--assessmentsDay " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * , (case" +
                "      when registration_day=1 then 'L'" +
                "      when registration_day=2 then 'M'"  +
                "      when registration_day=3 then 'M'"  +
                "      when registration_day=4 then 'J'"  +
                "      when registration_day=5 then 'V'"  +
                "      when registration_day=6 then 'S'"  +
                "      when registration_day=7 then 'D'"  +
                "      else  ''"  +
                "    end )::varchar day_w " +
                " from main.dashboard_assessments_day(" +
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

                Double minCsat   = rs.getDouble(1);
                Long registrationDay   = rs.getLong(2);
                Double csat           = rs.getDouble(3);
                String day           = rs.getString(4);

                object.put("min_csat", minCsat);
                object.put("registration_day", registrationDay);
                object.put("day_w", day);
                object.put("csat", csat);
                report.add(object);
            }

        } catch (SQLException e) {
            logger.error("--SQLException: " + e.getMessage());
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

    public List<Object> assessmentsHour(String schema, String startDate, String endDate, Integer headquarter, Integer zone, Integer campaign, Integer question) throws SQLException {
        logger.info("--assessmentsHour " + schema);
        List<Object> report = new ArrayList<>();
        //select
        String query = "select * from main.dashboard_assessments_hour(" +
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

                Double minCsat   = rs.getDouble(1);
                Long registrationHour   = rs.getLong(2);
                Double csat           = rs.getDouble(3);

                object.put("min_csat", minCsat);
                object.put("registration_hour", registrationHour);
                object.put("csat", csat);
                report.add(object);
            }

        } catch (SQLException e) {
            logger.error("--SQLException: " + e.getMessage());
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
