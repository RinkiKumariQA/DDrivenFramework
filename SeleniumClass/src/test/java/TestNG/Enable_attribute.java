package TestNG;

import org.testng.annotations.Test;

public class Enable_attribute 
{
	@Test
	void m1()
	{
		System.out.println("Manual");
	}
	@Test
	void m2()
	{
		System.out.println("Automation");
	}
	@Test(enabled=false)
	void m3()
	{
		System.out.println("Java");
	}
	@Test
	void m4()
	{
		System.out.println("Paython");
	}
	
}
