package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMetods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(By.id("small-searchterms")).sendKeys("book");
		Thread.sleep(1500);
		driver.findElement(By.id("small-searchterms")).clear();
		Thread.sleep(1500);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		String msg=driver.findElement(By.id("small-searchterms")).getText();
		System.out.println(msg);
		
	}
}
