package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		
		String text=driver.findElement(By.id("small-searchterms")).getText();
		String name=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
		System.out.println(text);
		
	   System.out.println(driver.findElement(By.xpath("//a[@class='ico-register']")).getText());
	   System.out.println(driver.findElement(By.xpath("//a[@class='ico-register']")).getAttribute("value"));
		
		
		
		
		
		
//		if(driver.findElement(By.id("small-searchterms")).isDisplayed()) {
//			driver.findElement(By.id("small-searchterms")).sendKeys("book");
//		}
//		if(driver.findElement(By.xpath("//input[@type='submit']")).isEnabled()) {
//			//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		}
		
		
	}
}
