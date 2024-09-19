package TestNG;

import org.testng.annotations.Test;

public class timeout_att 
{
	@Test(timeOut=2000)
	void automation() throws Exception 
	{
		Thread.sleep(3000);
		System.out.println("automation");
	}
	
	  
}
