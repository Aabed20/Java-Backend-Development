package com.main;

import java.util.Arrays;
import java.util.List;

import com.daos.DepartmentDao;
import com.entities.Department;
import com.entities.Doctor;

public class App 
{
	public static void main(String[] args) 
	{
	    Doctor d1 = new Doctor();
        d1.setDoctorName("Dr. Amit Sharma");
        d1.setSpecialization("Cardiologist");
        d1.setSalary(90000);

        Doctor d2 = new Doctor();
        d2.setDoctorName("Dr. Syed Saquib");
        d2.setSpecialization("Cardiologist");
        d2.setSalary(85000);

        Doctor d3 = new Doctor();
        d3.setDoctorName("Dr. Rahul Kumar");
        d3.setSpecialization("Cardiologist");
        d3.setSalary(80000);

        Department dep1 = new Department();
        dep1.setDepartmentName("Cardio Department");
        dep1.setEstablishedYear(2020);
        dep1.setLocation("Hyderabad");

        d1.setDepartment(dep1);
        d2.setDepartment(dep1);
        d3.setDepartment(dep1);

        List<Doctor> list = Arrays.asList(d1, d2, d3);
        dep1.setListOfDoctors(list);

        DepartmentDao.insertData(dep1);
        
      //  DepartmentDao.removeDoctor(1);
        
        DepartmentDao.getDoctorRecord(2);
    }
}


