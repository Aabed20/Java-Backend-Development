package blc;

class BankAccount {

	private int balance;
	
	void setBalance(int balance)
	{
		if (balance > 0) 
		{
			 this.balance = balance; // suspicious
		}
			 else
			 {
				 System.out.println("Invalid amount"); }
			 }
			 int getBalance() {
			 return balance;
			 }
			}
			public class TestYourAbility {
			 public static void main(String[] args) {
			Class cls = BankAccount.class;
			System.out.println(cls.getName());
			 }
			}

	
