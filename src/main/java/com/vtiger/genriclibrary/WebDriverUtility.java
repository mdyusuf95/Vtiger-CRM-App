package com.vtiger.genriclibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * its contains all reusuble methods
 * @author yusuf
 *
 */
public class WebDriverUtility {
	/**
	 * it is methd toUse  wait implicitly
	 * @param WebElement
	 * @param int Seconds 
	 */
	public void implicityWaitUntilPageLoad(WebDriver dr,int sec)
	{
		dr.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	/**
	 * explitly wait it is use to waite until elementToBeClickable
	 * @param driver WebDriver
	 * @param element webelement
	 */
public void waitForElemen(WebDriver driver, WebElement element)
{
	WebDriverWait wait= new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * This method is used to wait for page load
 *
 * @param driver
 */
public void waitForPageLoad(WebDriver driver) {
driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
 }
/**
 * This method is used until element to be visible
 *
 * @param driver
 * @param element
 */
public void waitForElementToBeVisible(WebDriver driver, WebElement
element) {
 WebDriverWait wait = new WebDriverWait(driver,10);
 wait.until(ExpectedConditions.visibilityOf(element));
 }
/**
 * This method will select data from dropdown using index
 *
 * @param element
 * @param indType
 */
public void select(WebElement element, int Index) {
 Select sel = new Select(element);
 sel.selectByIndex(Index);
 }
/**
 * This method will select data from dropdown using VisibleText
 *
 * @param element
 * @param text
 */
public void selectByVisibleText(WebElement element, String text) {
 Select sel = new Select(element);
 sel.selectByVisibleText(text);
 }
public void select(String value, WebElement element) {
 element.click();
 Select sel = new Select(element);
 sel.selectByValue(value);
 }
/**
 * This method will perform MouseHover action
 *
 * @param driver
 * @param element
 */
public void mouseHover(WebDriver driver, WebElement element) {
 Actions act = new Actions(driver);
 act.moveToElement(element).perform();
 }
/**
 * This method will perform drag and drop action
 *
 * @param driver
 * @param src
 * @param dst
 */
public void dragAnddrop(WebDriver driver, WebElement src, WebElement
dst) {
 Actions act = new Actions(driver);
 act.dragAndDrop(src, dst).perform();
 }
/**
 * THis method will double click on element
 *
 * @param driver
 * @param element
 */
public void doubleClickAction(WebDriver driver, WebElement element) {
 Actions act = new Actions(driver);
 act.doubleClick(element).perform();
 }
/**
 * This method will double click on WebPage
 *
 * @param driver
 */
public void doubleClickAction(WebDriver driver) {
 Actions act = new Actions(driver);
 act.doubleClick().perform();
 }
/**
 * This method will perform right click on WebPage
 *
 * @param driver
 */
public void rightClick(WebDriver driver) {
 Actions act = new Actions(driver);
 act.contextClick().perform();
 }
/**
 * This method will perform right click on element
 *
 * @param driver
 * @param element
 */
public void rightClick(WebDriver driver, WebElement element) {
 Actions act = new Actions(driver);
 act.contextClick(element).perform();
 }
/**
 * This method will Press Enter Key
 *
 * @param driver
 */
public void enterKeyPress(WebDriver driver) {
 Actions act = new Actions(driver);
 act.sendKeys(Keys.ENTER).perform();
 }
/**
 * This method will Press Enter Key
 *
 * @param driver
 */
public void enterKey (WebDriver driver, int index) throws Throwable {
 Robot rb = new Robot();
 rb.keyPress(KeyEvent.VK_ENTER);
 }
/**
 * This method is used to release the key
 *
 * @param driver
 * @throws Throwable
 */
public void enterRelease(WebDriver driver, int index) throws Throwable {
 Robot rb = new Robot();
 rb.keyRelease(KeyEvent.VK_ENTER);
 }
/**
 * This method will switch the frame based on index
 *
 * @param driver
 * @param index
 */
public void switchToFrame(WebDriver driver, int index) {
 driver.switchTo().frame(index);
 }
/**
 * This method will switch the frame based on nameOrID
 *
 * @param driver
 * @param nameOrID
 */
public void switchToFrame(WebDriver driver, String nameOrID) {
 driver.switchTo().frame(nameOrID);
 }
/**
 * This method will switch the frame based on address
 *
 * @param driver
 * @param address
 */
public void switchToFrame(WebDriver driver, WebElement address) {
 driver.switchTo().frame(address);
 }
/**
 * This method is used to accept alert popup
 *
 * @param driver
 */
public void acceptAlert(WebDriver driver) {
 driver.switchTo().alert().accept();
 }
/**
 * This method is used to cancel alert popup
 *
 * @param driver
 */
public void cancelAlert(WebDriver driver) {
 driver.switchTo().alert().dismiss();
 }
/**
 * This method will switch between windows
 *
 * @param driver
 * @param partialTitle
 */
public void switchToWindow(WebDriver driver, String partialTitle) {
 // step1: use getWindowHandes to capture all window id's
 Set<String> windows = driver.getWindowHandles();
 // step2: iterate through the windows
 Iterator<String> it = windows.iterator();
 // step3: check whether there is next window
 while (it.hasNext()) {
 // step4: capture current window id
 String winId = it.next();
 // step5: switch to current window and capture title
 String currentWinTitle =
driver.switchTo().window(winId).getTitle();
 // step6: check whether current window is expected
 if (currentWinTitle.contains(partialTitle)) {
 break;
 }
 }
 }
/**
 * This method will take screenshot and store it in folder called as
screenshot
 *
 * @param driver
 * @param screenShotName
 * @return
 * @throws Throwable
 */
public void getScreenShot(WebDriver driver, String screenShotName)
throws Throwable {
 TakesScreenshot ts = (TakesScreenshot) driver;
 File src = ts.getScreenshotAs(OutputType.FILE);
 String path = ".\\screenshot\\" + screenShotName + ".png";
 File dst = new File(path);
 FileUtils.copyFile(src, dst);
 }
/**
 * This method will perform random scroll
 *
 * @param driver
 */
public void scrollBarAction(WebDriver driver) {
 JavascriptExecutor jse = (JavascriptExecutor) driver;
 jse.executeScript("window.scrollBy(0,800)", "");
 }
/**
 * This method will scroll until specified element is found
 *
 * @param driver
 * @param element
 */
public void scrollAction(WebDriver driver, WebElement element) {
 JavascriptExecutor jse = (JavascriptExecutor) driver;
 int y = element.getLocation().getY();
 jse.executeScript("window.scrollBy(0," + y + ")", element);
 // jse.executeScript("argument[0].scrollIntoView()", element);

} 
public void maximiseWindow(WebDriver driver) 
{
	driver.manage().window().maximize();
}

public WebDriver OpenBrowser(String Browser,WebDriver driver)
{  
	if(Browser.equalsIgnoreCase("chrome"))
	{driver=WebDriverManager.chromedriver().create();
		}
	else if(Browser.equalsIgnoreCase("firefox"))
	{driver=WebDriverManager.firefoxdriver().create();}
	else if(Browser.equalsIgnoreCase("edge"))
	{driver=WebDriverManager.edgedriver().create();}
	else {Reporter.log ("invalid browser");}
	
	return driver;
	
}


}
