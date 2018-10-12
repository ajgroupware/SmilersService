package co.smilers.campaignservices.service;

import co.smilers.campaignservices.model.City;
import co.smilers.campaignservices.model.GeneralSettingParameter;
import co.smilers.campaignservices.model.Headquarter;
import co.smilers.campaignservices.model.Zone;
import co.smilers.campaignservices.utils.ConstantsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
public class ParameterService {

    private static final Logger logger = LoggerFactory.getLogger(ParameterService.class);

    @Autowired
    private Connection postgresDBConnection;

    public ParameterService() {
    }
    /*
    public String addButton(AlertButton alertButton) {
        logger.info("--addButton ");
        String response = "OK";
        String sql = "INSERT INTO Button (" +
                "                       phone," +
                "                       name," +
                "                       address," +
                "                       contactName," +
                "                       contactPhone," +
                "                       latitud," +
                "                       longitude," +
                "                       status" +
                "                   ) " +
                "                   VALUES (" +
                "                       ?," +
                "                       ?," +
                "                       ?," +
                "                       ?," +
                "                       ?," +
                "                       ?," +
                "                       ?," +
                "                       ?" +
                "                   );";

        try (
             PreparedStatement pstmt = sqliteDBConnection.prepareStatement(sql)) {

            pstmt.setString(1, alertButton.getPhone());
            pstmt.setString(2, alertButton.getName());
            pstmt.setString(3, alertButton.getAddress());
            pstmt.setString(4, alertButton.getContactName());
            pstmt.setString(5, alertButton.getContactPhone());
            pstmt.setDouble(6, alertButton.getLat());
            pstmt.setDouble(7, alertButton.getLng());
            pstmt.setString(8, alertButton.getStatus().name());

            pstmt.executeUpdate();
            logger.info("--AlertButton recorded");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            response = e.getMessage();
        }
        return response;
    }

    public String updateButton(AlertButton alertButton) {
        logger.info("--updateButton ");
        String response = "OK";
        String sql = "UPDATE Button SET " +
                "            phone        = ?," +
                "            name         = ?," +
                "            address      = ?," +
                "            contactName  = ?," +
                "            contactPhone = ?," +
                "            latitud      = ?," +
                "            longitude    = ?," +
                "            status       = ?" +
                "     WHERE id = ?;";

        try (PreparedStatement pstmt = sqliteDBConnection.prepareStatement(sql)) {

            pstmt.setString(1, alertButton.getPhone());
            pstmt.setString(2, alertButton.getName());
            pstmt.setString(3, alertButton.getAddress());
            pstmt.setString(4, alertButton.getContactName());
            pstmt.setString(5, alertButton.getContactPhone());
            pstmt.setDouble(6, alertButton.getLat());
            pstmt.setDouble(7, alertButton.getLng());
            pstmt.setString(8, alertButton.getStatus().name());
            pstmt.setInt(9, alertButton.getId().intValue());

            pstmt.executeUpdate();
            logger.info("--AlertButton updated");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            response = e.getMessage();
        }
        return response;
    }
    */


    public List<Headquarter> listHeadquarter(String schema) throws SQLException{
        logger.info("--listHeadquarter " + schema);
        List<Headquarter> headquarters = new ArrayList<>();
        //select
        String query = "SELECT code" +
                ", name" +
                ", city_code " +
                "FROM %s.headquarter";

        /*
        if (phoneFilter != null && phoneFilter.length() > 0) {
            query += " AND phone like '%" + phoneFilter + "%'";
        }

        if (nameFilter != null && nameFilter.length() > 0) {
            query += " AND name like '%" + nameFilter + "%'";
        }

        if (contactNameFilter != null && contactNameFilter.length() > 0) {
            query += " AND contactName like '%" + contactNameFilter + "%'";
        }
        */
        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                Headquarter headquarter = new Headquarter();
                Long code        = rs.getLong(1);
                String name      = rs.getString(2);
                Long cityCode    = rs.getLong(3);

                headquarter.setCode(code);
                headquarter.setName(name);
                City city = new City();
                city.setCode(cityCode);
                headquarter.setCity(city);

                headquarters.add(headquarter);
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
        return headquarters;
    }

    public List<City> listCity() throws SQLException{
        logger.info("--listCity " );
        List<City> list = new ArrayList<>();
        //select
        String query = "SELECT id" +
                ", name" +

                " FROM main.city";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                City city = new City();
                Long code        = rs.getLong(1);
                String name      = rs.getString(2);

                city.setCode(code);
                city.setName(name);

                list.add(city);
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
        return list;
    }

    public List<GeneralSettingParameter> listGeneralSettingParameter(String schema) throws SQLException{
        logger.info("--listGeneralSettingParameter " + schema);
        List<GeneralSettingParameter> generalSettingParameters = new ArrayList<>();
        //select
        String query = "SELECT parameter_key" +
                ", parameter_value" +
                " FROM %s.general_setting_parameter";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                GeneralSettingParameter generalSettingParameter = new GeneralSettingParameter();

                String parameterKey    = rs.getString(1);
                String parameterValue  = rs.getString(2);

                generalSettingParameter.setParameterKey(parameterKey);
                generalSettingParameter.setParameterValue(parameterValue);


                generalSettingParameters.add(generalSettingParameter);
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
        return generalSettingParameters;
    }

    public List<Zone> listZone(String schema) throws SQLException{
        logger.info("--listZone " + schema);
        List<Zone> zones = new ArrayList<>();
        //select
        String query = "SELECT code" +
                " , name" +
                " , headquarter_code " +
                "FROM %s.zone";

        ResultSet rs = null;
        try {
            Statement st = postgresDBConnection.createStatement();
            rs = st.executeQuery(String.format(query, schema));
            while(rs.next()) {
                Zone zone = new Zone();
                Long code             = rs.getLong(1);
                String name           = rs.getString(2);
                Long headquarterCode  = rs.getLong(3);

                zone.setCode(code);
                zone.setName(name);
                Headquarter headquarter = new Headquarter();
                headquarter.setCode(headquarterCode);
                zone.setHeadquarter(headquarter);

                zones.add(zone);
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
        return zones;
    }

    /*
    public AlertButton getButtonByPhone(String pPhone) {
        logger.info("--getButtonByPhone ");
        AlertButton alertButton = new AlertButton();
        //select
        String query = "SELECT id," +
                "       phone," +
                "       name," +
                "       address," +
                "       contactName," +
                "       contactPhone," +
                "       latitud," +
                "       longitude," +
                "       status" +
                "  FROM Button where phone = '" + pPhone.trim() + "';";
        ResultSet rs = null;
        try {
            Statement st = sqliteDBConnection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                Long id             = rs.getLong(1);
                String phone        = rs.getString(2);
                String name         = rs.getString(3);
                String address      = rs.getString(4);
                String contactName  = rs.getString(5);
                String contactPhone = rs.getString(6);
                Double latitud      = rs.getDouble(7);
                Double longitude    = rs.getDouble(8);
                String status       = rs.getString(9);

                alertButton.setId(id);
                alertButton.setName(name);
                alertButton.setAddress(address);
                alertButton.setContactName(contactName);
                alertButton.setContactPhone(contactPhone);
                alertButton.setLat(latitud);
                alertButton.setLng(longitude);
                alertButton.setStatus(AlertButton.StatusEnum.fromValue(status));
                alertButton.setPhone(phone);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return alertButton;
    }
    */

    public void saveImage(String schema, byte[] imageStream) {
        logger.info("--saveImage " + schema);

        try {
            String sql1 = "SELECT count(id) as number FROM %s.general_image";
            PreparedStatement psExists = postgresDBConnection.prepareStatement(String.format(sql1, schema));
            //psExists.setString(1, schema);

            ResultSet rs = psExists.executeQuery();
            boolean exists = false;
            if (rs != null) {
                while(rs.next()) {
                    int number = rs.getInt(1);
                    exists = number > 0 ? true : false;
                    // use the stream in some way here
                }
                rs.close();
            }
            psExists.close();

            if (exists) {
                String sql2 = "UPDATE %s.general_image SET image = ?";
                PreparedStatement ps = postgresDBConnection.prepareStatement(String.format(sql2, schema));
                ps.setBytes(1, imageStream);

                ps.executeUpdate();
                ps.close();

            } else {
                String sql2 = "INSERT INTO %s.general_image (image) VALUES (?)";
                PreparedStatement ps = postgresDBConnection.prepareStatement(String.format(sql2, schema));
                ps.setBytes(1, imageStream);

                ps.executeUpdate();
                ps.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public byte[] getImage(String schema) {
        logger.info("--getImage " + schema);
        byte[] imageData = null;
        try {
            String sql = "SELECT image FROM %s.general_image";
            PreparedStatement ps = postgresDBConnection.prepareStatement(String.format(sql, schema));
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while(rs.next()) {
                    imageData = rs.getBytes(1);
                    logger.info("--imageData " + imageData.length);
                }
                rs.close();
            }
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return imageData;
    }
}
