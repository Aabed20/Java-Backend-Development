package elc;

import java.util.Scanner;

import blc.Employee3;

public class Tester3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("firstName :");
		String firstName = sc.nextLine();
        System.out.println("lastName :");
        String lastName = sc.nextLine();
        System.out.println("employeeId :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("salary :");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("NoOfProject :");
        int noOfProjects = Integer.parseInt(sc.nextLine());
        sc.close();
        Employee3 emp = new Employee3(firstName, lastName, id, salary, noOfProjects);
        if(noOfProjects>0)
        {
        	System.out.println(emp.toString());
        }
        else {
        	System.err.println("Number of projects cannot be negative");
        }
        emp.calculateSalary();
	}

}
