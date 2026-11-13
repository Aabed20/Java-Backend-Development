package com.components;

public class University 
{
  
	private String nameOfUniverity;
	
	private String addressOfUniversity;
	
	private int universityCode;
	
	public University() {}

	public String getNameOfUniverity() {
		return nameOfUniverity;
	}

	public void setNameOfUniverity(String nameOfUniverity) {
		this.nameOfUniverity = nameOfUniverity;
	}

	public String getAddressOfUniversity() {
		return addressOfUniversity;
	}

	public void setAddressOfUniversity(String addressOfUniversity) {
		this.addressOfUniversity = addressOfUniversity;
	}

	public int getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(int universityCode) {
		this.universityCode = universityCode;
	}

	@Override
	public String toString() {
		return "University [nameOfUniverity=" + nameOfUniverity + ", addressOfUniversity=" + addressOfUniversity
				+ ", universityCode=" + universityCode + "]";
	}
	
}
