package com.nit;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.connections.DatabaseConfig;
import com.daos.ActorDao;
import com.models.Actor;

public class ActorMain 
{
	public static void main(String[] args) 
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);

		ActorDao bean = context.getBean(ActorDao.class);
		
		String insertActor = bean.insertActor(103, "pathan", "pathan@gmail.com", 50000, "RRR");
		
		System.out.println(insertActor);
		
	//	String updateActor = bean.updateActor(101, 60000, "Don");
		
		//System.out.println(updateActor);
		
		List<Actor> actors = bean.getAllActors();
		
		System.out.println(actors);
	}

}
