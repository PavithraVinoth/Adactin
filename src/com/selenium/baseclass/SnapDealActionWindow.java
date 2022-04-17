package com.selenium.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnapDealActionWindow {
public static void main(String[] args) throws InterruptedException {
	BaseClassOne.browserLaunch("CHROME");
	BaseClassOne.urlLaunch("https://www.snapdeal.com/");
	BaseClassOne.windowMaximize();
	WebElement women = BaseClassOne.driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
	BaseClassOne.mvToelmt(women);
	WebElement kurtha = BaseClassOne.driver.findElement(By.xpath("(//span[@class='linkTest'])[41]"));
	BaseClassOne.doubleClick(kurtha);
	Thread.sleep(2000);
	BaseClassOne.driver.navigate().back();
	WebElement womens = BaseClassOne.driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
	BaseClassOne.mvToelmt(womens);
	WebElement saree = BaseClassOne.driver.findElement(By.xpath("(//span[@class='linkTest'])[40]"));
	BaseClassOne.rightClick(saree);
	BaseClassOne.listClick();
	BaseClassOne.childWindow();
	BaseClassOne.winCount();
	
}
}
