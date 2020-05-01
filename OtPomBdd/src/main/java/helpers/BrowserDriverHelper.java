package helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import helpers.LoggerHelper;

public class BrowserDriverHelper {

	Logger log = LoggerHelper.getLogger(BrowserDriverHelper.class);

	public WebDriver selectWebdriver() {

		WebDriver webDriver = null;

		log.info("Logger loaded for BrowserDriverHelper");

		log.info("Accessing webdriver properties");

		InputStream instream;
		Properties webDriverProperties = new Properties();
		try {
			// instream = this.getClass().getResourceAsStream("/browserdriver.properties");
			instream = BrowserDriverHelper.class.getClassLoader()
					.getResourceAsStream("configs/browserdriver.properties");
			System.out.println("the input stream is " + instream);
			webDriverProperties.load(instream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driverPath = System.getProperty("user.dir") + "\\src\\test\\java\\testDrivers\\" + webDriverProperties.getProperty("driverName").toString();
		System.out.println("the driver path is " + driverPath);
		
		System.setProperty(webDriverProperties.getProperty("driverSystemProperty").toString(), driverPath);
		
		if (webDriverProperties.get("browser").toString().equalsIgnoreCase("chrome")) {
			log.info("Chrome Browser selected");
			webDriver = new ChromeDriver();
		} else if (webDriverProperties.get("browser").toString().equalsIgnoreCase("firefox")) {
			log.info("Firefox Browser selected");
			webDriver = new FirefoxDriver();
		} else if (webDriverProperties.get("browser").toString().equalsIgnoreCase("msedge")) {
			log.info("Edge Browser selected");
			webDriver = new EdgeDriver();
		}
		return webDriver;
	}

}
