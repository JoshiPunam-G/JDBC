package com.bridgelabz.datadriven.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.datadriven.gmail.base.TestBase;

public class Home extends TestBase {
	WebDriver driver;
	/**
	 * Initializing page object 
	 * */
	public Home(WebDriver ldriver)
	{
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath ="//div[contains(text(),'Compose')]")
	WebElement composeButton;
	
	@FindBy(name="to")
	WebElement to;
	
	@FindBy(id=":8t")
	WebElement subject;
	
	@FindBy(id=":a9")
	WebElement messageBody;
	
	@FindBy(xpath = "//div[@id=':8j']")
	WebElement sendButton;
	
	public void setCompose() {
		this.composeButton.click();
	}
	
	public void setTo(String to)
	{
		this.to.sendKeys(to);
	}
	
	public void setSubject(String subject)
	{
		this.subject.sendKeys(subject);
	}
	
	public void setMessage(String message)
	{
		this.messageBody.sendKeys(message);
	}
	
	public void setSend()
	{
		sendButton.click();
	}
} 
