package helpers;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	
	private static boolean root = false;

	public static Logger getLogger(Class<?> cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\main\\java\\configs\\log4j.properties");
		PatternLayout layout = new PatternLayout("%d{ABSOLUTE} %5p %c<strong>{1}</strong>:%L - %m%n");
		FileAppender fileAppender;
		try {
			fileAppender = new FileAppender(layout, System.getProperty("user.dir") + "\\test-output\\Logs\\Selenium.log");
			Logger rootLogger = Logger.getRootLogger();
			rootLogger.addAppender(fileAppender);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		root = true;
		return Logger.getLogger(cls);
	}

}
