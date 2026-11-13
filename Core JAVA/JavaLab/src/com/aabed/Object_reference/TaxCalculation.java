package com.aabed.Object_reference;

import java.util.Scanner;

class Employee {

	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hraPer;
	private double daPer;
	
	public Employee(int employeeId, String employeeName, double basicSalary, double hraPer, double daPer) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hraPer = hraPer;
		this.daPer = daPer;
	}

	public double calculateGrossSalary()
	{
		return basicSalary+(basicSalary*(hraPer/100))+(basicSalary*(daPer/100));
	}
	
}
class Manager{
	
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double hraPer;
	private double daPer;
	private double projectAllowance;
	
	public Manager(int managerId, String managerName, double basicSalary, double hraPer, double daPer,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.hraPer = hraPer;
		this.daPer = daPer;
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary() {
		
		return basicSalary+(basicSalary*(hraPer/100))+(basicSalary*(daPer/100))+projectAllowance;
	}

}

class Trainer {
	
	private int trainerId;
	private String trainerName;
	private double basicSalary;
	private double hraPer;
	private double daPer;
	private int batchCount;
	private double perkPerBatch;
	
	public Trainer(int trainerId, String trainerName, double basicSalary, double hraPer, double daPer, int batchCount,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		this.hraPer = hraPer;
		this.daPer = daPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary() {
		
		return basicSalary+(basicSalary*(hraPer/100))+(basicSalary*(daPer/100))+(batchCount*perkPerBatch);
	}

}

class Sourcing{
	
	private int sourceId;
	private String sourceName;
	private double basicSalary;
	private double hraPer;
	private double daPer;
	private double enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	public Sourcing(int sourceId, String sourceName, double basicSalary, double hraPer, double daPer,
			double enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		this.hraPer = hraPer;
		this.daPer = daPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary() {
		
		return basicSalary+(basicSalary*(hraPer/100))+(basicSalary*(daPer/100))+((((double)enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
	
	
}

class TaxUtil{
	
	public static double calculatetax(Employee e) {
		
	     if(e.calculateGrossSalary()>50000) {
	    	return e.calculateGrossSalary()*0.2;
	     }
	     else {
	    	 return e.calculateGrossSalary()*0.05;
	     }
	}
	
	public static double calculatetax(Manager m) {
		
	     if(m.calculateGrossSalary()>50000) {
	    	return m.calculateGrossSalary()*0.2;
	     }
	     else {
	    	 return m.calculateGrossSalary()*0.05;
	     }
	}
	public static double calculatetax(Trainer t) {
		
	     if(t.calculateGrossSalary()>50000) {
	    	return t.calculateGrossSalary()*0.2;
	     }
	     else {
	    	 return t.calculateGrossSalary()*0.05;
	     }
	}
	
	public static double calculatetax(Sourcing s) {
		
	     if(s.calculateGrossSalary()>50000) {
	    	return s.calculateGrossSalary()*0.2;
	     }
	     else {
	    	 return s.calculateGrossSalary()*0.05;
	     }
	}
	
}

public class TaxCalculation{
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee e1= new Employee(101, "Aabed", 40000, 10, 5);
		System.out.println("Employee Salary : "+e1.calculateGrossSalary());
		System.out.println("Tax on Employee Salary : "+TaxUtil.calculatetax(e1));
		System.out.println("Employee in hand Salary : "+(e1.calculateGrossSalary()-TaxUtil.calculatetax(e1)));
		System.out.println("");
		
		Manager m1 = new Manager(102, "Scott", 60000, 10, 5, 15000);
		System.out.println("Manager Salary : "+m1.calculateGrossSalary());
		System.out.println("Tax on Manager Salary : "+TaxUtil.calculatetax(m1));
		System.out.println("Manager in hand Salary : "+(m1.calculateGrossSalary()-TaxUtil.calculatetax(m1)));
		System.out.println("");
		
		Trainer t1 = new Trainer(103,"Smith",45000,10,5,10,1000);
		System.out.println("Trainer Salary : "+t1.calculateGrossSalary());
		System.out.println("Tax on Trainer Salary : "+TaxUtil.calculatetax(t1));
		System.out.println("Trainer in Hand Salary : "+(t1.calculateGrossSalary()-TaxUtil.calculatetax(t1)));
		System.out.println("");
		
		Sourcing s1 = new Sourcing(104, "Pathan", 40000, 10, 5, 100,110, 100);
		System.out.println("Sourcing salary : "+s1.calculateGrossSalary());
		System.out.println("Tax on Sourcing Salary : "+TaxUtil.calculatetax(s1));
		System.out.println("Sourcing in hand Salary : "+(s1.calculateGrossSalary()-TaxUtil.calculatetax(s1)));
	}
	
}


