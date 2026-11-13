package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.components.HospitalService;

@SpringBootApplication
public class SpringBoot3rdApplication 
{
	public static void main(String[] args) 
	{
	   ApplicationContext context = SpringApplication.run(SpringBoot3rdApplication.class);

	   HospitalService bean = context.getBean(HospitalService.class);
	   
	   bean.displayDoctorDetails();
	}

}
