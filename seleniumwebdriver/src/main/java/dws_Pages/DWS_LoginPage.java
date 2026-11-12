package dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
   public DWS_LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
   @FindBy(id="Email")
   WebElement userName;
   
   @FindBy(name="Password")
   WebElement password;
   @FindBy(xpath = "(//input[@type='submit'])[2]")
   WebElement loginButton;
   
   public void enterUserName(String userName1) {
	userName.sendKeys(userName1);
   }
   public void enterPassword(String pass) {
	   password.sendKeys("abc");
   }
   public void loginButton() {
	loginButton.click();
}
}
