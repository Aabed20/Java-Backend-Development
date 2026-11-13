package com.employee_record;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao 
{
	@Autowired
	private JdbcTemplate template;
	
	private final String QUERY_FOR_fETCHING_ALL_EMPLOYEES="select id, name,department, salary from employee";
	
	private final String QUERY_FOR_FETCHING_ONE_EMPLOYEE="select id, name, department, salary from employee where id=?";
	public List<Employee> getAllEmployees()
	{	
		List<Employee> list = template.query(QUERY_FOR_fETCHING_ALL_EMPLOYEES, (res,rowNum)->new Employee(res.getInt(1),res.getString(2),res.getString(3),res.getDouble(4)));
		return list;
	}
	
	public Employee getEmployeeById(int id)
	{
		Employee emp = template.queryForObject(QUERY_FOR_FETCHING_ONE_EMPLOYEE, (res,rowNum)->new Employee(res.getInt(1),res.getString(2),res.getString(3),res.getDouble(4)),id);
		return emp;
	}
}
