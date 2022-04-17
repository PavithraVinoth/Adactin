package com.selenium.alert.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SprintAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sprint.com/en/login.html");
	driver.manage().window().maximize();
	WebElement alert=driver.findElement(By.xpath("//*[@id='loginHeaderButton']"));
	alert.click();
	Thread.sleep(10000);
}
}
