package springcore.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.day1.springcore3.Book;

public class SpringCoreThirdApp {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/day1/springcore3/application-context.xml");

		Book bean = context.getBean("book", Book.class);
		 System.out.println(bean);
	}

}
