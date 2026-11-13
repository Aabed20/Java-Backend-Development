package com.project;

public class Card implements Payment 
{
	private String cardName;
	private String cardNumber;
	
	@Override
	public boolean paymentVerification() 
	{
		return (cardName.equals("ICICI_DebitCard")||cardName.equals("SBI_DebitCard"))&&cardNumber.length()==13;
	}

	

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

    public String getCardName()
    {
    	if( cardName.startsWith("ICICI"))
    	{
    		return "ICICI Debit Card";
    	}
    	else if(cardName.startsWith("SBI"))
    	{
    		return "SBI Debit card";
    	}
    	else
    	{
    		return "card";
    	}
    }

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", cardNumber=" + cardNumber + "]";
	}
	

}
