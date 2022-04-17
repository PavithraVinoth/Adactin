package com.selenium.alert.frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement normalAlert=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		normalAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement alert=driver.findElement(By.xpath("//a[@href=\'#CancelTab\']"));
		alert.click();
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@onclick=\'confirmbox()\']"));
		confirmAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		confirmAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		WebElement alert2=driver.findElement(By.xpath("//a[@href=\'#Textbox\']"));
		alert2.click();
		WebElement promptAlert=driver.findElement(By.xpath("//button[@onclick=\'promptbox()\']"));
		promptAlert.click();
		Thread.sleep(2000);
		/*driver.switchTo().alert().dismiss();
		Thread.sleep(2000);*/
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
	}

}
