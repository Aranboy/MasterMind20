package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectPractice2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver test = new ChromeDriver();
		test.get("https://www.amazon.com/");
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select moni = new Select(test.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"))); 
		moni.selectByVisibleText("Books");
		
		List<WebElement> options = moni.getOptions();
		System.out.println(options.size());
		
		for(int i = 0; i <options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	}

}
