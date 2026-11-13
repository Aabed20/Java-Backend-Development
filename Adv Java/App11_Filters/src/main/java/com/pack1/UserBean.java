package com.pack1;

import java.io.Serializable;

public class UserBean implements Serializable
{
	private String username;
	private String password;
	private String fname;
	private String lname;
	private String mail;
	private String phno;
	
	public UserBean() {
		super();
	}
	public String getUsername() {
		return username;
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
	public String getMail() {
		return mail;
	}
	public String getPhno() {
		return phno;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	

}
