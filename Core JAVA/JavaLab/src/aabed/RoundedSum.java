package aabed;

public class RoundedSum {

	public static int sumOfRoundedValues(int x) {
		 x =(x%10>=5)?((x/10)+1)*10: (x/10)*10;
		 return x;

	}

}
