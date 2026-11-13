package com.report_generator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.report_generator");
		
		ReportService bean = context.getBean("report",ReportService.class);
		
		bean.getReportGenerator().generateReport();
	}

}
