package com.bridgelabz.datadriven.linkedIn.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Factory;

import com.bridgelabz.datadriven.linkedin.base.Base;

public class HomePage extends Base{
	 public static WebDriverWait wait;
	  /**
		 * Initializing page object 
		 * */
		public HomePage(WebDriver ldriver)
		{
			PageFactory.initElements(ldriver, this);
		}
		
		@FindBy(xpath = "//button[@class='share-box__open share-box__trigger p4 hoverable-link-text t-16 t-black--light t-bold'] ")
		WebElement sharePost;
		
		@FindBy(xpath =" //span[@class='ph1']")
		WebElement privacy;
		
		@FindBy(xpath = "//h4[text()='Connections only']")
		WebElement connectionOnly;
		
		@FindBy(xpath = "//span[text()='Done']")
		WebElement doneButton;
		
		@FindBy(xpath = "//div[@class='mentions-texteditor__contenteditable t-18 t-black--light t-normal']")
		WebElement content;
		
		@FindBy(xpath = "//button[@id='ember657']")
		WebElement addImage;
		
		public void setPost()
		{
			sharePost.click();
		}
		public void setPrivacy()
		{
			privacy.click();
		}
		public void setConnectionPrivacy()
		{
			connectionOnly.click();
		}
		public void setDone()
		{
			doneButton.click();
		}
		public void setContent(String text)
		{
			content.sendKeys(text);
		}
		public void setImage() throws AWTException, InterruptedException
		{
			//addImage.click();
			Robot robot=new Robot();
			robot.mouseMove(477, 522);
		
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(2000);
		}
		
		public void scroll()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,250)", "");
		}
		
		
}
