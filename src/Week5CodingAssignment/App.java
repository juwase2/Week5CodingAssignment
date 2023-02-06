package Week5CodingAssignment;

public class App {
	public static void main( String[] args ) {
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		logger.error("STOP");
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Hello");
		spacedLogger.error("Warning");
		
	}

}
