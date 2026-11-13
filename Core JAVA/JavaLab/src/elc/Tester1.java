package elc;

import java.util.Scanner;

import blc.Employee1;

public class Tester1 {

	public static void main(String[] args) {
		Employee1 Pathan = new Employee1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fName = sc.nextLine();
		System.out.println("Enter your Last Name");
		String lName = sc.nextLine();
		System.out.println("Enter your Id Number");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your Salary ");
		Double sal = Double.parseDouble(sc.nextLine());
		System.out.println("Enter how many projects you have Done ");
		int projects = Integer.parseInt(sc.nextLine());
		sc.close(); 
		
		Pathan.setEmployeeData(fName, lName, empId, sal, projects);
		Pathan.calculateSalary();
		Pathan.displayDetails();

	}

}
