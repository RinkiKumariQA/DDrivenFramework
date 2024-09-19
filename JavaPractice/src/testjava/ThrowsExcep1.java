package testjava;

public class ThrowsExcep1 
{
   void m2() throws ArithmeticException
   
   {
	   System.out.println(9/0);
   }
	public static void main(String[] args)  {
           ThrowsExcep1 TR=new ThrowsExcep1();
           TR.m2();
           System.out.println("System is not working");
   	}

}
