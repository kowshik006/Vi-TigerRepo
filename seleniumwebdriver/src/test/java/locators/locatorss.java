package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	//driver.findElement(By.name("q")).sendKeys("book");
		//WebElement search = driver.findElement(By.name("q"));
//		WebElement search = driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("books");
		
		//by class name
		driver.findElement(By.className("search-box-text")).sendKeys("mobiles");
		
		//linkText-->click on register
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Log in")).click();
		
		//partial link text-->click on shopping cart
		//driver.findElement(By.partialLinkText("Shopping")).click();
		//b/w the word
		//driver.findElement(By.partialLinkText("hoppi")).click();
		
	}
}
