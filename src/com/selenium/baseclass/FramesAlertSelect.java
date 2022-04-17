package com.selenium.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesAlertSelect {
public static void main(String[] args) throws InterruptedException {
	BaseClassTwo.browserLaunch("CHROME");
	BaseClassTwo.urlLaunch("http://www.leafground.com/pages/Alert.html");
	BaseClassTwo.windowMaximize();
	WebElement normal = BaseClassTwo.driver.findElement(By.xpath("//button[text()='Alert Box']"));
	BaseClassTwo.acceptAlert(normal);
	WebElement confirm = BaseClassTwo.driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	BaseClassTwo.dismiss(confirm);
	WebElement prompt = BaseClassTwo.driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	BaseClassTwo.prompt(prompt, "Hello Everyone");
	BaseClassTwo.urlLaunch("http://www.leafground.com/pages/Dropdown.html");
	WebElement dd1 = BaseClassTwo.driver.findElement(By.xpath("//select[@id='dropdown1']"));
	BaseClassTwo.selectValue(dd1, 1);
	BaseClassTwo.printOptions(dd1);
	WebElement dd2 =BaseClassTwo.driver.findElement(By.name("dropdown2"));
	BaseClassTwo.selectText(dd2, "Loadrunner");
	BaseClassTwo.printOptions(dd2);
	BaseClassTwo.urlLaunch("http://www.leafground.com/pages/frame.html");
	BaseClassTwo.frames(0);
	WebElement f1= BaseClassTwo.driver.findElement(By.id("Click"));
	f1.click();
	BaseClassTwo.frames();
	BaseClassTwo.frames(1);
	BaseClassTwo.frames(0);
	WebElement f2= BaseClassTwo.driver.findElement(By.id("Click1"));
	f2.click();
}
}
