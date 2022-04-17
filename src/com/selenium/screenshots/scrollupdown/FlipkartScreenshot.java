package com.selenium.screenshots.scrollupdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		WebElement text=driver.findElement(By.name("q"));
		text.sendKeys("iphone");
		WebElement search=driver.findElement(By.className("L0Z3Pu"));
		search.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("D:\\Testing Course\\ScreenShots\\iphone.png");
		org.openqa.selenium.io.FileHandler.copy(screenshotAs,file);
		
		
	}

}
