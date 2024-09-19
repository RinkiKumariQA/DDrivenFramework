package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod 
{
   public WebDriver driver;
   
   @BeforeMethod
	 void test()
	 {
	   System.out.println("browser open");
	   driver=new ChromeDriver();
	 }
      @Test()
      void test1()
      { System.out.println("Url hit");
    	  driver.get("https://practicetestautomation.com/practice-test-login/");
      }
      
      @AfterMethod
      void test2()
      {
    	  System.out.println("browser close");
    	driver.close();
      }
      
}
