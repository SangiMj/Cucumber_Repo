package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_Write {
	
	public static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven\\DataSet\\DataSet_Write.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.getSheetAt(0).getRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheetAt(0).getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheetAt(0).getRow(1).createCell(0).setCellValue("sangeetha@123");
		
		wb.getSheetAt(0).getRow(1).createCell(1).setCellValue("Password@123");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);

	}
	
	public static void main(String[] args) throws IOException {
		
		writeData();
		
	}

}
