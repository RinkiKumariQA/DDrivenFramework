package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector_Method {

	public static void main(String[] args)
	{
		System.setProperty("WebDiver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://practicetestautomation.com/practice-test-login/");
	       driver.findElement(By.cssSelector("input#username")).sendKeys("student");
	       driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Password123");
	       driver.findElement(By.cssSelector("button.btn")).click();
	       
	}

}
