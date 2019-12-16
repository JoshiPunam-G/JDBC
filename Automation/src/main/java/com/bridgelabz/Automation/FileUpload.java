package com.bridgelabz.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/admin106/Downloads/chromedriver_linux64/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://html.com/input-type-file/");
	    driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/admin106/Documents/demo.txt");
	}

}
