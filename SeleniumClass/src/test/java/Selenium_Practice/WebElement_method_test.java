package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_method_test {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	//	driver.findElement(By.name("username")).sendKeys("student");
	//	driver.findElement(By.name("password")).sendKeys("Password123");
//	driver.findElement(By.id("submit")).click();
		 
		//WebElement a= driver.findElement(By.name("username"));
		//boolean b=a.isDisplayed();
		//System.out.println(b);
		
		
		//WebElement a= driver.findElement(By.name("username"));
		//String s=a.getAttribute("id");
		//System.out.println(s);
		
		WebElement a= driver.findElement(By.name("password"));
		String s2=a.getTagName();
		System.out.println(s2);

		
		
		
		
		

	}

}
