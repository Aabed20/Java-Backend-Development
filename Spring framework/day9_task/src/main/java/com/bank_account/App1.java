package com.bank_account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bank_account/application-context.xml");

		BankAccount bean1 = context.getBean("bank", BankAccount.class);
		bean1.setAccountNumber(101);
		bean1.setAccountHolderName("Aabed");
		bean1.setBalance(1200);
		
		BankAccount bean2 = context.getBean("bank", BankAccount.class);
		bean2.setAccountNumber(102);
		bean2.setAccountHolderName("Rahil");
		bean2.setBalance(1000);
		
		System.out.println(bean1.hashCode()+" "+bean2.hashCode());
		
		System.out.println(bean1.toString());
		System.out.println(bean2.toString());
		
		Transaction t1 = context.getBean("transaction", Transaction.class);
		t1.setTransactionId(10001);
		t1.setTransactionType("UPI");
		t1.setAmount(200);
		
		Transaction t2 = context.getBean("transaction", Transaction.class);
		t2.setTransactionId(10002);
		t2.setTransactionType("UPI");
		t2.setAmount(150);
		
		System.out.println(t1.hashCode()+" "+t2.hashCode());
		System.out.println(t1);
		System.out.println(t2);
		
		/*singleton scope creates only one object
		 * whereas prototype scope creates multiple object
		 * thats why bean1 & bean2 have same hashCode 
		 * and t1 & t2 are different objects so hashCode is different
		 */
	
	}

}
