package array;
import java.util.*;

class Employe
{
	private int id;
	private String name;
	private double salary;
	
	public Employe(int id, String name, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class EmployeeArrayDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		IO.print("Enter number of Employees : ");
		int size = sc.nextInt();
		Employe emp[]= new Employe[size];
		for(int i=0; i<size; i++)
		{
			IO.println("Enter details for Employee "+(i+1)+" :");
			IO.print("Enter ID : ");
			int id = sc.nextInt();
			IO.print("Enter Name : ");
			String name = sc.next();
			IO.print("Enter Salary : ");
			double salary = sc.nextDouble();
			emp[i]= new Employe(id, name, salary);
			IO.println("");
		}
		IO.println("===== Employee Details =====");
		for(int i=0; i<emp.length; i++)
		{
			IO.println(emp[i]);
		}
		
	}

}
