package aabed;

public class Fan {
 String name;
 String coil;
 int wings;
 public void switchOn()
 {
	 System.out.println("Hello Coders I'm "+name+" Switch me on");
	 System.out.println("I will spin with good speed because i have "+wings+" wings");
	 System.out.println("I have coil called "+coil);
 }
 public void switchOff()
 {
	System.out.println("If you feel cold Turn me Off"); 
 }
}
