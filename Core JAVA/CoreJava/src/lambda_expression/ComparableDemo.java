package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableDemo
{
	public static void main(String[] args)
	{
     ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,18,15,13));
     Collections.sort(list, (i1,i2)->i2-i1);
     System.out.println(list);
	}
}
