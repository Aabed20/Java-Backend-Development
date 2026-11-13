package com.hospital_management;

public class Doctor 
{
	private int doctorId;
	private String doctorName;
	private String specialization;
	private String hospitalName;
	public Doctor(int doctorId, String doctorName) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
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
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", hospitalName=" + hospitalName + "]";
	}
	
	
}
