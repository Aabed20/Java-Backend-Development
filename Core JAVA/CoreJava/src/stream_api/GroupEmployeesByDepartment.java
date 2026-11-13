package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee
{
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	public Employee(int employeeId, String employeeName, double salary,String department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
}

public class GroupEmployeesByDepartment
{
	public static void main(String[] args)
	{
		List<Employee> list = Arrays.asList(new Employee(101,"Aabed Pathan",60000,"IT"),new Employee(202,"Rahil",50000,"IT"),new Employee(105,"Asef",40000,"Testing"),new Employee(201,"Tejes",3000,"Database"),new Employee(202,"Harshad",30000,"Database"),
				      new Employee(204,"Priya",45000,"HR"),new Employee(103,"Lalit",40000,"Testing"));
				
		Map<String, List<Employee>> map = list.stream()
		   .collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.toList()));

	/*	map.forEach((k,v)->
		{
			IO.println(k+" "+v.toString());
		}
				); */
		
		Map<String, Long> map1 = list.stream()
		   .collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.counting()));
		
	//	IO.print(map1);
		
		Map<String, List<String>> map2 = list.stream()
		    .collect(Collectors.groupingBy(e-> e.getDepartment(),Collectors.mapping(e ->e.getEmployeeName(), Collectors.toList())));
		
		IO.print(map2);
	}

}
