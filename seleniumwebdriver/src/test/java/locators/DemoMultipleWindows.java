package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		driver.findElement(By.linkText("Facebook")).click();
				String parent=driver.getWindowHandle();
				System.out.println(parent);
				System.out.println(driver.getTitle());
				
				Set<String>s=driver.getWindowHandles();
				for (String str : s) {
					driver.switchTo().window(str);
					System.out.println(driver.getTitle());
					if(driver.getTitle().contains("Facebook")) {
						driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("hai");
					}
				}
				
		//driver.findElement(By.id("_r_1f_")).sendKeys("hai");
		
		
		
	}
}
