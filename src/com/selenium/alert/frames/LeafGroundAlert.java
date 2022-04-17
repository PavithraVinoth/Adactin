package com.selenium.alert.frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAlert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	alert.dismiss();
	driver.findElement(By.xpath("(//button[starts-with(@onclick ,'c')])[1]")).click();
	Alert alert2 = driver.switchTo().alert();
	System.out.println(alert2.getText());
	Thread.sleep(3000);
	alert2.accept();
	driver.findElement(By.xpath("//button[@onclick='confirmPrompt()' or text() ='PromptBox']")).click();
	Alert alert3 = driver.switchTo().alert();
	System.out.println(alert3.getText());
    Thread.sleep(3000);
	alert3.accept();

}
}
