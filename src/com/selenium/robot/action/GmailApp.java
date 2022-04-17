package com.selenium.robot.action;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailApp {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/webhp");
	Robot ro = new Robot();
	WebElement e=driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a/svg"));
	e.click();
}
}