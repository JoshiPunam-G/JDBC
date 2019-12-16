package com.bridgelabz.Automation;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Different Locators in Webdriver 
 * Automation On facebook 
 *
 */
public class Locators 
{
    public static void main( String[] args ) throws InterruptedException
    {	
    	System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		/**Xpath */
        driver.findElement(By.xpath(" //input[@id='u_0_m']")).sendKeys("Selenium");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath(" //input[@id='u_0_o']")).sendKeys("Tool");
        Thread.sleep(2000);
        
        /** By name */
        driver.findElement(By.name("reg_email__")).sendKeys("toolselenium07@gmail.com");
        Thread.sleep(2000);
        
        /**By CssSelector */
        driver.findElement(By.cssSelector("#u_0_u")).sendKeys("toolselenium07@gmail.com");
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("#u_0_w")).sendKeys("tool@123");
        Thread.sleep(2000);
        
        /**Handling Drop Box  */
        //Date
        org.openqa.selenium.support.ui.Select date =new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("day")));
        Thread.sleep(1000);
        date.selectByVisibleText("10");
        Thread.sleep(1000);
        
        //month 
        org.openqa.selenium.support.ui.Select month=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Jun");
       Thread.sleep(1000);
       
       //year
       org.openqa.selenium.support.ui.Select year=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("year")));
       year.selectByVisibleText("1990");
       Thread.sleep(1000);       
       
       //Gender RadioButton
       driver.findElement(By.name("sex")).click();;
       Thread.sleep(1000);
       
       /**Sign up  */
       driver.findElement(By.name("websubmit")).click();
       
       //driver.close();
    }
}
