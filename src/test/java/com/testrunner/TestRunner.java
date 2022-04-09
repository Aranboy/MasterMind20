package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="CucumberFeature",
		glue="com.stepdefinition",
		tags="@test1"
		)

public class TestRunner extends AbstractTestNGCucumberTests 
{
	
}
