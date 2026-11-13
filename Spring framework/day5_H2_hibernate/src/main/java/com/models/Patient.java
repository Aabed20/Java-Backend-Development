package com.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Patient_details")
@Data
public class Patient 
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="patient_id",length=5)
	private int patientId;
	
    @Column(name="Patient_fullName",length=40)
	private String fullName;
	
    @Column(name="Patient_PhoneNumber")
	private Long phoneNumber;
	
    @Column(name="Patient_email",length=30)
	private String email;
	
    @Embedded
    @Column(name="Patient_address")
	private Address address;
	
}
