package com.bridgelabz.readexceldata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinkedInLogin {
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
		Object[][] data=new Object[3][2];
		
		data[0][0]="punamsj20@gmail.com";
		data[0][1]="123";
		
		data[1][0]="seleniumtoo@gmail.com";
		data[1][1]="tool@123";
		
		data[2][0]="joshipunam207@gmail.com";
		data[2][1]="7218374140";
		
		return data;
	 }
		

}
