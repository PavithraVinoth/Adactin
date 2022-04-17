package com.selenium.baseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HotelAppMain {
public static void main(String[] args) {
	HotelAppBaseClass.browserLaunch("chrome");
	HotelAppBaseClass.urlLaunch("https://adactinhotelapp.com/index.php");
	HotelAppBaseClass.windowMaximize();
	WebElement userName=HotelAppBaseClass.driver.findElement(By.id("username"));
	WebElement passWord=HotelAppBaseClass.driver.findElement(By.name("password"));
	userName.sendKeys("pavithrat");
	passWord.sendKeys("Pavithra13");
	WebElement login=HotelAppBaseClass.driver.findElement(By.id("login"));
	login.sendKeys(Keys.RETURN);
	WebElement loc=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='location']"));
    HotelAppBaseClass.selectText(loc,"Paris");
    WebElement hotel=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='hotels']"));
    HotelAppBaseClass.selectValue(hotel, 2);
    WebElement room=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='room_type']"));
    HotelAppBaseClass.selectVal(room, "Double");
    WebElement roomNo=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='room_nos']"));
    HotelAppBaseClass.selectValue(roomNo, 3);
    WebElement checkIn=HotelAppBaseClass.driver.findElement(By.name("datepick_in"));
	WebElement checkOut=HotelAppBaseClass.driver.findElement(By.name("datepick_out"));
	checkIn.sendKeys("20/03/2022");
	checkOut.sendKeys("22/03/2022");
	WebElement adult=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='adult_room']"));
    HotelAppBaseClass.selectValue(adult, 2);
	WebElement child=HotelAppBaseClass.driver.findElement(By.xpath("//select[@name='child_room']"));
    HotelAppBaseClass.selectValue(child, 1);
    WebElement search=HotelAppBaseClass.driver.findElement(By.name("Submit"));
    search.click();
    WebElement radio=HotelAppBaseClass.driver.findElement(By.name("radiobutton_0"));
    radio.click();
    WebElement conti=HotelAppBaseClass.driver.findElement(By.name("continue"));
    conti.click();
    WebElement firstName=HotelAppBaseClass.driver.findElement(By.name("first_name"));
    firstName.sendKeys("Pavithra");
    WebElement lastName=HotelAppBaseClass.driver.findElement(By.name("last_name"));
    lastName.sendKeys("Thangavelu");
    WebElement address=HotelAppBaseClass.driver.findElement(By.name("address"));
    address.sendKeys("Coimbatore");
    WebElement cc=HotelAppBaseClass.driver.findElement(By.name("cc_num"));
    cc.sendKeys("6785433425768945");
    WebElement cardType=HotelAppBaseClass.driver.findElement(By.id("cc_type"));
    HotelAppBaseClass.selectValue(cardType, 2);
    WebElement selectMonth=HotelAppBaseClass.driver.findElement(By.id("cc_exp_month"));
    HotelAppBaseClass.selectValue(selectMonth, 3);
    WebElement selectYear=HotelAppBaseClass.driver.findElement(By.id("cc_exp_year"));
    HotelAppBaseClass.selectValue(selectYear, 3);
    WebElement cvv=HotelAppBaseClass.driver.findElement(By.name("cc_cvv"));
    cvv.sendKeys("123");
    WebElement book=HotelAppBaseClass.driver.findElement(By.name("book_now"));
    book.click();
    List<WebElement> details=HotelAppBaseClass.driver.findElements(By.xpath("//input[@type='text']"));
    for(int i=0;i<details.size();i++) {
    	System.out.println(details.get(i).getAttribute("value"));
    }
    WebElement place=HotelAppBaseClass.driver.findElement(By.tagName("textarea"));
    System.out.println(place.getAttribute("value"));
    HotelAppBaseClass.driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
    WebElement orderNo=HotelAppBaseClass.driver.findElement(By.name("order_no"));
    HotelAppBaseClass.jsGetData(orderNo);
   
    
    
}
}
