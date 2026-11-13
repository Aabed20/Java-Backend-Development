package com.hospital_system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("icu")
public class ICURoom implements HospitalRoom
{
	@Override
	public void allocateRoom() 
	{
		System.out.println("ICU Room Allocated");

	}
	
	public String toString()
	{
		return "ICU Room";
	}

}
