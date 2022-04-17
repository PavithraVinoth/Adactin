package com.tcs.webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
}
}
