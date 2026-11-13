package springcore.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day1.springcore.Employee;

public class SpringCoreFirstApp 
{

	public static void main(String[] args) 
	{
        ApplicationContext context = new ClassPathXmlApplicationContext("com/day1/springcore/application-context.xml");
        
             Employee bean = context.getBean("employee", Employee.class);
             bean.displayEmployee();
             
	}

}
