package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingTextFunction_X_Path {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
		
	}
}
