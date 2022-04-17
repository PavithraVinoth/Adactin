package com.selenium.baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClassFacebook {
	public static void main(String[] args) throws IOException {
		BaseClass.browserLaunch("chrome");
		BaseClass.urlLaunch("https://www.facebook.com/");
		BaseClass.windowMaximize();
		WebElement userName = BaseClass.driver.findElement(By.xpath("//input[@type='text']"));
		WebElement passWord = BaseClass.driver.findElement(By.xpath("//input[@type='password']"));
		BaseClass.sendData(userName, "pavithra");
		BaseClass.sendData(passWord, "12345");
		WebElement allow = BaseClass.driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
		BaseClass.buttonClick(allow);
		WebElement buttonEvent = BaseClass.driver.findElement(By.xpath("//button[text()='Log In']"));
		BaseClass.buttonClick(buttonEvent);
		BaseClass.takeScreenShots();
		
		
	}
	}

