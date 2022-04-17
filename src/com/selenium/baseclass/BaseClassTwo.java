package com.selenium.baseclass;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassTwo {
	public static WebDriver driver;
	public static Select sel;
	public static Alert alert;
	public static void browserLaunch(String browser) {
		if(browser=="chrome"||browser=="CHROME") 
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\UpdatedDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			}  }
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void sendData(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void sndDataEnter(WebElement element,String data) {
		element.sendKeys(data+Keys.ENTER);
	}
	public static void frames(int count) {
		driver.switchTo().frame(count);
	}
	public static void frames(String value) {
		driver.switchTo().frame(value);
	}
	public static void frames() {
		driver.switchTo().parentFrame();
	}
	public static void selectValue(WebElement element, String value) {
		sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectValue(WebElement element, int id) {
		sel = new Select(element);
		sel.selectByIndex(id);
	}
	public static void selectText(WebElement element, String text) {
		sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void printOptions(WebElement element) {
		sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
	}
	public static void acceptAlert(WebElement element) throws InterruptedException {
		element.click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
	}
	public static void dismiss(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}
	public static void prompt(WebElement element,String send) throws InterruptedException {
		element.click();
		alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys(send);
		alert.accept();
	}
	
}

