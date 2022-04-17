package com.selenium.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegistration {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.manage().window().maximize();
	WebElement firstName=driver.findElement(By.name("firstName"));
	firstName.sendKeys("Pavithra");
	String fname=firstName.getAttribute("value");
	System.out.println(fname);
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Thangavelu");
	String lname=lastName.getAttribute("value");
	System.out.println(lname);
	WebElement userName=driver.findElement(By.name("Username"));
	userName.sendKeys("pavithrathangavelu6");
	String uname=userName.getAttribute("value");
	System.out.println(uname);
	WebElement pwd=driver.findElement(By.name("Passwd"));
	pwd.sendKeys("123456");
	String p=pwd.getAttribute("value");
	System.out.println(p);
	WebElement ConPwd=driver.findElement(By.name("ConfirmPasswd"));
	ConPwd.sendKeys("123456");
	String cp=ConPwd.getAttribute("value");
	System.out.println(cp);
	
}
}
