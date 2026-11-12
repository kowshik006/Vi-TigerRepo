package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartAndEndsWIth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[starts-with(@id,'newslette')])[1]")).sendKeys("hai");
		driver.findElement(By.xpath("(//input[starts-with(@class,'button-1')])[2]")).click();
	}
}
