package com.selenium.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
    public static TakesScreenshot takeScreenShot;
    public static File files;
    public static Robot ro;
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
	public static void clearData(WebElement clearData) {
		clearData.clear();
	}

	public static void buttonClick(WebElement element) {
		element.click();

	}
	public static void sendData(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public static void submitMethod(WebElement element) {
		element.submit();
	}
	public static void takeScreenShots() throws IOException {
		takeScreenShot=(TakesScreenshot)driver;
		files=takeScreenShot.getScreenshotAs(OutputType.FILE);
		File f=new File("D:\\Testing Course\\ScreenShots\\facebook1.png");
		org.openqa.selenium.io.FileHandler.copy(files,f);
	}
	public static void roboEnter() throws AWTException {
		ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void roboCopy() throws AWTException {
		ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_C);
	}
	public static void roboPaste() throws AWTException {
		ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
	}
}
