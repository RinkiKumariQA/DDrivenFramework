package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Depends_Method_att
{
	
@Test
void m1()
{
	System.out.println("Manual");
}

@Test(dependsOnMethods= {"m3"})
void m2()
{
	System.out.println("Automation");
}
	
@Test
void m3()
{
      Assert.assertTrue(false);
}
	
@Test
void m4()
{
	System.out.println("Paython");
}
	

}
