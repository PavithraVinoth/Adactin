package com.selenium.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JsFlipkart {
public static void main(String[] args) {
	BaseClassOne.browserLaunch("CHROME");
	BaseClassOne.urlLaunch("https://www.flipkart.com/");
	BaseClassOne.windowMaximize();
	WebElement userName = BaseClassOne.driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	BaseClassOne.javaScriptSetAttribute("pavithra",userName);
	WebElement passWord = BaseClassOne.driver.findElement(By.xpath("//input[@type='password']"));
	BaseClassOne.javaScriptSetAttribute("12345",passWord);
	BaseClassOne.getUserData(userName);
	BaseClassOne.getUserData(passWord);
	BaseClassOne.jsGetData(userName);
	BaseClassOne.jsGetData(passWord);
	
}
}
