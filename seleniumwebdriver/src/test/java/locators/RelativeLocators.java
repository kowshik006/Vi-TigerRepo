package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("book");
		
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
	    
		//above and below
		driver.findElement(RelativeLocator.with(By.name("pollanswers-1")).above(By.id("pollanswers-1"))).click();
	
	}
}
