package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource("classpath:com/project/OnlinePaymentApp.properties")
   ,@PropertySource("classpath:com/project/ICICI.properties")
   ,@PropertySource("classpath:com/project/SBI.properties")	
	
})
@ComponentScan(basePackages = "com.project")
public class ShoppingConfiguration 
{ 
	@Autowired
	Environment environment;
	
    @Bean
	public Paytm paytm()
	{
		Paytm paytm  = new Paytm();
		paytm.setQRCODE(environment.getProperty("paytmQRcode"));
		paytm.setName(environment.getProperty("name"));
		return paytm;
	}
    
    @Bean
    
    public PhonePe phonepe()
    {
    	PhonePe phonepe = new PhonePe();
    	phonepe.setQRCODE(environment.getProperty("phonepayQRcode"));
		phonepe.setName(environment.getProperty("name"));
    	return phonepe;
    }
    
    @Bean
    public Gpay gpay()
    {
    	Gpay gpay = new Gpay();
    	gpay.setQRCODE(environment.getProperty("googlePayQRcode"));
		gpay.setName(environment.getProperty("name"));
    	return gpay;
    }
    
    @Bean
    @Primary
    public Card card()
    {
    	Card card = new Card();
    	card.setCardName(environment.getProperty("cardName2"));
    	card.setCardNumber(environment.getProperty("cardNumber2"));
    	return card;
    }
}
