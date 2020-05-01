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

public class EmailLoginPage {

	Logger log;
	WebDriver driver;
	WaitHelper waitHelper;
	OtMethodsHelper otHelper;

	public EmailLoginPage(WebDriver driver) {
		this.driver = driver;
		log = LoggerHelper.getLogger(EmailLoginPage.class);
		log.info("Logger loaded for EmailLoginPage");
		waitHelper = new WaitHelper(driver);
		otHelper = new OtMethodsHelper(driver);
		PageFactory.initElements(driver, this);
			
	}

	@FindBy(how = How.XPATH, using = "//*[contains(text(), \"Email (phone for mobile accounts)\")]//following::input[1]")
	WebElement userEmail;

	@FindBy(how = How.XPATH, using = "//input[@id=\"continue\"]")
	WebElement continueBtn;

	public String pageTitle() {
		log.info("EmailLoginPage - Loaded");
		return otHelper.getPageTitle();
	}

		
	public void enterUserEmail(String userEmailId) {
		otHelper.typeElement(userEmail, userEmailId);
		log.info("EmailLoginPage - Email entered");
	}

	public void clickContinueBtn() {
		otHelper.clickElement(continueBtn);
		log.info("EmailLoginPage - Continue button clicked");
	}

}
