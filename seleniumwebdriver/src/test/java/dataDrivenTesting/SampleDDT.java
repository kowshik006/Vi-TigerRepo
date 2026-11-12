package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDDT {
		public static void main(String[] args) throws IOException{
			//connect eclipse to drive location where prooerty file saved
			//by creating obj of FIS
			FileInputStream fin=new FileInputStream("c://ddt/commonData.properties");
			
			//create obj of property to laod all key
			Properties p=new Properties();
			p.load(fin);
			
			//get value based on key
//			System.out.println(p.getProperty("url"));
//			System.out.println(p.getProperty("browser"));
			
			String browser=p.getProperty("browser");
			String url=p.getProperty("url");
			String itemName=p.getProperty("username");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			driver.get(url);
			driver.findElement(By.name("q")).sendKeys(itemName);
			
			driver.get(url);
					
		}
}
