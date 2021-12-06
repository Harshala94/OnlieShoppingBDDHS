package com.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Gaurav\\AutomationDemo\\OnlineShopBDDHS\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);
			System.out.println("Property File is Reffered from the base class");
		}
		
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
		
		public static void initialization() {
		
		String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Gaurav\\AutomationDemo\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Driver initiated");
		}
		
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Gaurav\\AutomationDemo\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox Driver initiated");
		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		System.out.println("Url is launched successfully");
		
		}
		
		
	}
