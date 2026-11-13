package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.components.Hospital;
import com.service.HospitalService;

@SpringBootApplication
public class HospitalFinder 
{
	@Autowired
	Environment environment;
	
	@Bean
	public Hospital hospital()
	{
		Hospital hospital = new Hospital();
		hospital.setHospitalName(environment.getProperty("hospital.name"));
		
		List<String> list = Binder.get(environment)
				.bind("hospital.listoftreatement", Bindable.listOf(String.class))
				.orElse(new ArrayList<>());
		hospital.setListOfTreatements(list);	
		hospital.setContactPerson(environment.getProperty("hospital.contactperson"));
		hospital.setContactNumber(environment.getProperty("hospital.contactnumber"));
		hospital.setLocation(environment.getProperty("hospital.location"));
		
	    return hospital;
	}
	
	public static void main(String[] args) 
	{
		ApplicationContext context =
		SpringApplication.run(HospitalFinder.class);
		
		Hospital bean1 = context.getBean(Hospital.class);
		
		HospitalService bean2 = context.getBean(HospitalService.class);
		
		int code = bean2.addHospital(bean1.getHospitalName(), bean1.getListOfTreatements(), 
				bean1.getContactPerson(), bean1.getContactNumber(), bean1.getLocation());
		
		System.out.println(code);
		
		Map<Integer, String> hospitalName = bean2.getHospitalName(code);
		
		if(!(hospitalName==null))
		{
			System.out.println(hospitalName);
		}
		else
		{
			System.out.println("no hospital found with hospital code : "+code);
		}
		
		Hospital hospitalDetails = bean2.getAllDetailsOfHospital(code);
		
		if(!(hospitalDetails==null))
		{
			System.out.println(hospitalDetails);
		}
		else
		{
			System.out.println("no hospital found with hospital code : "+code);
		}
	}

}
