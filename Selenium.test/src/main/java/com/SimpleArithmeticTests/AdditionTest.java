package com.SimpleArithmeticTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class AdditionTest {

	private Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Addition test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Addition test completed\n");

	}

	@Test(description = "Addition 0 + 3 check")
	public void checkZeroAddition() {

		Assert.assertEquals(calc.addition(0, 3), 3.0, delta, "0 + 3 operation result is wrong!");

	}

	@Test(description = "Addition 5 + -5 check")
	public void checkAdditionNegative() {

		Assert.assertEquals(calc.addition(5, -5), 0.0, delta, "5 + -5 operation result is wrong!");

	}

	@Test(description = "Addition 2 + 3 check")
	public void checkSimpleAddition() {

		Assert.assertEquals(calc.addition(2, 3), 5.0, delta, "2 + 3 operation result is wrong!");

	}

	@Test(description = "Addition 1.5 + 0.33 check")
	public void checkAdditionFloats() {

		Assert.assertEquals(calc.addition(1.5, 0.33), 1.83, delta, "1.5 + 0.33 operation result is wrong!");

	}

}
