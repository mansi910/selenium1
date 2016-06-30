package util;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//for writing logs
public class LowLevelLogs {
	static final Logger logger = Logger.getLogger(LowLevelLogs.class);

	public static void loadLogger() {
		File log4jfile = new File("./src/log4j.properties");
	    PropertyConfigurator.configure(log4jfile.getAbsolutePath());
	}

	public static Logger getLogger() {
		if (logger != null){
			loadLogger();
			return logger;
			
		}	else {
			
		loadLogger();
		return logger;
			
		}
	}
}