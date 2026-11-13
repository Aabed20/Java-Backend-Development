package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("resources/application.properties")
public class Doctor 
{
	
	private int doctorId;
	
	private String doctorName;
	
	private String specialization;
	
	
	public Doctor(
	@Value("${doctor.id}") int id,
	@Value("${doctor.name}") String name,
	@Value("${doctor.specialization}") String specialization
			)
	{
		this.doctorId=id;
		this.doctorName=name;
		this.specialization=specialization;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ "]";
	}

}
