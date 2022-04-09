package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SigninPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninSteps extends Base
{
	//SigninPage sp=PageFactory.initElements(driver, SigninPage.class); < will not work 
	SigninPage sp; //<<< NEEEEEEEEEEEED
	@Given("user is on the home page")
	public void user_is_on_the_home_page() 
	{
		getBrowser();
		Assert.assertEquals(driver.getTitle(),  "Amazon.com. Spend less. Smile more.");
		sp=PageFactory.initElements(driver, SigninPage.class); //<<<< NEEEEEEED
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button() 
	{
		sp.getSignin();
		//driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click(); < don't need this !!
		
	}

	@When("enters an email")
	public void enters_an_email() 
	{
		sp.getUsername();
		//driver.findElement(By.id("ap_email")).sendKeys("saiyanmurshid@yahoo.com");
	}

	@When("clicks continue")
	public void clicks_continue()
	{
		sp.clickContinue();
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@When("enters the password")
	public void enters_the_password() 
	{
		sp.getPassword();
		//0609109851Nibir!
		//driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("0609109851Nibir!"); 
	}

	@When("clicks the log in button")
	public void clicks_the_log_in_button() 
	{
		//sp.clickLogin();
		//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click(); 
	}

	@Then("it should log them in")
	public void it_should_log_them_in()
	{
		//(driver.getCurrentUrl(), null);
		//Assert.assertEquals(null, null);
	}

}


