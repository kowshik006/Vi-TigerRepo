package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		//type cast driver 
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("mobile");
		//TakesScreenshot ts=(TakesScreenshot)driver;
		
					File source = search.getScreenshotAs(OutputType.FILE);
					
					File dest=new File("./screenshotss/search.png");
					FileHandler.copy(source, dest);
	}
}
