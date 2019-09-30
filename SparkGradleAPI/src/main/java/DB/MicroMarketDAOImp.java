package DB;

import Manager.MicroMarket;

import java.sql.Connection;
import java.util.ArrayList;

public class MicroMarketDAOImp implements StandardDAO<MicroMarket> {
    Connection mysqlCon;

    public MicroMarketDAOImp() {
        MysqlCon mysqlCon = new MysqlCon();
        mysqlCon = (MysqlCon) mysqlCon.connectToDB();
    }

    @Override
    public MicroMarket getFromId(int id) {
        return null;
    }

    @Override
    public ArrayList<MicroMarket> getAll() {
        return null;
    }

    @Override
    public MicroMarket add(MicroMarket item) {
        return null;
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
