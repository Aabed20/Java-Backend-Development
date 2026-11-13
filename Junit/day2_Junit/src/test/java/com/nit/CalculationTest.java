package com.nit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest 
{
	private Calculation calculation;
	
	@Before
	public void setUp()
	{
		calculation = new Calculation();
		
	}
	
	@Test
	public void addTest()
	{
		int actualResult = calculation.add(10, 20);
		
		assertEquals(30, actualResult);	
	}
	
	@Test
	public void objectIsNotNull()
	{
		assertNotNull(calculation);	
	}
	
	@Test
	public void objectIsNull()
	{
		calculation=null;
		assertNull(calculation);
	}
	
	@Test
	public void testIsNumberPositive()
	{
		assertTrue(calculation.isPositive(10));
	}
	
	@Test
	public void testIsNumberNotPositive()
	{
		assertFalse(calculation.isPositive(-2));
	}
	
	@After
	public void tearDown()
	{
		calculation=null;
	}

}
