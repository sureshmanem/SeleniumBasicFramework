package testMngPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testClass {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
