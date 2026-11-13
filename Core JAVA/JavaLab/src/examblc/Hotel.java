package examblc;

public class Hotel {

	public static double calculateTotalAmount(double roomRate, int days)
	{
		double totalAmount = (roomRate*days);
		return totalAmount;
	}
	public static double calculateDiscountedAmount(int days, double totalAmount)
	{
		if(days>=10)
		{
			return totalAmount-totalAmount*0.2;
		}
		else if(days>=5)
		{
			return totalAmount-totalAmount*0.1;
		}
		else if(days>=3)
		{
			return totalAmount-totalAmount*0.05;
		}
		else
		{
			return totalAmount;
		}
	}
	
}
