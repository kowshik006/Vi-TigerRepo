package pomPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dws_Pages.DWS_HomePage;

public class DWS_SearchTest {
	@Test
	public void tc1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//create object of Home pge
		DWS_HomePage home=new DWS_HomePage(driver);
		home.enterSearchText("book");
		home.clickOnSearchButton();
		home.clickOnRegister();
		Thread.sleep(1500);
		driver.quit();
	}
}
