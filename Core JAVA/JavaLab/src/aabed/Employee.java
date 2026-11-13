package aabed;

public class Employee
{
	int id = 100;
	
	public static void main(String[] args) 
	{
		int val = 200;

		Employee e1 = new Employee();     

		e1.id = val;

		update(e1);	  
		
		System.out.println(e1.id);

        Employee e2 = new Employee(); 

		e2.id = 900;
        
		switchEmployees(e2,e1); 

		  //GC [How many objects are eligible for GC]

			System.out.println("E1 id = "+e1.id);
		    System.out.println("E2 id = "+e2.id);
	    } 
		
	 public static void update(Employee e)  
	 {
        e.id = 500;
		e = new Employee();
		e.id = 400;
		System.out.println(e.id);
	 }

	 public static void switchEmployees(Employee e1, Employee e2)
	  {
		 int temp = e1.id; 
		 e1.id = e2.id; 
		 e2 = new Employee();
		 e2.id = temp;
		 System.out.println("E2 temp id = "+e2.id);
	  }
   }