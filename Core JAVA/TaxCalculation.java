public class TaxCalculation
{
    public static void main(String[] args)
    {
          int amount = Integer.parseInt(args[0]);
          double tax = amount*0.049;
          System.out.println("Total Tax is : "+tax);
    }
}