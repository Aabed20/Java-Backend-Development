package com.cab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cab/application-context.xml");

		Cab bean1 = context.getBean("cab", Cab.class);
		
		bean1.setCabId(101);
		bean1.setDriverName("Irfan");
		bean1.setCabType("non-Ac");
		bean1.setRatePerKm(10);
		
         Cab bean2 = context.getBean("cab", Cab.class);
		
		bean2.setCabId(102);
		bean2.setDriverName("Asef");
		bean2.setCabType("Luxury Ac");
		bean2.setRatePerKm(40);
		
        Cab bean3 = context.getBean("cab", Cab.class);
		
		bean3.setCabId(103);
		bean3.setDriverName("Tejes");
		bean3.setCabType("Ac");
		bean3.setRatePerKm(20);
		
		
		System.out.println(bean1.hashCode()==bean2.hashCode());
		System.out.println(bean2.hashCode()==bean3.hashCode());
		System.out.println(bean1.hashCode()==bean3.hashCode());
		
		int distance = 10;
		
		int totalFare1=bean1.getRatePerKm()*10;
		
		int totalFare2=bean2.getRatePerKm()*10;
		
		int totalFare3=bean3.getRatePerKm()*10;
		
		System.out.println(bean1);
		System.out.println("Cab1 total fare : "+totalFare1);
		
		System.out.println();
		
		System.out.println(bean2);
		System.out.println("Cab2 total fare :"+totalFare2);
		
		System.out.println();
		
		System.out.println(bean3);
		System.out.println("Cab3 total fare :"+totalFare3);
		
		
	}

}
