package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Doctor_details")
@Data
public class Doctor 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id()
	private long doctorId;
	
	@Column(name="doctor_name",length=30)
	private String doctorName;
	
	@Column(name="specialization",length=30)
	private String specialization;
	
	@Column(name="salary",length=10)
	private double salary;
	
	 @ManyToOne
	 @JoinColumn(name = "department_id")
	private Department department;

}
