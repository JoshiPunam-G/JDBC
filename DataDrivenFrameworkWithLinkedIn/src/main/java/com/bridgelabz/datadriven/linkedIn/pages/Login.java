/**
 * 
 */
package com.bridgelabz.datadriven.linkedIn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.datadriven.linkedin.base.Base;

/**
 * @author admin106
 *
 */
public class Login extends Base {
 
  /**
	 * Initializing page object 
	 * */
	public Login(WebDriver ldriver)
	{
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id="username")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")
	WebElement submit;
	
	public void setUsername(String username)
	{
		email.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
	this.password.sendKeys(pwd);
	}
	
	public void setSubmit()
	{
		submit.click();
	}
	
}
