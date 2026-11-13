package elc;

import java.util.Scanner;

import blc.Employee;

public class EmployeeDemo
{
 public static void main(String[] args)
 {
	 Employee Aabed = new Employee();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Id");
	 int id = Integer.parseInt(sc.nextLine());
	 System.out.println("Enter your Name");
	 String name = sc.nextLine();
	 System.out.println("Enter your position");
	 String position = sc.nextLine();
	 System.out.println("Enter your age");
	 int age = Integer.parseInt(sc.nextLine());
	 System.out.println("Enter your Salary");
	 double salary = Double.parseDouble(sc.nextLine());
	 
	 
	 Aabed.setEmployeeData(id, name, position, age, salary);
	 Aabed.getEmployeeData();
	 System.out.println("-------------------------");
	 Employee Eteshaam = new Employee();
	 System.out.println("Enter your Id");
	 int id1 = Integer.parseInt(sc.nextLine());
	 System.out.println("Enter your Name");
	 String name1 = sc.nextLine();
	 System.out.println("Enter your position");
	 String position1 = sc.nextLine();
	 System.out.println("Enter your age");
	  int age1 = Integer.parseInt(sc.nextLine());
	 System.out.println("Enter your Salary");
	 double salary1 = Double.parseDouble(sc.nextLine());
	 
	 Eteshaam.setEmployeeData(id1, name1, position1, age1, salary1);
	 Eteshaam.getEmployeeData();
	 sc.close();
	 
 }
}
