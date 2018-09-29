package co.smilers.campaignservices.service;

import co.smilers.campaignservices.model.*;
import co.smilers.campaignservices.utils.ConstantsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;


@Service
public class AccountService {

    private static final Logger logger = LoggerFactory.getLogger(ParameterService.class);

    @Autowired
    private Connection postgresDBConnection;

    public User login(String userName, String password) throws SQLException {
        logger.info("--login ");
        User user = new User();
        //select
        String query = "SELECT u.user_name" +
                " , u.password" +
                " , u.name" +
                " , ac.id" +
                " , ac.code" +
                " , ac.name" +
                " , ac.actived_users" +
                " FROM main.\"user\" u " +
                " inner join main.account ac " +
                " on u.account_id = ac.id" +
                " where u.user_name = ? and u.password = ?";

        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = postgresDBConnection.prepareStatement(query);
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String userNameDb   = rs.getString(1);
                String passwordDb   = rs.getString(2);
                String name         = rs.getString(3);
                Long idAccount       = rs.getLong(4);
                String codeAccount   = rs.getString(5);
                String nameAccount   = rs.getString(6);

                Integer activedUsers = rs.getInt(7);

                user.setUserName(userNameDb);
                user.setPassword(passwordDb);
                user.setName(name);

                Account account = new Account();
                account.setId(idAccount);
                account.setCode(codeAccount);
                account.setName(nameAccount);
                account.setActivedUsers(activedUsers);

                user.setAccount(account);

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
                pstmt.close();
            }
        }
        return user;
    }

    public User getUser(String userName) throws SQLException {
        logger.info("--getUser ");
        User user = new User();
        //select
        String query = "SELECT u.user_name" +
                " , u.password" +
                " , u.name" +
                " , ac.id" +
                " , ac.code" +
                " , ac.name" +
                " , ac.actived_users" +
                " FROM main.\"user\" u " +
                " inner join main.account ac " +
                " on u.account_id = ac.id" +
                " where u.user_name = ?";

        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = postgresDBConnection.prepareStatement(query);
            pstmt.setString(1, userName);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String userNameDb   = rs.getString(1);
                String passwordDb   = rs.getString(2);
                String name         = rs.getString(3);
                Long idAccount       = rs.getLong(4);
                String codeAccount   = rs.getString(5);
                String nameAccount   = rs.getString(6);

                Integer activedUsers = rs.getInt(7);

                user.setUserName(userNameDb);
                user.setPassword(passwordDb);
                user.setName(name);

                Account account = new Account();
                account.setId(idAccount);
                account.setCode(codeAccount);
                account.setName(nameAccount);
                account.setActivedUsers(activedUsers);

                user.setAccount(account);

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
                pstmt.close();
            }
        }
        return user;
    }


    public String addMeterDevice(String schema, MeterDevice meterDevice) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--addMeterDevice ", schema);
        String response = "OK";
        String sql = "INSERT INTO %s.meter_device(" +
                " name" +
                ", device_serial" +
                ", device_version_os" +
                ", device_id_push" +
                ", description" +
                ", \"current_user\"" +
                ") " +
                " VALUES (?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ", ?" +
                ");";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {


            if (meterDevice.getName() != null) {
                pstmt.setString(1, meterDevice.getName());
            } else {
                pstmt.setNull(1, Types.VARCHAR);
            }

            if (meterDevice.getDeviceSerial() != null) {
                pstmt.setString(2, meterDevice.getDeviceSerial());
            } else {
                pstmt.setNull(2, Types.VARCHAR);
            }

            if (meterDevice.getDeviceVersionOs() != null) {
                pstmt.setString(3, meterDevice.getDeviceVersionOs());
            } else {
                pstmt.setNull(3, Types.VARCHAR);
            }

            if (meterDevice.getDeviceIdPush() != null) {
                pstmt.setString(4, meterDevice.getDeviceIdPush());
            } else {
                pstmt.setNull(4, Types.VARCHAR);
            }

            if (meterDevice.getDescription() != null) {
                pstmt.setString(5, meterDevice.getDescription());
            } else {
                pstmt.setNull(5, Types.VARCHAR);
            }

            if (meterDevice.getCurrentUser() != null) {
                pstmt.setString(6, meterDevice.getCurrentUser());
            } else {
                pstmt.setNull(6, Types.VARCHAR);
            }

            pstmt.executeUpdate();
            logger.info("--MeterDevice recorded");

            postgresDBConnection.commit();

            response = "OK";
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

    public String addActiveUser(String schema, Login login) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--addActiveUser ", schema);
        String response = "OK";
        String sql = "INSERT INTO %s.active_user(" +
                " active_user" +
                ", device_id_push" +
                ") " +
                " VALUES (?" +
                ", ?" +
                ");";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {


            if (login.getUserName() != null) {
                pstmt.setString(1, login.getUserName());
            } else {
                pstmt.setNull(1, Types.VARCHAR);
            }

            if (login.getIdPush() != null) {
                pstmt.setString(2, login.getIdPush());
            } else {
                pstmt.setNull(2, Types.VARCHAR);
            }

            pstmt.executeUpdate();
            logger.info("--ActiveUser recorded");

            postgresDBConnection.commit();

            response = "OK";
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

    public int activeUser(String schema) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--activeUser ", schema);
        int users = 0;
        //select
        String query = "SELECT count(*) users " +
                " FROM %s.active_user";

        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = postgresDBConnection.prepareStatement(String.format(query, schema));
            rs = pstmt.executeQuery();
            while(rs.next()) {
                 users  = rs.getInt(1);
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
                pstmt.close();
            }

        }
        return users;
    }

    public String removeActiveUser(String schema, Logout logout) throws SQLException {
        logger.info(ConstantsUtil.PRINT_2_P, "--removeActiveUser ", schema);
        String response = "OK";
        String sql = "DELETE FROM %s.active_user where active_user = ? and device_id_push = ?;";
        postgresDBConnection.setAutoCommit(false); //transaction block start
        PreparedStatement pstmt = postgresDBConnection.prepareStatement(String.format(sql, schema));
        try  {
            pstmt.setString(1, logout.getUserName());
            pstmt.setString(2, logout.getIdPush());

            pstmt.executeUpdate();
            logger.info("--ActiveUser deleted");

            postgresDBConnection.commit();

            response = "OK";
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
}
