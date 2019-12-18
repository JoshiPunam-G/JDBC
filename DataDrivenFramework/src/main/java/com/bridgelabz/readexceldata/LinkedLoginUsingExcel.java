package com.bridgelabz.readexceldata;

import java.util.concurrent.TimeUnit;
import java.util.logging.Formatter;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinkedLoginUsingExcel {
	WebDriver driver;
	
	 @Test(dataProvider="linkedInData")
   public void loginLinkedIn(String username,String password) throws InterruptedException
   {
		 System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
   	     driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		 Thread.sleep(2000);
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys(password);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		 Thread.sleep(2000);
		
		
   } 
	 
	 @AfterMethod
	 public void teardown()
	 {
		 driver.close();
	 }
	 
	 @DataProvider(name="linkedInData")
	 public Object[][] passData()
	 {
		 ExcelConfig excel=new ExcelConfig("/home/admin106/eclipse-workspace/DataDrivenFramework/Testdata/inputData.xlsx");
		 int row=excel.rowCount(0);
		Object[][] data=new Object[row][2];
		
		for(int i=0;i<row;i++)
		{
		
			data[i][0]=excel.getData(i, 0, 0);
			data[i][1]=excel.getData(i, 1, 0); 
		}
		
		return data;
	 } 

}
