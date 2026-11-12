package dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_HomePage {
   //create constrctor with driver arg
	public DWS_HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//locate webelement by @findBy
	//search textfiled;
	@FindBy(name="q")
	WebElement searctText;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement searchButton;
	
	@FindBy(linkText = "Register")
	WebElement reg;
	
	@FindBy(linkText = "Log in")
	WebElement login;
	//actions or methods of web element
	public void enterSearchText(String value) {
		searctText.sendKeys(value);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public void clickOnRegister() {
		reg.click();
	}
	public void clickOnLogin() {
		login.click();
	}
	
}
