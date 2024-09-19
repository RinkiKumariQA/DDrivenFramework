package TestNG_Module2;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optn_parameter
{
	@Parameters({"i","j"})
	   @Test
	  
	   void m1(@Optional("5")int a, @Optional("10")int b)
	   {
		   System.out.println(a+b);
	   }
}
