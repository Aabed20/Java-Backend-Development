package com.hospital;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("com/hospital/application-context.xml");	
	
	Hospital bean = context.getBean("hospital", Hospital.class);
	
	System.out.println(bean);
	
	Map<Integer, Doctor> doctors = bean.getDoctors();
	
	if(doctors.containsKey(101))
	{
		System.out.println("Doctor Found!!!");
		System.out.println(doctors.get(101));
	}
	else
	{
		System.out.println("Invalid Doctor ID");
	}
	}

}
