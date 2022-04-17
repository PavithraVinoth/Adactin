package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartJava {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	js.executeScript("arguments[0].setAttribute('value','pavithra@gmail.com')",email);
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].setAttribute('value','12345')",pwd);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	js.executeScript("arguments[0].click()", login);
}
}
