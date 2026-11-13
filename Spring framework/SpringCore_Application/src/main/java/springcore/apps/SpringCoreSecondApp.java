package springcore.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day1.springcore2.Student;

public class SpringCoreSecondApp {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day1/springcore2/application-context.xml");

		Student bean = context.getBean("student", Student.class);
		bean.displayStudent();
	}

}
