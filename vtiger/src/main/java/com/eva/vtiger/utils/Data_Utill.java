package com.eva.vtiger.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Utill {
	
	public void readData() throws IOException {
	InputStream source=	new FileInputStream("src\\test\\resources\\Book.xlsx");
	Workbook book=	new XSSFWorkbook(source);
	Sheet seet= book.getSheet("sheet1");
	     int rowcount= seet.getLastRowNum();
	     for(int i=0;i<rowcount;i++) {
	    Row  rowobj= seet.getRow(i);
	    rowobj.getCell(i);
	    
	    
	    
	    	 
	     }
		
		
	}

}
