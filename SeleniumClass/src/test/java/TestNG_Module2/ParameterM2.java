package TestNG_Module2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterM2 
{
	@Parameters({"i","j"})
   @Test
  
   void m1(int a, int b)
   {
	   System.out.println(a+b);
   }
}
