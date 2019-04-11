package co.smilers.campaignservices.repository.postgres;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class PostgresDBConfig {

    private static final Logger logger = LoggerFactory.getLogger(PostgresDBConfig.class);


    @Bean(name = "postgresDBConnection")
    public Connection postgresDBConnection() {
        logger.info("--postgresDBConnection");
        Connection conn = null;
        try {
            String driver = "org.postgresql.Driver";
            Class.forName(driver);
            // connection string
            //String url = "jdbc:postgresql://smiller.cyluev4emnfj.us-west-2.rds.amazonaws.com:5432/smiller";
            String url = "jdbc:postgresql://smiller.cyluev4emnfj.us-west-2.rds.amazonaws.com:5432/smilers_stage";

            try {
                conn = DriverManager.getConnection(url, "smiller", "aUsTJK2sFhftcz34");
                logger.info("--Connected to database postgresql");
            } catch (SQLException e) {
                logger.info(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
