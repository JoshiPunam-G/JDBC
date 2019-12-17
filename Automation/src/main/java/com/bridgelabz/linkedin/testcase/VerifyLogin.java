/**
 * 
 */
package com.bridgelabz.linkedin.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bridgelabz.linkedin.pages.LoginPage;

/**
 * @author admin106
 *
 */
public class VerifyLogin {
	@Test
	public void verifyLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		Thread.sleep(1000);
		
	    LoginPage login=new LoginPage(driver);
	    login.loginToLinkedIn("joshipunam207@gmail.com", "7218374140");
	    
	    driver.close();
	}

}
