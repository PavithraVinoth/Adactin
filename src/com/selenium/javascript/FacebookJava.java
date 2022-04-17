package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookJava {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement email = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','pavithra@gmail.com')", email);
	WebElement pass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','12345')", pass);
	WebElement login = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()", login);
	
}
}
