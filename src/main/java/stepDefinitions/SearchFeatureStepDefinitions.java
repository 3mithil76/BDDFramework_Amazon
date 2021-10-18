package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.ScrollPaneLayout;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.SendKeysAction;

import TestBase.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.SearchPage;


public class SearchFeatureStepDefinitions extends BaseClass{
	
	public SearchFeatureStepDefinitions() throws IOException {
		super();
		initialization();
	}
	public LoginPage lp;
	public SearchPage sp;
	
	@Given("^user is logged in$")
	public void user_is_logged_in() throws IOException{
		
	lp = new LoginPage();
	sp =  new SearchPage();


	   lp.login();
	}

	@When("^user searches for the \"([^\"]*)\"$")
	public void user_searches_for_the_product(String arg1) throws IOException{
		sp.search(arg1);
	}

	@Then("^search results related to \"([^\"]*)\" should be displayed$")
	public void search_results_related_to_product_should_be_displayed(String arg1){	
		String title= driver.getTitle();
		Assert.assertEquals("Amazon.ca : "+arg1,title);
		System.out.println(title);
		//driver.close();
	}

	@When("^user selects specific \"([^\"]*)\" from dropdown$")
	public void user_selects_specific_department_from_dropdown(String arg1) throws IOException, InterruptedException{
		//sp = new SearchPage();
		System.out.println(arg1);
		Thread.sleep(5000);
		sp.selectDepartment(arg1);
		Thread.sleep(3000);
		
	}

	@Then("^verify that specific \"([^\"]*)\" is selected$")
	public void verify_that_specific_department_is_selected(String arg1){

	}
	
//	@When("^user searches for the product$")
//	public void user_searches_for_the_product(DataTable productName){
//		
//		List<List<String>> a = productName.raw();
//		sp.search(a.get(0).get(0));	   
//	}
//
//	@Then("^search results related to product should be displayed$")
//	public void search_results_related_to_product_should_be_displayed(DataTable productName){
//		List <List<String>> a = productName.raw();
//		String title= driver.getTitle();
//		Assert.assertEquals("Amazon.ca : "+a.get(0).get(0),title);
//		System.out.println(title);
//		//driver.close();
//	    
//	}

	@When("^user searches for the product and search results related to product should be displayed$")
	public void user_searches_for_the_product(DataTable productName){
		
		for(Map<String, String> data : productName.asMaps(String.class, String.class)){
			sp.search(data.get("productName"));	
			String title= driver.getTitle();
			Assert.assertEquals("Amazon.ca : "+data.get("productName"),title);
			System.out.println(title);
			
		}
	}

	
	@Then("^User close the browser$")
	public void User_close_the_browser() {
		
		driver.close();
	}

}
