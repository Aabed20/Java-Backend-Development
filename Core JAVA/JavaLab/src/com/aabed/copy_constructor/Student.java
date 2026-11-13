package com.aabed.copy_constructor;

import java.util.Scanner;

class Stu{
	 String name;
	 int age;
	
	Stu(String name, int age){
		
		this.name=name;
		this.age=age;
	}
	Stu(Stu s){
		this.name=s.name;
		this.age=s.age;
	}
	void displayDetails() {
		
		System.out.println(" Name : "+name);
		System.out.println(" Age : "+age);
	}
	void updatedDetails() {
		System.out.println(" Name : "+name);
		System.out.println(" Age : "+age);

	}
}


public class Student {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name :");	
	String name = sc.nextLine();
	System.out.print("Enter age :");
	int age = sc.nextInt();
	
	Stu s1= new Stu(name,age);
	Stu s2= new Stu(s1);
	System.out.println("Before updating : ");
	s1.displayDetails();
	s2.displayDetails();
	System.out.println("---------------");
	sc.nextLine();
	System.out.print("Enter name :");	
	s2.name = sc.nextLine();
	System.out.print("Enter age :");
	s2.age = sc.nextInt();
 
	System.out.println("After updating ");
	s1.displayDetails();
	s2.updatedDetails();
	}

}
