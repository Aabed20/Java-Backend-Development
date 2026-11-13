package com.aabed.blc;

public class Loan {

	private double principal;
	private double interestRate;
	private int durationMonths;
	
	public Loan(double principal, double interestRate, int durationMonths) {
		super();
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
	}

	public double getPrincipal() {
		return principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

	@Override
	public String toString() {
		return "Loan [principal=" + principal + ", interestRate=" + interestRate + ", durationMonths=" + durationMonths
				+ "]";
	}
	
	
	
}
