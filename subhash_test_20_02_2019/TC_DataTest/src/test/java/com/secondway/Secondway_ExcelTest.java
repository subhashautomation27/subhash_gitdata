package com.secondway;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Secondway_ExcelTest  extends BaseTest1  {
//extends BaseTest1 {
	
	@Test
	public void ExcelData() throws InterruptedException 
	{  

		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	   ExcelData_Library lib=new ExcelData_Library("E:\\subhash_test_20_02_2019\\TC_DataTest\\ExcelData\\subhash_test_Book1.xlsx");
	   String username = lib.getdata(0, 0, 0);
	   System.out.println("user1 details   :  " + username);
	   Thread.sleep(2000);
	   
	   String passwrd=lib.getdata(0, 0, 1);
	   System.out.println("password   :  " + passwrd);
	   Thread.sleep(2000);
	   
	   driver.findElement(By.name("email")).sendKeys(username);
  	 driver.findElement(By.name("pass")).sendKeys(passwrd);
  	 driver.findElement(By.id("u_0_2")).click();
	   
	}

}
