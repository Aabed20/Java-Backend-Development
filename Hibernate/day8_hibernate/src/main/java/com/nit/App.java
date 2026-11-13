package com.nit;

import java.util.Arrays;
import java.util.List;

import com.daos.MissionDao;
import com.entities.Astronaut;
import com.entities.SpaceMission;

public class App 
{
	public static void main(String[] args) 
	{
		SpaceMission mission1 = new SpaceMission();
		mission1.setMissionName("Appolo 11");
		mission1.setDestination("Moon");
		mission1.setLaunchYear(2024);
		
		SpaceMission mission2 = new SpaceMission();
		mission2.setMissionName("Mars 11");
		mission2.setDestination("Mars");
		mission2.setLaunchYear(2020);
		
		List<SpaceMission> missions = Arrays.asList(mission1,mission2);
		
		Astronaut astronaut1 = new Astronaut();
		astronaut1.setAstronautName("Aabed");
		astronaut1.setSpecialization("Space Ship Engineer");
		astronaut1.setExperienceYears(4);
		astronaut1.setMissions(missions);
		
		Astronaut astronaut2 = new Astronaut();
		astronaut2.setAstronautName("Rahil");
		astronaut2.setSpecialization("Space ship driving");
		astronaut2.setExperienceYears(4);
		astronaut2.setMissions(missions);
		
		Astronaut astronaut3 = new Astronaut();
		astronaut3.setAstronautName("Asef");
		astronaut3.setSpecialization("Scientist");
		astronaut3.setExperienceYears(5);
		astronaut3.setMissions(Arrays.asList(mission2));
		
		List<Astronaut> listOfAstronauts1 = Arrays.asList(astronaut1,astronaut2);

		List<Astronaut> listOfAstronauts2 = Arrays.asList(astronaut1,astronaut2,astronaut3);
		
		mission1.setAstronauts(listOfAstronauts1);
		mission2.setAstronauts(listOfAstronauts2);
		
		MissionDao.addMissionAndAstronauts(missions, listOfAstronauts2);
	}

}
