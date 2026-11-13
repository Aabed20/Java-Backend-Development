package elc;

import java.util.Scanner;

import blc.Loan;

public class CheckLoanDetails {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Loan Amount : ");
	double principal = Double.parseDouble(sc.nextLine());
	System.out.print("Enter Interest Rate : ");
	double interestRate = Double.parseDouble(sc.nextLine());
	System.out.print("Enter number of months for Loan : ");
	int durationMonths = Integer.parseInt(sc.nextLine());
	sc.close();
	
	Loan l1 = new Loan(principal, interestRate, durationMonths);
	
	l1.getDetails();
	

	}

}
