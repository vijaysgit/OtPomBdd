package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;

import helpers.OtMethodsHelper;
import helpers.ScreenshotHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmailLoginPage;
import pages.MainPage;
import pages.PasswordLoginPage;
import pages.UserHomePage;
import testBase.TestBase;
import utils.ReportListener;

public class AmazonLoginStepDef extends ReportListener {

	WebDriver driver;
	MainPage mainPage;
	EmailLoginPage emailPage;
	PasswordLoginPage passwordPage;
	UserHomePage userPage;
	TestBase testBase;
	OtMethodsHelper otHelper;
	ScreenshotHelper scrnHelper;

	public static String scrnFilePath;

	String actualTitle;
	String actualUserName;

	@Given("selected browser")
	public void selected_browser() {
		testBase = new TestBase();
		driver = testBase.getWebDriver();
	}

	@When("enter the url")
	public void enter_the_url() {
		driver.get(testBase.getWebURL());
	}

	@Then("main page is displayed")
	public void main_page_is_displayed() {
		actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		mainPage = new MainPage(driver);
		Assert.assertEquals(actualTitle, mainPage.pageTitle());
	}

	@Given("the main page without login")
	public void the_main_page_without_login() {
		reportLog = extent.createTest("MainPageTest");
		Assert.assertEquals(actualTitle, mainPage.pageTitle());
		System.out.println("the loginstepdfin user directory is " + System.getProperty("user.dir"));
		otHelper = new OtMethodsHelper(driver);
	}

	@Then("generic username available")
	public void generic_username_available() throws IOException {
		actualUserName = "Hello, Sign in";
		Assert.assertEquals(actualUserName, mainPage.getSignInText());

		scrnHelper = new ScreenshotHelper(driver);
		scrnFilePath = scrnHelper.takeScrnShotExtentReport();
		// reportLog.addScreenCaptureFromPath(scrnFilePath);
		reportLog.log(reportLog.getStatus(), "Main Page Display No Login",
				MediaEntityBuilder.createScreenCaptureFromPath(scrnFilePath).build());

		otHelper.closeBrowser();
	}

	@Given("the main page")
	public void the_main_page() throws IOException {
		reportLog = extent.createTest("LoginPageTest");
		otHelper = new OtMethodsHelper(driver);
		Assert.assertEquals(actualTitle, mainPage.pageTitle());

		scrnHelper = new ScreenshotHelper(driver);
		scrnFilePath = scrnHelper.takeScrnShotExtentReport();
		// reportLog.addScreenCaptureFromPath(scrnFilePath);
		reportLog.log(reportLog.getStatus(), "Main Page Display",
				MediaEntityBuilder.createScreenCaptureFromPath(scrnFilePath).build());

		otHelper = new OtMethodsHelper(driver);
	}

	@When("click on sign in")
	public void click_on_sign_in() {
		mainPage.clickSignInLink();
	}

	@Then("email login page displayed")
	public void email_login_page_displayed() throws IOException {
		actualTitle = "Amazon Sign-In";
		emailPage = new EmailLoginPage(driver);
		Assert.assertEquals(actualTitle, emailPage.pageTitle());

		scrnHelper = new ScreenshotHelper(driver);
		scrnFilePath = scrnHelper.takeScrnShotExtentReport();
		// reportLog.addScreenCaptureFromPath(scrnFilePath);
		reportLog.log(reportLog.getStatus(), "Email Login Page Display",
				MediaEntityBuilder.createScreenCaptureFromPath(scrnFilePath).build());
	}

	@When("fill the email with {string}")
	public void fill_the_email_with(String userEmailId) {
		emailPage.enterUserEmail(userEmailId);

	}

	@When("click on continue button")
	public void click_on_continue_button() {
		emailPage.clickContinueBtn();
	}

	@Then("password login page displayed")
	public void password_login_page_displayed() throws IOException {
		actualTitle = "Amazon Sign-In";
		passwordPage = new PasswordLoginPage(driver);
		Assert.assertEquals(actualTitle, passwordPage.pageTitle());

		scrnHelper = new ScreenshotHelper(driver);
		scrnFilePath = scrnHelper.takeScrnShotExtentReport();
		// reportLog.addScreenCaptureFromPath(scrnFilePath);
		reportLog.log(reportLog.getStatus(), "Password Login Page Display",
				MediaEntityBuilder.createScreenCaptureFromPath(scrnFilePath).build());

	}

	@When("fill the password with {string}")
	public void fill_the_password_with(String userPwd) {
		passwordPage.enterUserPassword(userPwd);
	}

	@When("clik on submit button")
	public void clik_on_submit_button() {
		passwordPage.clickSubmitBtn();
	}

	@Then("user home page displayed")
	public void user_home_page_displayed() throws IOException {
		actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		userPage = new UserHomePage(driver);
		Assert.assertEquals(actualTitle, userPage.pageTitle());

		scrnHelper = new ScreenshotHelper(driver);
		scrnFilePath = scrnHelper.takeScrnShotExtentReport();
		reportLog.log(reportLog.getStatus(), "User Home Page Display",
				MediaEntityBuilder.createScreenCaptureFromPath(scrnFilePath).build());
	}

	@Then("username is available")
	public void username_is_available() {
		actualUserName = "Hello, vikosh";
		Assert.assertEquals(actualUserName, userPage.getHelloUserName());
		otHelper.closeBrowser();

	}

}
