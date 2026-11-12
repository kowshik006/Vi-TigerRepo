package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebLaunchConfigure {
	WebDriver driver;
	@BeforeTest
	public void launchAppn() {
		//launch appn
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("excution of before test completed");
	}
	@AfterTest
	public void closeAppn() {
		driver.quit();
		System.out.println("aftertest completed");
	}
	@Test
	public void search() {
		driver.findElement(By.name("q")).sendKeys("book");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("excution of search  testcase is completed");
	}
	@Test
	public void subscribe() {
		System.out.println("subscribe");
	}
}
