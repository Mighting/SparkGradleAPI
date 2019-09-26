import static spark.Spark.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import spark.Request;
import spark.Route;

public class Main {

	public static void main(String[] args) 
	{
		//This is test
		//get("/MM",(req,res) -> doStuff(req));
		new TestController();
		
		//post("/MM", (req,res) -> doStuff(req));
		
	}
	

	public static String doStuff(Request req) 
	{
		
		
		Set<String> m =req.queryParams();
		Iterator i = m.iterator();
		while(i.hasNext())
				
		{
			System.out.println(req.queryParams(i.next().toString()));
			
		}
		
		return "lalala";
	}

}
