package blc;

public class Employee2 {

	private int id;
	private String name;
	private double salary;
	private double increment;
	
	public void setEmployeeDetails(int id , String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	
	}
	
	public void calculateSalaryIncrement()
	{
		
		if(salary>80000)
		{
		   increment = salary*0.05;
			salary += increment;
			System.out.println("----- Salary Increment Details -----");
			System.out.println("Salary increment amount : "+increment);
			System.out.println("After increment, Updated salary : "+salary);
		}
		
		else if(salary>=50000&&salary<=80000)
		{
			 increment = salary*0.07;
			salary += increment;
			System.out.println("----- Salary Increment Details -----");
			System.out.println("Salary increment amount : "+increment);
			System.out.println("After increment, Updated salary : "+salary);
		}
		else if(salary<50000)
		{
		    increment = salary*0.10;
			salary += increment;
			System.out.println("----- Salary Increment Details -----");
			System.out.println("Salary increment amount : "+increment);
			System.out.println("After increment, Updated salary : "+salary);
		}
		else
		{
		 increment = 0;
		}
		
	}
	
	public String toString() {
		
		 System.out.println("----- Employee Information -----");
		 System.out.println("Employee Details:");
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary+"]";
	}
	
	
	
	
}
