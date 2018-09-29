package co.smilers.campaignservices.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryUtils {
    private static final Logger logger = LoggerFactory.getLogger(QueryUtils.class);

    public static List<Object> getResultSet(ResultSet resultSet) throws Exception {
        List<Object> list = new ArrayList<>();
        ResultSetMetaData rsmd = resultSet.getMetaData();
        while(resultSet.next()){
            int numColumns = rsmd.getColumnCount();
            Map<String, Object> object = new HashMap<>();
            for (int i=1; i<numColumns+1; i++) {
                String column_name = rsmd.getColumnName(i);
                //logger.error("--column_name: " + column_name);
                //logger.error("--column_type: " + rsmd.getColumnType(i));
                if(rsmd.getColumnType(i) == java.sql.Types.ARRAY){
                    object.put(column_name, resultSet.getArray(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.BIGINT){
                    object.put(column_name, resultSet.getInt(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.BOOLEAN){
                    object.put(column_name, resultSet.getBoolean(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.BLOB){
                    if (resultSet.getBlob(column_name) != null) {
                        object.put(column_name, resultSet.getBlob(column_name));
                    } else {
                        object.put(column_name, null);
                    }
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.DOUBLE){
                    object.put(column_name, resultSet.getDouble(column_name));
                } else if(rsmd.getColumnType(i) == java.sql.Types.NUMERIC){
                    object.put(column_name, resultSet.getDouble(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.FLOAT){
                    object.put(column_name, resultSet.getFloat(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.INTEGER){
                    object.put(column_name, resultSet.getInt(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.VARCHAR){
                    if (resultSet.getString(column_name) != null) {
                        object.put(column_name, resultSet.getString(column_name));
                    } else {
                        object.put(column_name, null);
                    }
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.TINYINT){
                    object.put(column_name, resultSet.getInt(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.SMALLINT){
                    object.put(column_name, resultSet.getInt(column_name));
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.DATE){
                    if (resultSet.getDate(column_name) != null) {
                        object.put(column_name, resultSet.getDate(column_name));
                    } else {
                        object.put(column_name, null);
                    }
                }
                else if(rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP){
                    if (resultSet.getTimestamp(column_name) != null) {
                        object.put(column_name, resultSet.getTimestamp(column_name));
                    } else {
                        object.put(column_name, null);
                    }
                }
                else{
                    //obj.append("\""+resultSet.getObject(column_name)+"\"");
                    if (resultSet.getObject(column_name) != null) {
                        object.put(column_name, resultSet.getObject(column_name));
                    } else {
                        object.put(column_name, null);
                    }
                }
                list.add(object);
            }
        }

        return list;
    }
}
