package pomPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dws_Pages.DWS_HomePage;
import dws_Pages.DWS_LoginPage;

public class DWS_LoginTest {
	@Test
	public void tc3() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//create object of Home pge
		DWS_HomePage home=new DWS_HomePage(driver);
		home.clickOnLogin();
		
		//create obj of login page
		DWS_LoginPage login=new DWS_LoginPage(driver);
		login.enterUserName("kowshik@111.gmail");
		login.enterPassword("4bw14me022");
		login.loginButton();
		
		Thread.sleep(1500);
		driver.quit();
	}
}
