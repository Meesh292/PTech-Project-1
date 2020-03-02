package interfaces;

public class AsteriskLogger implements Logger {

@Override
public void log(String log) {
	System.out.println("***" + log + "***");
	
}

@Override
public void error(String error) {
	System.out.println("****************\r\n" + "***Error:" + error + "***\r\n" + "****************\r\n");
	
}
}
