package datadriven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameters {
	
	@Test
	@Parameters({"adminUserId"})
	public void fnTestXMLParameter(String userId) {
		System.out.println("XML Parameter Test: " + userId);
	}

}
