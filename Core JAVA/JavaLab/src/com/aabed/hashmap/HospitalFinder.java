package com.aabed.hashmap;
import java.util.*;
class Hospital
{
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatements;
	private String contactPerson;
	private String contactNumber;
	private String location;
	public Hospital(String hospitalName, List<String> listOfTreatements, String contactPerson,
			String contactNumber, String location) {
		super();
		this.hospitalName = hospitalName;
		this.listOfTreatements = listOfTreatements;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}
	public int getHospitalCode() {
		return hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public List<String> getListOfTreatements() {
		return listOfTreatements;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public void setListOfTreatements(List<String> listOfTreatements) {
		this.listOfTreatements = listOfTreatements;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatements="
				+ listOfTreatements + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}	
}
class HospitalService
{
 	static ArrayList<Hospital> listOfHospital = new ArrayList<>();
    static HashMap<Integer,String> hospitals = new HashMap<>();
  
	public void addHospital(String hospitalName, List<String> listOfTreatements, String contactPerson,
			String contactNumber, String location)
	{
		int min = 100;
        int hospitalCode = (int)(Math.random() * min+min) ;
        Hospital hospit = new Hospital(hospitalName,listOfTreatements,contactPerson,contactNumber,location);
        hospit.setHospitalCode(hospitalCode);
        listOfHospital.add(hospit);    
	}
	public void getHospitals()
	{
		for(Hospital hos:listOfHospital)
		{
			hospitals.put(hos.getHospitalCode(), hos.getHospitalName());
		}
		
		hospitals.forEach((k,v) -> IO.println(k +" = "+v));
	}
	public void getHospitalDetails(int code)
	{
		boolean found = false;
		for(Hospital hos:listOfHospital)
		{
			if(hos.getHospitalCode()==code)
			{
				found = true;
				IO.println("hospital Found :\n"+hos);
			}
		}
		if(!found)
		{
			IO.println("Hospital With "+code+" Code Not Found!!!");
		}
	}	 
}
public class HospitalFinder 
{
	public static void main(String[] args) 
	{		
		while(true)
		{
			IO.println("---------- Hospital Menu ---------");
			IO.println("1. Add Hospital Data.\n2. Display Hospital Code And Name.\n3. Search Hospital");
			int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
			HospitalService hs = new HospitalService();
			switch(choice)
			{
			case 1->
			{
		     String hospitalName = IO.readln("Enter Hospital Name : ");
		     List<String> listOfTreatements = new ArrayList<>();
		     int choice1 = Integer.parseInt(IO.readln("Enter Total Number of treatments : "));
		    for( int i=0; i<choice1; i++)
		    {
		     	String treatment = IO.readln("Enter Treatment Name : ");
			   listOfTreatements.add(treatment);
		    }
		    String contactPerson = IO.readln("Enter Contact Person Name : ");
		    String contactNumber = IO.readln("Enter Contact Number : ");
		    String Location = IO.readln("Enter Location : ");  
		    hs.addHospital(hospitalName, listOfTreatements, contactPerson, contactNumber, Location);
			}
			case 2 ->
			{
				hs.getHospitals();
			}
			case 3 ->
			{
				int hospitalCode = Integer.parseInt(IO.readln("Enter Hospital Code : "));
				hs.getHospitalDetails(hospitalCode);
			}
		  } 
		}
	}
}
