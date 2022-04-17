package com.selenium.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("pavithratcse@gmail.com");
		WebElement cont=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		cont.click();
	}

}
