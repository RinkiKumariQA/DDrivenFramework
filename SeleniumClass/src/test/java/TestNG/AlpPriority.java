package TestNG;

import org.testng.annotations.Test;

public class AlpPriority 
{
	 @Test
	  void a()
	  {
		  System.out.println("a");
	  }
	 @Test(priority=3)
	  void d()
	  {
		  System.out.println("d");
	  }
	 @Test(priority=3)
	  void c()
	  {
		  System.out.println("c");
	  }
	 @Test(priority=3)
	  void b()
	  {
		  System.out.println("b");
	  }
	 @Test(priority=3)
	  void e()
	  {
		  System.out.println("e");
	  }
}
