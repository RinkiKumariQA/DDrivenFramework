package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_test {

	public static void main(String[] args) 
	{

		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement e1=driver.findElement( By.id("user-name"));
		e1.sendKeys("standard_user");
		WebElement e2=driver.findElement(By.id("password"));
	  e2.sendKeys("secret_sauce");
	WebElement e3=driver.findElement(By.id("login-button"));
	e3.click();  // login page test
	//	WebElement e4=driver.findElement(By.partialLinkText("Sauce Labs Back"));
		//e4.click();
		
		//WebElement e5=driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
		// e5.click();
		
	}

}
