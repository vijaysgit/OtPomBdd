package helpers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	WebDriver driver;
	Logger log = LoggerHelper.getLogger(WaitHelper.class);

	public WaitHelper(WebDriver driver) {
		this.driver = driver;
		log.info("Logger loaded for WaitHelper");
	}

	public void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		log.info("Implicitwait over");
	}

	public void WaitForElementClickable(int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("WaitForElementClickable over");
	}

	public void WaitForElementSelectable(int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		log.info("WaitForElementSelectable over");
	}

	public void WaitForElementVisible(int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("WaitForElementVisible over");
	}

	public void WaitForElementInvisible(int waitTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.invisibilityOf(element));
		log.info("WaitForElementInvisible over");
	}

	public void WaitForTextInElement(int waitTime, WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		log.info("WaitForTextInElement over");
	}

	public void WaitForTitle(int waitTime, String title) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.titleContains(title));
		log.info("WaitForTitle over");
	}

	public void WaitForExactURL(int waitTime, String url) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.urlToBe(url));
		log.info("WaitForExactURL over");
	}

	public void WaitForSpecificURL(int waitTime, String url) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.urlContains(url));
		log.info("WaitForSpecificURL over");
	}

	public void fluentWaitForElementVisible(Duration timeOut, Duration pollTime, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeOut).pollingEvery(pollTime)
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("fluentWaitForElementVisible over");
	}

	public void fluentWaitForElementClickable(Duration timeOut, Duration pollTime, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeOut).pollingEvery(pollTime)
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		log.info("fluentWaitForElementClickable over");
	}

	public void fluentWaitForElementSelectable(Duration timeOut, Duration pollTime, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(timeOut).pollingEvery(pollTime)
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		log.info("fluentWaitForElementSelectable over");
	}

}
