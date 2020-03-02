package interfaces;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {	
		System.out.println("***" + log.replaceAll("", " ") + "***");
	}

	@Override
	public void error(String error) {
		System.out.println("****************\r\n" + "***ERROR:" + error.replaceAll("", " ") + "***\r\n" + "****************\r\n");
		
	}

}
