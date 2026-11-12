package pomPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dws_Pages.DWS_HomePage;
import dws_Pages.DWS_RegisterPage;

public class DWS_RegTest {
	@Test
	public void tc2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//create object of Home pge
		DWS_HomePage home=new DWS_HomePage(driver);
		home.clickOnRegister();
		
		//create obj of RegPage
		DWS_RegisterPage reg=new DWS_RegisterPage(driver);
		reg.clickGender();
		reg.firstName("kowshik");
		reg.lastName("gowda");
		reg.email("abc@1230");
		reg.password("4bw14me022");
		reg.confirmPassword("4bw14me022");
		reg.clickReg();
		Thread.sleep(1500);
		driver.quit();
	}
}
