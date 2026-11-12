package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sampletest {
	@Test
	public void test() {
		System.out.println("welcome to TestNg");
	}
	
	@Test
	public void tc1() {
		Reporter.log("test case -1");
	}
	@Test
	public void registerTest() {
		System.out.println("excuting Register test case...");
	}
	@Test
	public void searchTest() {
		System.out.println("excuting Search test case...");
	}
}
