package StepDefinitions;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.MyStorePage;
import com.pages.OrderPage;
import com.pages.SummerDressesPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class verifyAuthenticationPageStep extends TestBase{
	
	MyStorePage mystorepage=new MyStorePage();
	SummerDressesPage summerdressespage;
	OrderPage orderpage;

	public verifyAuthenticationPageStep() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
	}

	@Test(priority=0)
	@Given("user is on OnlineShoppingSite")
		public void MyStorePageTitle() {
		System.out.println("Given is being Run");
		String title= mystorepage.validateMyStorePageTitle();
		System.out.println("Page Title is : "+title);
		Assert.assertEquals(title, "My Store");
		}
	
	@Test(priority=1)
	@When("user added the Item in cart")
	public void HoverOnWomen() throws InterruptedException {
		System.out.println("When is being Run");
		summerdressespage = mystorepage.HoveronWomen();
		System.out.println("After When");
		orderpage = summerdressespage.AddItemToCart();
		}
		
	@Test(priority=2)	
	@Then("verify user is on Authentication page")
	public void AuthenticationPage() throws InterruptedException {
		String authpage = orderpage.AuthenticationPage();
	}
	
	@AfterTest
	public void teardown() {
	driver.quit();
	}
	

}
