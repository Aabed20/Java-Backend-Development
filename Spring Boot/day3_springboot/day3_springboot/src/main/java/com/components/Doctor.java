package com.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Doctor 
{
	@Value("${doctor.id}")
	private int doctorId;
	@Value("${doctor.name}")
	private String  doctorName;
	@Value("${specialization}")
	private String specialization;
	
	@Value("${hospital.name}")
	private String hospitalName;
	@Value("${consultation.fee}")
	private double consultationFee;
	
	public Doctor()
	{}
	
	public String toString()
	{
		return "=========HOSPITAL DETAILS=========\n"+
	         "\nDoctor ID             :  "+this.doctorId+
			 "\nDoctor Name           :  "+this.doctorName+
			 "\nSpecialization        :  "+this.specialization+
			 "\nHospital Name         :  "+this.hospitalName+
			 "\nConsultation Fee      :  "+this.consultationFee+
		   "\n\n=================================="
			 ;
	}

}
