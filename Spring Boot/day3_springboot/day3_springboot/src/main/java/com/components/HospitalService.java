package com.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospitalService 
{
	private Doctor doctor;
	
	@Autowired
	public HospitalService(Doctor doctor)
	{
		this.doctor=doctor;
	}
	
	public void displayDoctorDetails()
	{
		System.out.println(doctor);
	}

}
