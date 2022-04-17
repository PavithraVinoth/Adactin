package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.id("src"));
	WebElement to = driver.findElement(By.id("dest"));
	from.sendKeys("Coimbatore");
	to.sendKeys("Mettupalayam");
}
}