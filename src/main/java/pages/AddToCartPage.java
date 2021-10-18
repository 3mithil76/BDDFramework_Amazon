package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class AddToCartPage extends BaseClass {
	
	@FindBy(xpath="//div[@data-asin='B07DCJT7C9'][1]")
	public WebElement phillipsTrimmer ;
	
	@FindBy (id="addToCart_feature_div")
	WebElement addToCartButton;
	
	@FindBy (id="nav-cart")
	WebElement CartButton;
	
	
	public AddToCartPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() {
		phillipsTrimmer.click();
		addToCartButton.click();
	}
	
	public void verifyProductInCart() {
		CartButton.click();
	}

}
