package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import TestBase.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.SearchPage;

public class AddToCartStepDefinitions extends BaseClass{
	
	LoginPage lp;
	SearchPage sp;
	AddToCartPage ap;

	public AddToCartStepDefinitions() throws IOException {
		super();
	}
	
//	@Before
//	public void setUp() throws IOException {
//		initialization();
//		lp=new LoginPage();
//		sp=new SearchPage();
//		ap= new AddToCartPage();
//	}
	
//	@After
//	public void tearDown() {
//		driver.quit();
//	}

	@Given("^user is on home page and logged in$")
	public void user_is_on_home_page_and_logged_in() throws IOException {
		initialization();
		lp=new LoginPage();
		sp=new SearchPage();
		ap= new AddToCartPage();
		lp.login();
	}

	@When("^user search for \"([^\\\"]*)\"$")
	public void user_search_for_product(String ProductName) {
		sp.search(ProductName);
	}

	@Then("^user adds product to the cart$")
	public void user_adds_product_to_the_cart() {
		ap.addToCart();
	}

	@Then("^verify the product in the cart$")
	public void verify_the_product_in_the_cart(){
		ap.verifyProductInCart();
		Assert.assertTrue(ap.phillipsTrimmer.isDisplayed());
	}
	
	
	

}
