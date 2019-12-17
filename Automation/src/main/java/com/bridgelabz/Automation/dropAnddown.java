/**
 * 
 */
package com.bridgelabz.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author admin106
 *
 */
public class dropAnddown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    Thread.sleep(1000);
	    driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    Actions action=new Actions(driver);
	    Thread.sleep(1000);
	    action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
	    .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
	    .release().build().perform();
	    Thread.sleep(1000);
	}

}
