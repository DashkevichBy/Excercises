package com.MemoryRelatedTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class SubtractionFromMemory {
	
	private Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Subtracting from memory test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Subtracting from memory completed\n");

	}
	
	@Test(description = "Sutracting from default value test")
	public void subtractFromDefautValue() {
		int testValueFrst = 5;
				
		calc.subtractFromMemory(testValueFrst);
				
		Assert.assertEquals(calc.getMemoryResult(), (testValueFrst), delta, "Sutracting from default value result is wrong!");
		
		calc.clearMemory();

	}

	@Test(description = "Subtract negative value test")
	public void checkSubtractNegativeValue() {
		int testValueFrst = -5;
				
		calc.subtractFromMemory(testValueFrst);
				
		Assert.assertEquals(calc.getMemoryResult(), Math.abs(testValueFrst), delta, "Subtract negative value result is wrong!");
		
		calc.clearMemory();

	}
	

	@Test(description = "Subtracting zero")
	public void checkAddingZero() {
		
		double testValueScnd = 0.0;
				
		calc.subtractFromMemory(testValueScnd);
		
				
		Assert.assertEquals(calc.getMemoryResult(), 0.0, delta, "Subtracting zero result is wrong!");
		
		calc.clearMemory();

	}

	@Test(description = "Subtracting negative value from subtracted positive value")
	public void checkAddingNegativeValue() {
		int testValueFrst = 5;
		double testValueScnd = -1.0;

		calc.subtractFromMemory(testValueFrst);
		calc.subtractFromMemory(testValueScnd);
				
		Assert.assertEquals(calc.getMemoryResult(), (0 -(testValueFrst + testValueScnd)), delta, "Subtracting negative value from subtracted positive value result is wrong!");
		
		calc.clearMemory();

	}

}
