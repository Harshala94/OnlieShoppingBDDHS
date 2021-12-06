package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.base.TestBase;

public class TestUtil extends TestBase {
	
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static Actions hoverElement = new Actions(driver);
	public static long PAGE_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

}
