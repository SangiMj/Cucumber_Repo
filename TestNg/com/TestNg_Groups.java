package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_Groups {
	
	@Test(groups = "Test 1")
	public void Method_A() {
		System.out.println("Method A");
	}
	
	@Test(groups = "Test 2")
	public void Method_B() {
		System.out.println("Method B");
	}
	
	@Test(groups = "Test 1")
	public void Method_C() {
		System.out.println("Method C");
	}
	
	@Test(groups = {"Test 1", "Test 2"})
	public void Method_D() {
		System.out.println("Method D");
	}

}
