package com.report_generator;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReportGenerator implements ReportGenerator {

	@Override
	public void generateReport() 
	{
		System.out.println("Pdf Report generated Successfully");
		
	}

}
