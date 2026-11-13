package com.aabed.Array;

public class StudentArrayDemo {

	public static void main(String[] args) {

		Student students[] = new Student[3];
		
		students[0] = new Student(111,"Tej",80);
		students[1] = new Student(112,"Aabed",87.2); 
		students[2] = new Student(113,"Asif",85);
		
		for(Student student : students) {
			
			System.out.println(student);
		}
		
		
	}

}
