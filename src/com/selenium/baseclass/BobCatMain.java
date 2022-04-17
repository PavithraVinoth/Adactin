package com.selenium.baseclass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BobCatMain {
public static void main(String[] args) {
	BobCatBaseClass.browserLaunch("chrome");
	BobCatBaseClass.urlLaunch("https://www.bobcat.com/in/en/index");
	BobCatBaseClass.windowMaximize();
	WebElement close=BobCatBaseClass.driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']"));
	close.click();
	/*List<WebElement> compact=BobCatBaseClass.driver.findElements(By.xpath("//a[@class='text-uppercase text-center has-sub dtm-pro-grp-txt-name']"));
    Map<WebElement,WebElement> weight=new HashMap<WebElement, WebElement>();
    for (WebElement s : compact) {
		
	}*/
	WebElement backHoe=BobCatBaseClass.driver.findElement(By.xpath("//a[@class='text-uppercase text-center has-sub dtm-pro-grp-txt-name']"));
	backHoe.click();
	List<WebElement>backHoeText=BobCatBaseClass.driver.findElements(By.xpath("//*[text()='Bobcat B900 CEV Stage IV Backhoe Loader']"));
	for (WebElement b : backHoeText) {
		System.out.println(b.getAttribute("value"));
		//System.out.println(b.getText());
		
	}
}

}
