package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionsss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.name("q")).sendKeys("compu");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[2]")).click();
	}
}
