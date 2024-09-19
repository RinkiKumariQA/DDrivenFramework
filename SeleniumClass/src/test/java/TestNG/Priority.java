package TestNG;

import org.testng.annotations.Test;

public class Priority 
{
  @Test(priority=3)
  void m1()
  {
	  System.out.println("Alpha");
  }
  @Test(priority=0)
  void m2()
  {
	  System.out.println("Bita");
  }
  
  @Test(priority=5)
  void m3()
  {
	  System.out.println("Nancy");
  }
  @Test(priority=4)
  void m4()
  {
	  System.out.println("Alpha1");
  }
  @Test(priority=1)
  void m9()
  {
	  System.out.println("Alpha");
  }
}