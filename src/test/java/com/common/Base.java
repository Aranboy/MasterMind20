package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver driver; 
	
	public void getBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//WebDriverWait lol = new WebDriverWait(driver,30);
		//lol.until(ExpectedConditions.elementToBeClickable(By.locator)
	
	}
}
