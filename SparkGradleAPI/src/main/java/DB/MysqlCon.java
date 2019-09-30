package DB;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MysqlCon {
    Connection con;

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

    public Object select(Object object, ArrayList<String> parameter) {
        try {
            String sql = "";

            Class c = object.getClass();
            Field[] fields = c.getDeclaredFields();
            for(int i = 0; i < fields.length; i++){
                sql += fields[i].toString();
                System.out.println(fields[i]);
            }
           // System.out.println(sql);
            //System.out.println("test");

            //String tempOutputParameter = loopOutputParameter(outputParameter, ",");
            //String tempParameter = loopOutputParameter(outputParameter, " where ");

            //sql = String.format("SELECT %s FROM %s%s", tempOutputParameter, table, tempParameter);
            //System.out.println(sql);


            //String sqlString = String.format("SELECT %a FROM %b", tempParameter, table);
            /*PreparedStatement statement = con.prepareStatement(sqlString);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("Streetname"));
            }*/


            //Debug.println("sql string", sqlString);
            return null;
        } catch (Exception e) {
            //SQLException
            e.printStackTrace();
            return null;
        }
    }

    private String OLDloopOutputParameter(ArrayList<String> outputParameter, String seperator) {
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
    }

    private String removeLastWord(String str, int length) {
        return str.substring(0, str.length() - length);
    }
}
