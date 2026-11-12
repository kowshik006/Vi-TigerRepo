package basic_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	//System.out.println(driver.getPageSource());
	Thread.sleep(2000);
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(1500);
	driver.navigate().back();
	Thread.sleep(1500);
	driver.navigate().forward();
	Thread.sleep(1500);
	driver.navigate().refresh();
	Thread.sleep(1500);
	//driver.close();
	driver.quit();
	
	 
}
}
