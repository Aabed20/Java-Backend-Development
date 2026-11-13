package com.aabed.pack1;

import java.io.Serializable;

public class ProductBean implements Serializable
{

	private String pcode;
	private String pname;
	private String pcompany;
	private String pprice;
	private String pqty;
	
	public ProductBean()
	{
		
	}

	public String getPcode() {
		return pcode;
	}

	public String getPname() {
		return pname;
	}

	public String getPcompany() {
		return pcompany;
	}

	public String getPprice() {
		return pprice;
	}

	public String getPqty() {
		return pqty;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public void setPqty(String pqty) {
		this.pqty = pqty;
	}
	
}
