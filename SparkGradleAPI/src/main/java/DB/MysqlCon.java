package DB;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;

public class MysqlCon {
    Connection con;
    PreparedStatement statement;

    public MysqlCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://10.108.146.1/gogreen", "remotepirate", "Pirate@gr33n");
        } catch (
                ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet sql(String sql) {
        try {
            statement = con.prepareStatement(sql);
            return statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object select(Object object, ArrayList<String> parameter) {
        try {
            String sql = "SELECT ";

            Class c = object.getClass();
            Field[] fields = c.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                if (!fields[i].toString().contains("ArrayList")) {
                    sql += fields[i].getName() + ",";
                }
            }
            sql = removeLastWord(sql, ",".length());
            sql += " FROM " + object.getClass().getSimpleName();

            statement = con.prepareStatement(sql);
            if (parameter != null) {
                //TODO make parameter
                //statement.setString(1, "MicroMarketId");
            }
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            //TODO a smart way to convert rs.next() to object
            while (rs.next()) {
                String row = "";
                for (int i = 1; i <= columnCount; i++) {
                    row += rs.getString(i) + ", ";
                }
                System.out.println(row);
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*private String OLDloopOutputParameter(ArrayList<String> outputParameter, String seperator) {
        String tempParameter = "";
        if (seperator == ","){
            tempParameter = "*";
        }
        if (outputParameter != null) {
            for (int i = 0; outputParameter.size() < i; i++) {
                tempParameter += outputParameter.indexOf(i) + seperator;
            }
            tempParameter = removeLastWord(tempParameter, seperator.length());
        }
        return tempParameter;
    }*/

    private String removeLastWord(String str, int length) {
        return str.substring(0, str.length() - length);
    }
}
