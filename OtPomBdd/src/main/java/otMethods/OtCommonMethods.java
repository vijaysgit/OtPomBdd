package otMethods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

// OT Common Selenium Webdriver Methods
public interface OtCommonMethods {

	// Get current page title
	public String getPageTitle();

	// Get current page URL
	public String getPageURL();

	// Get current page source
	public String getPageSource();

	// Refresh current page
	public void refreshPage();

	// Navigate to a given page
	public void navigateToPage(String url);

	// Navigate to backward by one page
	public void navigateBack();

	// Navigate to forward by one page
	public void navigateForward();
	
	// Maximize window size
	public void maximizeWindow();

	// Get current window control
	public String getCurrentWindow();

	// Get all window controls
	public Set<String> getAlltWindows();
	
	// Switch to a given window
	public void switchToWindow(String windowHandle);
	
	// Switch to an alert
	public Alert switchToAlert();

	// Close browser
	public void closeBrowser();

	// Close all windows
	public void closeAll();

	// Find an element using the given id
	public WebElement findElementById(String elementId);

	// Find an element using the given name
	public WebElement findElementByName(String elementName);

	// Find an element using the given xpath
	public WebElement findElementByXpath(String elementXpath);

	// Find an element using the given class name
	public WebElement findElementByClass(String elementClass);

	// Find an element using the given CSS selector
	public WebElement findElementByCSS(String elementCSS);

	// Find an element using the given partial link text
	public WebElement findElementByPartialLinkText(String plinkText);

	// Find an element using the given link text
	public WebElement findElementByLinkText(String linkText);

	// Find an element using the given tag name
	public WebElement findElementByTagName(String tagName);

	// Find a list of elements using the given id
	public List<WebElement> findElementsById(String elementId);

	// Find a list of elements using the given name
	public List<WebElement> findElementsByName(String elementName);

	// Find a list of elements using the given xpath
	public List<WebElement> findElementsByXpath(String elementXpath);

	// Find a list of elements using the given class name
	public List<WebElement> findElementsByClass(String elementClass);

	// Find a list of elements using the given CSS selector
	public List<WebElement> findElementsByCSS(String elementCSS);

	// Find a list of elements using the given partial link text
	public List<WebElement> findElementsByPartialLinkText(String plinkText);

	// Find a list of elements using the given link text
	public List<WebElement> findElementsByLinkText(String linkText);

	// Find a list of elements using the given tag name
	public List<WebElement> findElementsByTagName(String tagName);

	// Click the given element
	public void clickElement(WebElement element);

	// Type the given text in the element
	public void typeElement(WebElement element, String typeText);

	// Clear the contents of given element
	public void clearElement(WebElement element);

	// Retrieve the text from the given element
	public String getElementText(WebElement element);

	// Retrieve the given attribute value of the element
	public String getElementAttribute(WebElement element, String elemAttribute);

	// Select an item from the dropdown by the given visible text
	public void selectByVisibleText(WebElement element, String elemVisibleText);

	// Select an item from the dropdown by the given value
	public void selectByValue(WebElement element, String elemValue);

	// Select an item from the dropdown by the given index
	public void selectByIndex(WebElement element, int elemIndex);

	// Deselect an item from the dropdown by the given visible text
	public void deSelectByVisibleText(WebElement element, String elemVisibleText);

	// Deselect an item from the dropdown by the given value
	public void deSelectByValue(WebElement element, String elemValue);

	// Deselect an item from the dropdown by the given index
	public void deSelectByIndex(WebElement element, int elemIndex);

	// Deselect all items from the dropdown
	public void deSelectAll(WebElement element);

	// Check if multiple selection is allowed in the given dropdown
	public boolean selectIsMultiple(WebElement element);

	// Mouse hover to the given element
	public void moveToElement(WebElement element);

	// Drag and drop the element from one to another
	public void dragDropElement(WebElement source, WebElement target);

	// Drag and drop the element to a particular location
	public void dragDropInLocation(WebElement element, int xOffset, int yOffset);

	// Double click on a given element
	public void doubleClickElement(WebElement element);

	// Right click on a given element
	public void rightClickElement(WebElement element);

}
