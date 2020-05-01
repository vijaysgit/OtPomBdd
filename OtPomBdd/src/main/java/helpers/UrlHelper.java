package helpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class UrlHelper {

	Logger log = Logger.getLogger(UrlHelper.class);

	public String getMainPageURL() {

		String url;

		log.info("Logger loaded for UrlHelper");

		log.info("Accessing URL properties");

		InputStream instream;
		Properties urlProperties = new Properties();
		try {
			 //instream = this.getClass().getResourceAsStream("/url.properties");
			instream = UrlHelper.class.getClassLoader().getResourceAsStream("configs/url.properties");
			urlProperties.load(instream);
			
		} catch (FileNotFoundException e) {
			log.info("URL file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		log.info("URL Selected");
		url = urlProperties.getProperty("mainURL").toString();
		System.out.println("the url is "+ url);
		return url;

	}

	public String getTestPageURL() {

		String url;

		log.info("Logger loaded for UrlHelper");

		log.info("Accessing URL properties");

		InputStream instream;
		Properties urlProperties = new Properties();
		try {
			instream = this.getClass().getResourceAsStream("/url.properties");
			urlProperties.load(instream);
		} catch (FileNotFoundException e) {
			log.info("URL file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		log.info("URL Selected");
		url = urlProperties.getProperty("testURL").toString();
		return url;

	}

}
