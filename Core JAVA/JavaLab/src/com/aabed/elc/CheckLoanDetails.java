package com.aabed.elc;

import java.util.Scanner;

class Loan {

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
public class CheckLoanDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Loan Amount : ");
		double loanAmount=sc.nextDouble();
		System.out.print("Enter Interest Rate :");
		double ir=sc.nextDouble();
		System.out.print("Enter number of months for Loan :");
		int nom=sc.nextInt();
		
		Loan loan = new Loan(loanAmount,ir,nom);
		System.out.println(loan.toString());
	}

}
