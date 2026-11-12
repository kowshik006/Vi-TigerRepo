package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRegisterScenario {
	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		//click on register 
		driver.findElement(By.linkText("Register")).click();
		//enter details
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("kowshik");
		Thread.sleep(1500);
		driver.findElement(By.name("LastName")).sendKeys("gowda T S");
		Thread.sleep(1500);
		driver.findElement(By.id("Email")).sendKeys("k006@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("4bw14me022");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("4bw14me022");
		Thread.sleep(1500);
		//click on register
		driver.findElement(By.id("register-button")).submit();
		Thread.sleep(1500);
		//close the browser
		driver.quit();
	}
}
