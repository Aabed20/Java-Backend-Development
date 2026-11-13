package com.food;

public class DeliveryPartner
{
	private int partnerId;
	private String partnerName;
	
	public DeliveryPartner() {}

	public int getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	@Override
	public String toString() {
		return "DeliveryPartner [partnerId=" + partnerId + ", partnerName=" + partnerName + "]";
	}
	
	

}
