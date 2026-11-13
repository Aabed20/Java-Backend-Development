package coms.components;


public class Employee 
{
	private int employeeId;
	
	private String employeeName;
	
	private String department;
	
	private String designation;
	
	private double salary;
	
	private String location;
	
	public Employee() {}
	
	

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



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	static class EmployeeBuilder
	{
		private int employeeId;
		
		private String employeeName;
		
		private String department;
		
		private String designation;
		
		private double salary;
		
		private String location;
		
		public EmployeeBuilder() {}
 
		public EmployeeBuilder setEmployeeId(int id)
		{
		 this.employeeId=id;
		 return this;
		}

		public EmployeeBuilder setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
			return this;
		}

		public EmployeeBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}

		public EmployeeBuilder setDesignation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeBuilder setLocation(String location) {
			this.location = location;
			return this;
		}
		
		public Employee build()
		{
			Employee emp = new Employee();
			emp.setEmployeeId(this.employeeId);
			emp.setEmployeeName(this.employeeName);
			emp.setDepartment(this.department);
			emp.setDesignation(this.designation);
		    emp.setLocation(this.location);
		    emp.setSalary(this.salary);
		    return emp;
		}
		
	}
}
