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

public class MainPage {

	WebDriver driver;
	Logger log;
	WaitHelper waitHelper;
	OtMethodsHelper otHelper;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		log = LoggerHelper.getLogger(MainPage.class);
		log.info("Logger loaded for MainPage");
		waitHelper = new WaitHelper(driver);
		otHelper = new OtMethodsHelper(driver);
		PageFactory.initElements(driver, this);
			
	}

	@FindBy(how = How.XPATH, using = "//span[text()=\"Hello, Sign in\"]")
	WebElement signInLink;

	public String pageTitle() {
		log.info("Main Page - Loaded");
		return otHelper.getPageTitle();
		
	}
	
	public String getSignInText() {
		waitHelper.WaitForTextInElement(50, signInLink, "Hello, Sign in");
		String signInText = otHelper.getElementText(signInLink);
		return signInText;
	}
	
	
	public void clickSignInLink() {
		otHelper.clickElement(signInLink);
		log.info("Main Page - Signin link clicked");
	}
	
	
	
	
	

}
