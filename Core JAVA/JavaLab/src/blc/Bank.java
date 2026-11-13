package blc;

public class Bank {
 
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	public static String bankName = "ICICI";
	public static String bankAddress = "Hyderabad";
	public static String bankIFSCCode = "IFSC00017";
	
	public void setCustomerDetails(String name, int accNumber, double balance)
	{
		customerName = name;
		accountNumber = accNumber;
		if(balance > 0)
		{
			currentBalance = balance;
		}
		else
		{
			System.err.println("Error Amount should be greater than 0.");
			System.exit(0);
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount<=currentBalance)
		{
			currentBalance = currentBalance-amount;
			System.out.println("Withdrawal successful! ₹"+amount+" debited.");
		}
		
		else
		{
			System.err.println("You have insufficient balance.");
			System.exit(0);
		}
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			currentBalance = currentBalance+amount;
			System.out.println("Deposit successful! ₹"+amount+" credited.");
		}
		else {
			System.err.println("Deposit amount should be greater than zero!");
			System.exit(0);
		}
	}
	
	public double getCurrentBalance()
	{
		return currentBalance;
	}

	
	public String displayDetails()
	{
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}
		
	
}
