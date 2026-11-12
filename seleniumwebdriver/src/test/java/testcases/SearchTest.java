package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTest {
	@Test
	public void searchtestcase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("application launched ");
		driver.findElement(By.name("q")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Reporter.log("Search test case completed");
		
	}
}
