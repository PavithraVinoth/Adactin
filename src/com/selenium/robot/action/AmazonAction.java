package com.selenium.robot.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		login.click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("pavithra@gmail.com");
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
        a.sendKeys("a");
        a.keyUp(Keys.CONTROL);
        a.build().perform();
        Thread.sleep(3000);
        a.keyDown(Keys.CONTROL);
        a.sendKeys("c");
        a.keyUp(Keys.CONTROL);
        a.build().perform();
        WebElement ctn = driver.findElement(By.id("continue"));
		ctn.click();
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.click();
        a.keyDown(Keys.CONTROL);
        a.sendKeys("v");
        a.keyUp(Keys.CONTROL);
        a.build().perform();
		
	}

}
