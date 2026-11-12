package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		//create obj of action class
		Actions ac=new Actions(driver);
		//ac.doubleClick(button).build().perform();	
		//right clcik
		ac.contextClick(button).build().perform();
		
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().perform();
	}
}
