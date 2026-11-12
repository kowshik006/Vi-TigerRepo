package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTest {
	@Test
	public void subscribetest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched ");
		driver.findElement(By.name("NewsletterEmail")).sendKeys("demo@123");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
		Reporter.log("subscribe test case");
	}
}
