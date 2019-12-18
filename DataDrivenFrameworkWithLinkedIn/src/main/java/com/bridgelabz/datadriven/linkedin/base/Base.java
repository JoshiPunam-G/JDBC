/**
 * 
 */
package com.bridgelabz.datadriven.linkedin.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author admin106
 *
 */
public class Base {
	
 public static WebDriver driver;
 static FileInputStream fs;
 static XSSFWorkbook wb;
 
	
	/**
  * Purpose :Method For Browser initialization
	 */
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	
	   /**
	    * Purpose :Method For Reading File
	 * @throws IOException 
	 * @throws InvalidFormatException 
	    */
		public static XSSFWorkbook readFile() throws InvalidFormatException, IOException
		{
			    File file=new File("/home/admin106/Documents/inputData.xlsx");
			    fs=new FileInputStream(file);
	            wb=new XSSFWorkbook(fs);
				return wb;	
		}
		
		
		public static String[][] getData() throws InvalidFormatException, IOException
		{
			wb=readFile();
			DataFormatter format=new DataFormatter();
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowCount=sheet.getLastRowNum();
			System.out.println("Row Count" +rowCount);
			String data[][]=new String[3][2];
			int length=data.length;
			for(int row=0;row<data.length;row++)
			{
				for(int col=0;col<data[row].length;col++)
				{
					data[row][col]=format.formatCellValue(sheet.getRow(row).getCell(col));
					System.out.println(data[row][col]);
				}
			}
			return data;
			
		}

}
