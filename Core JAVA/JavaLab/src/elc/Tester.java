package elc;

import java.util.Scanner;

import blc.Student1;

public class Tester {

	public static void main(String[] args) {
		Student1 Aabed = new Student1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Enter your Marks");
		int marks = Integer.parseInt(sc.nextLine());
		sc.close();
		Aabed.setStudentData(id, name, marks);
		Aabed.calculateGrade();
		System.out.println(Aabed.displayDetails());
		
		
	}

}
