package Testng1;

import org.testng.annotations.Test;

public class Emp 
{
   @Test(groups="Testing")
   void a()
   {
	   System.out.println("Automation");
   }
   @Test(groups="Testing")
   void a1()
   {
	   System.out.println("Manual");
   }
   
   @Test(groups="Developer")
   void a2()
   {
	   System.out.println("Pathon");
   }
   @Test(groups="Developer")
   void a3()
   {
	   System.out.println("Java");
   }
   
}
