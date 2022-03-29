package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_ReadAllData {
	
	public static void writeData() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven\\DataSet\\DataSet.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0; i<rowsize; i++)
		{
		
			Row row = sheetAt.getRow(i);
			
			int cellsize = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<cellsize; j++)
			{
				
				Cell cell = row.getCell(j);
				
				CellType typeofcell = cell.getCellType();
				
				if(typeofcell.equals(CellType.STRING))	
					
				{
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
				}
				
				else if(typeofcell.equals(CellType.NUMERIC))
				{		
					double numericCellValue = cell.getNumericCellValue();
					
					// to change data type to double into int
					
					int cellValue = (int) numericCellValue;
					
					System.out.println(cellValue);
						}
				
				else
				{
					System.out.println("Invalid cell value");	
				}
			}
			
			}
			
		}	
	
	public static void main(String[] args) throws IOException {

		
		writeData();
		
	}
	
	
}



