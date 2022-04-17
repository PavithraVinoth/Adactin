package com.selenium.webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://adactinhotelapp.com/");
		dr.manage().window().maximize();
		WebElement username = dr.findElement(By.id("username"));
		WebElement pwd = dr.findElement(By.name("password"));
		username.sendKeys("Mohnish");
		pwd.sendKeys("123456");
	}
}
