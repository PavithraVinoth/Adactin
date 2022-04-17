package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSqaJava {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement testimonial = driver.findElement(By.className("testimonials__heading"));
	js.executeScript("arguments[0].scrollIntoView(true);", testimonial);
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false);", testimonial);
	
}
}
