package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver sd=new EdgeDriver();
	sd.get("https://www.snapdeal.com/login");
	sd.manage().window().maximize();
	WebElement email=sd.findElement(By.name("username"));
	email.sendKeys("pavithratcse@gmail.com");
}
}
