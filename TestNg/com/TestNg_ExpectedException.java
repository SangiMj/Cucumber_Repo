package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() {
		
		int c=6/0;
		System.out.println(c);
	}
	
	@Test
	public void bMethod() {

		System.out.println("B Method");
	}

}
