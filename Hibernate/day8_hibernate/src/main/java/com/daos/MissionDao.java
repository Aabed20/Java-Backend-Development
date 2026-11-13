package com.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.ConnectionProvider;
import com.entities.Astronaut;
import com.entities.SpaceMission;

public class MissionDao 
{
   private static SessionFactory factory = ConnectionProvider.getConnection();
	
   public static void addMissionAndAstronauts(List<SpaceMission> missions,List<Astronaut> astronauts) 
   {
	   Session session = factory.openSession();
	   Transaction transaction = session.beginTransaction();

	   for(SpaceMission mission:missions)
	   {
		   session.persist(mission);
	   }
	   for(Astronaut astronaut:astronauts)
	   {
		   session.persist(astronaut);
	   }
	   
	   transaction.commit();
	   session.close();
	   
	   System.out.println("All the Mission and Astronauts are saved successfully");
   }

}
