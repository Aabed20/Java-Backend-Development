package com.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.models.Actor;

@Service
public class ActorDao 
{
	private  static final String QUERY_FOR_INSERT="insert into actor values(?,?,?,?,?)";
	
	private static final String QUERY_FOR_UPDATE="update actor set actor_salary=? , actor_movie=? where actor_id=?";
	
	private static final String QUERY_FOR_FETCHING_ALL_ACTORS="select * from actor";
	
	@Autowired
	JdbcTemplate template;
	
	public String insertActor(int id, String name,String email, double salary, String movie)
	{
		int update = template.update(QUERY_FOR_INSERT, id,name,email, salary,movie);
		
	    if(update==1)
	    {
	    	return "Actor Inserted Successfully";
	    }
	
		return "Actor not inserted";
	}
	
	public String updateActor(int id,double salary,String movie)
	{
		int update = template.update(QUERY_FOR_UPDATE, salary,movie,id);
		
		if(update==1)
		{
			return "Actor updated Successfully";
		}
		return "Actor not updated";
	}
	
	public List<Actor> getAllActors()
	{
		List<Actor> list=template.query(QUERY_FOR_FETCHING_ALL_ACTORS, (rs,rowNum)->
		   {
			   Actor actor = new Actor();
			   actor.setActorId(rs.getInt(1));
			   actor.setActorName(rs.getString(2));
			   actor.setActorEmail(rs.getString(3));
			   actor.setSalary(rs.getDouble(4));
			   actor.setMovie(rs.getString(5));
			   return actor;
		   }	   );
		
	   return list;
		
	}
	
	

}
