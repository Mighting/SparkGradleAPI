import Manager.MicroMarketController;
import spark.Request;

import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args)
	{
		//This is test
		//get("/MM",(req,res) -> doStuff(req));
		new MicroMarketController();

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
