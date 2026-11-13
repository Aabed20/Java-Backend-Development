package elc;


import java.util.Scanner;

import blc.Employee2;

public class EmployeeDemo1 {

	public static void main(String[] args) {
		Employee2 Aabed = new Employee2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee Name: ");
        String name  = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        
        sc.close();
        Aabed.setEmployeeDetails(id, name, salary);
        
        Aabed.calculateSalaryIncrement();
        System.out.println(Aabed.toString());
	}

}
