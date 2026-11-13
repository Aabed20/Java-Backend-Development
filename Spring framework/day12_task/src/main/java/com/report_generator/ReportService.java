package com.report_generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component("report")
public class ReportService 
{
	ReportGenerator reportGenerator;
	
	public ReportService() {}

	public ReportGenerator getReportGenerator() {
		return reportGenerator;
	}

	@Autowired()
	@Qualifier("excel")
	public void setReportGenerator(ReportGenerator reportGenerator) 
	{
		this.reportGenerator = reportGenerator;
	}
}
