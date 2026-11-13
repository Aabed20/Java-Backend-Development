package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeeInEachGroup
{
	public static void main(String[] args)
	{
		List<Employee> list = Arrays.asList(new Employee(101,"Aabed Pathan",60000,"IT"),new Employee(202,"Rahil",50000,"IT"),new Employee(105,"Asef",45000,"Testing"),new Employee(201,"Tejes",30000,"Database"),new Employee(202,"Harshad",25000,"Database"),
			      new Employee(204,"Priya",45000,"HR"),new Employee(103,"Lalit",40000,"Testing"));
	
		Map<String, Optional<Employee>> map = list.stream()
		   .collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.maxBy((s1,s2)->Double.compare(s1.getSalary(),s2.getSalary()))));

		IO.print(map);
	}

}
