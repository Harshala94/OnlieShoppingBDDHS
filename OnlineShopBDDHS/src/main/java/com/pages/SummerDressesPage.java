package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.TestBase;
import com.util.TestUtil;

public class SummerDressesPage extends TestBase {
	
	public String validateSummerDressesPageTitle() {
		return driver.getTitle();
	}
	
	public OrderPage AddItemToCart() throws InterruptedException {
		
		//Click on Summer Dress
		driver.findElement(By.xpath("//a[@title=\"Women\"]/parent::li/ul/li[2]/ul/li[3]/a[@title=\"Summer Dresses\"]")).click();;
		System.out.println("Clicked On Summer Dresses");
		Thread.sleep(8000);
				
		//Scroll to view the element
		WebElement dress30dollars = driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/6/16-home_default.jpg\"]"));
		TestUtil.js.executeScript("arguments[0].scrollIntoView();",dress30dollars);
				
		//Hover on Item to be added to Cart
		TestUtil.hoverElement.moveToElement(dress30dollars).build().perform();
		System.out.println("Hover on 30 Dollar dress succesful & Product added to the cart");
		Thread.sleep(8000);
				
		//Add Printed Summer Dress Item to Cart
		driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/6/16-home_default.jpg\"]/../../../following-sibling::div/div[2]/a/span[text()='Add to cart']")).click();
		Thread.sleep(8000);
				
		//Proceed to Checkout
		driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();
		Thread.sleep(4000);
				
		//Scroll to view the element
		WebElement checkoutbtn = driver.findElement(By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]"));
		TestUtil.js.executeScript("arguments[0].scrollIntoView();",checkoutbtn);
		Thread.sleep(2000);
		
		//Proceed to Cart
		checkoutbtn.click();
		Thread.sleep(4000);
				
		return new OrderPage();
		
	}

}
