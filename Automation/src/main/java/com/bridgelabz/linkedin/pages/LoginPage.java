/**
 * 
 */
package com.bridgelabz.linkedin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author admin106
 *
 */
public class LoginPage {
	WebDriver driver;
	By email=By.id("username");
	By password=By.name("session_password");
	By sign_in=By.xpath("//button[@class='btn__primary--large from__button--floating']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginToLinkedIn(String user,String pwd)
	{
		driver.findElement(email).sendKeys(pwd);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(sign_in).click();
	}

	public void typeUsername(String username)
	{
		driver.findElement(email).sendKeys(username);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(sign_in).click();
	}
}
