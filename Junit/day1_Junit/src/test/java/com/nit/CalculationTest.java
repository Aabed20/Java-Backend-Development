package com.nit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest 
{
	private Calculation calculation;
	private int positiveNumber1;
	private int positiveNumber2;
	private int expectedResult;
	
	@Before
	public void setUp()
	{
		calculation = new Calculation();
		positiveNumber1 = 10;
		positiveNumber2 = 20;
		expectedResult = 30;
	}
	
	@Test
	public void testPositiveResult()
	{
		int result = calculation.add(positiveNumber1, positiveNumber2);
		
		assertEquals(expectedResult, result);
	}
	@After
	public void tearDown()
	{
		calculation = null;
		positiveNumber1=0;
		positiveNumber2=0;
		expectedResult=0;
	}
	
	

}
