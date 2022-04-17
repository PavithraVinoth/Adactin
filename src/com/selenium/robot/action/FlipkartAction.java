package com.selenium.robot.action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//WebElement login=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		WebElement elect = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div/div"));
		Actions ac = new Actions(driver);
		ac.moveToElement(elect).perform();
		/*WebElement game = driver.findElement(By.xpath("//a[text()='Gaming']"));
		ac.contextClick(game).build().perform();
		ac.keyDown(Keys.CONTROL).click().build().perform();
		//ac.contextClick(saree).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			}*/
		
		}
	}


