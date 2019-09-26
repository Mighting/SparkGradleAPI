import static spark.Spark.*;

public class Main {

	public static void main(String[] args) 
	{
		get("/hello",(req,res) -> "Hello World");
		get("/Piratos",(req,res) -> "Piratos fixede hele API'en helt alene ved hjælp af genstart");
		get("/Changes",(req,res) -> "This is a test page");
		get("/Changes2",(req,res) -> "This is a test page");
	}
	
}
