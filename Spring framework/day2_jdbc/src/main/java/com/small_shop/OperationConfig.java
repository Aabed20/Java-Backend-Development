package com.small_shop;

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
@ComponentScan("com.small_shop")
@PropertySource("com/small_shop/application.properties")
public class OperationConfig 
{
	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName(env.getProperty("db.driver"));
		source.setUrl(env.getProperty("db.url"));
		source.setUsername(env.getProperty("db.userName"));
		source.setPassword(env.getProperty("db.pwd"));
		
		return source;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate template = new JdbcTemplate(dataSource());
		return template;
	}

}
