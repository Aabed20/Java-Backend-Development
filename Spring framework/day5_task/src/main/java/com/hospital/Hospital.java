package com.hospital;

public class Hospital
{
 private String hospitalName;
 private Doctor doctor;
 
 public Hospital() {}

 public String getHospitalName() {
	return hospitalName;
 }

 public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
 }

 public Doctor getDoctor() {
	return doctor;
 }

 public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
 }

 @Override
 public String toString() {
	return "Hospital [hospitalName=" + hospitalName + ", doctor=" + doctor + "]";
 }
 
 
	
}
