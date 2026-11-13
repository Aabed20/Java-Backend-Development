package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="book_details")
@Data
public class Book 
{
	@Id
	@Column(length=5)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(length=25)
	private String title;
	
	@Column(length=25)
	private String author;
	
	@Column(length=25)
	private String category;
	

}
