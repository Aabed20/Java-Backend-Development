package com.hospital_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoomAllocationService 
{
	@Autowired
	HospitalRoom hospitalRoom;
	
	@Autowired
	@Qualifier("icu")
	HospitalRoom icu;
	
	@Autowired
	@Qualifier("private")
	HospitalRoom privateRoom;
	
	public RoomAllocationService()
	{}
	
	public void displayData()
	{
		hospitalRoom.allocateRoom();
		icu.allocateRoom();
		privateRoom.allocateRoom();
	}

}
