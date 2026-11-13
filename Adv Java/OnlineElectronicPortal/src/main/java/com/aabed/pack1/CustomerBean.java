package com.aabed.pack1;

public class CustomerBean 
{
	private String uName;
	private String uPass;
	private String fName;
	private String lName;
	private String Addr;
	private String Mid;
	private String phNo;
	
	public CustomerBean() {
		super();
	}

	public String getuName() {
		return uName;
	}

	public String getuPass() {
		return uPass;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getAddr() {
		return Addr;
	}

	public String getMid() {
		return Mid;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setAddr(String addr) {
		Addr = addr;
	}

	public void setMid(String mid) {
		Mid = mid;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	

}
