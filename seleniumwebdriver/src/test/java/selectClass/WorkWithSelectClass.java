package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithSelectClass {
 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		//sort dropdown
		WebElement ele = driver.findElement(By.id("products-orderby"));
		Select sc=new Select(ele);
		sc.selectByContainsVisibleText("Created on");
		
		WebElement	ele1=driver.findElement(By.name("products-pagesize"));
		Select sc1=new Select(ele1);
		sc1.selectByIndex(2);
			List<WebElement> li=sc1.getOptions();
			for (WebElement we : li) {
				System.out.println(we.getTagName());
			}
}
}
