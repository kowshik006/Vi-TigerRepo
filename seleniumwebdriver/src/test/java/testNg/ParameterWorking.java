package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterWorking {
	@Parameters({"url","search"})
	@Test
	public void search(String url,String search) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1500);
		driver.close();
	}
	
	
	

//  int sum;
//  @Test
//  @Parameters({"num1","num2"})
//  public void add(int a,int b) {
//	  sum=a+b;
//	  System.out.println("sum of 2 num is: "+sum);
//  }
}
