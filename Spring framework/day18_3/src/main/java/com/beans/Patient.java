package com.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("resources/application.properties")
public class Patient 
{
	
	private int patientId;
	
	private String patientName;
	
	private int age;
	
	public Patient(
	@Value("${patient.id}") int id,
	@Value("${patient.name}") String name,
	@Value("${patient.age}") int age
			)
	{
		this.patientId=id;
		this.patientName=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + "]";
	}
	
}
