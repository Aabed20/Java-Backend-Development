package com.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Astronaut")
@Data
public class Astronaut 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int astronautId;
	
	@Column(name="astronaut_name",length=30)
	private String astronautName;
	
	@Column(name="specialization",length=30)
	private String specialization;
	
	@Column(name="experience_years")
	private int experienceYears;
	
	@ManyToMany(mappedBy="astronauts")
    private List<SpaceMission> missions;
	
}
