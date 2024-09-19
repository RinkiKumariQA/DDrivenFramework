
package Module_4;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Report extends BaseClass
{
	  
	   
	   @Test
	   void pass()
	   {
		   System.out.println("pass");
	   }
	   
	   @Test
	   void fail()
	   {
		    driver.get("https://practicetestautomation.com/practice-test-login/");
		    driver.findElement(By.id("usernam")).sendKeys("student");
		   
	 }
	   @Test
	   void skip()
	   {
		   throw new SkipException("Skipped");
		     }

}
