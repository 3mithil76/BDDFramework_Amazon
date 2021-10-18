package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(className="nav-line-1-container")
	WebElement Hellosignin;
	
	@FindBy(linkText="Sign in")
	WebElement signinButton1;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(id="signInSubmit")
	WebElement signinButton2;
	
	public LoginPage() throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login() {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(Hellosignin).build().perform();
		signinButton1.click();
		email.sendKeys(prop.getProperty("username"));
		continueButton.click();
		password.sendKeys(prop.getProperty("password"));
		signinButton2.click();
	}
	
	
}
