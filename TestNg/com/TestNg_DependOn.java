package com.TestNg.com;

import org.testng.annotations.Test;

public class TestNg_DependOn {
	
	@Test
	public void aMethod() {
		System.out.println("A Method");
	}
	
	@Test(dependsOnMethods = "aMethod")
	public void bMethod() {
		System.out.println("B Method");
	}
	
	@Test
	public void cMethod() {
		System.out.println("C Method");
	}
	
	@Test(dependsOnMethods = "aMethod")
	public void dMethod() {
		System.out.println("D Method");
	}

}
