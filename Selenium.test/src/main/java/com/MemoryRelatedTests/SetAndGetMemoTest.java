package com.MemoryRelatedTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class SetAndGetMemoTest {
	
	private Calculator calc;
	private static final double delta = 0.01;
		

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Set memory test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Set memory test completed\n");

	}

	@Test(description = "Zero memory set")
	public void checkZeroSetMemory() {
		
		double testValue = 0.0;
		calc.setInMemory(testValue);

		Assert.assertEquals(calc.getMemoryResult(), testValue, delta, "Settin/getting "+testValue+"Value operation result is wrong!");

	}
	
	@Test(description = "Simple memory set")
	public void checkPositiveIntegerSetMemory() {
				
		int testValue = 5;
		calc.setInMemory(testValue);

		Assert.assertEquals(calc.getMemoryResult(), testValue, delta, "Settin/getting "+testValue+"Value operation result is wrong!");

	}
	
	@Test(description = "Negative memory set")
	public void checkNegativeIntegerSetMemory() {
				
		int testValue = -1;
		calc.setInMemory(testValue);

		Assert.assertEquals(calc.getMemoryResult(), testValue, delta, "Settin/getting "+testValue+"Value operation result is wrong!");

	}
	
	@Test(description = "Simple memory set")
	public void checkNegativeFloatSetMemory() {
				
		double testValue = -1.23;
		calc.setInMemory(testValue);

		Assert.assertEquals(calc.getMemoryResult(), testValue, delta, "Settin/getting "+testValue+"Value operation result is wrong!");

	}


}
