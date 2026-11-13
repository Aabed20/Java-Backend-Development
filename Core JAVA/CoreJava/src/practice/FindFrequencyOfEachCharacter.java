package practice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacter
{
	public static void main(String[] args)
	{
		String s = "hello world";
		
		Map<Character, Long> freq = s.chars()
		  .mapToObj(ch->(char)ch)
		   .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		IO.print(freq);
	}

}
