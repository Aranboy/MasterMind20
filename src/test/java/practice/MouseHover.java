package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover 
{
	static WebDriver driver; 
	public static void main(String[] args) throws Throwable 
	{		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement signInHover =  driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement targetHover = driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(signInHover).moveToElement(targetHover).click().build().perform();
		
		//TakeScreenShot scrnShot = new TakeScreenShot();
		TakeScreenShot.screenShot(driver, "AmazonSmile");
	}
	
	public WebElement lol(WebElement john)
	{
		WebElement test = driver.findElement(By.xpath("test"));
		
		return test;
	}

}
