package com.rmgyntra.test;

import org.testng.annotations.Test;

public class RunningADemoClass {

	@Test
	public void runTest() {
		System.out.println("Inside class: "+getClass().getName());
	}
	
	
	@Test
	public void runTest2() {
		System.out.println("Inside method===>>> "+"runTest2()");
	}
	
	
	@Test
	public void runTest3() {
		System.out.println("Inside method===>>> "+"runTest3()");
	}
	
	@Test
	public void runTest4() {
		System.out.println("Inside method===>>> "+"runTest4()");
	}
	
}


