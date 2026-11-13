package com.ecommerce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
	   ApplicationContext context = new ClassPathXmlApplicationContext("com/ecommerce/application-context.xml");
	   
	   Order bean = context.getBean("order", Order.class);
	   
	   bean.setOrderId(101);
	   bean.setCustomerName("Aabed");
	   bean.setProductName("Realme p4x");
	   bean.setAmount(22000);
	   
      Order bean2 = context.getBean("order", Order.class);
	   
	   bean2.setOrderId(102);
	   bean2.setCustomerName("Rahil");
	   bean2.setProductName("Realme Tv");
	   bean2.setAmount(25000);
	   
	   System.out.println(bean.hashCode()==bean2.hashCode());
	   
	   System.out.println(bean);
	   System.out.println(bean2);

	}

}
