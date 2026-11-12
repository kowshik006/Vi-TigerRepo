package testNg;

import org.testng.annotations.Test;

public class WorkingWith_Group1 {
	@Test(groups = "smokeTest")
	 public void addtoCartTest() {
		 System.out.println("excuting login test....");
	 }
	 @Test(groups = "smokeTest")
	 public void subscribeTest() {
		 System.out.println("excuting subscribe");
	 }
	 @Test
	 public void voteTest() {
		 System.out.println("excuting vote....");
	 }
}
