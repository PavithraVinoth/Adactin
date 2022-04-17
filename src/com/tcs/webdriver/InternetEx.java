package com.tcs.webdriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetEx {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
}
}
