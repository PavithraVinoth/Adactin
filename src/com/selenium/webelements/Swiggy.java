package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Swiggy {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	WebElement location = driver.findElement(By.id("location"));
	location.sendKeys("Rs Puram");
}
}
