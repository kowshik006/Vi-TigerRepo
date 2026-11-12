package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWork {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.name("q"));
		
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.elementToBeClickable(search));
		
		FluentWait f=new FluentWait(driver);
		f.pollingEvery(Duration.ofSeconds(1));
		f.withTimeout(Duration.ofSeconds(15));
		f.until(ExpectedConditions.elementToBeClickable(search));
				
		
		driver.findElement(By.name("q")).sendKeys("book");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
//		WebElement se=driver.findElement(By.xpath("//h1[text()='Search']"));
//		wait.until(ExpectedConditions.visibilityOf(se));
				
	}
}
