package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingContainsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		WebElement ele = driver.findElement(By.xpath("(//input[contains(@class,'search-box')])[1]"));
		ele.sendKeys("book");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	
	}
}
