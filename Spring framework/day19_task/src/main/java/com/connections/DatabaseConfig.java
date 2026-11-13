package com.connections;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource("resources/application.properties")
@ComponentScan("com.daos")
public class DatabaseConfig 
{
     @Autowired
	private Environment environment;
     
     @Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName(environment.getProperty("db.driver"));
		data.setUrl(environment.getProperty("db.url"));
		data.setUsername(environment.getProperty("db.username"));
		data.setPassword(environment.getProperty("db.password"));
		
		return data;
	}
     
     @Bean
     public JdbcTemplate template()
     {
    	 JdbcTemplate temp = new JdbcTemplate(dataSource());
    	 return temp;
     }
	
}
