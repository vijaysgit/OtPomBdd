package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportListener {
	
	public static int stepCount;
	
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports extent;
	public static ExtentTest reportLog;
	
	
	public static void setupExtentReport() {

		String reportPath = System.getProperty("user.dir") + "\\test-output\\extentReports\\amazonLoginReport.html"; 
		htmlReport = new ExtentHtmlReporter(reportPath);
		
		System.out.println("the reporter current user directory is " + System.getProperty("user.dir"));
		htmlReport.config().setDocumentTitle("Amazon Login Test Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.start();

		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		extent.setSystemInfo("Name", "Amazon Test");
		extent.setSystemInfo("Company", "Orexel");
		extent.setSystemInfo("Tester", "Vikosh");
		
	}
	
		
	public static void endExtentReport() {
		extent.flush();
	}
	
	
/*	public static void checkTestResult(ITestResult testResult) throws IOException {
		
		//stepCount++;
		
		//ITestContext context = testResult.getTestContext();
		//WebDriver driver = (WebDriver) context.getAttribute("driver");
		//System.out.println("THE VIJAY URL IS " + driver.getCurrentUrl());
		
		//ScreenshotHelper scrnHelper = new ScreenshotHelper(driver);
		if (testResult.getStatus() == ITestResult.FAILURE) {
			//String path = scrnHelper.takeScrnShotExtentReport(testResult.getTestName());
			//reportLog.fail(testResult.getTestName() + stepCount, MediaEntityBuilder.createScreenCaptureFromPath(AmazonLoginStepDef.scrnFilePath).build());
			//reportLog.fail(testResult.getTestName()+stepCount);
			//reportLog.fail("FAILED TEST VIJAY" + testResult.getTestName());
			
			
		} else if (testResult.getStatus() == ITestResult.SKIP) {
			//reportLog.skip("Skipped test case is : " + testResult.getName());
		}
		else if (testResult.getStatus() == ITestResult.SUCCESS) {
			//String path = scrnHelper.takeScrnShotExtentReport(testResult.getTestName());
			//reportLog.pass(testResult.getTestName() + stepCount, MediaEntityBuilder.createScreenCaptureFromPath(AmazonLoginStepDef.scrnFilePath).build());
			//reportLog.pass(testResult.getTestName() + stepCount);
			//reportLog.pass("PASSED TEST VIJAY" + testResult.getTestName());
						
		}

	}
	*/
	
	
	
	
	
	
	
	
}
