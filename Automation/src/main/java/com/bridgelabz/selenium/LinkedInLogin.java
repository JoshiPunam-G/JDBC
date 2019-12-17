package com.bridgelabz.selenium;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;
import junit.framework.Test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;


public class LinkedInLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
    	 WebDriver driver=new ChromeDriver();
 		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		 driver.manage().window().maximize();
 		 driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
 		 Thread.sleep(2000);
 		 driver.findElement(By.id("username")).sendKeys("joshipunam207@gmail.com");
 		 driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys("7218374140");
 		 Thread.sleep(2000);
 		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/admin106/Pictures/diwali.jpg");                                                                             
		FileUtils.copyFile(srcFile, destFile);
		
 		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
 		Thread.sleep(2000);
 	
	}
	
	


}
