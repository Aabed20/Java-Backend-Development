package com.hospital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/hospital/hospital.properties")
public class Doctor
{
 private int doctorId;
 private String doctorName;
 private String specialization;
 private String hospitalName;
 private double consultationFee;
 
 public Doctor() {}

 public int getDoctorId() {
	return doctorId;
 }

 @Value("${id}")
 public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
 }

 public String getDoctorName() {
	return doctorName;
 }

 @Value("${name}")
 public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
 }

 public String getSpecialization() {
	return specialization;
 }

 @Value("${specialization}")
 public void setSpecialization(String specialization) {
	this.specialization = specialization;
 }

 public String getHospitalName() {
	return hospitalName;
 }

 @Value("${hospitalName}")
 public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
 }

 public double getConsultationFee() {
	return consultationFee;
 }

 @Value("${fee}")
 public void setConsultationFee(double consultationFee) {
	this.consultationFee = consultationFee;
 }

 @Override
 public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
			+ ", hospitalName=" + hospitalName + ", consultationFee=" + consultationFee + "]";
 }
 
}
