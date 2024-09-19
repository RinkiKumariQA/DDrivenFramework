package TestNG_Module2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplclss 
{

	@Parameters({"p","q"})
	   @Test
	  
	   void m1(int c, int d)
	   {
		   System.out.println(c+d);
	   }
}
