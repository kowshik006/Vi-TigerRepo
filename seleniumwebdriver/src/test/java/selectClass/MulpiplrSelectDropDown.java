package selectClass;

import org.openqa.selenium.By;n
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulpiplrSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement ele = driver.findElement(By.id("fruits"));
		Select sc=new Select(ele);
		System.out.println(sc.isMultiple());
	}
	
}
