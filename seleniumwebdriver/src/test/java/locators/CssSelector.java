package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("computers");
		driver.findElement(By.cssSelector("#small-searchterms:nth-of-type(1)")).sendKeys("mobiles");
	    driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
	}
}
