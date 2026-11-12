package dws_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_RegisterPage {
  public DWS_RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
  @FindBy(id="gender-male")
  WebElement gender;
  
  @FindBy(name="FirstName")
  WebElement firstname;
  
  @FindBy(id="LastName")
  WebElement lastName;
  
  @FindBy(id="Email")
  WebElement email;
  @FindBy(id="Password")
  WebElement password;
  
  @FindBy(id="ConfirmPassword")
  WebElement confirm;
  @FindBy(name="register-button")
  WebElement regButton;
  public void clickGender() {
	  gender.click();
  }
  public  void firstName(String name) {
	  firstname.sendKeys(name);
  }
  public  void lastName(String name) {
	  lastName.sendKeys(name);
  }
  public  void email(String value) {
	  email.sendKeys(value);
  }
  public  void password(String pass) {
	  password.sendKeys(pass);
  }
  public  void confirmPassword(String pass) {
	  confirm.sendKeys(pass);
  }
  public void clickReg() {
	  regButton.click();
  }
}
