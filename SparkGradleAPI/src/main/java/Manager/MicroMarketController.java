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
        //MysqlCon a = new MysqlCon();
        //a.select(new MicroMarket(), null);

        MicroMarket mm = new MicroMarket();

        mm.setFirstName("Rasmus");

        JsonConverter jc = new JsonConverter();

        String sc = jc.ObjectToString(mm);

        System.out.println(sc);



        System.out.println(jc.StringToObject(sc,MicroMarket.class));


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
}
