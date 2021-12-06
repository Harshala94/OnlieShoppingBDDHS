package com.pages;

import org.openqa.selenium.By;

import com.base.TestBase;

public class OrderPage extends TestBase{
	
	public String validateOrderPageTitle() {
		return driver.getTitle();
	}
	
	public String AuthenticationPage() throws InterruptedException {

	
	//Verify user is on Authentication Page
	String pageName= driver.findElement(By.xpath("//div[@class=\"center_column col-xs-12 col-sm-12\"]/h1[text()='Authentication']")).getText();
	System.out.println(pageName);
	if(pageName.equalsIgnoreCase("AUTHENTICATION")) {
		System.out.println("User is on Authentication Page");
	}
	else {
		System.out.println("Incorrect Page Opened");
		 }
	return pageName;
}
}
