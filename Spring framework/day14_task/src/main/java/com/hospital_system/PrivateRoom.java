package com.hospital_system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("private")
public class PrivateRoom implements HospitalRoom
{
	@Override
	public void allocateRoom()
	{
		System.out.println("Private Room allocated");

	}

	public String toString()
	{
		return "Private Room";
	}
}
