package com.project;

public class Gpay implements Payment 
{
	private String QRCODE;
	private String name;
	@Override
	public boolean paymentVerification() 
	{
		String[] split = QRCODE.split("#");
		 String str = split[1];
		return str.equals("googlePay");
	}
	
	public void setQRCODE(String qRCODE) {
		QRCODE = qRCODE;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Gpay [QRCODE=" + QRCODE + ", name=" + name + "]";
	}
	

}
