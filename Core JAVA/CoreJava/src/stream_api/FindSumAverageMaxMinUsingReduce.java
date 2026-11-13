package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindSumAverageMaxMinUsingReduce
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,2,5,4,33,13,28,7,6);
		
		
		Integer sumOfAll = list.stream()
		   .reduce(0, (a,b)->a+b);
		
		IO.println(sumOfAll);
		
		 Integer max = list.stream()
		    .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);

		IO.println(max);
		
		Integer min = list.stream()
		  .reduce(Integer.MAX_VALUE,(a,b)->b>a?a:b);
		
		IO.println(min);
		
		Double avg = (double)(list.stream()
		   .reduce(0, (a,b)->a+b)/list.size());
		
		  IO.println(avg);
		

	}

}
