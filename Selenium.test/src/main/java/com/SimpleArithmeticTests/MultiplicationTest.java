package com.SimpleArithmeticTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class MultiplicationTest {
	
	public Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Multiplication test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Multiplication test completed\n");

	}

	@Test(description = "Multiplication 10*2 check")
	public void checkMultiplicationPositive() {

		Assert.assertEquals(calc.multiplication(10, 2), 20.0, delta, "10 * 2 operation result is wrong!");

	}

	@Test(description = "Multiplication -10*-2 check")
	public void checkMultiplicationNegative() {

		Assert.assertEquals(calc.multiplication(-10, -5), 50.0, delta, "-10 * -5 operation result is wrong!");

	}

	@Test(description = "Multiplication 10*1 check")
	public void checkMultiplicationOne() {

		Assert.assertEquals(calc.multiplication(10, 1), 10.0, delta, "10*1 operation result is wrong!");

	}

	@Test(description = "Multiplication 10*0 check")
	public void checkMultiplicationZero() {

		Assert.assertEquals(calc.multiplication(10, 0), 0.0, delta, "10*0 operation result is wrong!");
		

	}
	
	@Test(description = "Multiplication 10*-1.5 check")
	public void checkMultiplicationFload() {

		Assert.assertEquals(calc.multiplication(10, -1.5), -15.0, delta, "10*-1.5 operation result is wrong!");
		

	}

}
