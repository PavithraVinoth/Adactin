package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableTagNorFor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\vinoth\\\\eclipse-workspace\\\\Selenium\\\\UpdatedDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> allData = driver.findElements(By.tagName("td"));
		for(int i=0;i<allData.size();i++) {
			System.out.println(allData.get(i).getText());
		}
}
}