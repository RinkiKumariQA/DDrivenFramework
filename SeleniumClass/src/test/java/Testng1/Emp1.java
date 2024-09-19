package Testng1;

import org.testng.annotations.Test;

public class Emp1 
{
	@Test(groups="Testing")
	   void b()
	   {
		   System.out.println("Auromation 1");
	   }
	@Test(groups="Testing")
	   void b1()
	   {
		   System.out.println("Manual 1");
	   }
	@Test(groups="Developer")
	   void b2()
	   {
		   System.out.println("Paython 1");
	   }
	@Test(groups="Developer")
	   void b3()
	   {
		   System.out.println("Java 1");
	   }
}
