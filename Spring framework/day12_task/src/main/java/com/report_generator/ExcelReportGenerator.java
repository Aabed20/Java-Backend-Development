package com.report_generator;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReportGenerator implements ReportGenerator {

	@Override
	public void generateReport() 
	{
		System.out.println("Excel Report Generated successfully");
		
	}

}
