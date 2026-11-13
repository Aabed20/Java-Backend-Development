package com.nit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Order;
import com.configuration.PaymentConfig;

public class App 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PaymentConfig.class);

		Order bean = context.getBean(Order.class);
		
		System.out.println(bean);
	}

}
