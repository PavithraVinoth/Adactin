package com.selenium.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone X"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone X, US Version, 64GB, Space Gray - Fully Unlocked (Renewed)'])[1]")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
				driver.switchTo().window(string);
		}
		driver.findElement(By.id("add-to-cart-button")).click();
			
	}

}

