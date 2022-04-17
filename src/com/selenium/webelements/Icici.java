package com.selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("DUMMY1"));
		user.click();
		WebElement userName = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		userName.sendKeys("Pavi");
		WebElement pass = driver.findElement(By.className("login-input-password"));
		pass.sendKeys("67879");

	}
}