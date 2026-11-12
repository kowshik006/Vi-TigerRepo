package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_Relative {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		//x-path on register
		//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		//x-path on radio button on excellent or good or poor
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		//x-path on vote button
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	}
}
