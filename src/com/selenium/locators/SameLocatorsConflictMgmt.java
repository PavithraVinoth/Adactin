package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameLocatorsConflictMgmt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstName.sendKeys("Pavithra");
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastName.sendKeys("Thangavelu");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("Mettupalayam");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("pavithra@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("987654321");
		WebElement passWord = driver.findElement(By.id("firstpassword"));
		passWord.sendKeys("12345");
		WebElement ConformPassWord = driver.findElement(By.id("secondpassword"));
		ConformPassWord.sendKeys("12345");
	}
}
