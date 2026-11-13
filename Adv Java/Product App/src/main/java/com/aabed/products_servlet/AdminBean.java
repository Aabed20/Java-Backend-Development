package com.aabed.products_servlet;

public class AdminBean
{
	private String userName;
	private String password;
	private String fname;
	private String lname;
	private String addr;
	private String mail;
	private String phone;
	
	public AdminBean()
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddr() {
		return addr;
	}

	public String getMail() {
		return mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
