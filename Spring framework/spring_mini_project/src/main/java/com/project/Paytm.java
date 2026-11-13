package com.project;

public class Paytm implements Payment 
{
	
	private String QRCODE;
	private String name;
	@Override
	public boolean paymentVerification() 
	{
		 String[] split = QRCODE.split("#");
		 String str = split[1];
		return str.equals("paytm");
	}
	public String getQRCODE() {
		return QRCODE;
	}
	public void setQRCODE(String qRCODE) {
		QRCODE = qRCODE;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Paytm [QRCODE=" + QRCODE + ", name=" + name + "]";
	}
	

}
