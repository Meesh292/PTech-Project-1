package interfaces;

public class App {
	
	public static void main(String[] args) {
	Logger logger = new AsteriskLogger();
	logger.log("Hello");
	logger.error("Goodbye");
	}
	
	{
	Logger logger = new SpacedLogger();
	logger.log("Hi");
	logger.error("Bye");
	}
}
