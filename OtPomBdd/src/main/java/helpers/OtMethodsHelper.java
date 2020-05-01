package helpers;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import otMethods.OtCommonMethods;

public class OtMethodsHelper implements OtCommonMethods {

	public WebDriver driver;
	Logger log = LoggerHelper.getLogger(OtMethodsHelper.class);

	public OtMethodsHelper(WebDriver driver) {
		this.driver = driver;
		log.info("Logger loaded for OtMethodsHelper");
	}

	public String getPageTitle() {
		log.info("Getting title of the page");
		return driver.getTitle();
	}

	public String getPageURL() {
		log.info("Getting current URL of the page");
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		log.info("Getting current page source");
		return driver.getPageSource();
	}

	public void refreshPage() {
		log.info("Refreshing the current page");
		driver.navigate().refresh();
	}

	public void navigateToPage(String url) {
		log.info("Navigating to the page");
		driver.navigate().to(url);
	}

	public void navigateBack() {
		log.info("Navigating to previous page");
		driver.navigate().back();
	}

	public void navigateForward() {
		log.info("Navigating to next page");
		driver.navigate().forward();
	}

	public void maximizeWindow() {
		log.info("Maximizing window size");
		driver.manage().window().maximize();
	}

	public String getCurrentWindow() {
		String currentWindow = driver.getWindowHandle();
		log.info("Getting current window handle");
		return currentWindow;
	}

	public Set<String> getAlltWindows() {
		Set<String> allWindows = driver.getWindowHandles();
		log.info("Getting all window handles");
		return allWindows;
	}

	public void switchToWindow(String windowHandleName) {
		driver.switchTo().window(windowHandleName);
		log.info("Switching to new window");
	}

	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		log.info("Switching to new alert");
		return alert;
	}

	public void closeBrowser() {
		log.info("Closing browser");
		driver.close();
	}

	public void closeAll() {
		log.info("Closing all windows");
		driver.quit();
	}

	public WebElement findElementById(String elementId) {
		WebElement element = driver.findElement(By.id(elementId));
		log.info("Finding element by ID");
		return element;
	}

	public WebElement findElementByName(String elementName) {
		WebElement element = driver.findElement(By.name(elementName));
		log.info("Finding element by name");
		return element;
	}

	public WebElement findElementByXpath(String elementXpath) {
		WebElement element = driver.findElement(By.xpath(elementXpath));
		log.info("Finding element by xpath");
		return element;
	}

	public WebElement findElementByClass(String elementClass) {
		WebElement element = driver.findElement(By.className(elementClass));
		log.info("Finding element by class name");
		return element;
	}

	public WebElement findElementByCSS(String elementCSS) {
		WebElement element = driver.findElement(By.cssSelector(elementCSS));
		log.info("Finding element by CSS selector");
		return element;
	}

	public WebElement findElementByPartialLinkText(String plinkText) {
		WebElement element = driver.findElement(By.partialLinkText(plinkText));
		log.info("Finding element by partial link text");
		return element;
	}

	public WebElement findElementByLinkText(String linkText) {
		WebElement element = driver.findElement(By.linkText(linkText));
		log.info("Finding element by link text");
		return element;
	}

	public List<WebElement> findElementsById(String elementId) {
		List<WebElement> elements = driver.findElements(By.id(elementId));
		log.info("Finding list of elements by ID");
		return elements;
	}

	public List<WebElement> findElementsByName(String elementName) {
		List<WebElement> elements = driver.findElements(By.name(elementName));
		log.info("Finding list of elements by name");
		return elements;
	}

	public List<WebElement> findElementsByXpath(String elementXpath) {
		List<WebElement> elements = driver.findElements(By.xpath(elementXpath));
		log.info("Finding list of elements by xpath");
		return elements;
	}

	public List<WebElement> findElementsByClass(String elementClass) {
		List<WebElement> elements = driver.findElements(By.className(elementClass));
		log.info("Finding list of elements by class name");
		return elements;
	}

	public List<WebElement> findElementsByCSS(String elementCSS) {
		List<WebElement> elements = driver.findElements(By.cssSelector(elementCSS));
		log.info("Finding list of elements by CSS selector");
		return elements;
	}

	public List<WebElement> findElementsByPartialLinkText(String plinkText) {
		List<WebElement> elements = driver.findElements(By.partialLinkText(plinkText));
		log.info("Finding list of elements by partial link text");
		return elements;
	}

	public List<WebElement> findElementsByLinkText(String linkText) {
		List<WebElement> elements = driver.findElements(By.linkText(linkText));
		log.info("Finding list of elements by link text");
		return elements;
	}

	public WebElement findElementByTagName(String tagName) {
		WebElement element = driver.findElement(By.tagName(tagName));
		log.info("Finding element by tag name");
		return element;
	}

	public List<WebElement> findElementsByTagName(String tagName) {
		List<WebElement> elements = driver.findElements(By.tagName(tagName));
		log.info("Finding list of elements by tag name");
		return elements;
	}

	public void clickElement(WebElement element) {
		log.info("Clicking on element");
		element.click();
	}

	public void typeElement(WebElement element, String typeText) {
		log.info("Typing text in element");
		element.sendKeys(typeText);
	}

	public void clearElement(WebElement element) {
		log.info("Clearing the contents of element");
		element.clear();
	}

	public String getElementText(WebElement element) {
		String text = element.getText();
		log.info("Getting text from element");
		return text;
	}

	public String getElementAttribute(WebElement element, String elemAttribute) {
		String attributeValue = element.getAttribute(elemAttribute);
		log.info("Getting attribute value from element");
		return attributeValue;
	}

	public void selectByVisibleText(WebElement element, String elemVisibleText) {
		Select selectElement = new Select(element);
		selectElement.selectByVisibleText(elemVisibleText);
		log.info("Selecting an item in dropdown by visible text");
	}

	public void selectByValue(WebElement element, String elemValue) {
		Select selectElement = new Select(element);
		selectElement.selectByValue(elemValue);
		log.info("Selecting an item in dropdown by value");
	}

	public void selectByIndex(WebElement element, int elemIndex) {
		Select selectElement = new Select(element);
		selectElement.selectByIndex(elemIndex);
		log.info("Selecting an item in dropdown by index");

	}

	public void deSelectByVisibleText(WebElement element, String elemVisibleText) {
		Select selectElement = new Select(element);
		selectElement.deselectByVisibleText(elemVisibleText);
		log.info("Deselecting an item in dropdown by visible text");
	}

	public void deSelectByValue(WebElement element, String elemValue) {
		Select selectElement = new Select(element);
		selectElement.deselectByValue(elemValue);
		log.info("Deselecting an item in dropdown by value");
	}

	public void deSelectByIndex(WebElement element, int elemIndex) {
		Select selectElement = new Select(element);
		selectElement.deselectByIndex(elemIndex);
		log.info("Deselecting an item in dropdown by index");
	}

	public void deSelectAll(WebElement element) {
		Select selectElement = new Select(element);
		selectElement.deselectAll();
		log.info("Deselecting all items in dropdown");
	}

	public boolean selectIsMultiple(WebElement element) {
		Select selectElement = new Select(element);
		boolean multiSelect = selectElement.isMultiple();
		log.info("Checking multiple selection in dropdown");
		return multiSelect;
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		log.info("Moving to element");
	}

	public void dragDropElement(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		log.info("Drag drop element from one to another");
	}

	public void dragDropInLocation(WebElement element, int xOffset, int yOffset) {
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, xOffset, yOffset).perform();
		log.info("Drag drop element to particular location");
	}

	public void doubleClickElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
		log.info("Double clicking on element");
	}

	public void rightClickElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element);
		log.info("Right clicking on element");
	}

}
