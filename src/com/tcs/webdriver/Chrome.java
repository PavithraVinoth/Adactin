package com.tcs.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://gmail.com/");
	driver.manage().window().maximize();
	
	
}
	
}

