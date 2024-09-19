package Testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter
{
	@Parameters({"r","s"})
	   @Test
	  
	   void m1(int e, int f)
	   {
		   System.out.println(e+f);
	   }
}
