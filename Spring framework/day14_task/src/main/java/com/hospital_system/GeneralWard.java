package com.hospital_system;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GeneralWard implements HospitalRoom
{
	@Override
	public void allocateRoom()
	{
		System.out.println("Room in General Ward allocated");
	}
	
	public String toString()
	{
		return "GeneralWard Room";
	}

}
