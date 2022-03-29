package com.TestNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Sample_Annotations {
	
	@BeforeSuite
	public void setup() {
 
		System.out.println("setting the browser");
		
	}
	@BeforeTest
	public void browserLaunch() {

		System.out.println("Launching the browser");
	}
	
	@BeforeClass
	public void url() {
 
		System.out.println("Launching the url");
	}
	
	@BeforeMethod
	public void login() {
 
		System.out.println("Login the page");
	}
	
	
	@Test
	public void searchMobile() {

		System.out.println("Search mobiles");
	}
	
	@Test
	public void searchLaptop() {

		System.out.println("Search Laptop");
	}
	
	@AfterMethod
	public void verifyResult() {

		System.out.println("Verify test results");
	}
	
	@AfterClass
	public void logout() {

		System.out.println("Logout");
	}
	
	@AfterTest
	public void closeBrowser() {

		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void deleteCookies() {

		System.out.println("Delete cookies");
	}
	
}
