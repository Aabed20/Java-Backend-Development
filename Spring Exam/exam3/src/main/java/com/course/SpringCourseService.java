package com.course;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("spring")
@PropertySource("com/course/application.properties")
public class SpringCourseService implements CourseFeeService {

	@Value("${studentName}")
	private String studentName;
    @Value("${courseName2}")
	private String courseName;
    @Value("${fee2}")
	private double CourseFee;
    @Value("${months}")
	private int months;
    @Value("${gst}")
	private double gst;
    @Value("${discount}")
	private double discount;
    @Value("${regFee}")
	private double registrationFee;
	
	
	@Override
	public void calculateFee() 
	{
		double gstAmount = this.CourseFee*this.gst/100;
		double discountAmount = this.CourseFee*this.discount/100;
		double coursePayableFee = this.CourseFee+gstAmount-discountAmount;
		double finalAmount = coursePayableFee+this.registrationFee;
		System.out.println(toString());
		System.out.println("GST Amount : "+gstAmount);
		System.out.println("Discount Amount : "+discountAmount);
		System.out.println("Final Course Amount : "+finalAmount);
		System.out.println("Enrolled in Spring Course");

	}



	@Override
	public String toString() {
		return "SpringCourseService [studentName=" + studentName + ", courseName=" + courseName + ", CourseFee="
				+ CourseFee + ", months=" + months + ", registrationFee=" + registrationFee + "]";
	}

}
