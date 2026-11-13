public class PalindromeOrNot
{
    public static void main(String[] args)
    {
          int num = Integer.parseInt(args[0]);
          int num2 = num;
          int remainder=0;
          int reversedNum=0;
          while (num != 0)
           {
              remainder = num % 10;         
              reversedNum = reversedNum * 10 + remainder; 
              num = num/10;          
            }
           if(num2 == reversedNum)
            {
               System.out.println(num2+" is Palindrome Number.");
            }
           else 
            {
              System.out.println(num2+" is Not Palindrome Number.");  
            }
    }
}