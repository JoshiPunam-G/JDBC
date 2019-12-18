
/**
 *Purpose :Page class For Gmail login  
 */
package com.bridgelabz.datadriven.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.datadriven.gmail.base.TestBase;

/**
 * @author admin106
 *
 */
public class LoginPage extends TestBase{
		WebDriver driver;
	
	/**
	 * Page Factory
	 */
	@FindBy(name="identifier")
	WebElement email;
	
	@FindBy(xpath="//div[@id='identifierNext']")
	WebElement nextButton;

	@FindBy(xpath ="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement submit;
	
	/**
	 * Initializing page object 
	 * */
	public LoginPage(WebDriver ldriver)
	{
		PageFactory.initElements(ldriver, this);
	}
	
	/**
	 * Purpose : Action method for login
	 * @param email
	 * @param password
	 * @return
	 * @throws InterruptedException
	 */
	
	
	public void getUsername(String username) throws InterruptedException
	{
		email.sendKeys(username);
	}
	
	public void clickOnNext()
	{
		nextButton.click();
	}
	
	public void getPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		submit.click();
		this.submit.click();
	}
}
