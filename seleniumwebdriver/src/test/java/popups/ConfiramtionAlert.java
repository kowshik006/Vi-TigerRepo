package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfiramtionAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1500);
		driver.findElement(By.name("cusid")).sendKeys("798");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1500);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		System.out.println("alert handeld by dismis()");
		//driver.quit();
	}
}
