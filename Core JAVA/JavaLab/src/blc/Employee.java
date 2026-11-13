package blc;

public class Employee {
  
	int employeeId;
	String employeeName;
	String employeePosition;
	double employeeSalary;
	int employeeAge;
	
	public void setEmployeeData(int id, String name, String position,int age, double salary )
	{
		employeeId =id;
		employeeName =name;
		employeePosition = position;
		employeeAge = age;
		employeeSalary = salary;
	}
	public void getEmployeeData()
	{
		System.out.println("Employee Id is "+employeeId);
		System.out.println("Employee Name is "+employeeName);
		System.out.println(employeeName+" is "+employeePosition);
		System.out.println(employeeName+" Age is "+employeeAge);
		System.out.println(employeeName+" Salary is "+employeeSalary);
	}
	
	
	
}
