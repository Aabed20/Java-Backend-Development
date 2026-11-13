package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Loan_details")
@Data
public class Loan 
{
	@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "loan_gen"
		)
	
	@SequenceGenerator(
		    name = "loan_gen",
		    sequenceName = "LOAN_SEQ",
		    allocationSize = 1
		)
	@Id
	@Column(name="loan_id",length=5)
   private int loanId;
   
	@Column(name="customer_name",length=35)
   private String customerName;
   
	@Column(name="loan_type",length=20)
   private String loanType;
   
	@Column(name="loan_amount",length=20)
   private double loanAmount;
   
	@Column(name="interest_rate",length=2)
   private double interestRate;
   
	@Column(name="duration_months",length=2)
   private int durationMonths;
   
	@Column(name="loan_status",length=20)
   private String loanStatus;
   
	@Column(name="credit_score",length=4)
   private int creditScore;
   

}
