package datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {
	
	@Test(dataProvider="getData")
	public void fnTest8(String fName, String mName, String lName) {
		System.out.println("Data Provider Test Case: " + fName + "-" + mName + "-" + lName);
	}
	
	@DataProvider
	public Object[][] getData(){  
		//i stands for number of times test case should run
		Object[][] data = new Object[3][3];
		data[0][0] = "Suresh00";
		data[0][1] = "Rao01";
		data[0][2] = "Manem02";
		
		data[1][0] = "Suresh10";
		data[1][1] = "Rao11";
		data[1][2] = "Manem12";
		
		data[2][0] = "Suresh20";
		data[2][1] = "Rao21";
		data[2][2] = "Manem22";
		
		return data;
	}

}
