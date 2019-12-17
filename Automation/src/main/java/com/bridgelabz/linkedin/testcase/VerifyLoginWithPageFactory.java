/**
 * 
 */
package com.bridgelabz.linkedin.testcase;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bridgelabz.linkedin.pages.LoginWithPageFactory;
import com.bridgelabz.selenium.Utility.BrowserFactory;

/**
 * @author admin106
 *
 */
public class VerifyLoginWithPageFactory {
	@Test
	public void checkValidUser() throws InterruptedException, AWTException
	{
		/**Launch browser and specific url */
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		/**Created Page using pageFactory */
		LoginWithPageFactory loginpage=PageFactory.initElements(driver, LoginWithPageFactory.class);
		PageFactory.initElements(driver, loginpage);
		 
		/**Call method */
		loginpage.loginLinkedIn("joshipunam207@gmail.com", "7218374140");
		
		Robot robot=new Robot();
		int x=driver.findElement(By.linkText("My Network")).getLocation().getX();
		int  y=driver.findElement(By.linkText("My Network")).getLocation().getY();	
		robot.mouseMove(x, y);
		
	    
		
		//driver.close();
	}

}
