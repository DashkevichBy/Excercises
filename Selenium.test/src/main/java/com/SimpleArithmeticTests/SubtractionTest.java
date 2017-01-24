package com.SimpleArithmeticTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class SubtractionTest {

	public Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Subtraction test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Subtraction test completed\n");

	}

	@Test(description = "Subtraction 3 - 0 check")
	public void checkZeroSubtraction() {

		Assert.assertEquals(calc.subtraction(3, 0), 3.0, delta, "3 - 0 operation result is wrong!");

	}

	@Test(description = "Subtraction 5 - -5 check")
	public void checkSubtractionNegative() {

		Assert.assertEquals(calc.subtraction(5, -5), 10.0, delta, "5 - -5 operation result is wrong!");

	}

	@Test(description = "Subtraction 2 - 3 check")
	public void checkSimpleSubtraction() {

		Assert.assertEquals(calc.subtraction(2, 3), -1.0, delta, "2 - 3 operation result is wrong!");

	}

	@Test(description = "Subtraction 1.5 - 0.33 check")
	public void checkSubtractionFloats() {

		Assert.assertEquals(calc.subtraction(1.5, 0.33), 1.17, delta, "1.5 - 0.33 operation result is wrong!");
	}

	@Test(description = "Subtraction 1.1 - 1.1 check")
	public void checkSubtractionSelf() {

		Assert.assertEquals(calc.subtraction(1.1, 1.1), 0.0, delta, "1.1 - 1.1 operation result is wrong!");

	}

}
