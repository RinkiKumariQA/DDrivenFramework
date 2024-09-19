package BeforeSuite1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class tst4 
{
   @BeforeSuite
   void tre()
   {
	   System.out.println("BeforeSuite");
   }
   @Test
   void trq()
   {
	   System.out.println("Test9");
   }
   @AfterSuite
   void tqq()
   {
	   System.out.println("AfterSuite");
   }
}
