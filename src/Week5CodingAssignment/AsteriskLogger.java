package Week5CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}
	@Override
	public void error(String error) {
		System.err.println();
		System.err.println("*******************");
		System.err.println("***" + "Error:" + error + "***");
		System.err.println("*******************" );
		
	}

}
