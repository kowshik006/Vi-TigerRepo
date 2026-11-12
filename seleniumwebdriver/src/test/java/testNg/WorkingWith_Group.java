package testNg;

import org.testng.annotations.Test;

public class WorkingWith_Group {
 @Test(groups = "smokeTest")
 public void login() {
	 System.out.println("excuting login test....");
 }
 @Test(groups = "smokeTest")
 public void registerTest() {
	 System.out.println("excuting register");
 }
 @Test
 public void searchTest() {
	 System.out.println("excuting search....");
 }
}
