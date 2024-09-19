package testjava;

public class Excefinallyblock 
{
	static void m1(int n,String s)
	{
		try
		{
			String str=s;
			System.out.println("Java Langusge");
			System.out.println(10/n);
			System.out.println("your name lenghth is-->"+str.length());
		}
		catch (ArithmeticException e)
		{
			System.out.println("zero not allowed getting exception"+e);
		}
		
		catch(NullPointerException ne)
		{
			System.out.println("null not allowed getting exception "+ne);
		}
		finally
		{
		   System.out.println("Java Language");	
		}

		System.out.println("getting not exception");
	}
	
	public static void main(String[] args)
	{
		Excefinallyblock.m1(2,null);
		
	}

}
