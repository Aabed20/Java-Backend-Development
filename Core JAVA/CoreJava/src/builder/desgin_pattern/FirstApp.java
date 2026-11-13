package builder.desgin_pattern;

class A 
{
  int a;
  int b;
  
  public A() { }
  
  public int getA() 
  {
	  return a; 
  }
  
  public void setA(int a) 
  {
	  this.a = a;  
  }
  
  public int getB() 
  { 
	  return b; 
  }
  
  public void setB(int b) 
  {
	  this.b = b; 
  }
  
  @Override
   public String toString() 
   {
     return "A [a=" + a + ", b=" + b + "]";
   }
}

class ABuilder
{
	int a;
	int b;
	
	public ABuilder()
	{}
	
	public ABuilder setA(int a)
	{
		this.a=a;
		return this;
	}
	
	public ABuilder setB(int b)
	{
		this.b=b;
		return this;
	}
	
	public A build()
	{
		A a = new A();
		a.setA(this.a);
		a.setB(this.b);
        return a;
	}
	
}

public class FirstApp 
{

	public static void main(String[] args) 
	{
		A a = new ABuilder().setA(10).setB(20).build();
        System.out.println(a);
	}

}
