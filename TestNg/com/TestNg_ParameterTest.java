package com.TestNg.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_ParameterTest {
	
	@Parameters("username")
	@Test
//	public void methodData1(String username) {
//		System.out.println("username is = " + username);
//	} 
//	
//	//doubt
	public void methodData2(@Optional("1234")String password) {
		System.out.println("password is = " + password);
	}

	//optional parameter test
	public void methodData1(@Optional("Mj")String username) {
		System.out.println("username is = " + username);
	} 
}
