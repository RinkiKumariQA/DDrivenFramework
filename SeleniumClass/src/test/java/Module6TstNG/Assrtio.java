package Module6TstNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assrtio 
{

	@Test
	void test()
	{
	
    WebDriver driver= new ChromeDriver();
   driver.get("https://www.google.com");
   String ExpTite="Googl";
  // String ActTitle= driver.getTitle();
 //  System.out.println("ActTitle");
 //  Assert.assertNotEquals(ExpTite, ActTitle);
 //  System.out.println("end of the code");
  WebElement e1= driver.findElement(By.id("APjFq"));
  Assert.assertTrue(e1.isDisplayed());
  
  System.out.println("end of the code");
  
   
   
   
   
	}
}
