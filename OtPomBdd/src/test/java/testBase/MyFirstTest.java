package testBase;

import org.openqa.selenium.WebDriver;

import helpers.OtMethodsHelper;
import helpers.UrlHelper;


public class MyFirstTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		TestBase tBase = new TestBase();
		driver = tBase.getWebDriver();
		UrlHelper url = new UrlHelper();
		driver.get(url.getTestPageURL());
		OtMethodsHelper othelper = new OtMethodsHelper(driver);
		System.out.println("the title is " + othelper.getPageTitle());

	}

}
