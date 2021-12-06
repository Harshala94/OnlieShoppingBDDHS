package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.TestBase;
import com.util.TestUtil;

public class MyStorePage extends TestBase{
	
			public String validateMyStorePageTitle() {
				return driver.getTitle();
			}
			
			public SummerDressesPage HoveronWomen() throws InterruptedException {
				
				//Hover on Womens section
				WebElement myElement = driver.findElement(By.xpath("//a[@title=\"Women\"]"));
				TestUtil.hoverElement.moveToElement(myElement).build().perform();
				Thread.sleep(5000);
				System.out.println("Hover is successful");
				return new SummerDressesPage();
				
			}
			
}
