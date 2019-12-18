/**
    Purpose : Implementation of Gmail Application
 * 
 */
package com.bridgelabz.datadriven.gmail.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bridgelabz.datadriven.gmail.base.TestBase;
import com.bridgelabz.datadriven.gmail.pages.Home;
import com.bridgelabz.datadriven.gmail.pages.LoginPage;
/**
 * @author admin106
 *
 */
public class LoginPageTest extends TestBase{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	//WebDriver driver;
	LoginPage loginpage;
	Home homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
        initialization();
	}
	
	@Test
	public void login() throws InterruptedException, InvalidFormatException, IOException
	{
		readFile();
		loginpage=new LoginPage(driver);
		String[][] data=getData();
		
		String username=data[0][1];
		System.out.println("Username :" +username);
		loginpage.getUsername(username);
		Thread.sleep(2000);

		loginpage.clickOnNext();
		Thread.sleep(1000);
		
		String password=data[1][1];
		
		System.out.println("Pass" +password);
		loginpage.getPassword(password);
		Thread.sleep(1000);
		loginpage.clickSubmit();
		Thread.sleep(2000);
		
        Home homepage=new Home(driver);
        Thread.sleep(5000);
        
        homepage.setCompose();
        Thread.sleep(5000);
		
		String to=data[2][0];
		homepage.setTo(to);
		Thread.sleep(1000);
	}
	
	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
