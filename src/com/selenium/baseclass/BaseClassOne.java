package com.selenium.baseclass;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClassOne {
	public static WebDriver driver;
	public static Actions ac;
	public static void browserLaunch(String browser) {
		if(browser=="chrome"||browser=="CHROME") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\UpdatedDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void sendData(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void javaScriptSetAttribute(String data,WebElement element) {
	JavascriptExecutor  js=(JavascriptExecutor )driver;
	js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
	}
	public static void getUserData(WebElement element) {
		String print = element.getAttribute("value");
		System.out.println(print);
	}
	public static void jsGetData(WebElement element) {
	JavascriptExecutor  js=(JavascriptExecutor )driver;	
    Object print = js.executeScript("return arguments[0].getAttribute('value')", element);
		System.out.println(print);
	}
	
	public static void mvToelmt(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	public static void doubleClick(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	public static void moveDown(WebElement element) {
		ac = new Actions(driver);
		ac.keyDown(element, Keys.ARROW_DOWN).perform();
	}
	public static void moveUp(WebElement element) {
		ac = new Actions(driver);
		ac.keyDown(element, Keys.ARROW_UP).perform();
	}
	public static void actClick(WebElement element) {
		ac = new Actions(driver);
		ac.click(element).perform();
	}
	public static void listClick() {
		ac.keyDown(Keys.CONTROL).click().perform();
	}
	public static void parentWindow(String parent) {
		driver.getWindowHandle();
		driver.switchTo().window(parent);
		}
	public static void childWindow() {
		Set<String> winHandles = driver.getWindowHandles();
		for(String wind:winHandles) {
			driver.switchTo().window(wind);
			}
	}
	public static void winCount() {
		Set<String> winHandles = driver.getWindowHandles();
		for(String wind:winHandles) {
			driver.switchTo().window(wind);
			}
		int count = driver.getWindowHandles().size();
		System.out.println(count);
	}

}
