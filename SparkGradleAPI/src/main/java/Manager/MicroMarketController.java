package Manager;


import DB.MysqlCon;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;


public class MicroMarketController {
    public MicroMarketController() {
        MysqlCon a = new MysqlCon();
        a.connectToDB();


        get("/MicroMarket", new Route() {
            public Object handle(Request req, Response res) {
                return "bla";
            }
        });

        post("/MicroMarket", "application/json", (req, res) -> {
            String q = req.body();
            return q;
        });

        put("/MicroMarket", "application/json", (req, res) -> {
            String q = req.body();
            return q;
        });
    }

    public MicroMarket JsonToObject(String json){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        return gson.fromJson(json, MicroMarket.class);
    }
}
