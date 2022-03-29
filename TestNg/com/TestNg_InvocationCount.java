package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_InvocationCount {
	
	@Test(invocationCount = 2)
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(invocationCount = 0)
	public void bMethod() {
		System.out.println("B Method");
	}
	
	@Test(invocationCount = 1)
	public void fMethod() {
		System.out.println("F Method");
	}
	
	@Test
	public void cMethod() {
		System.out.println("C Method");
	}

}
