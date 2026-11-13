package com.online_food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/online_food/application-context.xml");

		FoodOrder bean = context.getBean("food", FoodOrder.class);
		
		FoodOrder bean2 = context.getBean("food", FoodOrder.class);
		
		bean2.setOrderId(2345);
		bean2.setFoodItem("Chicken mandi");
		bean2.setCustomerName("Rahil");
		bean2.setAmount(300);
		
		System.out.println(bean.equals(bean2));
		System.out.println(bean.hashCode()+" "+bean2.hashCode());
		System.out.println(bean);
		System.out.println(bean2);
	}

}
