package com.selenium.robot.action;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vinoth\\\\eclipse-workspace\\\\Selenium\\\\UpdatedDriver\\\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement women = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(women).perform();
	WebElement saree = driver.findElement(By.xpath("(//span[@class='linkTest'])[40]"));
	ac.contextClick(saree).build().perform();
	ac.keyDown(Keys.CONTROL).click().build().perform();
	//ac.contextClick(saree).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		driver.switchTo().window(string);
		}
	}
}
