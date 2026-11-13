package com.hospital;

import java.util.Map;

public class Hospital
{
private Map<Integer,Doctor> doctors;

public Hospital(Map<Integer, Doctor> doctors) {
	super();
	this.doctors = doctors;
}

public Map<Integer, Doctor> getDoctors() {
	return doctors;
}

@Override
public String toString() {
	return "Hospital [doctors=" + doctors + "]";
}


	

}
