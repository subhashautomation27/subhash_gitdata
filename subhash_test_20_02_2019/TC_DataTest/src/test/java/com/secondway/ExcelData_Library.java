package com.secondway;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_Library {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	public ExcelData_Library( String excelpath) 
	{
	
	      try {
			File f=new File(excelpath);
            FileInputStream fis = new FileInputStream(f);
			wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	
	public String getdata(int sheetnumber,int row, int column)
	{
	             sh=wb.getSheetAt(sheetnumber);
	            String value= sh.getRow(row).getCell(column).getStringCellValue();
	            System.out.println(value);
	            return value;
	}
	
 

}
