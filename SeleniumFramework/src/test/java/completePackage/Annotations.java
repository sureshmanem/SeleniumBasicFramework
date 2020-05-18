package completePackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test(dependsOnMethods={"fnTest2"},alwaysRun=true)
	public void fnTest1() {
		System.out.println("Actual Test 1");
	}
	
	@Test()
	public void fnTest2() {
		System.out.println("Actual Test 2");
	}
	
	@Test(enabled=false)
	public void fnTest3() {
		System.out.println("Actual Test with Enabled=False");
	}
	
	@Test(timeOut=5000)
	public void fnTest4(){
		System.out.println("Actual Test with Timeout");
	}
	
	@Test(groups= {"Priority1"})
	public void fnTest5() {
		System.out.println("Priority 1 fnTest5");
	}
	
	@Test(groups= {"Priority1"})
	public void fnTest6() {
		System.out.println("Priority 1 fnTest6");
	}
	
	@Test(groups= {"Priority2"})
	public void fnTest7() {
		System.out.println("Priority 2 fnTest7");
	}


}
