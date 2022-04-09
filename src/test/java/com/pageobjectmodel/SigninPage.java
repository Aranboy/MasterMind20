package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
	public WebDriver driver; //this is an instance variable b/c inside class but outside method  
	//constructor name has to be same as class name
	public SigninPage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")  //WebElement signinButton ;  < this works too 
	public WebElement signinButton ; 
	
	public void getSignin()
	{
		signinButton.click();
	}
	
	@FindBy(id="ap_email")
	public WebElement enterEmail;
	public void getUsername()
	{
		enterEmail.sendKeys("Saiyanmurshid@yahoo.com");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueButton;
	public void clickContinue()
	{
		continueButton.click();
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement enterPassword;
	public void getPassword()
	{
		enterPassword.sendKeys("0609109851Nibir!");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginButton;
	public void clickLogin()
	{
		loginButton.click();
	}
	
	
	
}
