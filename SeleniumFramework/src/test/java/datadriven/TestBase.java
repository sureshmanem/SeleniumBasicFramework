package datadriven;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public WebDriver driver = null;
	
	public void Login() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","/Users/smanem/eclipseworkspace/SeleniumFramework/src/drivers/geckodriver");
		
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("/Users/smanem/eclipseworkspace/SeleniumFramework/datadriven.properties");
	
		prop.load(fis);
		//System.out.println("Username is " + prop.getProperty("username"));
		//System.out.println("Browser is " + prop.getProperty("browser"));
		
		if(prop.getProperty("browser").equals("Firefox")){
			driver = new FirefoxDriver();
			//System.out.println("This is Firefox");
		}else if(prop.getProperty("browser").equals("Chrome")) {
			driver = new ChromeDriver();
			//System.out.println("This is Chrome");
		}else if(prop.getProperty("browser").equals("IE")){
			driver = new InternetExplorerDriver();
			//System.out.println("This is IE");
		}else {
			System.out.println("Something Wrong in the Browser parameter");
		}
		
		driver.get(prop.getProperty("url"));
		System.out.println("Actual URL: " + driver.getCurrentUrl());
		System.out.println("Title: " + driver.getTitle());
		
	}

}
