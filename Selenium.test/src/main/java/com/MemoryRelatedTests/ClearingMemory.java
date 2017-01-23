package com.MemoryRelatedTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class ClearingMemory {

	private Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Clear memory test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Set memory test completed\n");

	}

	@Test(description = "Defauilt State test")
	public void checkDefaultStateMemory() {

		Assert.assertEquals(calc.getMemoryResult(), 0.0, delta, "Getting default state operation result is wrong!");

	}

	@Test(description = "Clearing memory test")
	public void checkVaueAfterClearing() {

		int testValue = 5;
		calc.setInMemory(testValue);
		calc.clearMemory();

		Assert.assertEquals(calc.getMemoryResult(), 0.0, delta, "Clearing memory operation result is wrong!");

	}

	@Test(description = "Clearing already cleared memory test")
	public void checkDoubleClearing() {

		calc.clearMemory();
		calc.clearMemory();

		Assert.assertEquals(calc.getMemoryResult(), 0.0, delta, "Double clearing memory operation result is wrong!");

	}

}
