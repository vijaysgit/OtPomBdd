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

public class PasswordLoginPage {

	
	Logger log;
	WebDriver driver;
	WaitHelper waitHelper;
	OtMethodsHelper otHelper;
	
	public PasswordLoginPage(WebDriver driver) {
		this.driver = driver;
		log = LoggerHelper.getLogger(PasswordLoginPage.class);
		log.info("Logger loaded for PasswordLoginPage");
		waitHelper = new WaitHelper(driver);
		otHelper = new OtMethodsHelper(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[contains(text(), \"Password\")]//following::input[1]")
	WebElement userPassword;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"signInSubmit\"]")
	WebElement submitBtn;
	
	public String pageTitle() {
		log.info("PasswordLoginPage - Loaded");
		return otHelper.getPageTitle();
	}
		
	public void enterUserPassword(String userPwd) {
		otHelper.typeElement(userPassword, userPwd);
		log.info("PasswordLoginPage - Password entered");
	}
	
	public void clickSubmitBtn() {
		otHelper.clickElement(submitBtn);
		log.info("PasswordLoginPage - Submit button clicked");
	}
	
}
