package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement userId=driver.findElement(By.xpath("//input[@type='text']"));
	userId.sendKeys("Pavithra");
	WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
	passWord.sendKeys("12345");
}
}
