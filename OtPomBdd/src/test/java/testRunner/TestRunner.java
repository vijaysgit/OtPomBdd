package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.ReportListener;

@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" }

)

public class TestRunner extends AbstractTestNGCucumberTests {

	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest test;

	
	@BeforeTest
	public void startReport() {
		ReportListener.setupExtentReport();
	}
	
	
	/*@AfterMethod
	public void verifyResult(ITestResult testResult) throws IOException {
		ReportListener.checkTestResult(testResult);
		
	}*/
	
	@AfterTest
	public void stopReport() {
		ReportListener.endExtentReport();
	}

}
