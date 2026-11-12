package testNg;

import org.testng.annotations.Test;

public class ANotherClassDataProvider {
	@Test(dataProvider = "searchTestData",dataProviderClass = WorkingDataProvider.class)
	public void tc3(String fn,String ln) {
		System.out.println(fn);
		System.out.println(ln);
	}
}
