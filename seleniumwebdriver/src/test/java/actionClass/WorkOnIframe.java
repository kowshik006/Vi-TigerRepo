package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOnIframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("enter url");
		Thread.sleep(0);
		//by index
		driver.switchTo().frame(0);//enter frame index start 0
		
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(1500);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("")).click();
		
		
		//by name
		driver.switchTo().frame("name");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(1500);
		//back to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("")).click();
		
		//by webelewmnt
		WebElement e=driver.findElement(By.id(""));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("")).sendKeys("s");
		
	}
}
