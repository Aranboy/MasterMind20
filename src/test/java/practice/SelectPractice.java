package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver test = new ChromeDriver();
		test.get("https://www.amazon.com/");
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select moni = new Select(test.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"))); 
		moni.selectByVisibleText("Books");
		
	}

}
