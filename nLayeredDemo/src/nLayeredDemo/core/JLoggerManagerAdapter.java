package nLayeredDemo.core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {

		JLoggerManager loggerManager = new JLoggerManager();
		loggerManager.log(message);
	}

		
}
