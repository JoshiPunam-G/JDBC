package com.bridgelabz.readexceldata;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	static XSSFWorkbook workbook;
	XSSFSheet sheet1;
	
	public ExcelConfig(String excelpath)
	{
		try {
			File file = new File(excelpath);
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		   sheet1 = workbook.getSheetAt(0);
			int rowcount = sheet1.getLastRowNum();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getData(int row,int cell ,int sheetnumber)
	{
		sheet1=workbook.getSheetAt(0);
		String data=sheet1.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public int rowCount(int index)
	{
		int row=workbook.getSheetAt(index).getLastRowNum();
		row=row+1;
		return row;
	}
}
