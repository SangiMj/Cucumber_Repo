package com.TestNg.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_Ignore {
	
	@Test(enabled = false)
	public void aMethod() {
		
		System.out.println("A Method");
	}
	
	@Test@Ignore
	public void bMethod() {
		
		System.out.println("B Method");
	}
	
	@Test
	public void dMethod() {

		System.out.println("D Method");
	}
	
	@Test
	public void cMethod() {
		
		System.out.println("C Method");
	}
	

}
