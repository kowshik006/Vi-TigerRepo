package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOnActionClass {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//navigate to application
	driver.get("https://demowebshop.tricentis.com/");
	
	//create obj of action class
	Actions ac=new Actions(driver);
	
	//move to element
	WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	//ac.moveToElement(computer).build().perform();
	ac.moveToElement(computer).perform();
	WebElement deskTop=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
	ac.moveToElement(deskTop).click().perform();
}
}
