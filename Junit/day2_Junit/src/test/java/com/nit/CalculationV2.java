package com.nit;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculationV2 
{
	public int a;
	public int b;
	public int expected;
	public String operation;
	public static Calculation calculation = new Calculation();
	
	public CalculationV2(int a, int b, int expected,String operation)
	{
		this.a=a;
		this.b=b;
		this.expected=expected;
		this.operation=operation;
	}
	
	@Parameters
	public static List<Object[]> valuesForAddition()
	{
		Object[][] arr= {
				 {10,10,20,"add"},
				 {20,0,20,"add"},
				 {0,0,0,"add"},
				 {-10,20,10,"add"}
				 , {20,10,10,"sub"},
					{10,20,-10,"sub"},
					{20,20,0,"sub"},
					{0,0,0,"sub"}
				 ,{20,5,100,"mul"},
					{10,20,200,"mul"},
					{20,20,400,"mul"},
					{0,0,0,"mul"}
		};
		
		return Arrays.asList(arr);
	}
	
	@Test
	public void calculationTest() {

	    int actualResult = 0;

	    if (operation.equals("add")) {
	        actualResult = calculation.add(a, b);
	    } 
	    else if (operation.equals("sub")) {
	        actualResult = calculation.sub(a, b);
	    } 
	    else if (operation.equals("mul")) {
	        actualResult = calculation.multiplication(a, b);
	    }

	    assertEquals(expected, actualResult);
	}

}
