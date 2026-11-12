package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsWorking {
  @Test
  public void search() {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		//assert conditin home page titel
		//Assert.assertEquals(title, "Demo Web Shop");
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(title, "Demoo Web Shop");
		
		driver.findElement(By.name("q")).sendKeys("book");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		// assertion for ssearch 
		String text=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		obj.assertEquals(text, "Search");
		obj.assertAll();
  }
}
