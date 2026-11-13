package aabed;

class Employee1{
	
	private double salary=75000;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}


public class Pass {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1();
		System.out.println(e1.getSalary());
		
		accept(e1);
		System.out.println(e1.getSalary());

	}
	public static void accept(Employee1 emp)
	{
		emp=new Employee1();
		emp.setSalary(90000);
	}

}
