import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;
public class TestController {

	public TestController() {
		
		get("/tester", new Route() {
			public Object handle(Request rq, Response re) {
				return "bla";
			}
			
		});
		
		post("/tester2", new Route() {
			public Object handle(Request rq, Response re) {
				return "bla2";
			}
			
		});
		
	}
}
