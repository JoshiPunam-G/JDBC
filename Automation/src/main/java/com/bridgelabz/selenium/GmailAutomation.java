package com.bridgelabz.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailAutomation {
	static WebDriver driver;
	
	public static void uploadFileWithRobot ()
	{
		StringSelection str=new StringSelection("/home/admin106/Documents/ReadExcel.xlsx");
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(str, null);
		Robot robot=null;
		try {
		 robot=new Robot();
		} catch (AWTException e) {
			e.printStackTrace(); 
		}
		
		robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
		//return filepath;
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		 
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
		 driver = new ChromeDriver();
		
		/**Open gmail login page*/ 
		driver.navigate().to("http://mail.google.com");
		driver.manage().window().maximize();
		
		/** Enter Username */
		driver.findElement(By.name("identifier")).sendKeys("toolselenium07@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		
        /** Enter password */
		WebElement passwordButton = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
		passwordButton.sendKeys("tool@123");
		
		/**Submit */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		Thread.sleep(2000);
		
		/**Compose Mail */
		driver.findElement(By.xpath(" //div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		Thread.sleep(2000);
//		
//		Robot robot=new Robot();
//		int x=driver.findElement(By.xpath("//*[@class='gb_Se']")).getLocation().getX();
//		int y=driver.findElement(By.xpath("//*[@class='gb_Se']")).getLocation().getY();
//		Thread.sleep(1000);
//		robot.mouseMove(x, y);
	
		/**Sent Mail  */
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("punamsj20@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Automated Record File");
		
		/**Attach File */
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Hello Punam ..! This is Automated Email ");
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		GmailAutomation.uploadFileWithRobot();
		
		/**Send Mail */
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
		Thread.sleep(2000);
		
		/**Click On Google Account */
		driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
		
		/**Sign Out Account */
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		
		driver.close();
	}

}
