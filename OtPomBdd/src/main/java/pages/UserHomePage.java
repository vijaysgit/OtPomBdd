package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helpers.LoggerHelper;
import helpers.OtMethodsHelper;
import helpers.WaitHelper;

public class UserHomePage {

	Logger log;
	WebDriver driver;
	WaitHelper waitHelper;
	OtMethodsHelper otHelper;

	public UserHomePage(WebDriver driver) {
		this.driver = driver;
		log = LoggerHelper.getLogger(UserHomePage.class);
		log.info("Logger loaded for UserHomePage");
		waitHelper = new WaitHelper(driver);
		otHelper = new OtMethodsHelper(driver);		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id=\"nav-link-accountList\"]/span[1]")
	WebElement helloUserName;

	public String pageTitle() {
		log.info("UserHomePage - Loaded");
		return otHelper.getPageTitle();
	}

	public String getHelloUserName() {
		String userName = otHelper.getElementText(helloUserName);
		log.info("UserHomePage - Sending Hello user name");
		return userName;
	}

}
