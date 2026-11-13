package com.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="space_mission_details")
@Data
public class SpaceMission 
{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int misssionId;
	
	@Column(name="mission_name",length=50)
	private String missionName;
	
	@Column(name="destination",length=30)
	private String destination;
	
	@Column(name="launch_year")
	private int launchYear;
	
	@ManyToMany
	@JoinTable(
	    name = "mission_astronaut",
	    joinColumns = @JoinColumn(name = "mission_id"),
	    inverseJoinColumns = @JoinColumn(name = "astronaut_id")
	)
	private List<Astronaut> astronauts;
}
