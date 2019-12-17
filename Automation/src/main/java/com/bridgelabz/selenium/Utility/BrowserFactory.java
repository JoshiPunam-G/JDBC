package com.bridgelabz.selenium.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
		if(browsername.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
