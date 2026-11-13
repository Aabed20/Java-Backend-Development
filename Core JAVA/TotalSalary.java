public class TotalSalary
{
    public static void main(String[] args)
    {
          int salary = Integer.parseInt(args[0]);
          int hra = salary * 15/100;
          int conveyanceAllowance = salary * 15/100;
          int entertainmentAllowance = salary * 10/100;
          int totalSalary = salary + hra + conveyanceAllowance + entertainmentAllowance;

          System.out.println("Total Salary is : "+totalSalary);
    }
}