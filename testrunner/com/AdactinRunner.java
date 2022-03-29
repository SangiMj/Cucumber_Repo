package com.testrunner.com;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature\\com", 
glue = "com.stepdefinition.com", 
plugin = {"pretty", "html:Report/Cucumber_Html_Report",
		"json:Report/Cucumber_Json_Report.json", 
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber_Extent_Report.html"},
monochrome = true, strict = true)

// dryRun = true //To give the console without launch the application
//tags = {"@smoketest"} //To run particular scenarios

public class AdactinRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver = BaseClass.BrowserLaunch("chrome");
	}
	
	@AfterClass
	public static void tearDown() throws IOException {

		BaseClass.screenshot("ss1");
		
		BaseClass.close();
		
		
	}

}
