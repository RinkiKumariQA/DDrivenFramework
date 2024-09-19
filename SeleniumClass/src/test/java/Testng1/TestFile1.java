package Testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFile1 
{
	@BeforeTest
	void tstt()
	{
		System.out.println("Before test");
	}
	 @Test
	 void tst4()
	 {
		 System.out.println("Life");
	 }
	 @Test
	 void tst5()
	 {
		 System.out.println("is");
	 }
	 @Test
	 void tst6()
	 {
		 System.out.println("Beautiful");
	 }
	 @AfterTest
	 void tsttt()
	 {
		 System.out.println("after test");
	 }
}
