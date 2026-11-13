package blc;

public class Employee3 {

	private String firstName;
	private String lastname;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public Employee3(String firstName, String lastname, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void calculateSalary()
	{
		double updatedSalary=0;
		
		if(noOfProject>=20)
		{
			updatedSalary= salary+15000;
			System.out.println("updated salary: "+updatedSalary);
		}
		else if(noOfProject>=10&&noOfProject<20)
		{
			updatedSalary = salary+10000;
			System.out.println("updated salary: "+updatedSalary);
		}
		else if(noOfProject>5&&noOfProject<10)
		{
			updatedSalary = salary+5000;
			System.out.println("updated salary: "+updatedSalary);
		}
		else {
			updatedSalary = salary;
			System.out.println("Salary remains "+updatedSalary);
		}
		
		
	}

	
	public String toString() {
		
		return "Employee3 [firstName=" + firstName + ", lastname=" + lastname + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]" ;
	
		}
	
	
	
}
