package com.hospital;

public class Doctor
{
private String doctorName;
private String specialization;


public Doctor() {}


public String getDoctorName() {
	return doctorName;
}


public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}


public String getSpecialization() {
	return specialization;
}


public void setSpecialization(String specialization) {
	this.specialization = specialization;
}


@Override
public String toString() {
	return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + "]";
}


	
}
