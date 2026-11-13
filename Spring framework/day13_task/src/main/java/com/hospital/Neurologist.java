package com.hospital;

import org.springframework.stereotype.Component;

@Component("neurologist")
public class Neurologist implements Doctor 
{
	@Override
	public void doConsultation() 
	{
	   System.out.println("Neurologist doctor consulted");
	}
	
	
	public String toString()
	{
		return "Neurologist Doctor";
	}

}
