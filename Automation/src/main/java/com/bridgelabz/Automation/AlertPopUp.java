package com.bridgelabz.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Handling Alert PopUp 
 * @param args
 */

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Thread.sleep(1000);
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        
        String text=alert.getText();
        
        if(text.equals("Please enter a valid user name"))
        {
        	System.out.println("Correct Alert Message");
        }else
        {
        	System.out.println("In-correct Alert Message");
        }
        alert.accept();
        
      
	}

}
