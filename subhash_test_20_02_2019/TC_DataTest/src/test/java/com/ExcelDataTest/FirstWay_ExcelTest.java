package com.ExcelDataTest;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstWay_ExcelTest extends BaseTest {
	
	@Test
	public void dataget() throws IOException
	{    
		
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		File f=new File("E:\\subhash_test_20_02_2019\\TC_DataTest\\ExcelData\\subhash_test_Book1.xlsx");
	    FileInputStream fis=new FileInputStream(f);
	    XSSFWorkbook wb=new  XSSFWorkbook(fis);
	    XSSFSheet sh=wb.getSheetAt(2);
	     int ttlnum= sh.getLastRowNum();
	     System.out.println(ttlnum);
	     for (int i = 0; i <ttlnum; i++) {
	    	 String username=sh.getRow(i).getCell(0).getStringCellValue();
	    	 System.out.println("username" + username);
	    	 
        	 String password=sh.getRow(i).getCell(1).getStringCellValue();
	    	 System.out.println("password" + password);
	    	 
	    	 
	    	 driver.findElement(By.name("email")).sendKeys(username);
	    	 driver.findElement(By.name("pass")).sendKeys(password);
	    	 driver.findElement(By.id("u_0_2")).click();
		}
	    
		
		
		
		
	}
	
	
	

}
