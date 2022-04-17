package com.tcs.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Class<? extends WebDriver> class1 = driver.getClass();
		System.out.println(class1);
	    driver.navigate().to("http://www.leafground.com/");
	    driver.manage().window().maximize();
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.get("http://www.leafground.com/pages/Window.html");
	    driver.manage().window().maximize();
	    WebElement buttonElement=driver.findElement
	    		(By.xpath("//button[text()='Open Multiple Windows']"));
	    buttonElement.click();
	    Thread.sleep(3000);
	    driver.close();
	    driver.quit();
		
	}
}
