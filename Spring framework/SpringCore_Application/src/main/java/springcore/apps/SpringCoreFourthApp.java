package springcore.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day1.springcore4.ToyCar;

public class SpringCoreFourthApp {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day1/springcore4/application-context.xml");
	
		ToyCar bean = context.getBean("toyCar", ToyCar.class);
		
		System.out.println(bean);
	}

}
