package com.aabed.Array;
import java.util.*;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter number of employees: ");
         int employeeSize = sc.nextInt();
         System.out.println("");
		Employee emp[] = new Employee[employeeSize];
		
		for(int i=0; i<employeeSize; i++) {
			
			System.out.println("Enter details for Employee "+(i+1)+":");
			System.out.print("Enter ID: ");
			int id=sc.nextInt();
			System.out.print("Enter Name: ");
			String name =sc.next();
			System.out.print("Enter Salary: ");
			double salary =sc.nextDouble();
			System.out.println("");
			
		    emp[i] = new Employee(id,name,salary);
		}
		System.out.println("==========Employee Details========");
		for(Employee emps : emp) {
			System.out.println(emps);
		}
		
		sc.close();
		
		
	}

}
