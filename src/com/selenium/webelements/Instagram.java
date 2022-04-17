package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	driver.manage().window().maximize();
	WebElement phone = driver.findElement(By.name("username"));
	phone.sendKeys("983478374");
	WebElement passWord=driver.findElement(By.name("password"));
	passWord.sendKeys("faefeaf");
}

}