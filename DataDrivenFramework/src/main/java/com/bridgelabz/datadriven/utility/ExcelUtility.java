package com.bridgelabz.datadriven.utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.WebConsole.Formatter;

public class ExcelUtility {
	public static void main(String[] args) {
		readFile();
	}
	
	public static void readFile()
	{
		try {
			
			XSSFWorkbook wb=new XSSFWorkbook("/home/admin106/Documents/ReadExcel.xlsx");
			XSSFSheet sheet=wb.getSheetAt(0);
//			String username=sheet.getRow(0).getCell(0).getStringCellValue();
//			System.out.println(username);
//			String password=sheet.getRow(0).getCell(1).getStringCellValue();
//			System.out.println(password);
			
		} catch (Exception e) {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		}
	//	return username;
	}
	
	public static void RowCount()
	{
		try {
			XSSFWorkbook wb=new XSSFWorkbook("/home/admin106/Documents/ReadExcel.xlsx");
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows:" +rowcount);
			
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		 System.out.println(e.getCause());
		 e.printStackTrace();
		}
	}
	
	
	public static void getCellDataString(int rowNum,int colNum)
	{
		try {
			XSSFWorkbook wb=new XSSFWorkbook("/home/admin106/Documents/ReadExcel.xlsx");
			XSSFSheet sheet=wb.getSheetAt(0);
			String username=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(username);
		} catch (Exception e) {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		}
	}
	
	public static void getCellDataNumeric(int rowNum,int colNum)
	{
		try {
			XSSFWorkbook wb=new XSSFWorkbook("/home/admin106/Documents/ReadExcel.xlsx");
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowcount=sheet.getPhysicalNumberOfRows();
			Double password =sheet.getRow( rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(password);
		} catch (Exception e) {
			 System.out.println(e.getMessage());
			 System.out.println(e.getCause());
			 e.printStackTrace();
		}
	}
	
}
