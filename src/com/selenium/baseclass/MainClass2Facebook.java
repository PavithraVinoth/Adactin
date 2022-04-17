package com.selenium.baseclass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass2Facebook {
public static void main(String[] args) throws AWTException {
	BaseClass.browserLaunch("chrome");
	BaseClass.urlLaunch("https://www.facebook.com/");
	BaseClass.windowMaximize();
	WebElement allow = BaseClass.driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
	BaseClass.buttonClick(allow);
	WebElement userName = BaseClass.driver.findElement(By.xpath("//input[@type='text']"));
	BaseClass.sendData(userName, "pavithra");
	BaseClass.roboCopy();
	WebElement passWord = BaseClass.driver.findElement(By.xpath("//input[@type='password']"));
	passWord.click();
	BaseClass.roboPaste();
}
}
