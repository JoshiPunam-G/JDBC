/**
 * 
 */
package com.bridgelabz.linkedIn.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.datadriven.linkedIn.pages.HomePage;
import com.bridgelabz.datadriven.linkedIn.pages.Login;
import com.bridgelabz.datadriven.linkedin.base.Base;

/**
 * @author admin106
 *
 */
public class LinkedInTest extends Base{
	XSSFWorkbook wb;
	XSSFSheet sheet;
	Login login;
	HomePage homepage;
	public LinkedInTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
        initialization();
	}
	
	@Test
	public void login() throws InterruptedException, InvalidFormatException, IOException, AWTException
	{
		readFile();
	    login=new Login(driver);
		String[][] data=getData();
		
		String username=data[0][1];
		System.out.println("Username :" +username);
		login.setUsername(username);
		Thread.sleep(2000);
		
		String password=data[1][1];
		System.out.println("Pass" +password);
		login.setPassword(password);
		Thread.sleep(1000);
		login.setSubmit();
		Thread.sleep(2000);
		
		homepage=new HomePage(driver);
		Thread.sleep(2000);
		homepage.setPost();
		Thread.sleep(2000);
		
		homepage.setPrivacy();
		Thread.sleep(2000);
		
		homepage.setConnectionPrivacy();
		Thread.sleep(2000);
		
		homepage.setDone();
		Thread.sleep(2000);
		
		String content=data[2][1];
		System.out.println("What you want to talk" +content);
		System.out.println(content);
		Thread.sleep(2000);
		
		homepage.setContent(content);
		Thread.sleep(2000);

		homepage.scroll();
		Thread.sleep(2000);
		
		homepage.setImage();
		Thread.sleep(2000);
	
		
		
		
		
	}
	
	

	   
	 
}
