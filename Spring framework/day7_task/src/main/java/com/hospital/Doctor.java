package com.hospital;

public class Doctor
{
 private Integer doctorId;
 private String doctorName;
 private String specialization;
 private Integer experience;
 public Doctor(Integer doctorId, String doctorName, String specialization, Integer experience) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.specialization = specialization;
	this.experience = experience;
 }
 public Integer getDoctorId() {
	return doctorId;
 }
 public void setDoctorId(Integer doctorId) {
	this.doctorId = doctorId;
 }
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
 public Integer getExperience() {
	return experience;
 }
 public void setExperience(Integer experience) {
	this.experience = experience;
 }
 @Override
 public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
			+ ", experience=" + experience + "]";
 }
 
 
	
}
