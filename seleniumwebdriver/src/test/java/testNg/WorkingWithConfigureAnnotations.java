package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithConfigureAnnotations {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("excuting beforeSuit");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("excuting afersuit");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("excuting beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest excuting");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("excuting before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("excuting afterclass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("excuting before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("excuting after method");
	}
	@Test
	public void tc1() {
		System.out.println("excuting tc1");
	}
	@Test
	public void tc2() {
		System.out.println("excuting tc2");
	}
}
