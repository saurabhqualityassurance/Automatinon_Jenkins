package com.eva.readdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xsls {

	public static void main(String[] args) throws IOException {

		FileInputStream  files=	new FileInputStream("src\\main\\resources\\Book1.xlsx");
		Workbook book=	new XSSFWorkbook(files);
	Sheet sheet=	book.getSheet("sheet1");
	int rowObj = sheet.getLastRowNum();
		for(int i=0;i<=rowObj; i++) {
			Row row = sheet.getRow(i);
			int cellCount = row.getLastCellNum();
			for(int j=0; j<=cellCount; j++) {
			Cell cellobj=	row.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		String value=	cellobj.getStringCellValue();
		System.out.print(value+"  ");
				
			}
			System.out.println();
		}
		
		
	}

}
