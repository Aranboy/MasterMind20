package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenShot 
{
	
	public static  void screenShot(WebDriver driver,String scrnShotName) throws Throwable
	{
		TakesScreenshot scrnShot =  (TakesScreenshot)driver;
		File f = scrnShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(scrnShotName +" .png"));
	}
}
