package com.hospital;

import org.springframework.stereotype.Component;

@Component("cardiologist")
public class Cardiologist implements Doctor {

	@Override
	public void doConsultation() 
	{
		System.out.println("Cardiologist doctor consulted");

	}

	public String toString()
	{
		return "Cardiologist Doctor";
	}
}
