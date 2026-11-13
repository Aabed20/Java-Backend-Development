package com.nit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.CompanyService;

public class App 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com/beans");

		CompanyService bean = context.getBean(CompanyService.class);
		
		System.out.println(bean);
	}

}
