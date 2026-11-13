package com.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientRecord 
{    
	@Autowired()
	@Qualifier("cardiologist")
	Doctor doctor;
	@Value("Asef")
	private String patientName;
	
	public PatientRecord() {}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void displayData()
	{
		System.out.println("Patient Name = "+this.patientName);
		System.out.println(doctor);
		doctor.doConsultation();
	}
}
