package com.selenium.screenshots.scrollupdown;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement text=driver.findElement(By.id("inputValEnter"));
	text.sendKeys("HP Laptop");
	WebElement search=driver.findElement(By.className("searchTextSpan"));
	search.click();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
	File file=new File("D:\\Testing Course\\ScreenShots\\laptop.png");
	org.openqa.selenium.io.FileHandler.copy(screenshotAs,file);
	
}
}
