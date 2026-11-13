package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Department_details")
@Data
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId;
	
	@Column(name="department_name",length=30)
	private String departmentName;
	
	@Column(name="location",length=30)
	private String location;
	
	@Column(name="established_year",length=5)
	private int establishedYear;
	
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.PERSIST)
	private List<Doctor> listOfDoctors;

}
