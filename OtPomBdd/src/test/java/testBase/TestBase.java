package testBase;

import org.openqa.selenium.WebDriver;

import helpers.BrowserDriverHelper;
import helpers.UrlHelper;


public class TestBase{
	//Test Base
	public WebDriver webdriver;
	
	public WebDriver getWebDriver() {
		BrowserDriverHelper browserdriver = new BrowserDriverHelper();
		webdriver = browserdriver.selectWebdriver();
		return webdriver;
	}
	
	public String getWebURL() {
		UrlHelper urlHelper = new UrlHelper();
		String url = urlHelper.getMainPageURL();
		return url;
	}
	
}
