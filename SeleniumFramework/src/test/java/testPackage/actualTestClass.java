package testPackage;

import org.testng.annotations.Test;

public class actualTestClass {
	
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
