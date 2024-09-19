package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kewbord_use {

	public static void main(String[] args) 
	{
		  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.google.com/");
	        WebElement e1 = driver.findElement(By.id("APjFqb"));
	        e1.sendKeys("Java");
	       Actions act =new Actions(driver);
	       act.sendKeys(Keys.ENTER).perform();
	       
	       act.keyDown(Keys.CONTROL);
	       act.sendKeys("A");
	       act.keyUp(Keys.CONTROL).perform();
	       
	       
	       
	       
	}

}
