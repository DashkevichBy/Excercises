package com.MemoryRelatedTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class AdditionToMemory {
	
	private Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Addition to memory test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Addition to memory completed\n");

	}
	
	

	@Test(description = "Adding two positive values test")
	public void checkAddOnePositiveValues() {
		int testValueFrst = 5;
		double testValueScnd = 1;
		
		calc.addInMemory(testValueFrst);
		calc.addInMemory(testValueScnd);
		
		Assert.assertEquals(calc.getMemoryResult(), (testValueFrst+testValueScnd), delta, "Adding two positive values result is wrong!");
		
		calc.clearMemory();

	}

	@Test(description = "Adding one positive value test")
	public void checkAddPositiveValue() {
		int testValueFrst = 5;
				
		calc.addInMemory(testValueFrst);
				
		Assert.assertEquals(calc.getMemoryResult(), (testValueFrst), delta, "Adding one positive value result is wrong!");
		
		calc.clearMemory();

	}
	

	@Test(description = "Adding zero")
	public void checkAddingZero() {
		int testValueFrst = 5;
		double testValueScnd = 0.0;
				
		calc.addInMemory(testValueFrst);
		calc.addInMemory(testValueScnd);
				
		Assert.assertEquals(calc.getMemoryResult(), (testValueFrst), delta, "Adding zero result is wrong!");
		
		calc.clearMemory();

	}

	@Test(description = "Adding negative value")
	public void checkAddingNegativeValue() {
		int testValueFrst = 5;
		double testValueScnd = -1.0;
				
		calc.addInMemory(testValueFrst);
		calc.addInMemory(testValueScnd);
				
		Assert.assertEquals(calc.getMemoryResult(), (testValueFrst + testValueScnd), delta, "Adding negative value result is wrong!");
		
		calc.clearMemory();

	}
	

}
