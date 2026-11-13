package array;

class Employee{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "EmployeeId=" + employeeId +
			   "EmployeeName=" + employeeName + 
			   "EmployeeSalary="+ employeeSalary ;
	}

}


public class EmpolyeeArray {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Aabed",80000);
		Employee e2 = new Employee(102,"Tej",80000);
		Employee e3 = new Employee(103,"Harshad",80000);
		Employee e4 = new Employee(104,"Asif",80000);
		
		Employee arr[] = new Employee[4];
		arr[0]=e1;
		arr[1]=e2;
		arr[2]=e3;
		arr[3]=e4;
		System.out.println("Employee Details: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
