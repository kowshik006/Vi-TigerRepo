package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Attributes {
	
	@Test(dependsOnMethods = "searchTest")
	public void logout() {
		System.out.println("thanks to TestNg");
	}
	@Test(priority = 3)
	public void registerTest() {
		System.out.println("excuting Register test case...");
	}
	@Test(dependsOnMethods = "registerTest")
	public void searchTest() {
		System.out.println("excuting Search test case...");
	}
	
	
	
	
	
	
//	@Test(priority = 3)
//	public void logout() {
//		System.out.println("thanks to TestNg");
//	}
//	@Test(priority = 1)
//	public void registerTest() {
//		System.out.println("excuting Register test case...");
//	}
//	@Test(priority = 2)
//	public void searchTest() {
//		System.out.println("excuting Search test case...");
//	}
}
