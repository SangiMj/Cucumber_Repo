package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_Priority {
	
	@Test(priority = 2)
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(priority = 1)
	public void bMethod() {
		System.out.println("B Method");
	}
	
	@Test(priority = 0)
	public void eMethod() {
		System.out.println("E Method");
	}
	
	@Test(priority = -1)
	public void dMethod() {
		System.out.println("D Method");
	}

}
