package com.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Robot 
{
    @Value("${robotId}")
	private int robotId;
    
    @Value("${manufactureCompany}")
	private String manufactureCompany;
    
    @Autowired
	private Chip chip;
	
}
