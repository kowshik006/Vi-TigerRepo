package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		//type casting
		
		//type cast driver 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
					File temp = ts.getScreenshotAs(OutputType.FILE);
					
					File dest=new File("./screenshotss/homepage.png");
					
					FileHandler.copy(temp, dest);
	}
}
