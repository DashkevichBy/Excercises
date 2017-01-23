package com.SimpleArithmeticTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.cdp.javabasics_testng.L2.Calculator;

public class DivisionTest {

	private Calculator calc;
	private static final double delta = 0.01;

	@BeforeClass
	public void createCalculatorInstance() {
		System.out.println("Division test started");
		calc = new Calculator();
	}

	@AfterClass
	public void tearDown() {
		
		System.out.println("Division test completed\n");
		
	}

	@Test(description = "Division 10/2 check")
	public void checkDivisionPositive() {

		Assert.assertEquals(calc.division(10, 2), 5.0, delta, "10/2 operation result is wrong!");

	}

	@Test(description = "Division -10/-2 check")
	public void checkDivisionNegative() {

		Assert.assertEquals(calc.division(-10, -5), 2.0, delta, "-10/-2 operation result is wrong!");

	}

	@Test(description = "Division 10/10 check")
	public void checkDivisionSelf() {

		Assert.assertEquals(calc.division(10, 10), 1.0, delta, "10/10 operation result is wrong!");

	}

	@Test(description = "Division 10/-2 check")
	public void checkDivisionPositiveNegative() {

		Assert.assertEquals(calc.division(8, -4), -2.0, delta, "8/-4 operation result is wrong!");

	}

}
