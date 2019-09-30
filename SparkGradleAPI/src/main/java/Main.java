import Manager.MicroMarketController;

import static spark.Spark.port;

public class Main {

	public static void main(String[] args)
	{
		port(8080);
		new MicroMarketController();
	}
}
