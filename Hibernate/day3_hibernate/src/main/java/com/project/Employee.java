package com.project;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name="emp_data")
@Data
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="emp_name" , length=30)
	private String name;
	
	@Column(name="emp_address", length=60)
	private String address;
	
	@Column(name="company_name",length=30)
	private String companyName;
	
	@Column(name="emp_joindate")
	private LocalDate joiningDate;
	
	@Column(name="project_assign_date_time")
	private LocalDateTime projectAssignmentDateAndTime;
	
	@Column(name="project_submit_date_time")
	private LocalDateTime projectSubmissionDateAndTime;
	
	@Transient
	private String hrEmail;
	
	@Column(name="emp_image")
	@Lob
	private byte[] employeeImage;
	

}
