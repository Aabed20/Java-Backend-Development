package com.report_generator;

import org.springframework.stereotype.Component;

@Component("html")
public class HtmlReportGenerator implements ReportGenerator {

	@Override
	public void generateReport()
	{
		System.out.println("Html Report Generated Successfully");
		
	}

}
