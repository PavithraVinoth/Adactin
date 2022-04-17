package com.tcs.webdriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\vinoth\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://redbus.com");
		driver.manage().window().maximize();
		
	}

}
