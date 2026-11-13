package com.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ecommerce/application-context.xml");

		ProductOrder bean1 = context.getBean("order", ProductOrder.class);
		bean1.setOrderId(123);bean1.setProductName("Realme p4x");
		bean1.setCustomerName("Aabed"); bean1.setPrice(22000);
		
		ProductOrder bean2 = context.getBean("order", ProductOrder.class);
		bean2.setOrderId(124); bean2.setProductName("Redmibook 15");
		bean2.setCustomerName("Pathan"); bean2.setPrice(35000);
		
		ProductOrder bean3 = context.getBean("order", ProductOrder.class);
		bean3.setOrderId(125); bean3.setProductName("IQOO Z9X");
		bean3.setCustomerName("Asef"); bean3.setPrice(18000);
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		
		System.out.println(bean1.hashCode()+" "+bean2.hashCode()+" "+bean3.hashCode());
	}

}
