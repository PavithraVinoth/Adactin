package com.selenium.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HotelAppJava {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
}
}
