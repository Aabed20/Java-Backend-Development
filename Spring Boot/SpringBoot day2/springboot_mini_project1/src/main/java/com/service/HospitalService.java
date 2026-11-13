package com.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.components.Hospital;

@Component
public class HospitalService 
{
	public List<Hospital> hospitals;
	
	public HospitalService() 
	{
		this.hospitals= new ArrayList<>();
	}
	

	public int addHospital(String hospitalName, List<String> listOfTreatements, String contactPerson,
			String contactNumber, String location)
	{
		Hospital hospital = new Hospital(hospitalName,listOfTreatements, contactPerson,
			contactNumber, location);
		
		hospitals.add(hospital);
		
		return hospital.getHospitalCode();
	}
	
	public Map<Integer,String> getHospitalName(int code)
	{
		Map<Integer,String> map = new LinkedHashMap<>();
		for(Hospital hospital:hospitals)
		{
			if(hospital.getHospitalCode()==code)
			{
				map.put(code, hospital.getHospitalName());
				return map;
			}
		}
		return null;
	}
	
	public Hospital getAllDetailsOfHospital(int code)
	{
		for(Hospital hospital:hospitals)
		{
			if(hospital.getHospitalCode()==code)
			{
				return hospital;
			}
		}
		
		return null;
	}
}
