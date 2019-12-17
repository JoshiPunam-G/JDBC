/**
 * 
 */
package com.bridgelabz.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author admin106
 *
 */
public class LoginWithPageFactory {
	
	WebDriver driver;
	
	public LoginWithPageFactory(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
  
	@FindBy(id="username")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="session_password")
	@CacheLookup
	WebElement password;                                                                                                                                                    
	
	@FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")
	@CacheLookup
	WebElement sign_in;
	
	public void loginLinkedIn(String username,String pwd)
	{
		email.sendKeys(username);
		password.sendKeys(pwd);
		sign_in.click();
		
	}
}
