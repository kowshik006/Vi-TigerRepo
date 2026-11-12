package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingDataProvider {
  @DataProvider(name="searchTestData")
  public Object[][] testData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]="https://demowebshop.tricentis.com/";
	  data[0][1]="books";
	  data[1][0]="https://demowebshop.tricentis.com/";
	  data[1][1]="computers";
	  return data;
  }
  @Test(dataProvider = "searchTestData")
  public void searchTest(String url,String search) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
  }
}
