package datadriven;

import org.testng.annotations.Test;

public class TestCase1 extends TestBase{
	
	@Test
	public void openBrowser() throws Exception {
		
		Login();
		
	}
	
	@Test(dependsOnMethods= {"openBrowser"})
	public void quitBrowser() {
		driver.quit();
	}

}
