package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {

	WebDriver driver;
	public static int scrnShotCount;
	Logger log = LoggerHelper.getLogger(ScreenshotHelper.class);

	public ScreenshotHelper(WebDriver driver) {
		this.driver = driver;
		log.info("Logger loaded for ScreenshotHelper");
	}

	public void takeSimpleScrnShot() throws IOException {
		try {
			driver.manage().window().maximize();
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
			String filePath = System.getProperty("user.dir") + "\\test-output\\screenShots\\simpleScreenShot.png";
			File target = new File(filePath);
			FileUtils.copyFile(source, target);
			log.info("Screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScrnShotTestCase(String testCasename) throws IOException {
		try {

			driver.manage().window().maximize();
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
			String filePath = System.getProperty("user.dir") + "\\test-output\\screenShots\\" + testCasename + ".png";
			File target = new File(filePath);
			FileUtils.copyFile(source, target);
			log.info("Screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScrnShotTestCaseMore(String testCasename) throws IOException {
		try {
			scrnShotCount++;
			driver.manage().window().maximize();
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
			String filePath = System.getProperty("user.dir") + "\\test-output\\screenShots\\" + testCasename + "_"
					+ scrnShotCount + ".png";

			File target = new File(filePath);
			FileUtils.copyFile(source, target);
			log.info("Screenshot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String takeScrnShotExtentReport() throws IOException {
		scrnShotCount++;
		String filePath = "";
		try {

			// driver.manage().window().maximize();
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File source = takeScreenShot.getScreenshotAs(OutputType.FILE);
			filePath = System.getProperty("user.dir") + "\\test-output\\screenShots\\testName"+ "_" + scrnShotCount + ".png";
			File target = new File(filePath);
			System.out.println("the screenshot current user directory is " + System.getProperty("user.dir"));
			FileUtils.copyFile(source, target);
			log.info("Screenshot taken");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return filePath;
	}

}
