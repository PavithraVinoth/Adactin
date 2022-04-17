package com.selenium.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelAppBaseClass {
	public static WebDriver driver;
	public static Select s;
	public static void browserLaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\UpdatedDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\UpdatedDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("This browser is not valid");
			break;
		}

	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void browserClose() {
		driver.close();
	}
	public static void sendData(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void login(WebElement element) {
		element.click();
	}
	public static void selectText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void selectValue(WebElement element,int id) {
		s=new Select(element);
		s.selectByIndex(id);
	}
	public static void selectVal(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	public static void jsGetData(WebElement element) {
		JavascriptExecutor  js=(JavascriptExecutor )driver;	
	    Object print = js.executeScript("return arguments[0].getAttribute('value')", element);
			System.out.println(print);
		}
	
	}

