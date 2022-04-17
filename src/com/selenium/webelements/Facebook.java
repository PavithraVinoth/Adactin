package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.name("email"));
	WebElement passWord = driver.findElement(By.id("pass"));
	userName.sendKeys("Pavithra");
	passWord.sendKeys("pavithra123");
	String s1=userName.getAttribute("value");
	String s2=passWord.getAttribute("value");
	
}
}
