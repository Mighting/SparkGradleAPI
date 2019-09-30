package DB;

import Manager.MicroMarket;

import java.sql.*;

import java.util.ArrayList;

public class MicroMarketDAOImp implements StandardDAO<MicroMarket> {
    MysqlCon mysqlCon;

    public MicroMarketDAOImp() {
        MysqlCon mysqlCon = new MysqlCon();
    }

    @Override
    public MicroMarket getFromId(int id) {
        try {
            ResultSet rs = mysqlCon.sql("SELECT * FROM MicroMarket WHERE MicroMarketId = " + id);
            MicroMarket microMarket = new MicroMarket();
            while (rs.next()) {
                microMarket.setActive(rs.getInt("Active"));
                microMarket.setEmail(rs.getString("Email"));
                microMarket.setFirstName(rs.getString("FirstName"));
                microMarket.setLastName(rs.getString("LastName"));
                microMarket.setFloorNumber(rs.getInt("FloorNumber"));
                microMarket.setHouseNumber(rs.getString("HouseNumber"));
                microMarket.setMicroMarketId(rs.getInt("MicroMarketId"));
                microMarket.setOpeningHoursEnd(rs.getDate("OpeningHoursEnd"));
                microMarket.setOpeningHoursStart(rs.getDate("OpeningHoursStart"));
                microMarket.setOrderHoursEnd(rs.getDate("OrderHoursEnd"));
                microMarket.setOrderHoursStart(rs.getDate("OrderHoursStart"));
                microMarket.setPhoneNumber(rs.getString("PhoneNumber"));
                microMarket.setStreetName(rs.getString("StreetName"));
            }
            return microMarket;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<MicroMarket> getAll() {
        return null;
    }

    @Override
    public MicroMarket add(MicroMarket item) {
        try {
            ResultSet rs = mysqlCon.sql("INSERT INTO MicroMarket (Active, Email, FirstName, LastName, FloorNumber, " +
                    "HouseNumber, MicroMarketId, OpeningHoursEnd, OpeningHoursStart, OrderHoursEnd, " +
                    "OrderHoursStart ,PhoneNumber, StreetName) VALUES ()");
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();

            while (rs.next()) {
                String row = "";
                for (int i = 1; i <= columnCount; i++) {
                    row += rs.getString(i) + ", ";
                }
                System.out.println(row);
            }


            MicroMarket microMarket = new MicroMarket();

            return microMarket;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public MicroMarket update(MicroMarket item) {
        return null;
    }

    @Override
    public MicroMarket disable(MicroMarket item) {
        return null;
    }
}
