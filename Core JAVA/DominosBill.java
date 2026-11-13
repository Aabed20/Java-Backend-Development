public class DominosBill
{
    public static void main(String[] args)
    {
          int chickenRolls = Integer.parseInt(args[0]);
          int VegetablePuffs = Integer.parseInt(args[1]);
          int priceOfChickenRoll = 60;
          int priceOfVegetablePuffs = 25;
          int chickenbill = chickenRolls * priceOfChickenRoll;
          int puffBill = VegetablePuffs * priceOfVegetablePuffs; 
          int total = ((chickenRolls * priceOfChickenRoll) + (VegetablePuffs * priceOfVegetablePuffs)) - 50;
          System.out.println("chickenRolls Amount = "+chickenbill);
          System.out.println("VegetablePuffs Amount = "+puffBill);
          System.out.println("Total bill After 50rs discount : "+total);
    }
}