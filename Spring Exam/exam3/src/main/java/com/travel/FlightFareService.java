package com.travel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("flight")
@PropertySource("com/travel/application.properties")
public class FlightFareService implements FareService {

	@Value("${name}")
	private String name;
	@Value("${source}")
	private String source;
	@Value("${destination}")
	private String destination;
	@Value("${passengers}")
	private int passengers;
	@Value("${baseFare3}")
	private double baseFare;
	@Value("${tax}")
	private double tax;
	@Value("${charge}")
	private double bookingCharge;

	@Override
	public void calculatefare() 
	{
	double totalBaseFare = this.baseFare*this.passengers;
	double taxAmount = totalBaseFare*this.tax/100;
	double finalAmount = totalBaseFare+this.bookingCharge+taxAmount;
	System.out.println(toString());
	System.out.println("Tax Amount : "+taxAmount);
	System.out.println("Final Bill Amount : "+finalAmount);
	System.out.println("Travelling via Flight");
	

	}

	@Override
	public String toString() {
		return "FlightFareService [name=" + name + ", source=" + source + ", destination=" + destination + ", passengers="
				+ passengers + ", baseFare=" + baseFare +", bookingCharge=" + bookingCharge + "]";
	}

}
