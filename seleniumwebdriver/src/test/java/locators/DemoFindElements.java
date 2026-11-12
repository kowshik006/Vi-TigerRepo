package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(list);
		for (WebElement webElement : list) {
			Thread.sleep(1500);
			webElement.click();
			System.out.println(webElement.isSelected());
		}
		
//		List<WebElement> list = driver.findElements(By.xpath("//a"));
//		System.out.println(list.size());
//		for (WebElement web : list) {
//			System.out.println(web.getAttribute("href"));
//		}
	}
}
