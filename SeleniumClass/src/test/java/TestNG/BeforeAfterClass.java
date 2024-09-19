package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass 
{
	public WebDriver driver;
	
	@BeforeClass
	void test1()
	{
		System.out.println("before class");
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
	void test4() {
		driver.findElement(By.id("password")).sendKeys("Password123");
	}
	@Test
	void test5()
	{
		driver.findElement(By.id("submit")).click();
	}
   @AfterClass
  void test6()
  {
	   System.out.println("after class");
	   driver.close();
  }
}
