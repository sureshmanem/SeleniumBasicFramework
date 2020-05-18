package methodPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class testMethodClass {
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

}
