package com.selenium.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BobCatBaseClass {
public static WebDriver driver;
public static void browserLaunch(String browser) {
	switch(browser) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\vinoth\\\\eclipse-workspace\\\\Selenium\\\\UpdatedDriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
	case "edge":
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\UpdatedDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		break;

	default:
		System.out.println("This browser is not valid");
		break;
	}
  }
public static void windowMaximize() {
	driver.manage().window().maximize();
}
public static void urlLaunch(String url) {
	driver.get(url);
}
public static void login(WebElement element) {
	element.click();
}

}
