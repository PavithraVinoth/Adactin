package com.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepeatedText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> text = driver.findElements(By.xpath("//*[contains(text(),'Orange')]"));
		WebElement webElement = text.get(1);
		String webPage = webElement.getText();
		System.out.println(webPage);
		for (int i = 0; i < text.size(); i++) {         //To get Multiple Index
			String text2 = text.get(i).getText();
			System.out.println(text2);
		}

}
}