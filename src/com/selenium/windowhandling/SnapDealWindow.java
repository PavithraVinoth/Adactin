package com.selenium.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7"+Keys.ENTER);
		/*WebElement e=driver.findElement(By.xpath("//*[@id='content_wrapper']/div[7]/div[5]/div[3]/div[2]/div/div[2]/input"));
		e.sendKeys("641305");
		WebElement c=driver.findElement(By.xpath("(//button[@class='pincode-check'])[3]"));
		c.click();*/
		driver.findElement(By.xpath("(//p[@class='product-title'])[1]")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if(!windowHandle.equals(string)) {
				driver.switchTo().window(string);
				driver.findElement(By.xpath("(//span[@class='intialtext'])[3]")).click();
				
			}
	}
	}

}
