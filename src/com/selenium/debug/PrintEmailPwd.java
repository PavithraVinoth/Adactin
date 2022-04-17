package com.selenium.debug;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintEmailPwd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Pavithra");
		String name=text.getAttribute("value");
		System.out.println(name);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("12345");
		String pass=pwd.getAttribute("value");
		System.out.println(pass);
	}

}
