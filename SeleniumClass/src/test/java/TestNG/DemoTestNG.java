package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestNG
{
	WebDriver driver;
  @Test
	void test1()
	{
		driver=new ChromeDriver();
	}
  @Test
  void test2()
  {
	 driver.get("https://practicetestautomation.com/practice-test-login/");
  }
   @Test
   void test3()
   {
	   driver.findElement(By.id("username")).sendKeys("student");
   }
   @Test
   void test4()
   {
	   driver.findElement(By.id("password")).sendKeys("Password123");
   }
  @Test
  void test5() {
	  driver.findElement(By.id("submit")).click();
  }
}
