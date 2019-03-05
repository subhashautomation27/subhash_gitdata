package com.crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest2 {
	
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String brow)
	{    
		if(brow.equalsIgnoreCase("chrome")) 
		{
		String key="webdriver.chrome.driver" ;
		String value="E:\\subhash_test_20_02_2019\\TC_DataTest\\Drivers\\chromedriver.exe";
		System.setProperty(key,value );
		driver=new ChromeDriver();
		}
		
		else if (brow.equalsIgnoreCase("ff"))
		{
			String key="webdriver.gecko.driver" ;
			String value="E:\\subhash_test_20_02_2019\\TC_DataTest\\Drivers\\geckodriver.exe";
			System.setProperty(key,value );
			driver= new FirefoxDriver();
		}
		
		else if (brow.equalsIgnoreCase("ie"))
		{
			String key="webdriver.ie.driver" ;
			String value="E:\\subhash_test_20_02_2019\\TC_DataTest\\Drivers\\IEDriverServer.exe";
			System.setProperty(key,value );
			driver= new InternetExplorerDriver();
		}
		
	}
	
	@AfterMethod
	public void teaeDown()
	{
		driver.close();
	}

}

