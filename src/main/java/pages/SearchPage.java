package pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.BaseClass;

public class SearchPage extends BaseClass {

	@FindBy (id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy (id="nav-search-dropdown-card")
	WebElement dropdownCard;
	
	@FindBy (id="searchDropdownBox")
	WebElement searchDropDown;
	
	@FindBy (id="nav-search-submit-button")
	WebElement searchButton;
	
	public SearchPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String productName) {
		searchBox.sendKeys(productName);
		searchButton.click();
	}
	
	public void selectDepartment(String productName){
		dropdownCard.click();
		Select s= new Select(searchDropDown);
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);","Books");
		//s.selectByValue(productName);
		s.selectByVisibleText(productName);
		
	}
}
