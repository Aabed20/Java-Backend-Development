public class InterestCalculator
{  
	public static void main(String[] args) 
	{
		double principalAmount = Double.parseDouble(args[0]);
		double rateOfInterest = Double.parseDouble(args[1]);
		int time = Integer.parseInt(args[2]);
		if(time > 6 && time <= 12)
		{
			double interest = principalAmount*(rateOfInterest/100);
			double totalAmount = interest + principalAmount;
            System.out.println("Total Amount = "+totalAmount+"  Simple Interest = "+interest);
		}
		else if(time > 1 && time <= 6)
		{
			double interest = (principalAmount*(rateOfInterest/100))/2;
			double totalAmount = interest + principalAmount;
            System.out.println("Total Amount = "+totalAmount+"  Simple Interest = "+interest);
		}
	}
}
