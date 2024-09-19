package testjava;

public class ThrowsExcep 
{
	void m1() 
	{
		System.out.println(34/0);
	}

	public static void main(String[] args) 
	{
       ThrowsExcep te=new ThrowsExcep();
       try
       {
       te.m1();
	}
 catch(ArithmeticException d)
       {
	 System.out.println("not getting exception" );
       }
       
       finally
       {
    	   System.out.println("finally block is running");
       }
       System.out.println("rest of the world");
       
       
       

}
}